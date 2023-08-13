package com.i1314i.ourproject.po;

import java.io.Serializable;
import java.util.Date;

/**
 * Restful方式登陆token
 * @author 平行时空
 * @created 2018-08-28 21:59
 **/
public class Token implements Serializable {
    private String token;

    /**
     * 到期时间
     */
    private Date expireTime;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public Token() {
    }

    public Token(String token, Date expireTime) {
        this.token = token;
        this.expireTime = expireTime;
    }
}
