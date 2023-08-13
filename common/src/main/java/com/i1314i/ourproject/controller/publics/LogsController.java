package com.i1314i.ourproject.controller.publics;


import com.alibaba.fastjson.JSON;
import com.i1314i.ourproject.annotation.LogAnnotation;
import com.i1314i.ourproject.mapper.SysLogsMapper;
import com.i1314i.ourproject.po.ResultMap;
import com.i1314i.ourproject.po.log.RequestLogs;
import com.i1314i.ourproject.po.log.SysLogs;
import com.i1314i.ourproject.utils.encode.AESUtil;
import com.i1314i.ourproject.utils.encode.MD5Util;
import com.i1314i.ourproject.utils.encode.RSAUtil;
import com.i1314i.ourproject.utils.jedisUtils.other.StringUtils;
import com.i1314i.ourproject.utils.time.DateUtil;
import com.i1314i.ourproject.utils.time.TimeTranUtil;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.servlet.http.HttpServletRequest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author 平行时空
 * @created 2018-12-10 16:58
 **/
@RestController
public class LogsController {
    @Autowired
    private  ResultMap resultMap;
    @Autowired
    private SysLogsMapper sysLogsMapper;
    public Map<String,Object> getLogs(String startTime,String endTime){
        return null;
    }

    @LogAnnotation(sysName = "日志系统",module = "日志模块")
    @ApiOperation(value = "获取系统日志列表")

    @RequestMapping("/public/getLogs")

    public Map logs(HttpServletRequest request, @PathVariable(required = false) String startTime,  @PathVariable(required = false) String endTime) throws Exception {

        String logToken=request.getHeader("logsToken");

        boolean status=false;
        try {
             status=getLogsTokens(logToken);
        }catch (Exception e){
            Map<String,Object>map=new HashMap<>();
            map.put("code","100");
            map.put("msg","令牌错误");
            return map;
        }



        //参数为空时
        if(org.springframework.util.StringUtils.isEmpty(startTime)){
            startTime=TimeTranUtil.TotimeSimpleZ(DateUtil.getTimesMonthmorning());
        }

        if(org.springframework.util.StringUtils.isEmpty(endTime)){
            endTime=TimeTranUtil.TotimeSimpleZ(DateUtil.getTimesnight());
        }


        if(status){
            List<SysLogs>sysLogsList=  sysLogsMapper.listByTime(TimeTranUtil.TotimeDate(startTime),TimeTranUtil.TotimeDate(endTime));

            List<RequestLogs>requestLogsList=new ArrayList<>();
            sysLogsList.stream().forEach(sysLogs -> {
                RequestLogs requestLogs=new RequestLogs();
                requestLogs.setF_request_ip(sysLogs.getIp());
                requestLogs.setF_logtype(sysLogs.getType());
                requestLogs.setF_exception_dsc(sysLogs.getRemark());

//                requestLogs.setF_operation_desc(sysLogs.getModule());

                requestLogs.setF_operator_name(sysLogs.getModule());

                requestLogs.setF_request_sysname(sysLogs.getSysName());

                requestLogs.setF_request_user(sysLogs.getUserId());
                requestLogs.setF_logtype(sysLogs.getFlag()==true?"1":"0");
                requestLogs.setF_operator_id(sysLogs.getId());
                requestLogs.setF_operation_desc(sysLogs.getDescs());
                requestLogs.setF_request_modelname(sysLogs.getModelName());
                try {
                    requestLogs.setF_request_start(TimeTranUtil.TotimeSimpleZ(sysLogs.getStartTime()));
                    requestLogs.setF_request_end(TimeTranUtil.TotimeSimpleZ(sysLogs.getEndTime()));
                } catch (ParseException e) {
                    e.printStackTrace();
                }

                requestLogsList.add(requestLogs);

            });

            Collections.sort(requestLogsList);
            Map<String,Object>map=new HashMap<>();
            map.put("code","200");
            map.put("msg","success");
            map.put("createSys","社区/惠农/人才/生产园区");
            map.put("logNumber",requestLogsList.size());
            map.put("log",requestLogsList);
            return map;
        }else {
            Map<String,Object>map=new HashMap<>();
            map.put("code","100");
            map.put("msg","令牌错误");
            return map;
        }

    }

    public static void main(String[] args) throws Exception {
        SimpleDateFormat format=new SimpleDateFormat("yyyyMMddHH");
        String strToken=format.format(new Date())+"040170090001005689";
        strToken= MD5Util.encrypt(strToken.getBytes());
        System.out.println(strToken);
    }

    public boolean getLogsTokens(String logsToken) throws Exception{
        SimpleDateFormat format=new SimpleDateFormat("yyyyMMddHH");
        String strToken=format.format(new Date())+"040170090001005689";
        strToken= MD5Util.encrypt(strToken.getBytes());
        if(strToken.trim().equalsIgnoreCase(logsToken))
            return true;
        return false;
    }

    public String getLogsToken() throws Exception{
        SimpleDateFormat format=new SimpleDateFormat("yyyyMMddHH");
        String strToken=format.format(new Date())+"040170090001005689";
        return MD5Util.encrypt(strToken.getBytes());
    }

}
