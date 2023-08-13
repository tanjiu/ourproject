package com.i1314i.ourproject.utils.wechat;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.i1314i.ourproject.po.Access_token;
import com.i1314i.ourproject.po.wechatMenu.Button;
import com.i1314i.ourproject.po.wechatMenu.Menu;
import com.i1314i.ourproject.po.wechatMenu.MenuReturn;
import com.i1314i.ourproject.utils.common.TemplateUtils;
import com.i1314i.ourproject.utils.httpclient.WxHttpClientUtils;
import org.apache.commons.collections4.map.LinkedMap;
import org.apache.http.HttpException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 平行时空
 * @created 2018-09-30 15:18
 **/
public class WechatUtil {
    private static Logger logger= LoggerFactory.getLogger(WechatUtil.class);
    private static String wechatPath="wechatConfig.properties";

    public static Access_token getAccessToken(){
        LinkedMap map=new LinkedMap();
        map.put("grant_type","client_credential");
        map.put("appid",getAppid());
        map.put("secret",getAppsecret());
        String url="https://api.weixin.qq.com/cgi-bin/token";
        String repsMsg="";
        try {
             repsMsg= WxHttpClientUtils.httpGetText(url,map);
        } catch (Exception e) {
            logger.info("微信获取access_token失败");
        }

        Access_token token = JSON.parseObject(repsMsg,Access_token.class);
        return token;
    }

    public static String getAppid(){
        String token= TemplateUtils.getPropertiesdata(wechatPath,"wechat.server.appID");
        return token;
    }

    public static String getAppsecret(){
        String token= TemplateUtils.getPropertiesdata(wechatPath,"wechat.server.appsecret");
        return token;
    }


    public static void main(String[] args) throws NoSuchAlgorithmException, KeyManagementException, IOException {
        Map<String,String>map=new HashMap<>();



    }


    /**
     * 创建自定义菜单
     * @param menu
     * @return
     */
    public static MenuReturn createMenu(Menu menu){
        MenuReturn menuReturn= null;
        try {
            String url=" https://api.weixin.qq.com/cgi-bin/menu/create?access_token="+getAccessToken().getAccess_token();

            JSONObject jsonObject = WxHttpClientUtils.HttpRequest(url, "POST", JSON.toJSONString(menu));
            System.out.println(jsonObject.toJSONString());
             menuReturn=JSON.parseObject(JSON.toJSONString(jsonObject),MenuReturn.class);
            if (null != jsonObject) {
                if (0 != jsonObject.getInteger("errcode")) {
                    String error = String.format("创建菜单失败 errcode:{} errmsg:{}", jsonObject.getInteger("errcode"), jsonObject.getString("errmsg"));
                    System.out.println(error);
                }
            }
        } catch (Exception e) {
            logger.info("创建微信自定义菜单失败");
        }

        if(menuReturn==null){
            System.out.println("ssss");
        }
        return menuReturn;
    }


}
