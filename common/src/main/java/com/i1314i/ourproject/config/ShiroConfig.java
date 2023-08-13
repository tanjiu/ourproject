package com.i1314i.ourproject.config;


import com.i1314i.ourproject.filter.LogoutFilter;
import com.i1314i.ourproject.filter.RestfulFilter;
import com.i1314i.ourproject.filter.TokenFilter;
import com.i1314i.ourproject.po.shiro.Permission;
import com.i1314i.ourproject.service.user.PermissionService;
import com.i1314i.ourproject.shiro.credentials.RetryLimitHashedCredentialsMatcher;
import com.i1314i.ourproject.shiro.realm.CustomRealm;
import com.i1314i.ourproject.shiro.realm.MyCasRealm;
import com.i1314i.ourproject.shiro.realm.MyShiroRealm;
import com.i1314i.ourproject.shiro.realm.UserLoginRealm;
import com.i1314i.ourproject.shiro.realmAuthenticator.MyModularRealmAuthenticator;
import com.i1314i.ourproject.utils.common.TemplateUtils;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.util.concurrent.ConcurrentHashMap;
import org.apache.shiro.authc.pam.AtLeastOneSuccessfulStrategy;
import org.apache.shiro.authc.pam.FirstSuccessfulStrategy;
import org.apache.shiro.authc.pam.ModularRealmAuthenticator;
import org.apache.shiro.cache.ehcache.EhCacheManager;
import org.apache.shiro.cas.CasFilter;
import org.apache.shiro.cas.CasSubjectFactory;
import org.apache.shiro.io.ResourceUtils;
import org.apache.shiro.mgt.DefaultSessionStorageEvaluator;
import org.apache.shiro.mgt.DefaultSubjectDAO;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.util.StringUtils;

import javax.servlet.Filter;
import java.io.IOException;
import java.util.*;

/**
 * shiro配置类
 * @author 平行时空
 * @created 2018-09-17 17:04
 **/

@Configuration
@PropertySource(value= "classpath:other.properties",encoding = "UTF-8")
@ComponentScan("com.i1314i.ourproject")
public class ShiroConfig {

//    @Value("${login.type}")
    private String loginType=TemplateUtils.getPropertiesdata("other.properties","login.type");

    private String  casServerUrlPrefix=TemplateUtils.getPropertiesdata("other.properties","login.casServerUrlPrefix");

//    @Value("${login.casService}")
    private String casService=TemplateUtils.getPropertiesdata("other.properties","login.casService");


//    @Value("${login.casFilterUrlPattern}")
    private String casFilterUrlPattern=TemplateUtils.getPropertiesdata("other.properties","login.casFilterUrlPattern");
//    @Bean
    public ShiroFilterFactoryBean factory(PermissionService permissionServices) {
        ShiroFilterFactoryBean factoryBean = new ShiroFilterFactoryBean();
//        factoryBean.setSecurityManager(securityManager());

        String loginType=TemplateUtils.getPropertiesdata("other.properties","login.type");
        // 添加自己的过滤器
        Map<String, Filter> filterMap = new HashMap<>();
        //设置我们自定义的token过滤器

        if(loginType.trim().equalsIgnoreCase("token")){
            filterMap.put("token", new TokenFilter());
        }

        if (loginType.trim().equalsIgnoreCase("cas")){
            filterMap.put("casFilter",new CasFilter());
        }

        if(loginType.trim().equalsIgnoreCase("session")){
            filterMap.put("authc", new RestfulFilter());
            filterMap.put("logout", new LogoutFilter());
        }






        /**
         * 登出
         */


//        filterMap.put("urlFilter",new ResourceCheckFilter(permissions));

        factoryBean.setFilters(filterMap);








        Map<String, String> filterRuleMap = new ConcurrentHashMap<>();
        // 所有请求通过我们自己的token Filter

        if(loginType.trim().equalsIgnoreCase("token")){
            filterRuleMap.put("/**", "token");
        }


        if (loginType.trim().equalsIgnoreCase("cas")){
            filterRuleMap.put("/shiro-cas","casFilter");
        }

        if (loginType.trim().equalsIgnoreCase("session")){
//            filterRuleMap.put("/shiro-cas","casFilter");
            filterRuleMap.put("/**", "authc");
            filterRuleMap.put("/logout", "logout");
        }



//        filterRuleMap.put("/**","urlFilter");
        //数据库动态权限
        List<Permission> permissions = permissionServices.findUrlPermissionList();
        Map<String, String> otherChains = new HashMap<String,String>();
        permissions.stream().forEach((per)->{
            if(!StringUtils.isEmpty(per.getHref())){
                otherChains.put(per.getHref(),"perms["+per.getPermission()+"]");
            }
        });

        filterRuleMap.putAll(otherChains);
        // 访问 /unauthorized/** 不通过TokenFilters
        filterRuleMap.put("/unauthorized/**", "anon");
        filterRuleMap.put("/public/**", "anon");
        filterRuleMap.put("/static/**", "anon");



        filterRuleMap.put("/unauthorized/**", "anon");
        filterRuleMap.put("/public/**", "anon");
        filterRuleMap.put("/static/**", "anon");
        filterRuleMap.put("/filter.js", "anon");

        filterRuleMap.put("/css/**", "anon");
        filterRuleMap.put("/fonts/**", "anon");
        filterRuleMap.put("/images/**", "anon");
        filterRuleMap.put("/img/**", "anon");
        filterRuleMap.put("/js/**", "anon");
        filterRuleMap.put("/sys/login/**", "anon");
        filterRuleMap.put("/files/*", "anon");
        filterRuleMap.put("/swagger-resources/**", "anon");




        factoryBean.setLoginUrl("/login.html");
        factoryBean.setSuccessUrl("/index.html");

        factoryBean.setFilterChainDefinitionMap(filterRuleMap);
        return factoryBean;
    }


