package com.i1314i.ourproject.utils.redisToken;

import com.alibaba.fastjson.JSON;
import com.i1314i.ourproject.mapper.PermissionMapper;
import com.i1314i.ourproject.po.Token;
import com.i1314i.ourproject.po.User;
import com.i1314i.ourproject.po.shiro.Permission;
import com.i1314i.ourproject.utils.jedisUtils.IJedisClient;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author 平行时空
 * @created 2018-10-09 23:51
 **/
public class UserUtil {
    @Autowired
    IJedisClient jedisClient;
    @Autowired
    PermissionMapper permissionMapper;
    public static User getCurrentUser(String token) {
        User user = TokenUtils.getToken(User.class,token);
        return user;
    }


    /**
     * 获取token对应对象
     * @param request
     * @return
     */
    public static User getCurrentUser(HttpServletRequest request){
        String token=request.getHeader("token");
        if (token!=null){
            User user = TokenUtils.getToken(User.class,token);
            return user;
        }
        return null;
    }


    @SuppressWarnings("unchecked")
    public static List<Permission> getCurrentPermissions(String token) {
        List<Permission> list = TokenUtils.getToken(User.class,token).getPermissionList();
        return list;
    }

    @SuppressWarnings("unchecked")
    public static List<Permission> getCurrentPermissions(HttpServletRequest request) {
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

    public static void setPermissionSession(List<Permission> list,String token) {
         User user= TokenUtils.getToken(User.class,token);
         user.setPermissionList(list);
         TokenUtils.setToken(JSON.toJSONString(user),token);
    }

    public static void setPermissionSession(List<Permission> list,HttpServletRequest request) {
        String token=request.getHeader("token");
        User user= TokenUtils.getToken(User.class,token);
        user.setPermissionList(list);
        TokenUtils.setToken(JSON.toJSONString(user),token);
    }

}
