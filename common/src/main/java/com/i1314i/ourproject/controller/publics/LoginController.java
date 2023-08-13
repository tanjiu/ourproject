package com.i1314i.ourproject.controller.publics;


import com.alibaba.fastjson.JSON;
import com.i1314i.ourproject.annotation.LogAnnotation;
import com.i1314i.ourproject.controller.BaseController;
import com.i1314i.ourproject.po.ResultMap;
import com.i1314i.ourproject.po.User;
import com.i1314i.ourproject.service.user.UserService;
import com.i1314i.ourproject.shiro.exception.UserException;
import com.i1314i.ourproject.utils.inimsg.UserMsgUtils;
import com.i1314i.ourproject.utils.redisToken.user.UserUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 平行时空
 * @created 2018-09-18 21:02
 **/
@RestController
@RequestMapping(value = "/public")
@Api(tags = "登陆")
public class LoginController extends BaseController{
    @Autowired
    private ResultMap resultMap;
    @Autowired
    private UserService userServices;
    @Autowired
    private UserUtils userUtils;

    @LogAnnotation(sysName = "登陆系统",type="登录请求",module = "登陆接口")
    @ApiOperation(value = "Restful方式登陆")
    @PostMapping("/sys/login/restful")
    public ResultMap restfulLogin(@RequestBody User user) {

        try {
            checkUser(user);
        } catch (UserException e) {
            resultMap
                    .code("100")
                    .msg(e.getMessage());
            return resultMap.start();
        }
        return userServices.login(user);


    }

    @ApiOperation(value = "获取当前登录用户")

    @GetMapping("/sys/login")
    public User getLoginInfo(HttpServletRequest request) {
        return userUtils.getCurrentUser(request);
    }


    /**
     * 用户登录
     * @param user
     * @return
     */
//    @RequestMapping(value = "/login", method = RequestMethod.POST)
//    public ResultMap login(@RequestBody User user) throws IOException {
//        try {
//            checkUser(user);
//        } catch (UserException e) {
//            resultMap
//                    .code("100")
//                    .msg(e.getMessage());
//            return resultMap.start();
//        }
//        return userService.login(user);
//    }





    /**
     * 登陆校验
     * @param user
     * @return
     * @throws UserException
     */
    public boolean checkUser(User user) throws UserException {
        if(StringUtils.isEmpty(user.getUsername())){
            throw new UserException(UserMsgUtils.login_username_is_null_msg);
        }else if(StringUtils.isEmpty(user.getPassword())){
            throw new UserException(UserMsgUtils.login_password_is_null_msg);
        }else  if (StringUtils.isEmpty(user.getCode())){
            throw new UserException(UserMsgUtils.login_code_is_null_msg);
        }
        return true;
    }

//    @RequestMapping(value = "/checkToken",method = {RequestMethod.POST})
//    public ResultMap checkToken(HttpServletRequest request){
//        User user=getToken(User.class,request);
//
//    }
}
