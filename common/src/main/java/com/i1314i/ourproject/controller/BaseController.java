package com.i1314i.ourproject.controller;

import com.alibaba.fastjson.JSON;

import com.i1314i.ourproject.po.User;
import com.i1314i.ourproject.utils.jedisUtils.IJedisClient;
import com.i1314i.ourproject.utils.redisToken.user.UserUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 平行时空
 * @created 2018-09-17 22:13
 **/
@Controller
public class BaseController {
    @Autowired
    private IJedisClient jedisClient;
    @Autowired
    private UserUtils userUtils;
    /**
     * 获取token对应对象
     * @param clazz
     * @param request
     * @param
     * @return
     */
    public User  getToken(Class clazz, HttpServletRequest request){
       return userUtils.getCurrentUser(request);
    }


    public <T> T getTokens(Class<T> clazz,HttpServletRequest request){
        String token=request.getHeader("token");
        T user=null;
        try{
            if(jedisClient.exists(token)){
                user= JSON.parseObject(jedisClient.get(token),clazz);
            }
        }catch (Exception e){
            return null;
        }

        return user;
    }


    public <T> T getSessionUser(Class<T> clazz,HttpServletRequest request){
        return null;
    }
}