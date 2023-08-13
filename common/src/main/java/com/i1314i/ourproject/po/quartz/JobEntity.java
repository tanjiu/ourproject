package com.i1314i.ourproject.po.quartz;

import org.quartz.JobDataMap;

import java.util.Date;

/**
 * @author 平行时空
 * @created 2018-09-25 20:48
 **/
public class JobEntity {
    private int jobId;

    private String jobType;

    private String jobGroup;

    private String jobName;

    private String triggerName;

    private String triggerGroupName;

    //旧job名称
    private String oldjobName;
    //旧jobgroup名称
    private String oldjobGroup;
    //旧trigger名称
    private String oldtriggerName;
    //旧triggergroup名称
    private String oldtriggerGroup;

    private String cronExpr;

    private Date previousFireTime;

    private Date nextFireTime;

    private String jobStatus;

    private long runTimes;

    private long duration;

    private Date startTime;

    private Date endTime;

    private String jobMemo;

    private String jobClass;

    private String jobMethod;

    private String jobObject;

    private int count;

    private JobDataMap jobDataMap;


    public String getOldjobName() {
        return oldjobName;
    }

    public void setOldjobName(String oldjobName) {
        this.oldjobName = oldjobName;
    }

    public String getOldjobGroup() {
        return oldjobGroup;
    }

    public void setOldjobGroup(String oldjobGroup) {
        this.oldjobGroup = oldjobGroup;
    }

    public String getOldtriggerName() {
        return oldtriggerName;
    }

    public void setOldtriggerName(String oldtriggerName) {
        this.oldtriggerName = oldtriggerName;
    }

    public String getOldtriggerGroup() {
        return oldtriggerGroup;
    }

    public void setOldtriggerGroup(String oldtriggerGroup) {
        this.oldtriggerGroup = oldtriggerGroup;
    }

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public String getJobGroup() {
        return jobGroup;
    }

    public void setJobGroup(String jobGroup) {
        this.jobGroup = jobGroup;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getTriggerName() {
        return triggerName;
    }

    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }

    public String getTriggerGroupName() {
        return triggerGroupName;
    }

    public void setTriggerGroupName(String triggerGroupName) {
        this.triggerGroupName = triggerGroupName;
    }

    public String getCronExpr() {
        return cronExpr;
    }

    public void setCronExpr(String cronExpr) {
        this.cronExpr = cronExpr;
    }

    public Date getPreviousFireTime() {
        return previousFireTime;
    }

    public void setPreviousFireTime(Date previousFireTime) {
        this.previousFireTime = previousFireTime;
    }

    public Date getNextFireTime() {
        return nextFireTime;
    }

    public void setNextFireTime(Date nextFireTime) {
        this.nextFireTime = nextFireTime;
    }

    public String getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    public long getRunTimes() {
        return runTimes;
    }

    public void setRunTimes(long runTimes) {
        this.runTimes = runTimes;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getJobMemo() {
        return jobMemo;
    }

    public void setJobMemo(String jobMemo) {
        this.jobMemo = jobMemo;
    }

    public String getJobClass() {
        return jobClass;
    }

    public void setJobClass(String jobClass) {
        this.jobClass = jobClass;
    }

    public String getJobMethod() {
        return jobMethod;
    }

    public void setJobMethod(String jobMethod) {
        this.jobMethod = jobMethod;
    }

    public String getJobObject() {
        return jobObject;
    }

    public void setJobObject(String jobObject) {
        this.jobObject = jobObject;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public JobDataMap getJobDataMap() {
        return jobDataMap;
    }

    public void setJobDataMap(JobDataMap jobDataMap) {
        this.jobDataMap = jobDataMap;
    }

    @Override
    public String toString() {
        return "JobEntity{" +
                "jobId=" + jobId +
                ", jobType='" + jobType + '\'' +
                ", jobGroup='" + jobGroup + '\'' +
                ", jobName='" + jobName + '\'' +
                ", triggerName='" + triggerName + '\'' +
                ", triggerGroupName='" + triggerGroupName + '\'' +
                ", oldjobName='" + oldjobName + '\'' +
                ", oldjobGroup='" + oldjobGroup + '\'' +
                ", oldtriggerName='" + oldtriggerName + '\'' +
                ", oldtriggerGroup='" + oldtriggerGroup + '\'' +
                ", cronExpr='" + cronExpr + '\'' +
                ", previousFireTime=" + previousFireTime +
                ", nextFireTime=" + nextFireTime +
                ", jobStatus='" + jobStatus + '\'' +
                ", runTimes=" + runTimes +
                ", duration=" + duration +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", jobMemo='" + jobMemo + '\'' +
                ", jobClass='" + jobClass + '\'' +
                ", jobMethod='" + jobMethod + '\'' +
                ", jobObject='" + jobObject + '\'' +
                ", count=" + count +
                ", jobDataMap=" + jobDataMap +
                '}';
    }
}
