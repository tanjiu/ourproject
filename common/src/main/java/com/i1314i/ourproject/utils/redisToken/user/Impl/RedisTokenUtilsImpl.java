package com.i1314i.ourproject.utils.redisToken.user.Impl;

import com.alibaba.fastjson.JSON;
import com.i1314i.ourproject.mapper.PermissionMapper;
import com.i1314i.ourproject.po.User;
import com.i1314i.ourproject.po.shiro.Permission;
import com.i1314i.ourproject.utils.jedisUtils.IJedisClient;
import com.i1314i.ourproject.utils.redisToken.TokenUtils;
import com.i1314i.ourproject.utils.redisToken.user.UserUtils;
import org.apache.shiro.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author 平行时空
 * @created 2018-11-24 10:45
 **/

public class RedisTokenUtilsImpl implements UserUtils {
    @Autowired
    IJedisClient jedisClient;
    @Autowired
    PermissionMapper permissionMapper;

    @Override
    public User getCurrentUser(String token) {
        User user = TokenUtils.getToken(User.class,token);
        return user;
    }

    /**
     * 获取token对应对象
     * @param request
     * @return
     */

    @Override
    public User getCurrentUser(HttpServletRequest request) {
        String token=request.getHeader("token");
        if (token!=null){
            User user = TokenUtils.getToken(User.class,token);
            return user;
        }
        return null;
    }

    @Override
    public List<Permission> getCurrentPermissions(String token) {
        List<Permission> list = TokenUtils.getToken(User.class,token).getPermissionList();
        return list;
    }

    @Override
    public List<Permission> getCurrentPermissions(HttpServletRequest request) {
        String token=request.getHeader("token");
        if (token!=null){
            try {
                List<Permission> list = TokenUtils.getToken(User.class,token).getPermissionList();
                return list;
            }catch (Exception e){

            }
        }
        return null;
    }

    @Override
    public void setPermissionSession(List<Permission> list, String token) {
        User user= TokenUtils.getToken(User.class,token);
        user.setPermissionList(list);
        TokenUtils.setToken(token,JSON.toJSONString(user));
    }

    @Override
    public void setPermissionSession(List<Permission> list, HttpServletRequest request) {
        String token=request.getHeader("token");
        User user= TokenUtils.getToken(User.class,token);
        user.setPermissionList(list);
        TokenUtils.setToken(token,JSON.toJSONString(user));
    }

    @Override
    public Session getSession() {
        return null;
    }

    @Override
    public void setUserSession(User user, String token) {
        jedisClient.set(token,JSON.toJSONString(user),7200);
    }

    @Override
    public void setUserSession(User user, HttpServletRequest request) {
        String token=request.getHeader("token");
        jedisClient.set(token,JSON.toJSONString(user),7200);
    }

    @Override
    public String getToken() {
        return null;
    }


}
