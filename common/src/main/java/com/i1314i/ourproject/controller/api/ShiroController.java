package com.i1314i.ourproject.controller.api;

import com.i1314i.ourproject.controller.BaseController;
import com.i1314i.ourproject.po.ResultMap;
import com.i1314i.ourproject.po.User;
import com.i1314i.ourproject.po.shiro.ChangeRole;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * 修改权限相关controller
 * @author 平行时空
 * @created 2018-10-03 17:50
 **/

@RestController
@RequestMapping(value = "/api")
public class ShiroController extends BaseController{
    @Autowired
    public ResultMap resultMap;


//    @RequiresRoles(logical = Logical.OR, value = {"admin", "hnadmin",""})
//    public ResultMap changeRole(@RequestBody ChangeRole role , HttpServletRequest request){
//        User user=getToken(User.class,request);
//
//
//    }
}
