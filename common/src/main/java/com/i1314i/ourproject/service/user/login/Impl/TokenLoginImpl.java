package com.i1314i.ourproject.service.user.login.Impl;

import com.i1314i.ourproject.mapper.PermissionMapper;
import com.i1314i.ourproject.mapper.UserMapper;
import com.i1314i.ourproject.po.ResultMap;
import com.i1314i.ourproject.po.Token;
import com.i1314i.ourproject.po.User;
import com.i1314i.ourproject.po.UserLoginReturn;
import com.i1314i.ourproject.po.shiro.Permission;
import com.i1314i.ourproject.service.user.UserService;
import com.i1314i.ourproject.service.user.impl.UserServiceimpl;
import com.i1314i.ourproject.service.user.login.BaseLogin;
import com.i1314i.ourproject.utils.inimsg.UserMsgUtils;
import com.i1314i.ourproject.utils.jedisUtils.IJedisClient;
import com.i1314i.ourproject.utils.jedisUtils.JedisClient;
import com.i1314i.ourproject.utils.redisToken.TokenUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @author 平行时空
 * @created 2018-11-27 21:54
 **/
@Service("tokenLogin")
public class TokenLoginImpl implements BaseLogin {
    @Autowired
    private UserService userServices;
    @Autowired
    private ResultMap resultMap;
    @Autowired
    PermissionMapper permissionMapper;
    private Logger logger= LoggerFactory.getLogger(TokenLoginImpl.class);

    @Override
    public ResultMap getUserToken(User user) {
        User usersql=null;
        try{
            usersql=userServices.selectUserByUserName(user.getUsername());
            usersql.setPermissionList(permissionMapper.listByUserId(user.getUserId()));
        }catch (Exception e){
            logger.info(user.getUsername()+" :user登陆数据库查询错误");
            return  resultMap.code(UserMsgUtils.login_error_code)
                    .msg(UserMsgUtils.login_error_msg);
        }

        Token token=null;

        if(user!=null){
            String gettoken="usertoken_"+ TokenUtils.makeToken();
            boolean tokenvalue=TokenUtils.makeToken(User.class,usersql,gettoken);
            logger.info("tokenLogin存储");
            if(tokenvalue){
                UserLoginReturn userLoginReturn=new UserLoginReturn();
                userLoginReturn.setToken(gettoken);
                List<Permission> permissionList=permissionMapper.listAll();
                Set<String> perSet=new CopyOnWriteArraySet<>();
                permissionList.stream().forEach((per)->{
                    if(!StringUtils.isEmpty(per.getPermission())){
                        perSet.add(per.getPermission());
                    }
                });
                userLoginReturn.setPermissons(perSet);
                resultMap.code(UserMsgUtils.login_success_code)
                        .msg(UserMsgUtils.login_success_msg)
                        .data(userLoginReturn);
            }
        }else{
            return  resultMap.code(UserMsgUtils.login_error_code)
                    .msg(UserMsgUtils.login_error_msg);
        }

        return resultMap.start();
    }
}
