package com.i1314i.ourproject.po.images;

import java.io.Serializable;

/**
 * 验证码po
 * @author 平行时空
 * @created 2018-09-28 22:33
 **/
public class Validate  implements Serializable {
    private String Base64Str;//Base64 值
    private String codetoken;

    public String getBase64Str() {
        return Base64Str;
    }

    public void setBase64Str(String base64Str) {
        Base64Str = base64Str;
    }

    public String getCodetoken() {
        return codetoken;
    }

    public void setCodetoken(String codetoken) {
        this.codetoken = codetoken;
    }
}