    @Bean
    public ShiroFilterFactoryBean shirFilter(SecurityManager securityManager,PermissionService permissionServices) {
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();

        shiroFilterFactoryBean.setSecurityManager(securityManager);


        // 拦截器.
        Map<String, String> filterChainDefinitionMap = new LinkedHashMap<String, String>();




        filterChainDefinitionMap.put("/unauthorized/**", "anon");
        filterChainDefinitionMap.put("/public/**", "anon");
        filterChainDefinitionMap.put("/static/**", "anon");
        filterChainDefinitionMap.put("/filter.js", "anon");

        filterChainDefinitionMap.put("/css/**", "anon");
        filterChainDefinitionMap.put("/fonts/**", "anon");
        filterChainDefinitionMap.put("/images/**", "anon");
        filterChainDefinitionMap.put("/img/**", "anon");
        filterChainDefinitionMap.put("/js/**", "anon");
        filterChainDefinitionMap.put("/sys/login/**", "anon");
        filterChainDefinitionMap.put("/files/*", "anon");
        filterChainDefinitionMap.put("/swagger-resources/**", "anon");

//        shiroFilterFactoryBean.setLoginUrl("/login.html");
//        shiroFilterFactoryBean.setSuccessUrl("/index.html");


        List<Permission> permissions = permissionServices.findUrlPermissionList();
        Map<String, String> otherChains = new HashMap<String,String>();
        permissions.stream().forEach((per)->{
            if(!StringUtils.isEmpty(per.getHref())){
                otherChains.put(per.getHref(),"perms["+per.getPermission()+"]");
            }
        });

        filterChainDefinitionMap.putAll(otherChains);






        if(loginType.trim().equalsIgnoreCase("token")){
            System.out.println("token拦截器");
            filterChainDefinitionMap.put("/**", "token");
            filterChainDefinitionMap.put("/login.html", "anon");
             shiroFilterFactoryBean.setLoginUrl("/login.html");
            TokenFilter tokenFilter=new TokenFilter();
            shiroFilterFactoryBean.getFilters().put("token",tokenFilter);
//            shiroFilterFactoryBean.getFilters().put("ssss",new CasUrlFilter());
//            filterChainDefinitionMap.put("/**", "ssss");
        }


        if (loginType.trim().equalsIgnoreCase("cas")){
            System.out.println("cas拦截器");

            CasFilter casFilter=new CasFilter();
            String loginUrl = casServerUrlPrefix + "/login?service="  + casService+casFilterUrlPattern;
            shiroFilterFactoryBean.setLoginUrl(loginUrl);
            casFilter.setFailureUrl(loginUrl);

            shiroFilterFactoryBean.getFilters().put("casFilter", casFilter);

            org.apache.shiro.web.filter.authc.LogoutFilter logoutFilter = new org.apache.shiro.web.filter.authc.LogoutFilter();
            logoutFilter.setRedirectUrl(casServerUrlPrefix + "/logout?service=" + casService);

            RestfulFilter restfulFilter=new RestfulFilter();
            shiroFilterFactoryBean.getFilters().put("authc", restfulFilter);
            shiroFilterFactoryBean.getFilters().put("logout", logoutFilter);
            filterChainDefinitionMap.put("/shiro-cas","casFilter");

            filterChainDefinitionMap.put("/**", "authc");
        }

        if (loginType.trim().equalsIgnoreCase("session")){
            System.out.println("session拦截器");
            filterChainDefinitionMap.put("/login.html", "anon");
            shiroFilterFactoryBean.setLoginUrl("/login.html");
            LogoutFilter logoutFilter=new LogoutFilter();
            RestfulFilter restfulFilter=new RestfulFilter();
            shiroFilterFactoryBean.getFilters().put("authc", restfulFilter);
            shiroFilterFactoryBean.getFilters().put("logout", logoutFilter);

            filterChainDefinitionMap.put("/**", "authc");
            filterChainDefinitionMap.put("/logout", "logout");

        }


        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);
        return shiroFilterFactoryBean;
    }


