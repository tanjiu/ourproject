package com.i1314i.ourproject.utils.redisToken;

import com.alibaba.fastjson.JSON;
import com.i1314i.ourproject.po.Code;
import com.i1314i.ourproject.po.User;
import com.i1314i.ourproject.utils.jedisUtils.IJedisClient;
import com.i1314i.ourproject.utils.jedisUtils.JedisClient;
import sun.misc.BASE64Encoder;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;


/**
 * @author 平行时空
 * @created 2018-09-18 17:35
 **/
public class TokenUtils {
    private static IJedisClient jedisClient=new JedisClient();

    public static String getUsername(String token){
        User user=null;
        try{
            if (jedisClient.exists(token)){
                user= JSON.parseObject(jedisClient.get(token),User.class);
            }
        }catch (Exception e){
            System.out.println("error");
        }

        if(user!=null){
            return user.getUsername();
        }else {
            return null;
        }
    }

    /**
     * 获取token对应对象
     * @param clazz
     * @param <T>
     * @return
     */
    public static  <T>  T getToken(Class<T> clazz,String token){
        T user=null;
//        System.out.println(jedisClient.get(token));
        try{
            if(jedisClient.exists(token)){
                user= JSON.parseObject(jedisClient.get(token),clazz);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }

        return user;
    }


    /**
     * 存储token以及数据
     * @param json
     * @param token
     * @return
     */
    public static  boolean setToken(String json,String token){
        try{
            jedisClient.set(token,json,60*60*24);

        }catch (Exception e){
            return false;
        }

        return true;
    }

    /**
     * 校验 token 是否正确
     *
     * @param token    密钥
     * @return 是否正确
     */
    public static boolean verify(String token) {
        try {
            return jedisClient.exists(token);
        } catch (Exception exception) {
            return false;
        }
    }


    /**
     * 生成Token
     * @return
     */
    public static String makeToken() {
        String token = (System.currentTimeMillis() + new Random().nextInt(999999999)) + "";
        try {
            MessageDigest md = MessageDigest.getInstance("md5");
            byte md5[] =  md.digest(token.getBytes());
            BASE64Encoder encoder = new BASE64Encoder();
            return encoder.encode(md5);
        } catch (NoSuchAlgorithmException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 生成token
     * @param clazz
     * @param objJson
     * @param token
     * @param <T>
     * @return
     */
    public static  <T> boolean makeToken(Class<T> clazz,Object objJson,String token) {

        try {
            String json=JSON.toJSONString((T)objJson);
            jedisClient.set(token,json,60*60*5);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            return false;
        }
       return true;
    }

    /**
     * 验证码
     * @param code
     * @return
     */
    public static  boolean verifyCode(Code code){
        try{
            if(jedisClient.exists("img_"+code.getCodetoken())){
                String coderedis=jedisClient.get("img_"+code.getCodetoken());

                if(coderedis.equalsIgnoreCase(code.getCode())){
                    return true;
                }
            }
            return false;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    /**
     * 图片验证码
     * @param token
     * @return
     */
    public static String newImgToken(String token){
        return "img_"+token;
    }
}
