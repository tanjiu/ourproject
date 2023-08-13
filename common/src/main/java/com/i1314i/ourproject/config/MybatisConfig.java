package com.i1314i.ourproject.config;

/**
 * @author 平行时空
 * @created 2018-04-04 23:12
 **/

import com.github.pagehelper.PageHelper;
import org.apache.ibatis.executor.ErrorContext;
import org.apache.ibatis.plugin.Interceptor;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.io.IOException;
import java.util.Properties;

@Configuration
@PropertySource(value= "classpath:dao.properties",encoding = "UTF-8")
@MapperScan("com.i1314i.ourproject")
public class MybatisConfig {
    private final static Logger logger= LoggerFactory.getLogger(MybatisConfig.class);

    @Autowired
    private DataSource dataSource;



    /**
     * SqlSession工厂
     * @return
     * @throws PropertyVetoException
     * @throws IOException
     */
    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean() throws PropertyVetoException, IOException {
        ResourcePatternResolver resourcePatternResolver=new PathMatchingResourcePatternResolver();
        SqlSessionFactoryBean sqlSessionFactoryBean =new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setConfigLocation(resourcePatternResolver.getResource("classpath:mybatisConfig.xml"));
        sqlSessionFactoryBean.setMapperLocations(resourcePatternResolver.getResources("classpath*:mapping/*.xml"));

        //开启pageHelper
        sqlSessionFactoryBean.setPlugins(new Interceptor[]{pageHelper()});

        try {            //开启驼峰命名转换
            sqlSessionFactoryBean.getObject().getConfiguration().setMapUnderscoreToCamelCase(true);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }finally {
            ErrorContext.instance().reset();
        }
        return sqlSessionFactoryBean;
    }

    //配置pageHelper分页插件

    @Bean
    public PageHelper pageHelper(){
        PageHelper pageHelper = new PageHelper();
        Properties properties = new Properties();
        properties.setProperty("offsetAsPageNum","true");
        properties.setProperty("rowBoundsWithCount","true");
        properties.setProperty("reasonable","true");
//        properties.setProperty("dialect","mysql");    //配置mysql数据库的方言
        pageHelper.setProperties(properties);
        return pageHelper;
    }



//    //事务管理器
//    @Bean(name="transactionManager")
//    public DataSourceTransactionManager dataSourceTransactionManager() throws PropertyVetoException {
//        DataSourceTransactionManager dataSourceTransactionManager=new DataSourceTransactionManager();
//        dataSourceTransactionManager.setDataSource(dataSource);
//        return dataSourceTransactionManager;
//    }

/*
    @Bean(name="transactionInterceptor")
    public TransactionInterceptor interceptor() throws PropertyVetoException {
        TransactionInterceptor interceptor=new TransactionInterceptor();

        interceptor.setTransactionManager(dataSourceTransactionManager());

        Properties attributes=new Properties();
        attributes.setProperty("save*","REQUIRED");
        attributes.setProperty("add*","REQUIRED");
        attributes.setProperty("create*","REQUIRED");
        attributes.setProperty("delete*","REQUIRED");
        attributes.setProperty("update*","REQUIRED");
        attributes.setProperty("find*","SUPPORTS,readOnly");
        attributes.setProperty("select*","SUPPORTS,readOnly");
        attributes.setProperty("get*","SUPPORTS,readOnly");
        interceptor.setTransactionAttributes(attributes);
        return interceptor;
    }

    */
}
