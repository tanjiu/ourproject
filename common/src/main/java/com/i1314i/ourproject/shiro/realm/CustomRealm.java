package com.i1314i.ourproject.shiro.realm;


import com.alibaba.fastjson.JSON;
import com.i1314i.ourproject.po.User;
import com.i1314i.ourproject.po.shiro.Permission;
import com.i1314i.ourproject.po.shiro.Role;
import com.i1314i.ourproject.service.user.PermissionService;
import com.i1314i.ourproject.service.user.RoleService;
import com.i1314i.ourproject.shiro.token.IToken;
import com.i1314i.ourproject.utils.jedisUtils.IJedisClient;
import com.i1314i.ourproject.utils.redisToken.TokenUtils;
import com.i1314i.ourproject.utils.redisToken.user.UserUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 * @Author 平行时空
 * @Description 自定义 TokenRealm
 * @created 2018-09-16 22:38
 */
@Component
public class CustomRealm extends AuthorizingRealm {
    private Logger logger= LoggerFactory.getLogger(CustomRealm.class);
//    @Autowired
//    private UserService userService;
    @Autowired
    private RoleService roleServices;
    @Autowired
    private PermissionService permissionServices;
    @Autowired
    private IJedisClient jedisClient;
    @Autowired
    private UserUtils userUtils;
    /**
     * 必须重写此方法，不然会报错
     */
    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof IToken;
    }

    /**
     * 默认使用此方法进行用户名正确与否验证，错误抛出异常即可。
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("————token身份认证方法————");
        String token = (String) authenticationToken.getCredentials();
        if (token == null || !TokenUtils.verify(token)) {
            throw new AuthenticationException("token认证失败！");
        }

        User user=TokenUtils.getToken(User.class,token);

        if (user == null) {
            throw new AuthenticationException("该用户不存在！");
        }

        if(user.getUsername()==null){
            throw new AuthenticationException("token认证失败！");
        }

        if (user.getStatus() == 2) {
            throw new AuthenticationException("该用户已被封号！");
        }
        if (user.getStatus() == 3) {
            throw new AuthenticationException("该用户为无效用户！");
        }

        try{
            if(jedisClient.ttl(token)<60*40){
                jedisClient.expire(token,60*60*5);
            }
        }catch (Exception e){
            logger.info("token延期失败:"+token);
        }

        /* 数据库 查询部分 为减小数据库压力暂时只用缓存
        if(user.getUsername()==null){
            throw new AuthenticationException("token认证失败！");
        }

        User usersql=userService.selectUserByUserName(user.getUsername());

        if (usersql == null) {
            throw new AuthenticationException("该用户不存在！");
        }

        if (usersql.getStatus() == 0) {
            throw new AuthenticationException("该用户已被封号！");
        }

        */

        return new SimpleAuthenticationInfo(token, token, "MyRealm");

    }


    /**
     * 清除权限缓存
     */
    public void clearCachedAuthorization(){
        this.clearCachedAuthorizationInfo(SecurityUtils.getSubject().getPrincipals());
    }


    /**
     * 只有当需要检测用户权限的时候才会调用此方法，例如checkRole,checkPermission之类的
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        System.out.println("————权限认证————");
        User user=TokenUtils.getToken(User.class,principals.toString());

//        User usersql=userService.selectUserByUserName(user.getUsername());


        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();

        try{
            List<Role> roles = roleServices.getUserRoles(user);

            Set<String> roleNames = roles.stream().map(Role::getName).collect(Collectors.toSet());
            info.setRoles(roleNames);


            List<Permission> permissionList = permissionServices.getPermissionListByUserId(user);

            userUtils.setPermissionSession(permissionList,principals.toString());
            Set<String> permissions = permissionList.stream().filter(p -> !StringUtils.isEmpty(p.getPermission()))
                    .map(Permission::getPermission).collect(Collectors.toSet());
            info.setStringPermissions(permissions);
        }catch (Exception e){
            logger.info("customRealm is error");
        }


        return info;





        //每个角色拥有默认的权限
//        List<Permission> rolePermission =user.getUserRole().getPermissionList();
        //每个用户可以设置新的权限
//        List<Role>roleList=usersql.getUserRole().getRoleList();
//        Set<Permission>permissionSet=roleServices.selectPermissionByRole(roleList);
//        Set<String> roleSet = new HashSet<>();
//        Set<String>permSet=new HashSet<>();
//        //需要将 role, permission 封装到 Set 作为 info.setRoles(), info.setStringPermissions() 的参数
//
//        for (Role rolestring:roleList
//             ) {
//            roleSet.add(rolestring.getRole());
//        }
//
//        for (Permission permission:permissionSet
//             ) {
//            permSet.add(permission.getPermToken());
//        }

        //设置该用户拥有的角色和权限
//        info.setRoles(roleSet);
//        info.setStringPermissions(permSet);
//        return info;
    }
}
