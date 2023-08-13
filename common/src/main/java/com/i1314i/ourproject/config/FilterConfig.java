package com.i1314i.ourproject.config;



import com.i1314i.ourproject.filter.CorsFilter;
import com.i1314i.ourproject.filter.TokenFilter;
import org.apache.shiro.authc.*;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 平行时空
 * @created 2018-09-08 17:31
 **/
//
//@Configuration
public class FilterConfig {

//    @Bean
//    public Filter tokenAuthorFilter(){
//        return new TokenFilter();//自定义的过滤器
//    }
//    @Bean
//    public Filter validatorFilter (){
//        return new ValidatorFilter();//自定义的过滤器
//    }

    @Bean
    public CorsFilter corsFilter(){
        return new CorsFilter();
    }
    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        CorsFilter domainFilter = new CorsFilter();
        registrationBean.setFilter(domainFilter);
        List<String> urlPatterns = new ArrayList<String>();
        urlPatterns.add("/*");
        registrationBean.setUrlPatterns(urlPatterns);
        return registrationBean;
    }



//    @Bean
//    public FilterRegistrationBean filterRegistrationBean2(){
//        FilterRegistrationBean filterRegistrationBean=new FilterRegistrationBean();
//        filterRegistrationBean.setFilter(validatorFilter());
//        filterRegistrationBean.addUrlPatterns("*");
//        filterRegistrationBean.setOrder(3);
//        return filterRegistrationBean;
//    }


}
