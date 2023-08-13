package com.i1314i.ourproject.service.status;

/**
 * @author 平行时空
 * @created 2018-11-23 16:51
 **/
public interface UserConstants {

    /** 加密次数 */
    int HASH_ITERATIONS = 3;

    String LOGIN_USER = "login_user";

    String USER_PERMISSIONS = "user_permissions";

    /** 登陆token(nginx中默认header无视下划线) */
    String LOGIN_TOKEN = "token";

}
