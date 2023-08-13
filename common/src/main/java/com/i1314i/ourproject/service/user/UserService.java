package com.i1314i.ourproject.service.user;

import com.i1314i.ourproject.po.ChangePassword;
import com.i1314i.ourproject.po.ResultMap;
import com.i1314i.ourproject.po.User;
import com.i1314i.ourproject.po.pageHelper.PageBean;

import java.util.List;

/**
 * @author 平行时空
 * @created 2018-10-10 0:14
 **/
public interface UserService {
    ResultMap login(User user);
    /**
     * 按用户名查找user
     * @param username
     * @return
     */
    User selectUserByUserName(String username);

    User selectUserByUid(String uid);
    List<User>findUserListByDepartmentId(String departmentId);


    ResultMap saveUser(User user);
    ResultMap insertUser(User user);
    User updateUser(User user);

    String passwordEncoder(String credentials, String salt);

    ResultMap findLisUsersPage(PageBean pageBean,User user);

    ResultMap deleteUser(String userId);

    ResultMap changePassword(ChangePassword changePassword,User user);
}