//    /**
//     * session restful
//     * @return
//     */
//    @Bean
//    public   RestfulFilter restfulFilter(){
//        return new RestfulFilter();
//    }
//
//    /**
//     * 登出
//     * @return
//     */
//    @Bean
//    public LogoutFilter logoutFilter(){
//        LogoutFilter logoutFilter = new LogoutFilter();
//
//        logoutFilter.setRedirectUrl("/login.html");
//        return logoutFilter;
//    }
//
//    /**
//     * redis Token
//     * @return
//     */
//    @Bean
//    public TokenFilter tokenFilter(){
//        return new TokenFilter();
//    }
//    @Bean
//    public CasFilter casFilter(){
//        return new CasFilter();
//    }

    /**
     * 注入 securityManager
     */
    @Bean
    public DefaultWebSecurityManager securityManager() {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        // 设置自定义 realm.

        //身份验证(权限)
//        securityManager.setRealm(customRealm());
        List realmList=new ArrayList();
        realmList.add(customRealm());
        realmList.add(myCasRealm());
        realmList.add(myShiroRealm());

        if (loginType.trim().equalsIgnoreCase("cas")){
            securityManager.setSubjectFactory(new CasSubjectFactory());
        }

        securityManager.setRealms(realmList);
        //注入缓存管理器
        securityManager.setCacheManager( ehCacheManager());
        securityManager.setAuthenticator(modularRealmAuthenticator());
        /*
        jwt或者token
         * 关闭shiro自带的session，详情见文档
         * http://shiro.apache.org/session-management.html#SessionManagement-StatelessApplications%28Sessionless%29
         */


        String loginType=TemplateUtils.getPropertiesdata("other.properties","login.type");
        if(loginType.trim().equalsIgnoreCase("token")||loginType.trim().equalsIgnoreCase("jwt")){
            securityManager.setSubjectDAO(defaultSubjectDAO());
        }

        return securityManager;
    }






    @Bean
    public EhCacheManager ehCacheManager() {
        CacheManager cacheManager = CacheManager.getCacheManager("es");
        if(cacheManager == null){
            try {
                cacheManager = CacheManager.create(ResourceUtils.getInputStreamForPath("classpath:ehcache.xml"));
            } catch (IOException e) {
                throw new RuntimeException("initialize cacheManager failed");
            }
        }
        EhCacheManager ehCacheManager = new EhCacheManager();
        ehCacheManager.setCacheManager(cacheManager);
        return ehCacheManager;
    }

    @Bean
    public ModularRealmAuthenticator modularRealmAuthenticator(){
        ModularRealmAuthenticator realmAuthenticator=new MyModularRealmAuthenticator();
        List<Realm>realmList=new ArrayList<>();

        String loginType=TemplateUtils.getPropertiesdata("other.properties","login.type");

//        if (loginType.trim().equalsIgnoreCase("session")){
//            realmList.add(myShiroRealm());
//        }
//
//        if(loginType.trim().equalsIgnoreCase("token")){
//
//        }

        realmList.add(userLoginRealm());  //普通用户

        realmList.add(myShiroRealm());

        realmList.add(myCasRealm());

        realmList.add(customRealm());  //token
//        realmList.add(adminLoginRealm());  //管理员
        realmAuthenticator.setRealms(realmList);
        realmAuthenticator.setAuthenticationStrategy(firstSuccessfulStrategy());
        return realmAuthenticator;
    }


    @Bean
    public MyShiroRealm myShiroRealm() {
        MyShiroRealm myShiroRealm = new MyShiroRealm();
        myShiroRealm.setCredentialsMatcher(retryLimitHashedCredentialsMatcher());
        return myShiroRealm;
    }



    /**
     * 添加注解支持
     */
    @Bean
    public DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator() {
        DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator = new DefaultAdvisorAutoProxyCreator();
        // 强制使用cglib，防止重复代理和可能引起代理出错的问题
        // https://zhuanlan.zhihu.com/p/29161098
        defaultAdvisorAutoProxyCreator.setProxyTargetClass(true);
        return defaultAdvisorAutoProxyCreator;
    }

    /**
     * 用户登录realm
     * @return
     */
    @Bean
    public UserLoginRealm userLoginRealm(){
        UserLoginRealm loginRealm= new UserLoginRealm();
        loginRealm.setCredentialsMatcher(retryLimitHashedCredentialsMatcher());
        return loginRealm;
    }




    @Bean
    public CustomRealm customRealm(){
        return new CustomRealm();
    }



