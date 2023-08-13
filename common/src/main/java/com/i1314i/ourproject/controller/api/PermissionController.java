package com.i1314i.ourproject.controller.api;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.beust.jcommander.internal.Lists;
import com.i1314i.ourproject.annotation.LogAnnotation;
import com.i1314i.ourproject.controller.BaseController;
import com.i1314i.ourproject.mapper.PermissionMapper;
import com.i1314i.ourproject.po.User;
import com.i1314i.ourproject.po.shiro.Permission;
import com.i1314i.ourproject.service.user.PermissionService;
import com.i1314i.ourproject.utils.redisToken.user.UserUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 权限相关接口
 * @author 平行时空
 * @created 2018-10-09 18:09
 **/

@Api(tags = "权限")
@RestController
@RequestMapping("/api/permissions")
public class PermissionController extends BaseController{

    @Autowired
    private PermissionMapper permissionMapper;
    @Autowired
    private PermissionService permissionServices;
    @Autowired
    private UserUtils userUtils;

    @ApiOperation(value = "当前登录用户拥有的权限")
    @PostMapping("/current")
    public List<Permission> permissionsCurrent(HttpServletRequest request) {


        List<Permission> list = userUtils.getCurrentPermissions(request);

        if (list == null||list.size()<=0) {
            User user = userUtils.getCurrentUser(request);
            System.out.println("ssss"+JSON.toJSONString(user));
            if(user!=null){
                list = permissionMapper.listByUserId(user.getUserId());
                userUtils.setPermissionSession(list,request);
            }else
                list=new ArrayList<>();

        }

        final List<Permission> permissions = list.stream().filter(l -> l.getType().equals(1))
                .collect(Collectors.toList());

        List<Permission> firstLevel = permissions.stream().filter(p -> p.getParentId().equals(0L)).collect(Collectors.toList());
        firstLevel.parallelStream().forEach(p -> {
            setChild(p, permissions);
        });

        return firstLevel;
    }

    /**
     * 设置子元素
     * 2018.06.09
     *
     * @param p
     * @param permissions
     */
    private void setChild(Permission p, List<Permission> permissions) {
        List<Permission> child = permissions.parallelStream().filter(a -> a.getParentId().equals(p.getId())).collect(Collectors.toList());
        p.setChild(child);
        if (!CollectionUtils.isEmpty(child)) {
            child.parallelStream().forEach(c -> {
                //递归设置子元素，多级菜单支持
                setChild(c, permissions);
            });
        }
    }



//	private void setChild(List<Permission> permissions) {
//		permissions.parallelStream().forEach(per -> {
//			List<Permission> child = permissions.stream().filter(p -> p.getParentId().equals(per.getId()))
//					.collect(Collectors.toList());
//			per.setChild(child);
//		});
//	}

    /**
     * 菜单列表
     *
     * @param pId
     * @param permissionsAll
     * @param list
     */
    private void setPermissionsList(Long pId, List<Permission> permissionsAll, List<Permission> list) {
        for (Permission per : permissionsAll) {
            if (per.getParentId().equals(pId)) {
                list.add(per);
                if (permissionsAll.stream().filter(p -> p.getParentId().equals(per.getId())).findAny() != null) {
                    setPermissionsList(per.getId(), permissionsAll, list);
                }
            }
        }
    }

    @GetMapping
    @ApiOperation(value = "菜单列表")
    @RequiresPermissions("sys:menu:query")
    public List<Permission> permissionsList() {
        List<Permission> permissionsAll = permissionMapper.listAll();

        List<Permission> list = Lists.newArrayList();
        setPermissionsList(0L, permissionsAll, list);

        return list;
    }

    @GetMapping("/all")
    @ApiOperation(value = "所有菜单")
    @RequiresPermissions("sys:menu:query")
    public JSONArray permissionsAll() {
        List<Permission> permissionsAll = permissionMapper.listAll();
        JSONArray array = new JSONArray();
        setPermissionsTree(0L, permissionsAll, array);

        return array;
    }

    @GetMapping("/parents")
    @ApiOperation(value = "一级菜单")
    @RequiresPermissions("sys:menu:query")
    public List<Permission> parentMenu() {
        List<Permission> parents = permissionMapper.listParents();
        return parents;
    }

    /**
     * 菜单树
     *
     * @param pId
     * @param permissionsAll
     * @param array
     */
    private void setPermissionsTree(Long pId, List<Permission> permissionsAll, JSONArray array) {
        for (Permission per : permissionsAll) {
            if (per.getParentId().equals(pId)) {
                String string = JSONObject.toJSONString(per);
                JSONObject parent = (JSONObject) JSONObject.parse(string);
                array.add(parent);

                if (permissionsAll.stream().filter(p -> p.getParentId().equals(per.getId())).findAny() != null) {
                    JSONArray child = new JSONArray();
                    parent.put("child", child);
                    setPermissionsTree(per.getId(), permissionsAll, child);
                }
            }
        }
    }

    @GetMapping(params = "roleId")
    @ApiOperation(value = "根据角色id删除权限")
    @RequiresPermissions(value = { "sys:menu:query", "sys:role:query" }, logical = Logical.OR)
    public List<Permission> listByRoleId(Long roleId) {
        return permissionMapper.listByRoleId(roleId);
    }

    @LogAnnotation
    @PostMapping
    @ApiOperation(value = "保存菜单")
    @RequiresPermissions("sys:menu:add")
    public void save(@RequestBody Permission permission) {
        permissionMapper.save(permission);
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "根据菜单id获取菜单")
    @RequiresPermissions("sys:menu:query")
    public Permission get(@PathVariable Long id) {

        return permissionMapper.getById(id);
    }

    @LogAnnotation
    @PutMapping
    @ApiOperation(value = "修改菜单")
    @RequiresPermissions("sys:menu:add")
    public void update(@RequestBody Permission permission) {
        permissionMapper.update(permission);
    }

    /**
     * 校验权限
     *
     * @return
     */
    @GetMapping("/owns")
    @ApiOperation(value = "校验当前用户的权限")
    public Set<String> ownsPermission(HttpServletRequest request) {

        List<Permission> permissions = new ArrayList<>();
        User user=getToken(User.class,request);
        permissions = permissionServices.getPermissionListByUserId(user);
//
//                UserUtil.getCurrentPermissions(request);
        if (CollectionUtils.isEmpty(permissions)) {
            return Collections.emptySet();
        }

        return permissions.parallelStream().filter(p -> !StringUtils.isEmpty(p.getPermission()))
                .map(Permission::getPermission).collect(Collectors.toSet());
    }

    @LogAnnotation
    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除菜单")
    @RequiresPermissions(value = { "sys:menu:del" })
    public void delete(@PathVariable Long id) {
        permissionServices.delete(id);
    }
}
