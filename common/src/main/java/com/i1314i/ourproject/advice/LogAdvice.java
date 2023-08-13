package com.i1314i.ourproject.advice;

import com.i1314i.ourproject.annotation.LogAnnotation;
import com.i1314i.ourproject.po.log.SysLogs;
import com.i1314i.ourproject.service.log.ISysLogService;
import com.i1314i.ourproject.utils.httpContext.HttpContextUtils;
import com.i1314i.ourproject.utils.httpContext.IpUtil;
import com.i1314i.ourproject.utils.time.TimeTranUtil;
import io.swagger.annotations.ApiOperation;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.Date;

/**
 * @author 平行时空
 * @created 2018-10-09 18:16
 **/

@Aspect
@Component
public class LogAdvice {
    @Autowired
    private ISysLogService sysLogService;

    @Around(value = "@annotation(com.i1314i.ourproject.annotation.LogAnnotation)")
    public Object logSave(ProceedingJoinPoint joinPoint) throws Throwable {
        SysLogs sysLogs = new SysLogs();
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();

        String module = null;
        String sysName=null;
        String type=null;
        LogAnnotation logAnnotation = methodSignature.getMethod().getDeclaredAnnotation(LogAnnotation.class);

        module = logAnnotation.module();

        sysName=logAnnotation.sysName();

        type=logAnnotation.type();


        if (StringUtils.isEmpty(module)) {

        }


        String desc="";
        ApiOperation apiOperation = methodSignature.getMethod().getDeclaredAnnotation(ApiOperation.class);
        if (apiOperation != null) {
            desc = apiOperation.value();
        }


        if (StringUtils.isEmpty(module)) {
            throw new RuntimeException("没有指定日志module");
        }

        sysLogs.setModule(module);

        sysLogs.setDescs(desc);

        sysLogs.setSysName(sysName);
        sysLogs.setType(type);


        Date startTime=new Date();
        try {


            Object object =joinPoint.proceed();

            String classType = joinPoint.getTarget().getClass().getName();
            Class<?> clazz = Class.forName(classType);
            String className = clazz.getName();
            String methodName = joinPoint.getSignature().getName();
            String modelName=className+"."+methodName;


            sysLogs.setModelName(modelName);

            Date endTime=new Date();
//            sysLogs.setRemark(e.getMessage());
            sysLogs.setFlag(true);
            sysLogs.setStartTime(startTime);
            sysLogs.setEndTime(endTime);
            sysLogs.setIp(IpUtil.getIp());
            sysLogService.save(sysLogs);

            return object;
        } catch (Exception e) {
            sysLogs.setFlag(false);
            Date endTime=new Date();
            sysLogs.setStartTime(startTime);
            sysLogs.setEndTime(endTime);
            sysLogs.setRemark(e.getMessage());
            sysLogs.setIp(IpUtil.getIp());
            sysLogs.setType("执行异常");
            sysLogService.save(sysLogs);
            throw e;
        }

    }
}
