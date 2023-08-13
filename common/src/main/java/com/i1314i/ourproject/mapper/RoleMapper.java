package com.i1314i.ourproject.mapper;

import com.i1314i.ourproject.po.pageHelper.PageBean;
import com.i1314i.ourproject.po.shiro.Role;
import com.i1314i.ourproject.po.shiro.UserRole;
import org.apache.ibatis.annotations.*;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;
import java.util.Map;

/**
 * @author 平行时空
 * @created 2018-10-09 18:04
 **/
@Mapper
@CacheConfig(cacheNames = "role")
public interface RoleMapper
{


//    @Insert("insert into sys_role(name, description,department, create_time, update_time) values(#{name}, #{description},#{department}, now(),now())")
    Integer save(Role role);

    Integer count(PageBean pageBean);

    List<Role> list(PageBean pageBean);
    List<Role> listOfSelf(PageBean pageBean);

//    List<Role> list(@Param("params") Map<String, Object> params, @Param("offset") Integer offset,
//                    @Param("limit") Integer limit);

//    @Select("select * from sys_role t where t.id = #{id}")
    Role getById(Long id);

//    @Select("select * from sys_role t where t.name = #{name}")
    Role getRole(String name);

    @Update("update sys_role  set name = #{name}, description = #{description},department=#{department}, update_time =#{updateTime} where id = #{id}")
    Integer update(Role role);

//    @Select("select * from sys_role r inner join sys_role_user ru on r.id = ru.role_id where ru.user_id = #{userId}")
    List<Role> listByUserId(String userId);

    @Delete("delete from sys_role_permission where role_id = #{roleId}")
    Integer deleteRolePermission(Long roleId);

    Integer saveRolePermission(@Param("roleId") Long roleId, @Param("permissionIds") List<Long> permissionIds);

    @Delete("delete from sys_role where id = #{id}")
    Integer delete(Long id);

    @Delete("delete from sys_role_user where role_id = #{roleId}")
    Integer deleteRoleUser(Long roleId);


    Integer  insertUserRole(UserRole userRole);
    Integer delUserRole(String usrId);
}
