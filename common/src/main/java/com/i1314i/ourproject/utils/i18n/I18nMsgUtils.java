package com.i1314i.ourproject.utils.i18n;

import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

/**
 * @author 平行时空
 * @created 2018-09-28 14:56
 **/
public class I18nMsgUtils {
    public static String getMsg(String key){
        Locale locale = LocaleContextHolder.getLocale();
        System.out.println(locale);
        return I18nUtils.getApplicationContext().getMessage(key,null,locale);
    }

    public static String loadMessage(String key,Object...args) throws UnsupportedEncodingException {
        ReloadableResourceBundleMessageSource messageSource=new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("classpath:/i18n/messages");
        messageSource.setUseCodeAsDefaultMessage(true);
        messageSource.setCacheSeconds(0);
        messageSource.setDefaultEncoding(StandardCharsets.UTF_8.name());
        Locale locale= LocaleContextHolder.getLocale();
        System.out.println(locale);
        return messageSource.getMessage(key,null,locale);
    }
}
