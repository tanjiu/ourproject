package com.i1314i.ourproject.shiro.token;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * Created with IntelliJ IDEA
 *
 * @Author yuanhaoyue swithaoy@gmail.com
 * @Description token
 * @Date 2018-04-09
 * @Time 16:54
 */
public class IToken implements AuthenticationToken {
    private String token;

    public IToken(String token) {
        this.token = token;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}