//     <!-- 单点登录下的配置 -->
//     <bean id="casRealm" class="com.lora.shiro.MyCasRealm">
//        <property name="defaultRoles" value="ROLE_USER"/>
//        <!-- cas服务端地址前缀 -->
//        <property name="casServerUrlPrefix" value="http://cas.uat.qa.nt.ctripcorp.com/caso" />
//        <!-- 应用服务地址，用来接收cas服务端票据 -->
//        <!-- 客户端的回调地址设置，必须和上面的shiro-cas过滤器casFilter拦截的地址一致 -->
//        <property name="casService" value="http://127.0.0.1:8080/springdemo/shiro-cas" />
//    </bean>

    @Bean
    public MyCasRealm myCasRealm() {
        MyCasRealm casRealm = new MyCasRealm();
//        casRealm.setCredentialsMatcher(retryLimitHashedCredentialsMatcher());
        casRealm.setCachingEnabled(true);

        casRealm.setCasServerUrlPrefix(casServerUrlPrefix);
        casRealm.setCasService(casService+casFilterUrlPattern);

        return  casRealm;
    }



//    @Bean
//    public MyCasRealm myCasRealm(){
//        MyCasRealm casRealm=new MyCasRealm();
//        casRealm.setDefaultRoles("ROLE_USER");
//        casRealm.setCasServerUrlPrefix(TemplateUtils.getPropertiesdata("other.properties","login.casServerUrlPrefix"));
//        casRealm.setCasService(TemplateUtils.getPropertiesdata("other.properties","login.login.casService"));
//
//        return casRealm;
//    }


    /**
     * 验证错误密码次数锁定
     * @return
     */
    @Bean
    public RetryLimitHashedCredentialsMatcher retryLimitHashedCredentialsMatcher(){
        if( ehCacheManager()==null){
            System.out.println("ssss");
        }
        RetryLimitHashedCredentialsMatcher matcher=new RetryLimitHashedCredentialsMatcher( ehCacheManager());
        matcher.setHashAlgorithmName("md5");
        matcher.setHashIterations(2);
        matcher.setStoredCredentialsHexEncoded(true);
        return matcher;
    }


    @Bean
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(DefaultWebSecurityManager securityManager) {
        AuthorizationAttributeSourceAdvisor advisor = new AuthorizationAttributeSourceAdvisor();
        advisor.setSecurityManager(securityManager);
        return advisor;
    }


    /**
     * 禁用sessionManger
     *   * 关闭shiro自带的session，详情见文档
     * http://shiro.apache.org/session-management
     * .html#SessionManagement-StatelessApplications%28Sessionless%29
     * @return
     */

    @Bean
    public DefaultSessionStorageEvaluator sessionStorageEvaluator(){
        DefaultSessionStorageEvaluator  DefaultSessionStorageEvaluator=new DefaultSessionStorageEvaluator();
        DefaultSessionStorageEvaluator.setSessionStorageEnabled(false);
        return DefaultSessionStorageEvaluator;
    }

    @Bean
    public DefaultSubjectDAO defaultSubjectDAO(){
        DefaultSubjectDAO defaultSubjectDAO=new DefaultSubjectDAO();
        defaultSubjectDAO.setSessionStorageEvaluator(sessionStorageEvaluator());
        return defaultSubjectDAO;
    }

    @Bean
    public LifecycleBeanPostProcessor lifecycleBeanPostProcessor() {
        return new LifecycleBeanPostProcessor();
    }

    /**
     * 只要有一个Realm验证成功即可，和FirstSuccessfulStrategy不同，返回所有Realm身份验证成功的认证信息；
     * @return
     */
    public AtLeastOneSuccessfulStrategy atLeastOneSuccessfulStrategy(){
        return new AtLeastOneSuccessfulStrategy();
    }

    /**
     * 只要有一个Realm验证成功即可，只返回第一个Realm身份验证成功的认证信息，其他的忽略
     * @return
     */
    public FirstSuccessfulStrategy firstSuccessfulStrategy(){
        return new FirstSuccessfulStrategy();
    }



    @Bean
    public DefaultWebSessionManager sessionManager(){
        DefaultWebSessionManager defaultWebSessionManager =new DefaultWebSessionManager();
        defaultWebSessionManager.setSessionIdUrlRewritingEnabled(false);
        return  defaultWebSessionManager;
    }

}
