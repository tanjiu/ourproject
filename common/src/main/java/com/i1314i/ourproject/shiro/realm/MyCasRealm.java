package com.i1314i.ourproject.shiro.realm;

import com.alibaba.fastjson.JSON;
import com.i1314i.ourproject.mapper.PermissionMapper;
import com.i1314i.ourproject.mapper.RoleMapper;
import com.i1314i.ourproject.po.User;
import com.i1314i.ourproject.po.shiro.Permission;
import com.i1314i.ourproject.po.shiro.Role;
import com.i1314i.ourproject.service.user.UserService;
import com.i1314i.ourproject.utils.cookies.CookieUtils;
import com.i1314i.ourproject.utils.redisToken.user.UserUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.cas.CasRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;


import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author 平行时空
 * @created 2018-11-23 12:18
 **/
public class MyCasRealm extends CasRealm {
    @Autowired
    private PermissionMapper permissionMapper;
    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private UserService userServices;
    @Autowired
    private UserUtils userUtils;
    /**
     * 授权，获取用户的角色、权限
     */
    @SuppressWarnings("rawtypes")
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(
            PrincipalCollection principals) {
        if (principals == null) {
            throw new AuthorizationException("Principal对象不能为空");
        }
        Iterator it = principals.fromRealm(getName()).iterator();
        String username = null;
        if (it.hasNext()) {
            username = (String) it.next();
        } else {
            username = principals.toString();
        }
        //获取用户响应的permission
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


//        if (username != null) {
//            // 添加一个角色,不是配置意义上的添加,而是证明该用户拥有admin角色
//            info.addRole("admin");
//            // 添加权限
//            info.addStringPermission("admin:manage");
//            System.out.println("已为用户赋予了[admin]角色和[admin:manage]权限");
//            return info;
//        }

        System.out.println(username);
        return authorizationInfo;
    }

    /**
     * 认证，登录验证。
     */
    @SuppressWarnings("rawtypes")
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(
            AuthenticationToken token) throws AuthenticationException {
        AuthenticationInfo authenticationInfo = super
                .doGetAuthenticationInfo(token);
        PrincipalCollection principalCollection = authenticationInfo
                .getPrincipals();

        Map loginDataMap=null;
        try {
            loginDataMap = (Map) principalCollection.asList().get(1);
        }catch (Exception e){
            System.out.println("sss");
        }

//        String userAccount = (String) loginDataMap.get("name");
//        String userCode = (String) loginDataMap.get("employee");
//        String fullName = (String) loginDataMap.get("sn");
//        String department = (String) loginDataMap.get("department");
//        String email = (String) loginDataMap.get("mail");
        String name= (String) principalCollection.getPrimaryPrincipal();
        User user =userServices.selectUserByUserName(name);

//        primaryPrincipal
//        user.setUsername(userAccount);
//        System.out.println(JSON.toJSONString(loginDataMap));

//        {"empty":false,"primaryPrincipal":"casuser","realmNames":["com.i1314i.ourproject.shiro.realm.MyCasRealm_1"]}
//        user.setUserCode(userCode);
//        user.setUserAccount(userAccount);
//        user.setUname(fullName);
//        user.setDepartment(department);
//        user.setEmail(email);
        // 将用户保存在SESSION回话中


        userUtils.setUserSession( user,"");
        return authenticationInfo;
    }

}
