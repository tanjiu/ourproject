package com.i1314i.ourproject.service.user.impl;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.i1314i.ourproject.mapper.PermissionMapper;
import com.i1314i.ourproject.mapper.RoleMapper;
import com.i1314i.ourproject.mapper.UserMapper;
import com.i1314i.ourproject.po.*;
import com.i1314i.ourproject.po.pageHelper.PageBean;
import com.i1314i.ourproject.po.shiro.Permission;
import com.i1314i.ourproject.po.shiro.Role;
import com.i1314i.ourproject.po.shiro.UserRole;
import com.i1314i.ourproject.service.user.RoleService;
import com.i1314i.ourproject.service.user.UserService;
import com.i1314i.ourproject.service.user.login.BaseLogin;
import com.i1314i.ourproject.shiro.token.CaptchaUsernamePasswordToken;
import com.i1314i.ourproject.utils.common.TemplateUtils;
import com.i1314i.ourproject.utils.inimsg.UserMsgUtils;
import com.i1314i.ourproject.utils.jedisUtils.IJedisClient;
import com.i1314i.ourproject.utils.redisToken.Md5Utils;
import com.i1314i.ourproject.utils.redisToken.TokenUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @author 平行时空
 * @created 2018-10-10 0:14
 **/
@Service("userServices")
public class UserServiceimpl implements UserService{
    private Logger logger= LoggerFactory.getLogger(UserServiceimpl.class);
    @Autowired
    private IJedisClient jedisClient;
    @Autowired
    private ResultMap resultMap;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    PermissionMapper permissionMapper;
    @Autowired
    RoleService roleServices;
    @Autowired
    BaseLogin baseLogin;
    @Override
    public ResultMap login(User user) {
        Code code=new Code(user.getCodetoken(),user.getCode());
        //3、得到Subject及创建用户名/密码身份验证Token（即用户身份/凭证）
        Subject subject = SecurityUtils.getSubject();
        CaptchaUsernamePasswordToken usernamePasswordToken = new CaptchaUsernamePasswordToken(user.getUsername(), user.getPassword(),code);
        subject.login(usernamePasswordToken);
        PrincipalCollection principalCollection = subject.getPrincipals();
        logger.info(user.getUsername()+":"+ UserMsgUtils.login_success_msg);
        Set<String> stringSet=principalCollection.getRealmNames();

        for (String realmName:stringSet
                ) {
            if("userLoginRealm".equalsIgnoreCase(realmName)){
                jedisClient.del(TokenUtils.newImgToken(user.getCodetoken())); //登陆成功删除验证码
                return baseLogin.getUserToken(user);
            }else if("myShiroRealm".equalsIgnoreCase(realmName)){
//                return getAdminUserToken(user);

                jedisClient.del(TokenUtils.newImgToken(user.getCodetoken())); //登陆成功删除验证码
                return  baseLogin.getUserToken(user);
            }
        }
        return resultMap.start();
    }

    @Override
    public User selectUserByUserName(String username) {
        List<User>userList=userMapper.selectUserByUserName(username);
        if (userList!=null&&userList.size()>0){
            User user=userList.get(0);
            return user;
        }
        return null;
    }

    @Override
    public User selectUserByUid(String uid) {
        return userMapper.findUserById(uid);
    }

    @Override
    public List<User> findUserListByDepartmentId(String departmentId) {
        return userMapper.findUserListByDepartmentId(departmentId);
    }
    @Transactional(rollbackFor = Exception.class)
    @Override
    public ResultMap saveUser(User user) {
        roleServices.delUserRole(user.getUserId());
        roleServices.insertUserRole(new UserRole(user.getUserId(),user.getRole()));
        userMapper.saveUser(user);
        return resultMap.start().code("200").msg("修改用户信息成功");
    }
    @Transactional(rollbackFor = Exception.class)
    @Override
    public ResultMap insertUser(User user) {
        user.setSalt(TemplateUtils.uuid());
        user.setPassword(Md5Utils.getMsgMD5Password(user.getSalt(),user.getPassword(),2));

        user.setUserId(TemplateUtils.uuid());
        UserRole userRole=new UserRole();
        userRole.setUserId(user.getUserId());
        userRole.setRole(user.getRole());
        roleServices.insertUserRole(userRole);
        userMapper.insertUser(user);
        return resultMap.start().code("200").msg("新增用户成功");
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public String passwordEncoder(String credentials, String salt) {
        return null;
    }


    /**
     * 分页查询用户列表
     * @param pageBean
     * @return
     */
    @Override
    public ResultMap findLisUsersPage(PageBean pageBean,User user) {
        try {
            pageBean.setDepartment(user.getDepartment());
            PageHelper.startPage(pageBean.getCurrentPage(),pageBean.getPageSize());
            List<User>userList=userMapper.findLisUsersPage(pageBean);
            PageInfo<User> pageInfo = new PageInfo<User>(userList);
            return resultMap.start().code("200").msg("获取信息成功").data(pageInfo);
        }catch (Exception e){
            return resultMap.start().code("100").msg("获取信息失败");
        }

    }

    @Override
    public ResultMap deleteUser(String userId) {
        User user=userMapper.findUserById(userId);
        if(user==null){
            return resultMap.start().code("100").msg("删除失败,该用户不存在");
        }


        return null;
    }

    @Override
    public ResultMap changePassword(ChangePassword changePassword,User user) {


        User usersql=userMapper.findUserById(user.getUserId());

        String md5 = new Md5Hash(changePassword.getNewpassword(), user.getSalt(),2).toString();//还可以转换为 toBase64()/toHex()

        if(usersql.getPassword().equalsIgnoreCase(md5)){
            return resultMap.start().code("200").msg("success");
        }else {
            return resultMap.start().code("100").msg("fail");
        }
//        userMapper.

    }


    /**
     * 用户登录
     * @param user
     * @return
     */
    protected ResultMap getUserToken(User user){
        User usersql=null;
        try{
            usersql=selectUserByUserName(user.getUsername());
            usersql.setPermissionList(permissionMapper.listByUserId(user.getUserId()));
        }catch (Exception e){
            logger.info(user.getUsername()+" :user登陆数据库查询错误");
            return  resultMap.code(UserMsgUtils.login_error_code)
                    .msg(UserMsgUtils.login_error_msg);
        }

        Token token=null;

        if(user!=null){
            String gettoken="usertoken_"+TokenUtils.makeToken();
            boolean tokenvalue=TokenUtils.makeToken(User.class,usersql,gettoken);

            if(tokenvalue){
                UserLoginReturn userLoginReturn=new UserLoginReturn();
                userLoginReturn.setToken(gettoken);
                List<Permission>permissionList=permissionMapper.listAll();
                Set<String>perSet=new CopyOnWriteArraySet<>();
                permissionList.stream().forEach((per)->{
                    if(!StringUtils.isEmpty(per.getPermission())){
                        perSet.add(per.getPermission());
                    }
                });
                userLoginReturn.setPermissons(perSet);
                resultMap.code(UserMsgUtils.login_success_code)
                        .msg(UserMsgUtils.login_success_msg)
                        .data(userLoginReturn);
            }
        }else{
            return  resultMap.code(UserMsgUtils.login_error_code)
                    .msg(UserMsgUtils.login_error_msg);
        }

        return resultMap.start();
    }


}
