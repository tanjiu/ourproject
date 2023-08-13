package com.i1314i.ourproject.po;

import java.io.Serializable;

/**
 * @author 平行时空
 * @created 2018-09-19 21:53
 **/
public class Code implements Serializable {
    private String codetoken;
    private String code;

    public Code(String codetoken, String code) {
        this.codetoken = codetoken;
        this.code = code;
    }

    public Code() {
    }

    public String getCodetoken() {
        return codetoken;
    }

    public void setCodetoken(String codetoken) {
        this.codetoken = codetoken;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Code{" +
                "codetoken='" + codetoken + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
