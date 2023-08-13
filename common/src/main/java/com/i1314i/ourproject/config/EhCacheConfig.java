package com.i1314i.ourproject.config;

import net.sf.ehcache.CacheManager;
import org.apache.shiro.cache.ehcache.EhCacheManager;
import org.apache.shiro.io.ResourceUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

/**
 * @author 平行时空
 * @created 2018-11-23 21:26
 **/

//@Configuration
public class EhCacheConfig {
//    @Bean("ehCacheManager")
    public EhCacheManager ehCacheManagers() {

        EhCacheManager cacheManager = new EhCacheManager();
        cacheManager.setCacheManagerConfigFile("classpath:ehcache.xml");
        return cacheManager;
    }


//    @Bean
    public EhCacheManager ehCacheManager() {
        CacheManager cacheManager = CacheManager.getCacheManager("es");
        if(cacheManager == null){
            try {
                cacheManager = CacheManager.create(ResourceUtils.getInputStreamForPath("classpath:ehcache.xml"));
            } catch (IOException e) {
                throw new RuntimeException("initialize cacheManager failed");
            }
        }
        EhCacheManager ehCacheManager = new EhCacheManager();
        ehCacheManager.setCacheManager(cacheManager);
        return ehCacheManager;
    }

}
