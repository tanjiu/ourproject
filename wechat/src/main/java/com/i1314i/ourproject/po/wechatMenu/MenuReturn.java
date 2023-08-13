package com.i1314i.ourproject.po.wechatMenu;

import java.io.Serializable;

/**
 * 创建菜单返回类
 * @author 平行时空
 * @created 2018-09-30 17:03
 **/
public class MenuReturn implements Serializable{
    private int errcode;
    private String errmsg;

    public int getErrcode() {
        return errcode;
    }

    public void setErrcode(int errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }
}
