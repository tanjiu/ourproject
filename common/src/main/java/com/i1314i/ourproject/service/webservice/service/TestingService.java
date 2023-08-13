package com.i1314i.ourproject.service.webservice.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.i1314i.ourproject.po.testing.TestingDate;

import com.i1314i.ourproject.service.webservice.serviceUtil.GetFarmsCheckDataResponse;
import com.i1314i.ourproject.service.webservice.serviceUtil.MServiceLocator;
import com.i1314i.ourproject.service.webservice.serviceUtil.MServiceSoap_BindingStub;
import com.i1314i.ourproject.utils.encode.MD5Util;
import net.sf.ehcache.util.concurrent.ConcurrentHashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 平行时空
 * @created 2018-09-13 21:29
 **/
public class TestingService {
   static Logger logger= LoggerFactory.getLogger(TestingService.class);
    public static List<TestingDate> getDateList() throws Exception {
        Date date=new Date();
        SimpleDateFormat format=new SimpleDateFormat("yyyyMMdd");
        SimpleDateFormat format2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strToken=format.format(date)+"040170090001006263";
        strToken= MD5Util.encrypt(strToken.getBytes());
        System.out.println(format2.format(new Date()));


        //        MServiceSoap_BindingStub binding=new MServiceSoap_BindingStub();
        MServiceSoap_BindingStub binding=null;
        try {
            binding = (MServiceSoap_BindingStub)
                    new MServiceLocator().getMServiceSoap();
        }
        catch (Exception e) {
            logger.info("获取.net webservice服务检测处理数据失败");
        }


        // Time out after a minute
        binding.setTimeout(60000);

        Map<String,String>map=new HashMap<>();
        map.put("200","success");
        map.put("100","get date error");
        map.put("90001","未知错误");
        map.put("90202","密钥错误");
        map.put("90201","参数为空");

        // Test operation
        String value = null;
        value = binding.getFarmsCheckData(strToken, "040170090001006263", "2016-11-02T16:29:54","2018-11-02T16:29:54");
        // TBD - validate results
        GetFarmsCheckDataResponse response=new GetFarmsCheckDataResponse(value);
        JSONObject json= JSONObject.parseObject(response.getGetFarmsCheckDataResult());
        String status=json.getString("Resultcode");
        if(status.equalsIgnoreCase("200")){

            JSONObject Result=JSON.parseObject(json.getString("Result"));
            String data=Result.getString("data");
            String table=JSONObject.parseObject(data).getString("Table");
            List<TestingDate> testingDateList=JSON.parseArray(table, TestingDate.class);
            return  testingDateList;
        }else {
            logger.info("获取产品质量安全监管数据错误码："+status+" 原因："+map.get(status));
        }
        return null;
    }


    public static void main(String[] args) throws Exception {
        System.out.println(JSON.toJSONString(getDateList()));

    }
}
