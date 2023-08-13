package com.i1314i.ourproject.mapper;

import com.i1314i.ourproject.po.shiro.*;
import com.i1314i.ourproject.po.zTree.Node;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Set;

/**
 * @author 平行时空
 * @created 2018-10-01 16:24
 **/
public interface UserRoleMapper {
    void insertPermission(Permission permission);
    Permission selectPermissionById(String permissionId);
    Permission selectPermissionByName(String permission);
    void insertRole(Role role);
    Role selectRoleById(String roleId);
    Role selectRoleByName(String roleName);
    Role selectOtherRoleByName(Role role);
    Role selectRealRoleByName(String roleName);
    Role selectOtherRealRoleByName(Role role);
    List<UserRole> selectUserRoleById(String user_id);
    void insertUserRole(UserRole userRole);

    List<Role>selectRoleByNameList(@Param("array") String[] roleName);

    int delUserRolesByUid(String userId);

    List<Node> selectPermNodesById(String id);
    List<Node>getNodes();
    List<Node>getPermNodes(String roleId);

    Set<String>SelectPermissions(String userId);

    Integer updateRole(Role role);

    Integer delRolePermission(Role role);

    Integer addRole(Role role);
    Integer addRolePrem(Role role);

    /**
     * 获取全部角色
     * @return
     */
    List<Role>selectAllRole();

    /**
     * 获取角色权限
     * @param role
     * @return
     */
//    Set<Permission> selectPermissionByRole(@Param("list") List<RolePermission> rolePermissionList);

    /**
     * 查询所有角色 权限对应表
     * @param role
     * @return
     */
//    List<RolePermission>selectRolePermissionByRole(@Param("list") List<Role> role);

    /**
     * 插入权限
     * @param permission
     * @return
     */
    Integer inserPermission(Permission permission);


    /**
     * 查询权限list通过数组
     * @param ids
     * @return
     */
    List<Role>selectRoleListByIds(@Param("array") String[]ids);

    Integer insertUserRoleList(@Param("list") List<UserRole>userRoleList);


    /**
     * 删除角色表
     * @param roleList
     * @return
     */
    Integer delRoleList(@Param("array") String[]roleList);
    Integer delRolePermissionList(@Param("array") String[]roleList);
    Integer delUserRoleList(@Param("array") String[]roleList);

}
