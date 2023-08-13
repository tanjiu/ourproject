package com.i1314i.ourproject.controller.api;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Maps;
import com.i1314i.ourproject.annotation.LogAnnotation;
import com.i1314i.ourproject.mapper.RoleMapper;
import com.i1314i.ourproject.po.ResultMap;
import com.i1314i.ourproject.po.User;
import com.i1314i.ourproject.po.pageHelper.PageBean;
import com.i1314i.ourproject.po.shiro.Role;
import com.i1314i.ourproject.po.shiro.RoleDto;
import com.i1314i.ourproject.service.user.RoleService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 角色相关接口
 * @author 平行时空
 * @created 2018-10-09 18:18
 **/
@Api(tags = "角色")
@RestController
@RequestMapping("/api/roles")
public class RoleController {
    @Autowired
    private RoleService roleServices;
    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private ResultMap resultMap;

    @LogAnnotation
    @PostMapping
    @ApiOperation(value = "保存角色")
    @RequiresPermissions("sys:role:add")
    public void saveRole(@RequestBody RoleDto roleDto) {
        System.out.println(JSON.toJSONString(roleDto));
        roleServices.saveRole(roleDto);
    }

    @PostMapping(value = "/roleList")
    @ApiOperation(value = "角色列表")
    @RequiresPermissions("sys:role:query")
    public ResultMap listRoles(@RequestBody PageBean pageBean) {

        if(pageBean.getPageSize()==0){
            return resultMap.start().code("100").msg("参数不能为空");
        }

        try{

            return resultMap.start().code("200").msg("获取角色列表成功").data(roleServices.selectListRolesPage(pageBean));
        }catch (Exception e){
            return resultMap.start().code("100").msg("获取角色列表失败");
        }

    }

    @GetMapping("/{id}")
    @ApiOperation(value = "根据id获取角色")
    @RequiresPermissions("sys:role:query")
    public Role get(@PathVariable Long id) {
        return roleMapper.getById(id);
    }

    @GetMapping("/all")
    @ApiOperation(value = "所有角色")
    @RequiresPermissions(value = { "sys:user:query", "sys:role:query" }, logical = Logical.OR)
    public List<Role> roles() {
        return roleMapper.list(new PageBean());
    }

    @GetMapping("/alls")
    @ApiOperation(value = "当前用户拥有所有角色")
    @RequiresPermissions(value = { "sys:user:query", "sys:role:query" }, logical = Logical.OR)
    public List<Role> selfroles() {
        return roleMapper.listOfSelf(new PageBean());
    }

    @PostMapping (value = "/userRole")
    @ApiOperation(value = "根据用户id获取拥有的角色")
    @RequiresPermissions(value = { "sys:user:query", "sys:role:query" }, logical = Logical.OR)
    public ResultMap roles(@RequestBody User user) {
        if (org.apache.commons.lang3.StringUtils.isEmpty(user.getUserId())){
            return resultMap.start().code("100").msg("用户id不能为空");
        }

        try {
            List<Role>  roleList= roleServices.getUserRoles(user);
            return resultMap.start().code("200").msg("成功").data(roleList);
        }catch (Exception e){
            return resultMap.start().code("100").msg("获取数据失败");
        }


    }

    @LogAnnotation
    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除角色")
    @RequiresPermissions(value = { "sys:role:del" })
    public ResultMap delete(@PathVariable Long id) {
        try {
            return roleServices.deleteRole(id);
        }catch (Exception e){
            return resultMap.start().code("100").msg("删除失败");
        }
    }
}
