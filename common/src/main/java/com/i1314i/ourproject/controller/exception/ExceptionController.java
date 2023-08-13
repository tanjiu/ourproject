package com.i1314i.ourproject.controller.exception;


import com.i1314i.ourproject.po.ResultMap;
import com.i1314i.ourproject.shiro.exception.CodeException;
import com.i1314i.ourproject.utils.inimsg.QuartzMsgUtils;
import com.i1314i.ourproject.utils.inimsg.UserMsgUtils;
import org.apache.shiro.ShiroException;
import org.apache.shiro.authc.*;
import org.apache.shiro.authc.pam.UnsupportedTokenException;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.HostUnauthorizedException;
import org.apache.shiro.authz.UnauthenticatedException;
import org.apache.shiro.authz.UnauthorizedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.io.IOException;



/**
 * 统一异常捕获处理
 * @author 平行时空
 * @created 2018-09-18 21:02
 **/
//@RestControllerAdvice
public class ExceptionController {

    private final ResultMap resultMap;
    private Logger logger= LoggerFactory.getLogger(ExceptionController.class);

    @Autowired
    public ExceptionController(ResultMap resultMap) {
        this.resultMap = resultMap;
    }


    /**
     * 400错误请求 信息解析错误
     * @return
     */
    @ExceptionHandler(IllegalArgumentException.class)
    public ResultMap IllegalArgumentException(){
        return resultMap.start().code(UserMsgUtils.user_senderror_code)
                .msg(UserMsgUtils.user_senderror_msg);
    }


    @ExceptionHandler(Exception.class)
    public ResultMap Exception(Exception ex){
        logger.info("error:"+ex.getMessage());
        return resultMap.start().code("500")
                .msg("error");

    }


    /**
     * 400错误请求 信息解析错误
     * @return
     */
    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResultMap HttpMessageNotReadableException(){
        return resultMap.start().code(UserMsgUtils.user_senderror_code)
                .msg(UserMsgUtils.user_senderror_msg);
    }




    /**
     * 捕捉 CustomRealm 抛出的异常  100
     */
    @ExceptionHandler(AccountException.class)
    public ResultMap handleShiroException(Exception ex) throws IOException {
        return resultMap.start()
                .code(UserMsgUtils.login_error_code)
                .msg(ex.getMessage());
    }


    /**
     * 捕获shiro全局异常  401
     * @return
     */
    @ExceptionHandler(ShiroException.class)
    public ResultMap handle401() {
        resultMap.remove("data");
        return resultMap.start()
                .code(UserMsgUtils.user_no_role_code)
                .msg(UserMsgUtils.user_no_role_msg);
    }


    /**
     * 身份令牌异常  111
     * @return
     */
    @ExceptionHandler(UnsupportedTokenException.class)
    public ResultMap UnsupportedTokenException(){
        resultMap.remove("data");
        return resultMap.start()
                .code(UserMsgUtils.user_role_token_error_code)
                .msg(UserMsgUtils.user_role_token_error_msg);
    }


    /**
     * 账户异常
     * @return
     */
//    @ExceptionHandler(AccountException.class)
//    public ResultMap AccountException(){
//        return resultMap.start().code("112").msg("您没有权限访问:账户异常");
//    }


    /**
     * 未知账户/没找到帐号,登录失败 100
     * @return
     */
    @ExceptionHandler(UnknownAccountException.class)
    public ResultMap UnknownAccountException() throws IOException {
        resultMap.remove("data");
        return resultMap.start()
                .code(UserMsgUtils.login_error_code)
                .msg(UserMsgUtils.login_error_msg);
    }

    /**
     * 帐号锁定  118
     * @return
     */
    @ExceptionHandler(LockedAccountException.class)
    public ResultMap LockedAccountException(){
        return resultMap.start()
                .code(UserMsgUtils.user_role_token_lock_code)
                .msg(UserMsgUtils.user_role_token_lock_msg);
    }

    /**
     * 用户禁用 119
     * @return
     */
    @ExceptionHandler(DisabledAccountException.class)
    public ResultMap DisabledAccountException(){
        return resultMap.start()
                .code(UserMsgUtils.user_role_token_disabled_code)
                .msg(UserMsgUtils.user_role_token_disabled_msg);
    }


