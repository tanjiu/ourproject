package com.i1314i.ourproject.po;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;

/**
 * 内部通用信息
 * @author 平行时空
 * @created 2018-09-19 11:48
 **/
public class CommonMsg implements Serializable {
    private String code;
    private String msg;

    public CommonMsg(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public CommonMsg() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String msgJson(){
        return JSON.toJSONString(this);
    }
    public static CommonMsg createCommonMsg(){
        return new CommonMsg();
    }

    /**
     * 通过json获取对象
     * @param json
     * @return
     */
    public static CommonMsg getCommonMsgFromJson(String json){
        CommonMsg msg=JSON.parseObject(json,CommonMsg.class);
        return msg;
    }
}
