package com.i1314i.ourproject.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

import javax.sql.DataSource;

/** Quartz配置类
 * @author 平行时空
 * @created 2018-09-25 20:05
 **/

@Configuration
public class QuartzConfig {
    @Autowired
    private DataSource dataSource;


    @Bean
    public SchedulerFactoryBean quartzScheduler(){
        SchedulerFactoryBean factoryBean=new SchedulerFactoryBean();
        factoryBean.setDataSource(dataSource);
        factoryBean.setApplicationContextSchedulerContextKey("applicationContextKey");
        factoryBean.setConfigLocation(new ClassPathResource("quartz.properties"));
        return factoryBean;
    }
}
