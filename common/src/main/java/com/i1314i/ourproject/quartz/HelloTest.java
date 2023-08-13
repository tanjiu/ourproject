package com.i1314i.ourproject.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @author 平行时空
 * @created 2018-11-14 11:34
 **/
public class HelloTest implements Job {
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("hello world");
    }
}
