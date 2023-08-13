package com.i1314i.ourproject.utils.inimsg;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author 平行时空
 * @created 2018-09-25 22:12
 **/

@Configuration
@PropertySource(value= "classpath:msg.properties",encoding = "UTF-8")
public class QuartzMsgUtils {
    //quartz SchedulerException异常错误
    public static String quartz_error_code;
    public static String quartz_error_msg;

    @Value("${quartz.error.code}")
    public  void setQuartz_error_code(String quartz_error_code) {
        QuartzMsgUtils.quartz_error_code = quartz_error_code;
    }
    @Value("${quartz.error.msg}")
    public  void setQuartz_error_msg(String quartz_error_msg) {
        QuartzMsgUtils.quartz_error_msg = quartz_error_msg;
    }

    //quartz 成功
    public static String quartz_success_code;
    public static String quartz_success_msg;
    @Value("${quartz.success.code}")
    public  void setQuartz_success_code(String quartz_success_code) {
        QuartzMsgUtils.quartz_success_code = quartz_success_code;
    }
    @Value("${quartz.success.msg}")
    public  void setQuartz_success_msg(String quartz_success_msg) {
        QuartzMsgUtils.quartz_success_msg = quartz_success_msg;
    }

    //暂停定时任务错误
    public static String quartz_pauseerror_code;
    public static String quartz_pauseerror_msg;
    @Value("${quartz.pauseerror.code}")
    public  void setQuartz_pauseerror_code(String quartz_pauseerror_code) {
        QuartzMsgUtils.quartz_pauseerror_code = quartz_pauseerror_code;
    }
    @Value("${quartz.pauseerror.msg}")
    public  void setQuartz_pauseerror_msg(String quartz_pauseerror_msg) {
        QuartzMsgUtils.quartz_pauseerror_msg = quartz_pauseerror_msg;
    }

    //参数不能为空
    public static String quartz_empty_code;
    public static String quartz_empty_msg;

    @Value("${quartz.empty.code}")
    public  void setQuartz_empty_code(String quartz_empty_code) {
        QuartzMsgUtils.quartz_empty_code = quartz_empty_code;
    }
    @Value("${quartz.empty.msg}")
    public  void setQuartz_empty_msg(String quartz_empty_msg) {
        QuartzMsgUtils.quartz_empty_msg = quartz_empty_msg;
    }

    //开启定时任务失败

    public static String quartz_starerror_code;
    public static String quartz_starerror_msg;

    @Value("${quartz.starerror.code}")
    public  void setQuartz_starerror_code(String quartz_starerror_code) {
        QuartzMsgUtils.quartz_starerror_code = quartz_starerror_code;
    }
    @Value("${quartz.starerror.msg}")
    public  void setQuartz_starerror_msg(String quartz_starerror_msg) {
        QuartzMsgUtils.quartz_starerror_msg = quartz_starerror_msg;
    }

    public static String quartz_delerror_code;
    public static String quartz_delerror_msg;
    @Value("${quartz.delerror.code}")
    public  void setQuartz_delerror_code(String quartz_delerror_code) {
        QuartzMsgUtils.quartz_delerror_code = quartz_delerror_code;
    }
    @Value("${quartz.delerror.msg}")
    public  void setQuartz_delerror_msg(String quartz_delerror_msg) {
        QuartzMsgUtils.quartz_delerror_msg = quartz_delerror_msg;
    }
}
