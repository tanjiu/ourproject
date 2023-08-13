package com.i1314i.ourproject.service.user.login.Impl;

import com.i1314i.ourproject.mapper.PermissionMapper;
import com.i1314i.ourproject.mapper.UserMapper;
import com.i1314i.ourproject.po.ResultMap;
import com.i1314i.ourproject.po.Token;
import com.i1314i.ourproject.po.User;
import com.i1314i.ourproject.po.UserLoginReturn;
import com.i1314i.ourproject.po.shiro.Permission;
import com.i1314i.ourproject.service.manger.TokenManager;
import com.i1314i.ourproject.service.user.UserService;
import com.i1314i.ourproject.service.user.login.BaseLogin;
import com.i1314i.ourproject.utils.inimsg.UserMsgUtils;
import com.i1314i.ourproject.utils.jedisUtils.IJedisClient;
import com.i1314i.ourproject.utils.jedisUtils.JedisClient;
import com.i1314i.ourproject.utils.redisToken.TokenUtils;
import com.i1314i.ourproject.utils.redisToken.user.UserUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @author 平行时空
 * @created 2018-11-27 21:53
 **/

@Service("sessionLogin")
public class SessionLoginImpl implements BaseLogin {
    @Autowired
    private UserService userServices;
    @Autowired
    private ResultMap resultMap;

    @Autowired
    PermissionMapper permissionMapper;
    @Autowired
    private TokenManager tokenManager;
    @Autowired
    private UserUtils userUtils;
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
                Token loginToken=tokenManager.saveToken(usersql);
                userUtils.setUserSession(usersql,"token");
                logger.info("sessionLogin存储");
                UserLoginReturn userLoginReturn=new UserLoginReturn();
                userLoginReturn.setToken(loginToken.getToken());
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

        }else{
            return  resultMap.code(UserMsgUtils.login_error_code)
                    .msg(UserMsgUtils.login_error_msg);
        }

        return resultMap.start();
    }
}
