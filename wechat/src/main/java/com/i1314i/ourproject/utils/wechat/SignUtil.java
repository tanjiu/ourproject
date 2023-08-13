package com.i1314i.ourproject.utils.wechat;

import com.i1314i.ourproject.utils.common.TemplateUtils;
import org.apache.commons.lang3.StringUtils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author 平行时空
 * @created 2018-05-26 21:16
 **/
public class SignUtil {
    //与微信配置中的的Token一致
    private static String servertoken = "pxsk";

    public static String getToken(){

        String token=TemplateUtils.getPropertiesdata("wechatConfig.properties","wechat.server.token");
        if(token==null|| StringUtils.isEmpty(token)){
            token=servertoken;
        }
        return token;
    }

    public static boolean checkSignature(String signature, String timestamp,
                                         String nonce) {
        String[] arra = new String[]{getToken(),timestamp,nonce};
        //将signature,timestamp,nonce组成数组进行字典排序
        Arrays.sort(arra);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arra.length;i++){
            sb.append(arra[i]);
        }
        MessageDigest md = null;
        String stnStr = null;
        try {
            md = MessageDigest.getInstance("SHA-1");
            byte[] digest = md.digest(sb.toString().getBytes());
            stnStr = byteToStr(digest);
        } catch (NoSuchAlgorithmException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //释放内存
        sb = null;
        //将sha1加密后的字符串与signature对比，标识该请求来源于微信
        return stnStr!=null?stnStr.equals(signature.toUpperCase()):false;
    }
    /**
     * 将字节数组转换成十六进制字符串
     * @param digestArra
     * @return
     */
    private static String byteToStr(byte[] digestArra) {
        // TODO Auto-generated method stub
        String digestStr = "";
        for(int i=0;i<digestArra.length;i++){
            digestStr += byteToHexStr(digestArra[i]);
        }
        return digestStr;
    }
    /**
     * 将字节转换成为十六进制字符串
     */
    private static String byteToHexStr(byte dByte) {
        // TODO Auto-generated method stub
        char[] Digit = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        char[] tmpArr = new char[2];
        tmpArr[0] = Digit[(dByte>>>4)&0X0F];
        tmpArr[1] = Digit[dByte&0X0F];
        String s = new String(tmpArr);
        return s;
    }

    public static void main(String[] args) {
 /*byte dByte = 'A';
 System.out.println(byteToHexStr(dByte));*/
        Map<String,String> map = new ConcurrentHashMap<String, String>();
        map.put("4", "zhangsan");
        map.put("100", "lisi");
        Set set = map.keySet();
        Iterator iter = set.iterator();
        while(iter.hasNext()){
// String keyV = (String) iter.next();
            String key =(String)iter.next();
            System.out.println(map.get(key));
// System.out.println(map.get(iter.next()));
        }
 /*for(int i=0;i<map.size();i++){

 }*/
    }
}
