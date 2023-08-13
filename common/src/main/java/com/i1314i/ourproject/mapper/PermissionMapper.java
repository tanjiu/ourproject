package com.i1314i.ourproject.mapper;


import com.i1314i.ourproject.po.shiro.Permission;
import org.apache.ibatis.annotations.*;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

/**
 * @author 平行时空
 * @created 2018-10-09 17:53
 **/
@Mapper
public interface PermissionMapper {

//    @Select("select * from sys_permission t order by t.sort")
    List<Permission> listAll();

//    @Select("select * from sys_permission t where t.type = 1 order by t.sort")
    List<Permission> listParents();


//    @Select("select distinct p.* from sys_permission p inner join sys_role_permission rp on p.id = rp.permission_id inner join sys_role_user ru on ru.role_id = rp.role_id where ru.user_id = #{userId} order by p.sort")
    List<Permission> listByUserId(String userId);


//    @Select("select p.* from sys_permission p inner join sys_role_permission rp on p.id = rp.permission_id where rp.role_id = #{roleId} order by p.sort")
    List<Permission> listByRoleId(Long roleId);


//    @Select("select * from sys_permission t where t.id = #{id}")
    Permission getById(Long id);


//    @Insert("insert into sys_permission(parent_id, name, css, href, type, permission, sort) values(#{parentId}, #{name}, #{css}, #{href}, #{type}, #{permission}, #{sort})")
Integer save(Permission permission);

//    @Update("update sys_permission t set parent_id = #{parentId}, name = #{name}, css = #{css}, href = #{href}, type = #{type}, permission = #{permission}, sort = #{sort} where t.id = #{id}")
Integer update(Permission permission);

//    @Delete("delete from sys_permission where id = #{id}")
Integer delete(Long id);

//    @Delete("delete from sys_permission where parent_id = #{id}")
Integer deleteByParentId(Long id);

//    @Delete("delete from sys_role_permission where permission_id = #{permissionId}")
Integer deleteRolePermission(Long permissionId);


    List<Permission>findUrlPermissionList();
}
