package com.i1314i.ourproject.controller;


import com.alibaba.fastjson.JSON;
import com.i1314i.ourproject.mapper.UserMapper;
import com.i1314i.ourproject.mapper.UserRoleMapper;
import com.i1314i.ourproject.po.ResultMap;
import com.i1314i.ourproject.po.User;
import com.i1314i.ourproject.po.testing.TestingDate;
import com.i1314i.ourproject.service.user.RoleService;
import com.i1314i.ourproject.utils.common.TemplateUtils;
import com.i1314i.ourproject.utils.redisToken.Md5Utils;
//import com.sun.org.apache.regexp.internal.RE;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * @author 平行时空
 * @created 2018-09-07 21:25
 **/
@RestController
////@Controller
//@RequestMapping(value = "/api")
// 拥有 admin 角色可以访问
//@RequiresRoles("admin")
public class AController extends BaseController {

    @Autowired
UserMapper userMapper;
    @Autowired
private RedisTemplate redisTemplate;//操作key-value都是字符串

    public static void main(String[] args) {
        //2e14fad881f13181af7cb85986c38c93

        ResultMap resultMap=new ResultMap();
        List<TestingDate>daList=new ArrayList<>();
        TestingDate da=new TestingDate();
        da.setProductType("果菜类");
        da.setSampleName("富士苹果");
        da.setDetectionProject("残留农药");
        da.setMeasuredValue(13.86);
        da.setConclusion("合格");
        da.setTestingCompany("诸城常山永辉生态农业家庭农场");
        da.setPlaceOfOrigin("山东");
//        da.setTestingTime("2017-10-23 15:33:56");
        daList.add(da);
        resultMap.code("200").msg("获取数据成功").data(daList);

        System.out.println(JSON.toJSONString(resultMap));
//        System.out.println(Md5Utils.getMsgMD5("张三","123",2).getEncodedString());
    }





//    @RequestMapping(value = "/in")
//    public Set<Permission> tes(){
//
//        List<Role>roleList=new ArrayList<>();
//        Role role=new Role("CF2942015CEB462E9C2200F14D2260B8","ss","ss");
//        roleList.add(role);
//        Role role1=new Role("447DAAEDEC08473FAB8E9A280A631C27","ss","ss");
//        roleList.add(role1);
//        Set<Permission> permissionSet=roleServices.selectPermissionByRole(roleList);
//        System.out.println(JSON.toJSONString(roleServices.permissions(permissionSet)));
//        return permissionSet;
////        List<Node> nodeList=userRoleMapper.selectPermNodesById("sss");
////        System.out.println(JSON.toJSONString(nodeList));
//    }


    // 拥有 student 或 admin 角色可以访问
//    @RequiresRoles(logical = Logical.OR, value = {"Bstudent", "admin"})
    @RequestMapping(value = "/test")
    public void test(HttpServletResponse response) throws IOException {
     //userService.tests();
//        User user=new User();
//        user.setUsername("hnadmin");
//        user.setPassword("1234");
//        String []a={"hnnormal","hnadmin"};
//        user.setRoles(a);
//        userService.insertUser(user);
//        System.out.println("success");
//        User user=new User();
//        user.setUserId(TemplateUtils.uuid());
//        user.setUsername("test");
//        String salt=TemplateUtils.uuid();
//        user.setSalt(salt);
//        user.setPassword(Md5Utils.getMsgMD5(salt,"123456",2).getEncodedString());
//        userMapper.insertUser(user);
//        Role role=new Role(TemplateUtils.uuid(),"hnargic","农业局管理（惠农系统）");
//        Role role1=new Role(TemplateUtils.uuid(),"hnguotu","国土局管理（惠农系统）");
//        Role role2=new Role(TemplateUtils.uuid(),"hnshuili","水利局管理（惠农系统）");
//        Role role3=new Role(TemplateUtils.uuid(),"hnwujia","物价局管理（惠农系统）");
//        Role role4=new Role(TemplateUtils.uuid(),"hnyuanqu","园区企业（惠农系统）");
//        userRoleMapper.insertRole(role);
//        userRoleMapper.insertRole(role1);
//        userRoleMapper.insertRole(role2);
//        userRoleMapper.insertRole(role3);
//        userRoleMapper.insertRole(role4);
//        JavaPoiUtil.setDownType(response,"导出数据",2007);
//        JavaPoiUtil


        redisTemplate.opsForValue().append("msg","hello");

//        return userService.selectUserByUserName("张三");
    }





    // 拥有 hnnormal 和 hnadmin 权限可以访问
    @RequiresRoles(logical = Logical.OR, value = {"hnadmin", "hnnormal"})
    public void othrt(){

    }

    // 拥有 user 或 admin 角色，且拥有 vip 权限可以访问
    @GetMapping("/getVipMessage")
    @RequiresRoles(logical = Logical.OR, value = {"admin", "school"})

    @RequiresPermissions("vip")
    public ResultMap getVipMessage() {
        return null;
    }

//    public static void main(String[] args) {
//        IJedisClient jedisClient=new JedisClient();
////        jedisClient.set("test01","ss",100);
////        jedisClient.set("test02","ss",100);
////        jedisClient.flushlikekey("test*");
//        jedisClient.flushlikekey_foreach("test*");
//    }


    public void testCustomRealm() {
        //1、获取SecurityManager工厂，此处使用Ini配置文件初始化SecurityManager
        Factory<SecurityManager> factory =
                new IniSecurityManagerFactory("classpath:shiro-realm.ini");

        //2、得到SecurityManager实例 并绑定给SecurityUtils
        org.apache.shiro.mgt.SecurityManager securityManager = factory.getInstance();
        SecurityUtils.setSecurityManager(securityManager);

        //3、得到Subject及创建用户名/密码身份验证Token（即用户身份/凭证）
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken("zhang", "123");

        try {
            //4、登录，即身份验证
            System.out.println("登陆成功");
            subject.login(token);
        } catch (AuthenticationException e) {
            //5、身份验证失败
            System.out.println("登陆失败");
            e.printStackTrace();
        }


        //6、退出
        subject.logout();
    }



}
