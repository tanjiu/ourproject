package com.i1314i.ourproject.controller.publics;

import com.i1314i.ourproject.annotation.LogAnnotation;
import com.i1314i.ourproject.controller.BaseController;
import com.i1314i.ourproject.po.ChangePassword;
import com.i1314i.ourproject.po.ResultMap;
import com.i1314i.ourproject.po.User;
import com.i1314i.ourproject.po.pageHelper.PageBean;
import com.i1314i.ourproject.service.user.UserService;
import com.i1314i.ourproject.utils.jedisUtils.other.StringUtils;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author 平行时空
 * @created 2018-10-10 17:06
 **/

@RestController
@RequestMapping("/api/users")
public class UserController extends BaseController {
    @Autowired
    private ResultMap resultMap;
    @Autowired
    private UserService userServices;
    @PostMapping(value = "/current")
    public ResultMap getCurrentUser(HttpServletRequest request){
            User returnnUser=getToken(User.class,request);
            returnnUser.setPassword("");
            returnnUser.setSalt("");
        return resultMap.start().code("200").msg("获取当前用户信息成功").data(returnnUser);
    }



    @LogAnnotation
    @PostMapping
    @ApiOperation(value = "保存用户")
    @RequiresPermissions("sys:user:add")
    public ResultMap saveUser(@RequestBody User user) {

        if (!StringUtils.isEmpty(user.getUserId())){
            return userServices.saveUser(user);
        }

        User u = userServices.selectUserByUserName(user.getUsername());
        if (u != null) {
            throw new IllegalArgumentException(user.getUsername() + "已存在");
        }
        return userServices.insertUser(user);
    }



    @ApiOperation(value = "根据用户id获取用户")
    @GetMapping("/{id}")
    @RequiresPermissions("sys:user:query")
    public ResultMap user(@PathVariable String id) {
        User user=new User();
        try {
             user= userServices.selectUserByUid(id);
        }catch (Exception e){
            return resultMap.start().code("100").msg("获取数据失败").data(user);
        }
        return resultMap.start().code("200").msg("获取数据成功").data(user);
    }


    @RequiresPermissions("sys:user:del")
    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除")
    public ResultMap delete(@PathVariable String userId) {
       return userServices.deleteUser(userId);
    }


    /**
     * 获取用户列表
     * @param pageBean
     * @param request
     * @return
     */
    @PostMapping(value="/userList")
    @ApiOperation(value = "用户列表")
    @RequiresPermissions("sys:user:query")
    public ResultMap listUsers(@RequestBody PageBean pageBean,HttpServletRequest request) {
        if (pageBean.getPageSize() == 0) {
            return resultMap.start().code("100").msg("参数不能为空");
        }
        User user=getToken(User.class,request);
        return userServices.findLisUsersPage(pageBean,user);

    }


    @RequestMapping(value = "/changePassword")
    @RequiresPermissions("sys:user:changePasword")
    public ResultMap changePassword(@RequestBody ChangePassword password,HttpServletRequest request){
        User user=getToken(User.class,request);
        return userServices.changePassword(password,user);
    }
}
