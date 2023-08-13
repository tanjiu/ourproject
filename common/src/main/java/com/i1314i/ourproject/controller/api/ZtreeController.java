package com.i1314i.ourproject.controller.api;

import com.i1314i.ourproject.po.ResultMap;
import com.i1314i.ourproject.service.user.RoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author 平行时空
 * @created 2018-10-04 12:04
 **/

@RestController
@RequestMapping(value = "/api/ztree")
public class ZtreeController {
    @Autowired
    ResultMap resultMap;
    @Autowired
    RoleService roleService;
    private static Logger logger= LoggerFactory.getLogger(ZtreeController.class);


//    /**
//     * 获取列表权限数据(ZTree)
//     * @return
//     */
//    @PostMapping("/tree")
//    public ResultMap tree(){
//        try {
//            List<Node> nodes = roleServices.getNodes();
//            return resultMap.start().code("200").msg("获取权限tree数据成功").data(nodes);
//        } catch (Exception e) {
//            logger.error("获取权限节点失败", e);
//            return resultMap.start().code("100").msg("获取权限tree数据失败");
//        }
//    }
//
//
//    /**
//     * 添加权限
//     * @param role
//     * @return
//     */
//    @PostMapping(value = "/addRole")
//    public ResultMap addRole(@RequestBody Role role) {
//        System.out.println(role.toString());
//        try {
//            return roleServices.addRole(role);
//        } catch (Exception e) {
//            logger.error("添加角色失败", e);
//            return resultMap.start().code("100").msg("添加角色失败");
//        }
//
//    }
//
//
//    /**
//     * 查看用户的权限信息
//     * @param role
//     * @return
//     */
//    public ResultMap toUpdateRole(@RequestBody Role role){
//        if(StringUtils.isEmpty(role.getRoleId())){
//            return resultMap.start().code("100").msg("id不能为空");
//        }
//        Role rolesql = roleServices.selectRoleById(role);
//        return resultMap.start().code("200").msg("获取成功").data(rolesql);
//    }
//
//
//    /**
//     * 查看角色已有的权限
//     * @param role
//     * @return
//     */
//    @RequestMapping(value = "/permTree",method = {RequestMethod.POST})
//    public ResultMap  getUpdateRole(@RequestBody Role role){
//
//        if(StringUtils.isEmpty(role.getRoleId())){
//            return resultMap.start().code("100").msg("获取权限tree数据失败 参数不能为空");
//        }
//
//        try {
//            List<Node> nodes =  roleServices.getPermNodes(role);
//            return resultMap.start().code("200").msg("获取权限tree数据成功").data(nodes);
//        } catch (Exception e) {
//            logger.error("获取权限节点失败", e);
//            return resultMap.start().code("100").msg("获取权限tree数据失败");
//        }
//    }
//
//
//    /**
//     * 查看角色已有的信息 包括标识和名称和权限
//     * @param role
//     * @return
//     */
//    @RequestMapping(value = "/permUserTree",method = {RequestMethod.POST})
//    public ResultMap  getUserUpdateRole(@RequestBody Role role){
//        System.out.println(role.toString());
//        if(StringUtils.isEmpty(role.getRoleId())){
//            return resultMap.start().code("100").msg("获取权限tree数据失败 参数不能为空");
//        }
//
//        try {
//            UserNode userNode =  roleServices.getPermBigNodes(role);
//            return resultMap.start().code("200").msg("获取权限tree数据成功").data(userNode);
//        } catch (Exception e) {
//            logger.error("获取权限节点失败", e);
//            return resultMap.start().code("100").msg("获取权限tree数据失败");
//        }
//    }
//    @PostMapping(value = "/updateRole")
//    public ResultMap updateRole(@RequestBody Role role){
//        System.out.println(role.toString());
//        try {
//            return roleServices.updateRole(role);
//        } catch (Exception e) {
//            logger.error("修改角色失败", e);
//            return resultMap.start().code("100").msg("修改角色失败");
//        }
//    }
//
//
//    @RequestMapping(value="/allRole",method = {RequestMethod.POST})
//    public ResultMap getAllRoles(){
//        try{
//            List<Role>roleList=roleServices.selectAllRole();
//            return resultMap.start().code("200").msg("获取所有角色信息成功").data(roleList);
//        }catch (Exception e){
//            return resultMap.start().code("100").msg("获取角色信息失败");
//        }
//    }
//
//    @RequestMapping(value="/allRolePageBean",method = {RequestMethod.POST})
//    public ResultMap getAllRoles(@RequestBody PageBean pageBean){
//        if (pageBean.getCurrentPage()==null){
//            pageBean.setCurrentPage(1);
//        }
//        if (pageBean.getPageSize()==null){
//            pageBean.setPageSize(10);
//        }
//        try{
//            PageInfo<Role> pageInfo=roleServices.selectAllRole(pageBean.getCurrentPage(),pageBean.getPageSize());
//            return resultMap.start().code("200").msg("获取所有角色信息成功").data(pageInfo);
//        }catch (Exception e){
//            return resultMap.start().code("100").msg("获取角色信息失败");
//        }
//    }
//
//
//    @PostMapping(value = "/delRoles")
//    public ResultMap delRole(@RequestBody ChangeRole roles){
//        try{
//            return  roleServices.delRoleList(roles);
//        }catch (Exception e){
//            return resultMap.start().code("100").msg("删除角色失败");
//        }
//
//    }


}
