package com.i1314i.ourproject.quartz.job;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.i1314i.ourproject.controller.publics.TestingDataController;
import com.i1314i.ourproject.mapper.TestingDataMapper;
import com.i1314i.ourproject.po.testing.TestingDate;
import com.i1314i.ourproject.service.webservice.serviceUtil.GetFarmsCheckDataResponse;
import com.i1314i.ourproject.service.webservice.serviceUtil.MServiceLocator;
import com.i1314i.ourproject.service.webservice.serviceUtil.MServiceSoap_BindingStub;
import com.i1314i.ourproject.utils.encode.MD5Util;
import com.i1314i.ourproject.utils.time.DateUtil;
import com.i1314i.ourproject.utils.time.DateUtil;
import com.i1314i.ourproject.utils.time.TimeTranUtil;
import com.sun.org.apache.xpath.internal.SourceTree;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 永辉数据获取job
 * @author 平行时空
 * @created 2018-12-06 19:35
 **/
public class TestingDataJob implements Job {
    private static Logger logger= LoggerFactory.getLogger(TestingDataJob.class);
    @Autowired
    private TestingDataMapper testingDataMapper;
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        updateDataAboutTesting();
    }


    public static void main(String[] args) throws Exception {

        System.out.println(JSON.toJSONString(getDateList(TimeTranUtil.TotimeSimple(DateUtil.getWeekFromNow()),TimeTranUtil.TotimeSimple(DateUtil.getTimesnight()))));
    }

    public static   List<TestingDate> getDateList(String startTime,String endTime) throws Exception {
        Date date=new Date();
        SimpleDateFormat format=new SimpleDateFormat("yyyyMMdd");
        SimpleDateFormat format2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strToken=format.format(date)+"040170090001006263";
        strToken= MD5Util.encrypt(strToken.getBytes());
//        System.out.println(format2.format(new Date()));
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

        Map<String,String> map=new HashMap<>();
        map.put("200","success");
        map.put("100","get date error");
        map.put("90001","未知错误");
        map.put("90202","密钥错误");
        map.put("90201","参数为空");

        // Test operation
        String value = null;
        value = binding.getFarmsCheckData(strToken, "040170090001006263", TimeTranUtil.ZtimeTo(startTime),TimeTranUtil.ZtimeTo(endTime));
        // TBD - validate results
        GetFarmsCheckDataResponse response=new GetFarmsCheckDataResponse(value);
        JSONObject json= JSONObject.parseObject(response.getGetFarmsCheckDataResult());
        String status=json.getString("Resultcode");
        if(status.equalsIgnoreCase("200")){

            JSONObject Result= JSON.parseObject(json.getString("Result"));
            String data=Result.getString("data");
            String table=JSONObject.parseObject(data).getString("Table");
            List<TestingDate> testingDateList=JSON.parseArray(table, TestingDate.class);
            return  testingDateList;
        }else {
            logger.info("获取产品质量安全监管数据错误码："+status+" 原因："+map.get(status));
        }
        return null;
    }

    public void  updateDataAboutTesting(){

        try {
            List<TestingDate>ajaxDateList=getDateList(TimeTranUtil.TotimeSimple(DateUtil.getWeekFromNow()),TimeTranUtil.TotimeSimple(DateUtil.getTimesnight()));

            List<TestingDate>newList=new ArrayList<>();

            if(ajaxDateList.size()>0){
                //获取数据库 数据对比
                List<TestingDate> testingDateList=testingDataMapper.selectTestingDataListByTime(DateUtil.getWeekFromNow(),DateUtil.getTimesnight());

                testingDateList.stream().forEach(testingData->{

                    ajaxDateList.stream().forEach(ajax->{
                        if (Double.compare(testingData.getMeasuredValue(),ajax.getMeasuredValue()) != 0&&!testingData.getProductType().equalsIgnoreCase(ajax.getProductType())&&!testingData.getTestingTimes().equalsIgnoreCase(ajax.getTestingTimes())){
                            newList.add(ajax);
                        }

                    });


                });

            }


            if (newList.size()>0){
                int nums=testingDataMapper.insertList(newList);
                logger.info("自动获取："+nums+"条新数据");
            }else {
                logger.info("自动获取:0条新数据");
            }

        }catch (Exception e){
            logger.info("get data error about yonghui");
        }









//        getTestingTime
    }

}
