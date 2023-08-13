package com.i1314i.ourproject.po;

import java.io.Serializable;

/**
 * @author 平行时空
 * @created 2018-07-25 20:40
 **/
public class ResultInfo implements Serializable {
    private String msg;
    private String code;
    private Object data;

    public ResultInfo() {
    }



    public ResultInfo(String msg, String code, Object data) {
        this.msg = msg;
        this.code = code;
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static ResultInfo createResultInfo(){
        return new ResultInfo();
    }
}
