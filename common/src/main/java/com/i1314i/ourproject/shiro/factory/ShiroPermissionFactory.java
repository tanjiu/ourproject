package com.i1314i.ourproject.shiro.factory;

import com.i1314i.ourproject.po.shiro.Permission;
import com.i1314i.ourproject.service.user.PermissionService;
import net.sf.ehcache.util.concurrent.ConcurrentHashMap;
import org.apache.shiro.config.Ini;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.util.CollectionUtils;
import org.apache.shiro.web.config.IniFilterChainResolverFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 平行时空
 * @created 2018-10-28 15:35
 **/

public class ShiroPermissionFactory extends ShiroFilterFactoryBean {
    /**配置中的过滤链*/
    public static String definitions;
    public Map<String ,String>  basefilterChainDefinitionMap=new ConcurrentHashMap<>();
    /**权限service*/

//    @Autowired
     private PermissionService permissionServices;
    /**
     * 从数据库动态读取权限
     */
    @Override
    public void setFilterChainDefinitions(String definitions) {
        // 记录配置中的过滤链
        ShiroPermissionFactory.definitions = definitions;

        //数据库动态权限
//        List<Permission> permissions = permissionMapper.findUrlPermissionList();
//
//        Map<String, String> otherChains = new HashMap<String,String>();
//
//        permissions.stream().forEach((per)->{
//            otherChains.put(per.getHref(),"perms["+per.getPermission()+"]");
//        });

//        for(Permission po : permissions){
//            //字符串拼接权限
//            definitions = definitions+po.getHref() + " = "+"perms["+po.getPermission()+"]";
//        }

        //从配置文件加载权限配置
        Ini ini = new Ini();
        ini.load(definitions);
        Ini.Section section = ini.getSection(IniFilterChainResolverFactory.URLS);
        if (CollectionUtils.isEmpty(section)) {
            section = ini.getSection(Ini.DEFAULT_SECTION_NAME);
        }

//        section.putAll(otherChains);
        //加入权限集合
        setFilterChainDefinitionMap(section);
    }


    @Override
    public void setFilterChainDefinitionMap(Map<String, String> filterChainDefinitionMap) {
        //数据库动态权限
        List<Permission> permissions = permissionServices.findUrlPermissionList();
        Map<String, String> otherChains = new HashMap<String,String>();
        permissions.stream().forEach((per)->{
          if(!StringUtils.isEmpty(per.getHref())){
              otherChains.put(per.getHref(),"perms["+per.getPermission()+"]");
          }
        });
        basefilterChainDefinitionMap.putAll(otherChains);
        basefilterChainDefinitionMap.putAll(filterChainDefinitionMap);
        super.setFilterChainDefinitionMap(basefilterChainDefinitionMap);
    }
}
