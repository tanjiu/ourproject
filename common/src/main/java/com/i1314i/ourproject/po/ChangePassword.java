package com.i1314i.ourproject.po;

/**
 * @author 平行时空
 * @created 2018-11-18 19:20
 **/

public class ChangePassword {
    private String oldpassword;
    private String newpassword;

    public void setOldpassword(String oldpassword) {
        this.oldpassword = oldpassword;
    }

    public void setNewpassword(String newpassword) {
        this.newpassword = newpassword;
    }

    public String getOldpassword() {
        return oldpassword;
    }

    public String getNewpassword() {
        return newpassword;
    }
}
