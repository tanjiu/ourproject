package com.i1314i.ourproject.utils.i18n;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author 平行时空
 * @created 2018-09-28 14:52
 **/

@Component
public class I18nUtils  implements ApplicationContextAware {
    private static ApplicationContext applicationContext;

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    @Override
    public void setApplicationContext(ApplicationContext args) throws BeansException {
        applicationContext=args;
    }

    public static Object getBean(String id){
        Object object=null;
        object=applicationContext.getBean(id);
        return object;
    }


}
