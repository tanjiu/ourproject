package com.i1314i.ourproject.service.user.login;

import com.i1314i.ourproject.po.ResultMap;
import com.i1314i.ourproject.po.User;

/**
 * @author 平行时空
 * @created 2018-11-27 21:52
 **/
public interface BaseLogin {
    ResultMap getUserToken(User user);
}
