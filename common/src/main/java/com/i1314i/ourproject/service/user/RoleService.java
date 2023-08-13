package com.i1314i.ourproject.service.user;

import com.github.pagehelper.PageInfo;
import com.i1314i.ourproject.po.ResultMap;
import com.i1314i.ourproject.po.User;
import com.i1314i.ourproject.po.pageHelper.PageBean;
import com.i1314i.ourproject.po.shiro.Role;
import com.i1314i.ourproject.po.shiro.RoleDto;
import com.i1314i.ourproject.po.shiro.UserRole;

import java.util.List;
import java.util.Map;

/**
 * @author 平行时空
 * @created 2018-10-01 17:12
 **/
public interface RoleService {



    ResultMap saveRole(RoleDto roleDto);

    ResultMap deleteRole(Long id);
    ResultMap saveRolePermission(Long roleId, List<Long> permissionIds);

    Map<String,Object> selectListRoles(PageBean pageBean);
    PageInfo<Role> selectListRolesPage(PageBean pageBean);
    List<Role> getUserRoles(User user);

    ResultMap delete(Role role);

    int insertUserRole(UserRole userRole);

    int delUserRole(String usrId);
}
