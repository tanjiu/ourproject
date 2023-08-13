package com.i1314i.ourproject.controller.api;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.i1314i.ourproject.annotation.LogAnnotation;
import com.i1314i.ourproject.controller.BaseController;
import com.i1314i.ourproject.po.ResultMap;
import com.i1314i.ourproject.po.User;
import com.i1314i.ourproject.po.department.Department;
import com.i1314i.ourproject.po.pageHelper.PageBean;
import com.i1314i.ourproject.service.user.DepartmentService;
import com.i1314i.ourproject.service.user.UserService;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 平行时空
 * @created 2018-10-14 11:53
 **/

@RestController
@RequestMapping(value = "/api/department")
public class DepartmentController extends BaseController {
    @Autowired
    private ResultMap resultMap;
    @Autowired
    private DepartmentService departmentServices;
    @Autowired
    private UserService userServices;

    @ApiOperation(value = "查看部门列表")
//    @RequiresPermissions("sys:department:query")
    @PostMapping(value = "/getDepartmentList")
    public ResultMap getDepartmentList(HttpServletRequest request,@RequestBody Department department){
        List<Department>departmentList=departmentServices.findDepartmentList();


        final List<Department> departments = departmentList.stream().filter(l -> l.getType().equals(1)).collect(Collectors.toList());


        List<Department> firstLevel = departments.stream().filter(p -> p.getParentId().equals("0")).collect(Collectors.toList());
        firstLevel.parallelStream().forEach(p -> {
            setChild(p, departments);
        });
        return resultMap.start().data(firstLevel);
    }


    /**
     * 获取部门人员树接口
     * @param request
     * @return
     */
    @LogAnnotation(sysName = "主系统部门模块",type="登录请求")
    @PostMapping("/getselfDepartmentList")
    @ApiOperation(value = "查看部门列表")
    @RequiresPermissions("sys:department:query")
    public ResultMap getSelfDepartmentList(HttpServletRequest request){
        User user=getToken(User.class,request);
        try{
            return resultMap.start().code("200").msg("获取数据成功").data(departmentServices.findSelfDepartmentList(user));
        }catch (Exception e){
            return resultMap.start().code("100").msg("获取数据失败");
        }
    }


    /**
     * 设置子元素
     * 2018.06.09
     *
     */
    private void setChild(Department d, List<Department> departments) {
        List<Department> child = departments.parallelStream().filter(a -> a.getParentId().equals(d.getDepartmentId())&&d.getType()==1).collect(Collectors.toList());

//        d.setChild(child);
        List<User>userList=userServices.findUserListByDepartmentId(d.getDepartmentId());
        List<Department>departmentList=new ArrayList<>();
        userList.forEach(c->departmentList.add(new Department(c.getNickName(),d.getParentId(),2)));
        if(departmentList!=null&&departmentList.size()>0){
            child.addAll(departmentList);
        }
        d.setChild(child);
        if (!CollectionUtils.isEmpty(child)) {
            child.parallelStream().forEach(c -> {
                //递归设置子元素，多级菜单支持
                setChild(c, departments);
            });
        }
    }

    @GetMapping("/parents")
    @ApiOperation(value = "部门一级菜单")
    @RequiresPermissions("sys:department:query")
    public List<Department> parentMenu() {
        List<Department> parents = departmentServices.listParents();

        return parents;
    }



    @PostMapping(value = "/departmentList")
    @ApiOperation(value = "部门列表")
    @RequiresPermissions("sys:department:query")
    public ResultMap listRoles(@RequestBody PageBean pageBean,HttpServletRequest request) {
        User user=getToken(User.class,request);

        if(pageBean.getPageSize()==0){
            return resultMap.start().code("100").msg("参数不能为空");
        }



        try{

            return resultMap.start().code("200").msg("获取部门列表成功").data(departmentServices.selectListDepartmentsPage(pageBean,user));
        }catch (Exception e){
            return resultMap.start().code("100").msg("获取部门列表失败");
        }

    }

    @GetMapping(value = "/departmentList")
    @ApiOperation(value = "部门列表")
    @RequiresPermissions("sys:department:query")
    public ResultMap listRoles(HttpServletRequest request) {
        User user=getToken(User.class,request);
        try{

            return resultMap.start().code("200").msg("获取部门列表成功").data(departmentServices.selectListDepartmentsPage(user));
        }catch (Exception e){
            return resultMap.start().code("100").msg("获取部门列表失败");
        }

    }


    @GetMapping("/all")
    @ApiOperation(value = "所有部门菜单")
    @RequiresPermissions("sys:departmentAll:query")
    public JSONArray permissionsAll() {
        List<Department> permissionsAll = departmentServices.findDepartmentList();
        JSONArray array = new JSONArray();
        setDepartmentsTree("0", permissionsAll, array);
        return array;
    }



    @LogAnnotation
    @PutMapping()
    @ApiOperation(value = "更新部门")
    @RequiresPermissions("sys:department:add")
    public ResultMap UpdateDepartment(@RequestBody Department department){

        if(StringUtils.isEmpty(department.getParentId())||StringUtils.isEmpty(department.getDepartmentName())){
            return resultMap.start().code("100").msg("参数不能为空");
        }


        if(StringUtils.isEmpty(department.getDepartmentId())){
            return departmentServices.insertDepartment(department);
        }

        return departmentServices.saveDepartment(department);
    }



    @PostMapping("/selfall")
    @ApiOperation(value = "个人部门菜单")
    @RequiresPermissions("sys:departmentSelf:query")
    public JSONArray departmentsSelf(HttpServletRequest request) {
        User user=getToken(User.class,request);
        List<Department> permissionsAll = departmentServices.findDepartmentList();
        JSONArray array = new JSONArray();
        String departmentId=user.getDepartment();
        setDepartmentsTree(departmentId, permissionsAll, array);
        return array;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "个人部门菜单")
    @RequiresPermissions("sys:department:query")
    public ResultMap findDepartmentById(@PathVariable String id){

        if(StringUtils.isEmpty(id)){
            return resultMap.start().code("100").msg("参数不能为空");
        }
        try{
            return resultMap.start().code("200").msg("获取部门数据成功").data(departmentServices.findDepartmentById(id));
        }catch (Exception e){
            return resultMap.start().code("100").msg("获取部门数据失败");
        }
    }

    /**
     * 菜单树
     *
     * @param pId
     * @param
     * @param array
     */
    private void setDepartmentsTree(String pId, List<Department> departmentListsAll, JSONArray array) {
        for (Department per : departmentListsAll) {
            if (per.getParentId().equals(pId)) {
                String string = JSONObject.toJSONString(per);
                JSONObject parent = (JSONObject) JSONObject.parse(string);
                array.add(parent);

                if (departmentListsAll.stream().filter(p -> p.getParentId().equals(per.getId())).findAny() != null) {
                    JSONArray child = new JSONArray();
                    parent.put("child", child);
                    setDepartmentsTree(per.getId(), departmentListsAll, child);
                }
            }
        }
    }

    @LogAnnotation
    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除部门")
    @RequiresPermissions("sys:department:del")
    public ResultMap delDepartmentById(@PathVariable String id){
        if(StringUtils.isEmpty(id)){
            return resultMap.start().code("100").msg("参数不能为空");
        }
        try{

            if(departmentServices.delDepartment(id)>0){
                return resultMap.start().code("200").msg("删除部门数据成功");
            }

        }catch (Exception e){

        }

        return resultMap.start().code("100").msg("删除部门数据失败");
    }

}
