package com.i1314i.ourproject.controller;

import com.alibaba.fastjson.JSON;
import com.i1314i.ourproject.po.ResultMap;
import com.i1314i.ourproject.po.wechatMenu.*;
import com.i1314i.ourproject.utils.wechat.SignUtil;
import com.i1314i.ourproject.utils.wechat.WechatUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author 平行时空
 * @created 2018-09-30 10:01
 **/
@RestController
public class WeChatController {

    private Logger logger= LoggerFactory.getLogger(WeChatController.class);

    /**
     * 确认请求来自于微信服务器
     */
    @RequestMapping(value ="/wechat",method = {RequestMethod.GET,RequestMethod.POST})
    public String Text(HttpServletRequest request) throws IOException {
        logger.info("微信请求接口验证开始");

        try{
            //微信加密签名
            String signature = request.getParameter("signature");
            //时间戳
            String timestamp = request.getParameter("timestamp");
            //随机数
            String nonce = request.getParameter("nonce");
            //随机字符串
            String echostr = request.getParameter("echostr");

            //通过校验signature对请求进行校验，若校验成功则原样返回echostr，表示接入成功，否则接入失败
            if(SignUtil.checkSignature(signature,timestamp,nonce)){
                logger.info("请求来自微信官方...验证成功 URL:"+request.getRequestURI());
                return echostr;
            }
        }catch (Exception e){
            logger.info("请求不是来自微信官方...验证失败 URL:"+request.getRequestURI());
        }

        return  null;
    }

    @RequestMapping(value="/token")
    public String  token(){
        Menu menu=new Menu();
        ComplexButton buttons=new ComplexButton();
        CommonButton button=new CommonButton();
        buttons.setName("test");
        button.setName("哈哈哈");
        button.setKey("ssss");
        button.setType("click");
        List<Button>buttonList=new ArrayList<>();
        buttonList.add(button);
        ViewButton btn31 = new ViewButton();
        btn31.setName("学霸授权");
        btn31.setType("view");
        btn31.setUrl("http://www.baidu.com");
        buttonList.add(btn31);
        buttons.setSub_button(buttonList);
        List<Button>buttonList1=new ArrayList<>();
        buttonList1.add(buttons);
        menu.setButton(buttonList1);
        return JSON.toJSONString(WechatUtil.createMenu(menu));
    }


//    public static void main(String[] args) {
//        ResultMap maps=new ResultMap();
//        List<User>userList=new ArrayList<>();
//        User user1=new User();
//        user1.setUserid("ssss");
//        user1.setUsername("张三");
//        User user2=new User();
//        user2.setUserid("aaaaa");
//        user2.setUsername("李四");
//        userList.add(user1);
//        userList.add(user2);
//        List<User>userList1=new ArrayList<>();
//        User user11=new User();
//        user11.setUserid("ssss");
//        user11.setUsername("张三");
//        User user21=new User();
//        user21.setUserid("aaaaa");
//        user21.setUsername("李四");
//        userList1.add(user11);
//        userList1.add(user21);
//
//        Map<String,List<User>>map=new net.sf.ehcache.util.concurrent.ConcurrentHashMap<>();
//        map.put("长江学者",userList);
//        map.put("你次啊",userList1);
//        System.out.println(JSON.toJSONString(maps.code("200").msg("success").data(map)));
//
//    }
}
