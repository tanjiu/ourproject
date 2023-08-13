package com.i1314i.ourproject.shiro.token;


import com.i1314i.ourproject.po.Code;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;

/**
 * usernamepasswordToken扩展类加入验证码
 * @author 平行时空
 * @created 2018-09-19 17:34
 **/
public class CaptchaUsernamePasswordToken extends UsernamePasswordToken implements AuthenticationToken {

    //验证码
    private Code code;
    public CaptchaUsernamePasswordToken(String username, char[] password, Code code) {
        super(username, password);
        this.code = code;
    }

    public CaptchaUsernamePasswordToken(String username, String password, Code code) {
        super(username, password);
        this.code = code;
    }

    public CaptchaUsernamePasswordToken(String username, String password, boolean rememberMe, String host, Code code) {
        super(username, password, rememberMe, host);
        this.code = code;
    }

    public Code getCode() {
        return code;
    }

    public void setCode(Code code) {
        this.code = code;
    }
}
