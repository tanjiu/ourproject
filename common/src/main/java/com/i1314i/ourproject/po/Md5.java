package com.i1314i.ourproject.po;

/**
 * @author 平行时空
 * @created 2018-09-20 22:00
 **/
public class Md5 {
    //盐值
    private String salt;
    //加密后的值
    private String encodedString;

    public Md5(String salt, String encodedString) {
        this.salt = salt;
        this.encodedString = encodedString;
    }

    public Md5() {
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getEncodedString() {
        return encodedString;
    }

    public void setEncodedString(String encodedString) {
        this.encodedString = encodedString;
    }
}
