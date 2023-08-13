package com.i1314i.ourproject.po.shiro;

import java.io.Serializable;

/**
 * @author 平行时空
 * @created 2018-10-03 17:55
 **/
public class ChangeRole implements Serializable{
    String userId;
    String[]roles;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String[] getRoles() {
        return roles;
    }

    public void setRoles(String[] roles) {
        this.roles = roles;
    }
}
