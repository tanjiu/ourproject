package com.i1314i.ourproject.service.user;

import com.i1314i.ourproject.po.ResultMap;
import com.i1314i.ourproject.po.User;
import com.i1314i.ourproject.po.shiro.Permission;

import java.util.List;


/**
 * @author 平行时空
 * @created 2018-10-09 17:47
 **/
public interface PermissionService {
    ResultMap save(Permission permission);

    ResultMap update(Permission permission);

    ResultMap delete(Long id);
    List<Permission>getPermissionListByUserId(User user);
    List<Permission>findUrlPermissionList();
}
