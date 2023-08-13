package com.i1314i.ourproject.utils.inimsg;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


/**
 * 参数类
 * @author 平行时空
 * @created 2018-09-21 0:43
 **/
@Configuration
@PropertySource(value= "classpath:msg.properties",encoding = "UTF-8")
public class UserMsgUtils {

    //登陆错误 账号或者密码错误
    public static String login_error_code;
    public static String login_error_msg;

    @Value("${login.error.code}")
    public  void setLogin_error_code(String login_error_code) {
        UserMsgUtils.login_error_code = login_error_code;
    }
    @Value("${login.error.msg}")
    public  void setLogin_error_msg(String login_error_msg) {
        UserMsgUtils.login_error_msg = login_error_msg;
    }


    //登陆成功

    public static String login_success_code;
    public static String login_success_msg;
    @Value("${login.success.code}")
    public  void setLogin_success_code(String login_success_code) {
        UserMsgUtils.login_success_code = login_success_code;
    }
    @Value("${login.success.msg}")
    public  void setLogin_success_msg(String login_success_msg) {
        UserMsgUtils.login_success_msg = login_success_msg;
    }



    //用户名为空

    public static String login_username_is_null_code;
    public static String login_username_is_null_msg;

    @Value("${login.username_is_null.code}")
    public  void setLogin_username_is_null_code(String login_username_is_null_code) {
        UserMsgUtils.login_username_is_null_code = login_username_is_null_code;
    }
    @Value("${login.username_is_null.msg}")
    public  void setLogin_username_is_null_msg(String login_username_is_null_msg) {
        UserMsgUtils.login_username_is_null_msg = login_username_is_null_msg;
    }


    //密码不能为空

    public static String login_password_is_null_code;
    public static String login_password_is_null_msg;
    @Value("${login.password_is_null.code}")
    public  void setLogin_password_is_null_code(String login_password_is_null_code) {
        UserMsgUtils.login_password_is_null_code = login_password_is_null_code;
    }
    @Value("${login.password_is_null.msg}")
    public  void setLogin_password_is_null_msg(String login_password_is_null_msg) {
        UserMsgUtils.login_password_is_null_msg = login_password_is_null_msg;
    }



    //验证码不能为空

    public static String login_code_is_null_code;
    public static String login_code_is_null_msg;
    @Value("${login.code_is_null.code}")
    public  void setLogin_code_is_null_code(String login_code_is_null_code) {
        UserMsgUtils.login_code_is_null_code = login_code_is_null_code;
    }
    @Value("${login.code_is_null.msg}")
    public  void setLogin_code_is_null_msg(String login_code_is_null_msg) {
        UserMsgUtils.login_code_is_null_msg = login_code_is_null_msg;
    }



    //网络异常 请重试

    public static String login_net_error_code;
    public static String login_net_error_msg;

    @Value("${login.net.error.code}")
    public  void setLogin_net_error_code(String login_net_error_code) {
        UserMsgUtils.login_net_error_code = login_net_error_code;
    }
    @Value("${login.net.error.msg}")
    public  void setLogin_net_error_msg(String login_net_error_msg) {
        UserMsgUtils.login_net_error_msg = login_net_error_msg;
    }


    //验证码错误

    public static String login_code_is_error_code;
    public static String login_code_is_error_msg;

    @Value("${login.code_is_error.code}")
    public  void setLogin_code_is_error_code(String login_code_is_error_code) {
        UserMsgUtils.login_code_is_error_code = login_code_is_error_code;
    }
    @Value("${login.code_is_error.msg}")
    public  void setLogin_code_is_error_msg(String login_code_is_error_msg) {
        UserMsgUtils.login_code_is_error_msg = login_code_is_error_msg;
    }


    //您没有权限访问！

    public static String user_no_role_code;
    public static String user_no_role_msg;
    @Value("${user.no.role.code}")
    public  void setUser_no_role_code(String user_no_role_code) {
        UserMsgUtils.user_no_role_code = user_no_role_code;
    }
    @Value("${user.no.role.msg}")
    public  void setUser_no_role_msg(String user_no_role_msg) {
        UserMsgUtils.user_no_role_msg = user_no_role_msg;
    }

//    身份令牌异常
    public static String user_role_token_error_code;
    public static String user_role_token_error_msg;
    @Value("${user.role.token.error.code}")
    public  void setUser_role_token_error_code(String user_role_token_error_code) {
        UserMsgUtils.user_role_token_error_code = user_role_token_error_code;
    }
    @Value("${user.role.token.error.msg}")
    public  void setUser_role_token_error_msg(String user_role_token_error_msg) {
        UserMsgUtils.user_role_token_error_msg = user_role_token_error_msg;
    }


    //账号锁定
    public static String user_role_token_lock_code;
    public static String user_role_token_lock_msg;
    @Value("${user.role.token.lock.code}")
    public  void setUser_role_token_lock_code(String user_role_token_lock_code) {
        UserMsgUtils.user_role_token_lock_code = user_role_token_lock_code;
    }
    @Value("${user.role.token.lock.msg}")
    public  void setUser_role_token_lock_msg(String user_role_token_lock_msg) {
        UserMsgUtils.user_role_token_lock_msg = user_role_token_lock_msg;
    }

    //用户禁用
    public static String user_role_token_disabled_code;
    public static String user_role_token_disabled_msg;
    @Value("${user.role.token.disabled.code}")
    public  void setUser_role_token_disabled_code(String user_role_token_disabled_code) {
        UserMsgUtils.user_role_token_disabled_code = user_role_token_disabled_code;
    }
    @Value("${user.role.token.disabled.msg}")
    public  void setUser_role_token_disabled_msg(String user_role_token_disabled_msg) {
        UserMsgUtils.user_role_token_disabled_msg = user_role_token_disabled_msg;
    }

