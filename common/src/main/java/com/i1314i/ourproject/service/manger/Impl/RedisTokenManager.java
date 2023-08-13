package com.i1314i.ourproject.service.manger.Impl;

import com.alibaba.fastjson.JSONObject;
import com.i1314i.ourproject.po.Token;
import com.i1314i.ourproject.po.User;
import com.i1314i.ourproject.service.manger.TokenManager;
import com.i1314i.ourproject.utils.jedisUtils.IJedisClient;
import org.apache.commons.lang3.time.DateUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * redis实现的Token
 * @author 平行时空
 * @created 2018-11-23 21:11
 **/
@Service
@PropertySource(value= "classpath:dao.properties",encoding = "UTF-8")
public class RedisTokenManager implements TokenManager {
    @Autowired
    private IJedisClient jedisClient;


    /**
     * token过期秒数
     */
    @Value("${token.expire.seconds}")
    private Integer expireSeconds;

    private static final String TOKEN_PREFIX = "tokens:";
    @Override
    public Token saveToken(User user) {

        String key = UUID.randomUUID().toString();

        jedisClient.set(TOKEN_PREFIX + key, JSONObject.toJSONString(user),
                expireSeconds);
        return new Token(key, DateUtils.addSeconds(new Date(), expireSeconds));

    }

    @Override
    public User getToken(String key) {

        String json = jedisClient.get(TOKEN_PREFIX + key);
        if (!StringUtils.isEmpty(json)) {
            User usernamePasswordToken = JSONObject.parseObject(json, User.class);

            return usernamePasswordToken;
        }
        return null;
    }

    @Override
    public boolean deleteToken(String key) {
        key = TOKEN_PREFIX + key;
        if (jedisClient.exists(key)) {
            jedisClient.del(key);

            return true;
        }
        return false;
    }
}
