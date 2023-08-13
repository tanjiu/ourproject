package com.i1314i.ourproject.shiro.realm;

import com.i1314i.ourproject.mapper.PermissionMapper;
import com.i1314i.ourproject.mapper.RoleMapper;
import com.i1314i.ourproject.po.Code;
import com.i1314i.ourproject.po.User;
import com.i1314i.ourproject.po.shiro.Permission;
import com.i1314i.ourproject.po.shiro.Role;
import com.i1314i.ourproject.service.user.UserService;

import com.i1314i.ourproject.shiro.exception.CodeException;
import com.i1314i.ourproject.shiro.token.CaptchaUsernamePasswordToken;
import com.i1314i.ourproject.utils.inimsg.UserMsgUtils;
import com.i1314i.ourproject.utils.redisToken.TokenUtils;
import com.i1314i.ourproject.utils.redisToken.user.UserUtils;
import com.i1314i.ourproject.utils.spring.SpringUtil;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.SimplePrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class MyShiroRealm extends AuthorizingRealm {
	@Autowired
	private PermissionMapper permissionMapper;
	@Autowired
	private RoleMapper roleMapper;
	@Autowired
	private UserService userServices;
	@Autowired
	private UserUtils userUtils;

	private static final Logger logger = LoggerFactory.getLogger("adminLogger");

	public String getName() {
		return "myShiroRealm";
	}

	@Override
	public boolean supports(AuthenticationToken token) {
		return token instanceof CaptchaUsernamePasswordToken; //支持CaptchaUsernamePasswordToken类型的Token
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		CaptchaUsernamePasswordToken newToken=(CaptchaUsernamePasswordToken)token;
		String username = (String)newToken.getPrincipal();  //得到用户名
		Code code=newToken.getCode();

		if (!TokenUtils.verifyCode(code)){
			//验证码错误
			logger.info(username+": "+ UserMsgUtils.login_code_is_error_msg);
			throw new CodeException(UserMsgUtils.login_code_is_error_msg);
		}
		User usersql=null;
		try{
			usersql=userServices.selectUserByUserName(username);
			System.out.println(usersql.toString());
		}catch (Exception e){
			System.out.println(e.getMessage());
			throw new UnknownAccountException(); //如果用户名错误
		}



		if(usersql==null){
			logger.info(UserMsgUtils.login_error_msg);
			throw new UnknownAccountException(); //如果用户名错误
		}

		SimpleAuthenticationInfo ai=null;
		System.out.println();
		ai = new SimpleAuthenticationInfo(usersql.getUsername(),usersql.getPassword(), getName());
		ai.setCredentialsSalt(ByteSource.Util.bytes(usersql.getSalt()));

		return ai;
	}

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		logger.debug("权限配置");
		SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
		User user = userUtils.getCurrentUser("");
		List<Role> roles = roleMapper.listByUserId(user.getUserId());
		Set<String> roleNames = roles.stream().map(Role::getName).collect(Collectors.toSet());
		authorizationInfo.setRoles(roleNames);
		List<Permission> permissionList = permissionMapper.listByUserId(user.getUserId());
		userUtils.setPermissionSession(permissionList,"");
		Set<String> permissions = permissionList.stream().filter(p -> !StringUtils.isEmpty(p.getPermission()))
				.map(Permission::getPermission).collect(Collectors.toSet());
		authorizationInfo.setStringPermissions(permissions);

		return authorizationInfo;
	}

	/**
	 * 重写缓存key，否则集群下session共享时，会重复执行doGetAuthorizationInfo权限配置
	 */
	@Override
	protected Object getAuthorizationCacheKey(PrincipalCollection principals) {
		SimplePrincipalCollection principalCollection = (SimplePrincipalCollection) principals;
		Object object = principalCollection.getPrimaryPrincipal();

		if (object instanceof User) {
			User user = (User) object;

			return "authorization:cache:key:users:" + user.getUserId();
		}

		return super.getAuthorizationCacheKey(principals);
	}

}
