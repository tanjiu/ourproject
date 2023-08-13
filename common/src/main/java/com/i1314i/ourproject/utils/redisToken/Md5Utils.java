package com.i1314i.ourproject.utils.redisToken;


import com.i1314i.ourproject.po.Md5;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;

/**
 * @author 平行时空
 * @created 2018-09-20 22:00
 **/
public class Md5Utils {

    public static Md5 getMsgMD5(String salt, String password, Integer hashIterations) {
        String algorithmName = "md5";
        if (hashIterations==null){
            hashIterations=2;
        }
        String salt1 = salt;
    //    String salt2 = new SecureRandomNumberGenerator().nextBytes().toHex();
        SimpleHash hash = new SimpleHash(algorithmName, password, salt1 , hashIterations);
        String encodedPassword = hash.toHex();
        Md5 md5=new Md5(salt1,encodedPassword);
        return md5;
    }

    public static String getMsgMD5Password(String salt, String password, Integer hashIterations) {
        String algorithmName = "md5";
        if (hashIterations==null){
            hashIterations=2;
        }
        String salt1 = salt;
        //    String salt2 = new SecureRandomNumberGenerator().nextBytes().toHex();
        SimpleHash hash = new SimpleHash(algorithmName, password, salt1 , hashIterations);
        String encodedPassword = hash.toHex();

        return encodedPassword;
    }

    /**
     * 获取盐值
     * @param username
     * @return
     */
    public static String getSalt(String username) {
        String salt2 = new SecureRandomNumberGenerator().nextBytes().toHex();
        return username+salt2;
    }

}
