package com.i1314i.ourproject.shiro.service.impl;


import com.i1314i.ourproject.shiro.factory.ShiroPermissionFactory;
import com.i1314i.ourproject.shiro.service.IFilterChainDefinitionsService;
import org.apache.shiro.util.CollectionUtils;
import org.apache.shiro.web.filter.mgt.DefaultFilterChainManager;
import org.apache.shiro.web.filter.mgt.PathMatchingFilterChainResolver;
import org.apache.shiro.web.servlet.AbstractShiroFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author 平行时空
 * @created 2018-10-28 16:26
 **/
//@Service("filterChainDefinitionsServices")
public class FilterChainDefinitionsServiceImpl implements IFilterChainDefinitionsService{
//    @Autowired
    private ShiroPermissionFactory shiroPermissionFactory;

    @Override
    public void reloadFilterChains() {
        synchronized (shiroPermissionFactory) {   //强制同步，控制线程安全
            AbstractShiroFilter shiroFilter = null;
            try {
                shiroFilter = (AbstractShiroFilter) shiroPermissionFactory.getObject();

                PathMatchingFilterChainResolver resolver = (PathMatchingFilterChainResolver) shiroFilter
                        .getFilterChainResolver();
                // 过滤管理器
                DefaultFilterChainManager manager = (DefaultFilterChainManager) resolver.getFilterChainManager();
                // 清除权限配置
                manager.getFilterChains().clear();
                shiroPermissionFactory.getFilterChainDefinitionMap().clear();
                // 重新设置权限
                shiroPermissionFactory.setFilterChainDefinitions(ShiroPermissionFactory.definitions);//传入配置中的filterchains
                Map<String, String> chains = shiroPermissionFactory.getFilterChainDefinitionMap();
                //重新生成过滤链
                if (!CollectionUtils.isEmpty(chains)) {
                    chains.forEach((url, definitionChains) -> {
                        manager.createChain(url, definitionChains.trim().replace(" ", ""));
                    });
                }
                // manager.addToChain("/discover/banner", "perms", "sssss");


            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
