package com.i1314i.ourproject.shiro.realm;


import com.i1314i.ourproject.po.Code;
import com.i1314i.ourproject.po.User;
import com.i1314i.ourproject.service.user.UserService;
import com.i1314i.ourproject.shiro.exception.CodeException;
import com.i1314i.ourproject.shiro.token.CaptchaUsernamePasswordToken;
import com.i1314i.ourproject.utils.inimsg.UserMsgUtils;
import com.i1314i.ourproject.utils.redisToken.TokenUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 用户名登陆
 * @author 平行时空
 * @created 2018-09-16 22:38
 **/

@Component
public class UserLoginRealm extends AuthorizingRealm {
    @Autowired
    UserService userServices;
    private Logger logger= LoggerFactory.getLogger(UserLoginRealm.class);
    @Override
    public String getName() {
        return "userLoginRealm";
    }

    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof CaptchaUsernamePasswordToken; //支持CaptchaUsernamePasswordToken类型的Token
    }


    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        return null;
    }
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        CaptchaUsernamePasswordToken newToken=(CaptchaUsernamePasswordToken)token;
        String username = (String)newToken.getPrincipal();  //得到用户名
        Code code=newToken.getCode();

        if (!TokenUtils.verifyCode(code)){
                //验证码错误
                logger.info(username+": "+ UserMsgUtils.login_code_is_error_msg);
                throw new CodeException(UserMsgUtils.login_code_is_error_msg);
        }
        User usersql=null;
        try{
             usersql=userServices.selectUserByUserName(username);
            System.out.println(usersql.toString());
        }catch (Exception e){
            System.out.println(e.getMessage());
            throw new UnknownAccountException(); //如果用户名错误
        }



        if(usersql==null){
            logger.info(UserMsgUtils.login_error_msg);
            throw new UnknownAccountException(); //如果用户名错误
        }

        System.out.println(usersql.toString());
//        Md5 md5=Md5Utils.getMsgMD5(username,password,2);
        SimpleAuthenticationInfo ai=null;
        System.out.println();
         ai = new SimpleAuthenticationInfo(usersql.getUsername(),usersql.getPassword(), getName());
        ai.setCredentialsSalt(ByteSource.Util.bytes(usersql.getSalt())); //盐是用户名+随机数
        //如果身份认证验证成功，返回一个AuthenticationInfo实现；
        return ai;

    }

}