    //一个用户多次登录异常：不允许多次登录
    public static String user_role_token_concurrent_code;
    public static String user_role_token_concurrent_msg;
    @Value("${user.role.token.concurrent.code}")
    public  void setUser_role_token_concurrent_code(String user_role_token_concurrent_code) {
        UserMsgUtils.user_role_token_concurrent_code = user_role_token_concurrent_code;
    }
    @Value("${user.role.token.concurrent.msg}")
    public  void setUser_role_token_concurrent_msg(String user_role_token_concurrent_msg) {
        UserMsgUtils.user_role_token_concurrent_msg = user_role_token_concurrent_msg;
    }

    //凭据异常
    public static String user_role_token_Credentials_code;
    public static String user_role_token_Credentials_msg;
    @Value("${user.role.token.Credentials.code}")
    public  void setUser_role_token_Credentials_code(String user_role_token_Credentials_code) {
        UserMsgUtils.user_role_token_Credentials_code = user_role_token_Credentials_code;
    }
    @Value("${user.role.token.Credentials.msg}")
    public  void setUser_role_token_Credentials_msg(String user_role_token_Credentials_msg) {
        UserMsgUtils.user_role_token_Credentials_msg = user_role_token_Credentials_msg;
    }
    //权限异常
    public static String user_role_token_HostUnauthorized_code;
    public static String user_role_token_HostUnauthorized_msg;
    @Value("${user.role.token.HostUnauthorized.code}")
    public  void setUser_role_token_HostUnauthorized_code(String user_role_token_HostUnauthorized_code) {
        UserMsgUtils.user_role_token_HostUnauthorized_code = user_role_token_HostUnauthorized_code;
    }
    @Value("${user.role.token.HostUnauthorized.msg}")
    public  void setUser_role_token_HostUnauthorized_msg(String user_role_token_HostUnauthorized_msg) {
        UserMsgUtils.user_role_token_HostUnauthorized_msg = user_role_token_HostUnauthorized_msg;
    }

    //授权异常
    public static String user_role_token_Unauthenticated_code;
    public static String user_role_token_Unauthenticated_msg;
    @Value("${user.role.token.Unauthenticated.code}")
    public  void setUser_role_token_Unauthenticated_code(String user_role_token_Unauthenticated_code) {
        UserMsgUtils.user_role_token_Unauthenticated_code = user_role_token_Unauthenticated_code;
    }
    @Value("${user.role.token.Unauthenticated.msg}")
    public  void setUser_role_token_Unauthenticated_msg(String user_role_token_Unauthenticated_msg) {
        UserMsgUtils.user_role_token_Unauthenticated_msg = user_role_token_Unauthenticated_msg;
    }
    //捕获输入密码错误锁定
    public static String user_role_token_ExcessiveAttempts_code;
    public static String user_role_token_ExcessiveAttempts_msg;
    @Value("${user.role.token.ExcessiveAttempts.code}")
    public  void setUser_role_token_ExcessiveAttempts_code(String user_role_token_ExcessiveAttempts_code) {
        UserMsgUtils.user_role_token_ExcessiveAttempts_code = user_role_token_ExcessiveAttempts_code;
    }
    @Value("${user.role.token.ExcessiveAttempts.msg}")
    public  void setUser_role_token_ExcessiveAttempts_msg(String user_role_token_ExcessiveAttempts_msg) {
        UserMsgUtils.user_role_token_ExcessiveAttempts_msg = user_role_token_ExcessiveAttempts_msg;
    }

    //#您没有权限访问:凭据已过期
    public static String user_role_token_ExpiredCredentials_code;
    public static String user_role_token_ExpiredCredentials_msg;
    @Value("${user.role.token.ExpiredCredentials.code}")
    public  void setUser_role_token_ExpiredCredentials_code(String user_role_token_ExpiredCredentials_code) {
        UserMsgUtils.user_role_token_ExpiredCredentials_code = user_role_token_ExpiredCredentials_code;
    }
    @Value("${user.role.token.ExpiredCredentials.msg}")
    public  void setUser_role_token_ExpiredCredentials_msg(String user_role_token_ExpiredCredentials_msg) {
        UserMsgUtils.user_role_token_ExpiredCredentials_msg = user_role_token_ExpiredCredentials_msg;
    }

    //管理员登陆成功

    //超级
    public static String admin_login_success_code;
    //学校
    public static String admin_school_success_code;
    //学院
    public static String admin_college_success_code;
    //信息
    public static String admin_login_success_msg;

    @Value("${admin.login.success.code}")
    public  void setAdmin_login_success_code(String admin_login_success_code) {
        UserMsgUtils.admin_login_success_code = admin_login_success_code;
    }

    @Value("${admin.school.success.code}")
    public  void setAdmin_school_success_code(String admin_school_success_code) {
        UserMsgUtils.admin_school_success_code = admin_school_success_code;
    }
    @Value("${admin.college.success.code}")
    public  void setAdmin_college_success_code(String admin_college_success_code) {
        UserMsgUtils.admin_college_success_code = admin_college_success_code;
    }
    @Value("${admin.login.success.msg}")
    public  void setAdmin_login_success_msg(String admin_login_success_msg) {
        UserMsgUtils.admin_login_success_msg = admin_login_success_msg;
    }


    //request error信息传入错误 错误请求

    public static String user_senderror_code;
    public static String user_senderror_msg;
    @Value("${user.senderror.code}")
    public  void setUser_senderror_code(String user_senderror_code) {
        UserMsgUtils.user_senderror_code = user_senderror_code;
    }
    @Value("${user.senderror.msg}")
    public  void setUser_senderror_msg(String user_senderror_msg) {
        UserMsgUtils.user_senderror_msg = user_senderror_msg;
    }
}
