package com.i1314i.ourproject.utils.redisToken.user.Impl;

import com.i1314i.ourproject.po.User;
import com.i1314i.ourproject.po.shiro.Permission;
import com.i1314i.ourproject.service.status.UserConstants;
import com.i1314i.ourproject.utils.redisToken.user.UserUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author 平行时空
 * @created 2018-11-24 10:45
 **/

public class SessionUtilsImpl implements UserUtils{
    @Override
    public User getCurrentUser(String token) {
        User user = (User) getSession().getAttribute(UserConstants.LOGIN_USER);
        return user;
    }

    @Override
    public User getCurrentUser(HttpServletRequest request) {

        User user = (User) getSession().getAttribute(UserConstants.LOGIN_USER);
        return user;
    }

    @Override
    public List<Permission> getCurrentPermissions(String token) {
        User user = (User) getSession().getAttribute(UserConstants.LOGIN_USER);
        List<Permission> list = user.getPermissionList();

        return list;
    }

    @Override
    public List<Permission> getCurrentPermissions(HttpServletRequest request) {

        User user = (User) getSession().getAttribute(UserConstants.LOGIN_USER);
        List<Permission> list = user.getPermissionList();
        return list;
    }

    @Override
    public void setPermissionSession(List<Permission> list, String token) {
        User user = (User) getSession().getAttribute(UserConstants.LOGIN_USER);
        user.setPermissionList(list);
        setUserSession(user,"");
    }

    @Override
    public void setPermissionSession(List<Permission> list, HttpServletRequest request) {
        User user = (User) getSession().getAttribute(UserConstants.LOGIN_USER);
        user.setPermissionList(list);
        setUserSession(user,"");
    }

    @Override
    public Session getSession() {
        Subject currentUser = SecurityUtils.getSubject();
        Session session = currentUser.getSession();

        return session;
    }

    @Override
    public void setUserSession(User user, String token) {
        getSession().setAttribute(UserConstants.LOGIN_USER, user);
    }

    @Override
    public void setUserSession(User user, HttpServletRequest request) {
        getSession().setAttribute(UserConstants.LOGIN_USER, user);
    }

    @Override
    public String getToken() {
        return getSession().getId().toString();
    }


}