    /**
     * 一个用户多次登录异常：不允许多次登录，只能登录一次 。即不允许多处登录 120
     * @return
     */
    @ExceptionHandler(ConcurrentAccessException.class)
    public ResultMap ConcurrentAccessException(){
        return resultMap.start()
                .code(UserMsgUtils.user_role_token_concurrent_code)
                .msg(UserMsgUtils.user_role_token_concurrent_msg);
    }


//    账户异常

    /**
     * 过期的凭据异常 113
     * @return
     */
    @ExceptionHandler(ExpiredCredentialsException.class)
    public ResultMap ExpiredCredentialsException(){
        return resultMap.start()
                .code(UserMsgUtils.user_role_token_ExpiredCredentials_code)
                .msg(UserMsgUtils.user_role_token_ExpiredCredentials_msg);
    }

    /**
     * 错误的凭据异常  113
     * @return
     */
    @ExceptionHandler(IncorrectCredentialsException.class)
    public ResultMap IncorrectCredentialsException() throws IOException {
        return resultMap.start()
                .code(UserMsgUtils.login_error_code)
                .msg(UserMsgUtils.login_error_msg);
    }



    /**
     * 凭据异常  113
     * @return
     */
    @ExceptionHandler(CredentialsException.class)
    public ResultMap CredentialsException(){
        return resultMap.start()
                .code(UserMsgUtils.user_role_token_ExpiredCredentials_code)
                .msg(UserMsgUtils.user_role_token_ExpiredCredentials_msg);
    }

    /**
     * 凭据异常 113
     * @return
     */
    @ExceptionHandler(AuthenticationException.class)
    public ResultMap AuthenticationException(){
        return resultMap.start()
                .code(UserMsgUtils.user_role_token_ExpiredCredentials_code)
                .msg(UserMsgUtils.user_role_token_ExpiredCredentials_msg);
    }




//    权限异常

    /**
     * 没有访问权限，访问异常  115
     * @return
     */
    @ExceptionHandler(HostUnauthorizedException.class)
    public ResultMap HostUnauthorizedException(){
        return resultMap.start()
                .code(UserMsgUtils.user_role_token_HostUnauthorized_code)
                .msg(UserMsgUtils.user_role_token_HostUnauthorized_msg);
    }

    /**
     * 没有访问权限，访问异常
     * @return
     */
    @ExceptionHandler(UnauthorizedException.class)
    public ResultMap UnauthorizedException(){
        return resultMap.start()
                .code(UserMsgUtils.user_role_token_HostUnauthorized_code)
                .msg(UserMsgUtils.user_role_token_HostUnauthorized_msg);
    }


//    授权异常

    /**
     * 授权异常 116
     * @return
     */
    @ExceptionHandler(UnauthenticatedException.class)
    public ResultMap UnauthenticatedException(){
        return resultMap.start()
                .code(UserMsgUtils.user_role_token_Unauthenticated_code)
                .msg(UserMsgUtils.user_role_token_Unauthenticated_msg);
    }

    @ExceptionHandler(AuthorizationException.class)
    public ResultMap AuthorizationException(){
        return resultMap.start()
                .code(UserMsgUtils.user_role_token_Unauthenticated_code)
                .msg(UserMsgUtils.user_role_token_Unauthenticated_msg);
    }


    /**
     * 捕获输入密码错误异常 100
     * @return
     */
    @ExceptionHandler(ExcessiveAttemptsException.class)
    public ResultMap handleShiroPasswordCount(){
        return resultMap.start()
                .code(UserMsgUtils.user_role_token_ExcessiveAttempts_code)
                .msg(UserMsgUtils.user_role_token_ExcessiveAttempts_msg);
    }

    /**
     * 捕获验证码异常  104
     * @return
     */
    @ExceptionHandler(CodeException.class)
    public ResultMap handleCodeError() {
        ResultMap resultMap=new ResultMap();
        System.out.println("sss");
        return resultMap.start()
                .code(UserMsgUtils.login_code_is_error_code)
                .msg(UserMsgUtils.login_code_is_error_msg);
    }
}
