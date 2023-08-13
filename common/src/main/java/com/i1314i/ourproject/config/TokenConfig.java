package com.i1314i.ourproject.config;

import com.i1314i.ourproject.service.user.login.BaseLogin;
import com.i1314i.ourproject.service.user.login.Impl.SessionLoginImpl;
import com.i1314i.ourproject.service.user.login.Impl.TokenLoginImpl;
import com.i1314i.ourproject.utils.common.TemplateUtils;
import com.i1314i.ourproject.utils.redisToken.user.Impl.RedisTokenUtilsImpl;
import com.i1314i.ourproject.utils.redisToken.user.Impl.SessionUtilsImpl;
import com.i1314i.ourproject.utils.redisToken.user.UserUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * @author 平行时空
 * @created 2018-07-25 20:48
 **/
@Configuration
public class TokenConfig {
    //跨域设置
    private CorsConfiguration buildConfig() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.addAllowedOrigin("*"); // 1允许任何域名使用
        corsConfiguration.addAllowedHeader("*"); // 2允许任何头
        corsConfiguration.addAllowedMethod("*"); // 3允许任何方法（post、get等）
        corsConfiguration.setAllowCredentials(true);
        return corsConfiguration;
    }

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", buildConfig());
        return new CorsFilter(source);
    }

//    @Bean
//    public ResultMap resultMap(){
//        return new ResultMap();
//    }

    @Bean
    public UserUtils userUtils(){
        UserUtils userUtils=null;
        String type=TemplateUtils.getPropertiesdata("other.properties","login.type");
        if(type.trim().equalsIgnoreCase("token")){
            userUtils=new RedisTokenUtilsImpl();
        }else {
            userUtils=new SessionUtilsImpl();
        }
        return userUtils;
    }


    @Bean
    public BaseLogin baseLogin(){
        String type=TemplateUtils.getPropertiesdata("other.properties","login.type");
        BaseLogin baseLogin=null;
        if(type.trim().equalsIgnoreCase("token")){
            baseLogin=new TokenLoginImpl();
        }else {
            baseLogin=new SessionLoginImpl();
        }

        return baseLogin;
    }



}
