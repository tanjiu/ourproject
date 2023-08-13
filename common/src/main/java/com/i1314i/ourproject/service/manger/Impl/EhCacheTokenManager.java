package com.i1314i.ourproject.service.manger.Impl;

import com.i1314i.ourproject.po.Token;
import com.i1314i.ourproject.po.User;
import com.i1314i.ourproject.service.manger.TokenManager;
import net.sf.ehcache.Cache;
import net.sf.ehcache.Element;
import org.apache.commons.lang3.time.DateUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.cache.ehcache.EhCacheManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

/**
 * EhCache实现的Token<br>
 * 默认采用此实现
 * @author 平行时空
 * @created 2018-11-23 21:24
 **/

@Primary
@Service
@PropertySource(value= "classpath:dao.properties",encoding = "UTF-8")
public class EhCacheTokenManager implements TokenManager {
    @Autowired
    private EhCacheManager ehCacheManager;

    /**
     * token过期秒数
     */
    @Value("${token.expire.seconds}")
    private Integer expireSeconds;

    @Override
    public Token saveToken(User user) {
        Cache cache = ehCacheManager.getCacheManager().getCache("login_user_tokens");

        String key = UUID.randomUUID().toString();
        Element element = new Element(key, user);
        element.setTimeToLive(expireSeconds);
        cache.put(element);

        return new Token(key, DateUtils.addSeconds(new Date(), expireSeconds));
    }

    @Override
    public User getToken(String key) {
        Cache cache = ehCacheManager.getCacheManager().getCache("login_user_tokens");
        Element element = cache.get(key);
        if (element != null) {
            return (User) element.getObjectValue();
        }

        return null;
    }

    @Override
    public boolean deleteToken(String key) {
        Cache cache = ehCacheManager.getCacheManager().getCache("login_user_tokens");
        return cache.remove(key);
    }
}
