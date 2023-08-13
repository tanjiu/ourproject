package com.i1314i.ourproject.config;

import com.alibaba.druid.filter.Filter;
import com.alibaba.druid.filter.logging.Slf4jLogFilter;
import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import com.alibaba.druid.support.spring.stat.DruidStatInterceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.JdkRegexpMethodPointcut;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.transaction.annotation.EnableTransactionManagement;


import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * driud连接池相关
 * @author 平行时空
 * @created 2018-07-09 0:40
 **/

@Configuration
@PropertySource(value= "classpath:dao.properties",encoding = "UTF-8")
@EnableTransactionManagement
public class DruidConfig {
    private final static Logger logger= LoggerFactory.getLogger(DruidConfig.class);
    @Value("${spring.datasource.driver}")
    private String driver;
    @Value("${spring.datasource.url}")
    private String url;
    @Value("${spring.datasource.username}")
    private String username;
    @Value("${spring.datasource.password}")
    private String password;
    @Value("${spring.datasource.minIdle}")
    private Integer minIdle;
    @Value("${spring.datasource.maxActive}")
    private Integer maxActive;
    @Value("${spring.datasource.maxWait}")
    private Integer maxWait;

    //C3P0
    @Value("${spring.datasource.minPoolSize}")
    private Integer minPoolSize;
    @Value("${spring.datasource.maxPoolSize}")
    private Integer maxPoolSize;
    @Value("${spring.datasource.maxIdleTime}")
    private Integer maxIdleTime;
    @Value("${spring.datasource.initialPoolSize}")
    private Integer initialPoolSize;
    @Value("${spring.datasource.maxStatements}")
    private Integer maxStatements;
    @Value("${spring.dataSource.timeBetweenEvictionRunsMillis}")
    private Integer timeBetweenEvictionRunsMillis;
    @Value("${spring.dataSource.minEvictableIdleTimeMillis}")
    private Integer minEvictableIdleTimeMillis;
    @Value("${spring.dataSource.testWhileIdle}")
    private boolean testWhileIdle;
    @Value("${spring.dataSource.testOnBorrow}")
    private boolean testOnBorrow;
    @Value("${spring.dataSource.testOnReturn}")
    private boolean testOnReturn;
    @Value("${spring.dataSource.removeAbandoned}")
    private boolean removeAbandoned;
    @Value("${spring.dataSource.removeAbandonedTimeout}")
    private Integer removeAbandonedTimeout;
    @Value("${spring.dataSource.logAbandoned}")
    private boolean logAbandoned;

    @Value("${spring.dataSource.poolPreparedStatements}")
    private boolean poolPreparedStatements;
    @Value("${spring.dataSource.maxPoolPreparedStatementPerConnectionSize}")
    private Integer maxPoolPreparedStatementPerConnectionSize;
    @Value("${spring.dataSource.validationQuery}")
    private String validationQuery;
    @Value("${spring.dataSource.filters}")
    private String filters;

    @Value("${druid.loginUsername}")
    private String druidLoginUsername;
    @Value("${druid.loginPassword}")
    private String druidLoginPassword;

    @Value("${spring.datasource.postgresqldriver}")
    private String postgresqlDriver;

    @Value("${datasourceType}")
    private String datasourceType;
    @Value("${spring.datasource.postgresqlurl}")
    private String postUrl;
    @Value("${spring.datasource.postgresqlusername}")
    private String postsqlUername;
    @Value("${spring.datasource.postgresqlpassword}")
    private String postsqlPassword;

    /**
     * c3p0
     * @return
     * @throws PropertyVetoException
     */
//    @Bean
//    public DataSource dataSource() throws PropertyVetoException {
//        logger.info("初始化数据库...");
//        //c3p0连接池
//        ComboPooledDataSource dataSource=new ComboPooledDataSource();
//        dataSource.setJdbcUrl(url);
//        dataSource.setDriverClass(driver);
//        dataSource.setUser(username);
//        dataSource.setPassword(password);
//        dataSource.setMinPoolSize(minPoolSize);
//        dataSource.setMaxPoolSize(maxPoolSize);
//        dataSource.setMaxIdleTime(maxIdleTime);
//        dataSource.setInitialPoolSize(initialPoolSize);
//        dataSource.setMaxStatements(maxStatements);
//        return dataSource;
//    }

