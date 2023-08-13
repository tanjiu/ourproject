package com.i1314i.ourproject.mapper;

import com.i1314i.ourproject.po.User;
import com.i1314i.ourproject.po.pageHelper.PageBean;
import org.mapstruct.Mapper;
import org.springframework.cache.annotation.CacheConfig;

import java.util.List;

/**
 * @author 平行时空
 * @created 2018-10-01 16:59
 **/
@Mapper

public interface UserMapper {
    List<User> selectUserByUserName(String username);
    User findUserById(String id);
    void insertUser(User user);
    List<User>findUserListByDepartmentId(String departmentId);

    List<User> findLisUsersPage(PageBean pageBean);

    Integer saveUser(User user);
    void delete(String userId);
}
