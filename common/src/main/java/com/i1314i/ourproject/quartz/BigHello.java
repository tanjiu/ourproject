package com.i1314i.ourproject.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @author 平行时空
 * @created 2018-11-16 19:05
 **/
public class BigHello implements Job {
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("哈哈哈");
    }
}
