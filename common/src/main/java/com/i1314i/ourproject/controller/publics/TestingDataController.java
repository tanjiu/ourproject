package com.i1314i.ourproject.controller.publics;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.i1314i.ourproject.mapper.TestingDataMapper;
import com.i1314i.ourproject.po.testing.TestingDate;
import com.i1314i.ourproject.service.webservice.serviceUtil.GetFarmsCheckDataResponse;
import com.i1314i.ourproject.service.webservice.serviceUtil.MServiceLocator;
import com.i1314i.ourproject.service.webservice.serviceUtil.MServiceSoap_BindingStub;
import com.i1314i.ourproject.utils.encode.MD5Util;
import com.i1314i.ourproject.utils.excel.JavaPoiUtil;
import com.i1314i.ourproject.utils.time.DateUtil;
import com.i1314i.ourproject.utils.time.TimeTranUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author 平行时空
 * @created 2018-12-04 19:12
 **/
@RestController
public class TestingDataController {
   private static Logger logger= LoggerFactory.getLogger(TestingDataController.class);
   @Autowired
    private TestingDataMapper testingDataMapper;

   @GetMapping(value = "/getTestingDateList")
   public List<TestingDate> testingDateList(String startTime,String endTime) throws ParseException {

       return testingDataMapper.selectTestingDataListByTime(TimeTranUtil.TotimeDate(startTime),TimeTranUtil.TotimeDate(endTime));
   }

    @RequestMapping(value = "/testingdata")
    public String gg() throws Exception {
//        try {

            List<TestingDate> testingDateList=testingDataMapper.selectTestingDataListByTime(DateUtil.getLastYearStartTime(),DateUtil.getTimesnight());
          //  JavaPoiUtil.createWorkBooks(TestingDate.class,testingDateList,new String[]{"dateId","productType","sampleName","detectionProject","measuredValue","conclusion","testingCompany","placeOfOrigin","testingTimes","result"},new String[]{"ID","产品小类","样品","检测项目","实测值","结论","检测公司","产地","检测时间","处理结果"}).write(new FileOutputStream(new File("C:\\Users\\平行时空\\Desktop\\处理+5"+".xls")));
         return JSON.toJSONString(testingDateList);
//            testingDataMapper.insertList(testingDateList);
//            return "success";

//            return testingDateList;
//        }catch (Exception e){
//            return "fail";
//        }

    }

}
