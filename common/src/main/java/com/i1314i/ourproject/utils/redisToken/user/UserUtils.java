package com.i1314i.ourproject.utils.redisToken.user;

import com.i1314i.ourproject.po.User;
import com.i1314i.ourproject.po.shiro.Permission;
import org.apache.shiro.session.Session;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 用户权限/身份管理工具
 * @author 平行时空
 * @created 2018-11-24 10:40
 **/
public interface UserUtils {
      User getCurrentUser(String token);

      User getCurrentUser(HttpServletRequest request);

      List<Permission> getCurrentPermissions(String token);
      List<Permission> getCurrentPermissions(HttpServletRequest request);
      void setPermissionSession(List<Permission> list,String token);
      void setPermissionSession(List<Permission> list,HttpServletRequest request);

      Session getSession();
      void setUserSession(User user,String token);
      void setUserSession(User user,HttpServletRequest request);

      public String getToken();
}
