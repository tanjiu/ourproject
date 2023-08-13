package com.i1314i.ourproject.service.manger;

import com.i1314i.ourproject.po.Token;
import com.i1314i.ourproject.po.User;
import org.apache.shiro.authc.UsernamePasswordToken;

/**
 * @author 平行时空
 * @created 2018-11-23 21:11
 **/
public interface TokenManager {


    /**
     * 保存Token
     *
     * @param token
     * @return
     */
    Token saveToken(User token);

    /**
     * 根据token获取凭证
     *
     * @param key
     * @return
     */
    User getToken(String key);

    /**
     * 删除token
     *
     * @param key
     */
    boolean deleteToken(String key);
}
