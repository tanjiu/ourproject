package com.i1314i.ourproject.utils.Sysmsg;

import com.i1314i.ourproject.po.User;
import com.i1314i.ourproject.po.pageHelper.PageBean;

/**
 * @author 平行时空
 * @created 2018-10-14 18:09
 **/
public class RedisSign {
    public static String getPermissionList(User user){
        return "system_permission_"+user.getUserId();
    }
    public static String delPermissionList(){
        return "system_permission_";
    }
    public static String delPermissionList(Long id){
        return "system_permission_"+id;
    }
    public static String getUserRoles(User user){
        return "sys_getUserRoles_"+user.getUserId();
    }

    public static String delUserRoles(){
        return "sys_getUserRoles_";
    }

    public static String selectListRoles(PageBean pageBean){
        return "sys_selectListRoles_"+pageBean.getPageSize()+"_"+pageBean.getCurrentPage();
    }
}
