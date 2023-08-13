package com.i1314i.ourproject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

/**
 * @author 平行时空
 * @created 2018-09-28 14:46
 **/
@Configuration
public class I18nConfig {
    @Bean
    public ResourceBundleMessageSource messageSource(){
        ResourceBundleMessageSource source=new ResourceBundleMessageSource();
        source.setBasename("i18n/messages");
        source.setUseCodeAsDefaultMessage(true);
        source.setDefaultEncoding("UTF-8");
        return source;
    }
}
