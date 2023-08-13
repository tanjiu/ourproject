package com.i1314i.ourproject.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * 事务配置类
 * @author 平行时空
 * @created 2018-10-04 21:28
 **/

@Configuration
@EnableTransactionManagement
public class TransactionalConfig {
    @Autowired
    DataSource dataSource;

    @Bean
    public PlatformTransactionManager txManager() {
        return new DataSourceTransactionManager(dataSource);
    }

}
