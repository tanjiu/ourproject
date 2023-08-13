package com.i1314i.ourproject;

import org.springframework.boot.SpringApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Hello world!
 *
 */
//@SpringBootApplication
@ComponentScan(basePackages = "com.i1314i.ourproject")
@EnableTransactionManagement
@EnableScheduling
@EnableCaching  //开启缓存
public class App 
{
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