    /**
     * Druid连接池DataSource对象
     * @return
     */
    @Bean
    public DataSource dataSource(){
        logger.info("初始化数据库 Druid连接池加载...");
        DruidDataSource dataSource=new DruidDataSource();

        if(datasourceType.equalsIgnoreCase("mysql")){
            logger.info("mysql数据库连接池初始化");
            dataSource.setDriverClassName(driver);
            dataSource.setUrl(url);
            dataSource.setUsername(username);
            dataSource.setPassword(password);
        }else if(datasourceType.equalsIgnoreCase("postgresql")) {
            logger.info("postgresql数据库连接池初始化");
            dataSource.setDriverClassName(postgresqlDriver);
            dataSource.setUrl(postUrl);
            dataSource.setUsername(postsqlUername);
            dataSource.setPassword(postsqlPassword);
        }else  if (datasourceType.equalsIgnoreCase("oracle")){
            logger.info("oracle数据库连接池初始化");
            dataSource.setDriverClassName(postgresqlDriver);
            dataSource.setUrl(postUrl);
            dataSource.setUsername(postsqlUername);
            dataSource.setPassword(postsqlPassword);
        }


        dataSource.setInitialSize(initialPoolSize);
        dataSource.setMinIdle(minPoolSize);

        dataSource.setMaxPoolPreparedStatementPerConnectionSize(maxStatements);
        dataSource.setMaxActive(maxActive);

        dataSource.setMaxWait(maxWait);
        dataSource.setTestWhileIdle(testWhileIdle);
        dataSource.setTestOnBorrow(testOnBorrow);
        dataSource.setTestOnReturn(testOnReturn);
        dataSource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
        dataSource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
        dataSource.setPoolPreparedStatements(poolPreparedStatements);
        dataSource.setMaxPoolPreparedStatementPerConnectionSize(maxPoolPreparedStatementPerConnectionSize);
        dataSource.setRemoveAbandoned(removeAbandoned);
        dataSource.setRemoveAbandonedTimeout(removeAbandonedTimeout);
        dataSource.setLogAbandoned(logAbandoned);
        dataSource.setValidationQuery(validationQuery);
        List<Filter> filterList=new ArrayList<>();
        filterList.add(logFilter());
        dataSource.setProxyFilters(filterList);
        try {
            dataSource.setFilters(filters);
        } catch (SQLException e) {
            logger.error("druid configuration initialization filter", e);
        }
        return dataSource;

    }



    @Bean
    public Slf4jLogFilter logFilter(){
        Slf4jLogFilter slf4jLogFilter=new Slf4jLogFilter();
        slf4jLogFilter.setStatementExecutableSqlLogEnable(false);
        return slf4jLogFilter;
    }

    @Bean
    public ServletRegistrationBean druidServlet() {
        ServletRegistrationBean reg = new ServletRegistrationBean();
        reg.setServlet(new StatViewServlet());
        reg.addUrlMappings("/druid/*");
//        reg.addInitParameter("loginUsername", druidLoginUsername);
//        reg.addInitParameter("loginPassword", druidLoginPassword);
        return reg;
    }

    /**
     * Druid连接池监控
     * @return
     */
    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new WebStatFilter());
        filterRegistrationBean.addUrlPatterns("/*");
        filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
        filterRegistrationBean.addInitParameter("profileEnable", "true");
        filterRegistrationBean.addInitParameter("principalCookieName", "USER_COOKIE");
        filterRegistrationBean.addInitParameter("principalSessionName", "USER_SESSION");

        //是否能够重置数据.
        filterRegistrationBean.addInitParameter("resetEnable", "false");
        return filterRegistrationBean;
    }


    /**
     * spring监控
     * @return
     */

    @Bean
    public DruidStatInterceptor druidStatInterceptor() {
        DruidStatInterceptor dsInterceptor = new DruidStatInterceptor();
        return dsInterceptor;
    }

    @Bean
    @Scope("prototype")
    public JdkRegexpMethodPointcut druidStatPointcut() {
        JdkRegexpMethodPointcut pointcut = new JdkRegexpMethodPointcut();
        pointcut.setPattern("com.i1314i.ourproject.mapper.*");
        return pointcut;
    }

    @Bean
    public DefaultPointcutAdvisor druidStatAdvisor(DruidStatInterceptor druidStatInterceptor, JdkRegexpMethodPointcut druidStatPointcut) {
        DefaultPointcutAdvisor defaultPointAdvisor = new DefaultPointcutAdvisor();
        defaultPointAdvisor.setPointcut(druidStatPointcut);
        defaultPointAdvisor.setAdvice(druidStatInterceptor);
        return defaultPointAdvisor;
    }


    }
