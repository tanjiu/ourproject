package com.i1314i.ourproject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.HttpPutFormContentFilter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 *
 * @author 平行时空
 * @created 2018-09-23 10:40
 **/

@Configuration
@EnableWebMvc
public class WebMvcConfig {
    /**
     * 使form表单支持 restful
     * 在form加入隐藏字段 _method  put...
     * json交互不需要
     * @return
     */
    @Bean
    public HttpPutFormContentFilter httpPutFormContentFilter() {
        return new HttpPutFormContentFilter();
    }

}
