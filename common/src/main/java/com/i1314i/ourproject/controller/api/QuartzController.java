package com.i1314i.ourproject.controller.api;


import com.i1314i.ourproject.annotation.LogAnnotation;
import com.i1314i.ourproject.po.ResultMap;
import com.i1314i.ourproject.po.pageHelper.PageBean;
import com.i1314i.ourproject.po.quartz.JobEntity;
import com.i1314i.ourproject.service.quartz.QuartzService;
import com.i1314i.ourproject.utils.inimsg.QuartzMsgUtils;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.quartz.*;
import org.quartz.impl.matchers.GroupMatcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Quartz操作类
 * @author 平行时空
 * @created 2018-09-25 21:59
 **/
@RestController
@RequestMapping("/api/quartz")
//@RequiresRoles(logical = Logical.OR, value = {"admin"})
public class QuartzController {
    @Autowired
    private Scheduler quartzScheduler;
    @Autowired
    private QuartzService quartzServices;
    @Autowired
    private ResultMap resultMap;

    /**
     * 获取定时任务job列表
     * @return
     */

    @RequestMapping(method = {RequestMethod.GET})
    public ResultMap listJob(){
        List<JobEntity> jobInfos=null;
        try {
             jobInfos = this.getSchedulerJobInfo();
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
        return resultMap.start()
                .code(QuartzMsgUtils.quartz_success_code)
                .msg(QuartzMsgUtils.quartz_success_msg)
                .data(jobInfos);

    }


    @RequestMapping(value = "list/{status}/{pageNumber}/{pageSize}",method = {RequestMethod.GET})
    public ResultMap baselistJob(@PathVariable String status ,@PathVariable int pageNumber, @PathVariable int pageSize,  String jobName) throws Exception {
        PageBean<JobEntity> jobInfos=null;
        try {
            System.out.println(jobName);
            jobInfos = this.getSchedlerjobInfo(status,pageNumber,pageSize,jobName);
        } catch (Exception e) {
            return resultMap.start()
                    .code(QuartzMsgUtils.quartz_error_code)
                    .msg(QuartzMsgUtils.quartz_error_msg);
        }
        return resultMap.start()
                .code(QuartzMsgUtils.quartz_success_code)
                .msg(QuartzMsgUtils.quartz_success_msg)
                .data(jobInfos);

    }



    /**
     * 添加定时任务
     * @param jobEntity
     * @return
     */
    @RequestMapping(method = {RequestMethod.POST})
    @LogAnnotation(sysName = "主系统",type="作业调度请求")
    @ApiOperation(value = "作业调度模块新增任务")
    public ResultMap add(@RequestBody JobEntity jobEntity){
        Class cls = null;
        try {
            cls = Class.forName(jobEntity.getJobClass());
            quartzServices.addJob(jobEntity.getJobName(), jobEntity.getJobGroup(), jobEntity.getTriggerName(), jobEntity.getTriggerGroupName(), cls, jobEntity.getCronExpr());
        } catch (ClassNotFoundException e) {
           return resultMap.start().code(QuartzMsgUtils.quartz_error_code).msg(QuartzMsgUtils.quartz_error_msg);
        }
        return resultMap.start().code(QuartzMsgUtils.quartz_success_code).msg(QuartzMsgUtils.quartz_success_msg);
    }


    /**
     * {  JSON格式
     *      "oldjobName":"",
     *      "oldjobGroup":"",
     *      "oldtriggerName":"",
     *      "oldtriggerGroup":"",
     *      "jobName":"",
     *      "jobNroup":"",
     *      "triggerName":"",
     *      "triggergroupName":""
     *  }
     *
     * 编辑定时任务
     * @param jobEntity
     * @return
     */
    @RequestMapping(method = {RequestMethod.PUT})
    @LogAnnotation(sysName = "主系统",type="作业调度请求")
    @ApiOperation(value = "作业调度模块编辑已有任务")
    public ResultMap edit(@RequestBody JobEntity jobEntity){
        boolean result = quartzServices.modifyJobTime(jobEntity.getOldjobName(), jobEntity.getOldjobGroup(), jobEntity.getOldtriggerName(), jobEntity.getOldtriggerGroup(),
                jobEntity.getJobName(), jobEntity.getJobGroup(), jobEntity.getTriggerName(), jobEntity.getTriggerGroupName(), jobEntity.getCronExpr());

        if (result){
            return resultMap.start()
                    .code(QuartzMsgUtils.quartz_success_code)
                    .msg(QuartzMsgUtils.quartz_success_msg);
        }else {
            return resultMap.start()
                    .code(QuartzMsgUtils.quartz_error_code)
                    .msg(QuartzMsgUtils.quartz_error_msg);
        }
    }


    /**
     * JSON格式
     *  {
     *       "jobName":"",
     *       "jobGroup":""
     *  }
     * 暂停定时任务
     *
     * @param jobEntity
     * @return
     */
    @LogAnnotation(sysName = "主系统",type="作业调度请求")
    @ApiOperation(value = "作业调度模块暂停已有任务")
    @RequestMapping(value = "/pause",method = {RequestMethod.PUT})
    public ResultMap pauseJob(@RequestBody JobEntity jobEntity){

        if(org.springframework.util.StringUtils.isEmpty(jobEntity.getJobName())|| org.springframework.util.StringUtils.isEmpty(jobEntity.getJobGroup())){
            return resultMap.start().code(QuartzMsgUtils.quartz_empty_code)
                    .msg(QuartzMsgUtils.quartz_empty_msg);
        }

        quartzServices.pauseJob(jobEntity.getJobName(), jobEntity.getJobGroup());
        try{
        }catch (Exception e){
            return resultMap.start()
                    .code(QuartzMsgUtils.quartz_pauseerror_code)
                    .msg(QuartzMsgUtils.quartz_pauseerror_msg);
        }
        return resultMap.start().code(QuartzMsgUtils.quartz_success_code)
                .msg(QuartzMsgUtils.quartz_success_msg);
    }

    /**
     * 恢复暂停的定时任务
     * @return
     */

    @RequestMapping(value = "/pause",method = {RequestMethod.POST})
    public ResultMap resumeJob(@RequestBody JobEntity jobEntity){

        if(org.springframework.util.StringUtils.isEmpty(jobEntity.getJobName())|| org.springframework.util.StringUtils.isEmpty(jobEntity.getJobGroup())){
            return resultMap.start().code(QuartzMsgUtils.quartz_empty_code)
                    .msg(QuartzMsgUtils.quartz_empty_msg);
        }

        try {
            quartzServices.resumeJob(jobEntity.getJobName(),jobEntity.getJobGroup());
        }catch (Exception e){
            return resultMap.start()
                    .code(QuartzMsgUtils.quartz_starerror_code)
                    .msg(QuartzMsgUtils.quartz_starerror_msg);
        }

        return resultMap.start().code(QuartzMsgUtils.quartz_success_code)
                .msg(QuartzMsgUtils.quartz_success_msg);
    }


    /**
     * 删除定时任务
     * @return
     */
    @LogAnnotation(sysName = "主系统",type="作业调度请求")
    @ApiOperation(value = "作业调度模块删除已有任务")
    @RequestMapping(method = {RequestMethod.DELETE})
    public ResultMap del(@RequestBody JobEntity jobEntity){

        if(org.springframework.util.StringUtils.isEmpty(jobEntity.getJobName())||org.springframework.util.StringUtils.isEmpty(jobEntity.getJobGroup())||org.springframework.util.StringUtils.isEmpty(jobEntity.getTriggerName())||org.springframework.util.StringUtils.isEmpty(jobEntity.getTriggerGroupName())){
            return resultMap.start().code(QuartzMsgUtils.quartz_empty_code)
                    .msg(QuartzMsgUtils.quartz_empty_msg);
        }

        try {
            quartzServices.removeJob(jobEntity.getJobName(), jobEntity.getJobGroup(), jobEntity.getTriggerName(), jobEntity.getTriggerGroupName());
        }catch (Exception e){
            return resultMap.start()
                    .code(QuartzMsgUtils.quartz_delerror_code)
                    .msg(QuartzMsgUtils.quartz_delerror_msg);
        }

        return resultMap.start().code(QuartzMsgUtils.quartz_success_code)
                .msg(QuartzMsgUtils.quartz_success_msg);

    }



    /**
     * 获取Job集合对象
     * @return
     * @throws SchedulerException
     */
    private List<JobEntity> getSchedulerJobInfo() throws SchedulerException {
        List<JobEntity> jobInfos = new ArrayList<JobEntity>();
        List<String> triggerGroupNames = quartzScheduler.getTriggerGroupNames();
        for (String triggerGroupName : triggerGroupNames) {
            Set<TriggerKey> triggerKeySet = quartzScheduler
                    .getTriggerKeys(GroupMatcher
                            .triggerGroupEquals(triggerGroupName));
            for (TriggerKey triggerKey : triggerKeySet) {
                Trigger t = quartzScheduler.getTrigger(triggerKey);
                if (t instanceof CronTrigger) {
                    CronTrigger trigger = (CronTrigger) t;
                    JobKey jobKey = trigger.getJobKey();
                    JobDetail jd = quartzScheduler.getJobDetail(jobKey);
                    JobEntity jobInfo = new JobEntity();
                    jobInfo.setJobName(jobKey.getName());
                    jobInfo.setJobGroup(jobKey.getGroup());
                    jobInfo.setTriggerName(triggerKey.getName());
                    jobInfo.setTriggerGroupName(triggerKey.getGroup());
                    jobInfo.setCronExpr(trigger.getCronExpression());
                    jobInfo.setNextFireTime(trigger.getNextFireTime());
                    jobInfo.setPreviousFireTime(trigger.getPreviousFireTime());
                    jobInfo.setStartTime(trigger.getStartTime());
                    jobInfo.setEndTime(trigger.getEndTime());
                    jobInfo.setJobClass(jd.getJobClass().getCanonicalName());
                    // jobInfo.setDuration(Long.parseLong(jd.getDescription()));
                    Trigger.TriggerState triggerState = quartzScheduler
                            .getTriggerState(trigger.getKey());
                    jobInfo.setJobStatus(triggerState.toString());// NONE无,
                    //                                                                                                                                                                                                                                                                        ,
                    // PAUSED暂停,
                    // COMPLETE完全,
                    // ERROR错误,
                    // BLOCKED阻塞
                    JobDataMap map = quartzScheduler.getJobDetail(jobKey)
                            .getJobDataMap();
                    if (null != map&&map.size() != 0) {
                        jobInfo.setCount(Integer.parseInt((String) map
                                .get("count")));
                        jobInfo.setJobDataMap(map);
                    } else {
                        jobInfo.setJobDataMap(new JobDataMap());
                    }
                    jobInfos.add(jobInfo);
                }
            }
        }
        return jobInfos;
    }

    private PageBean getSchedlerjobInfo(String status, int pageNumber, int pageSize,String jobName) throws Exception {
        List<JobEntity>jobEntityList=new ArrayList<>();
        List<JobEntity>allJobInfos=getSchedulerJobInfo();

        if(status.equalsIgnoreCase("ALL")){

            if(StringUtils.isEmpty(jobName)){
                    jobEntityList.addAll(allJobInfos);
            }else {
                allJobInfos.stream().forEach(jobInfo->{
                    System.out.println(jobInfo.getJobName());
                    if (jobInfo.getJobName().indexOf(jobName)>=0)
                        jobEntityList.add(jobInfo);
                });
            }
        }else {
            if(StringUtils.isEmpty(jobName)){
                allJobInfos.stream().forEach(jobInfo->{
                    if (jobInfo.getJobStatus().equalsIgnoreCase(status))
                        jobEntityList.add(jobInfo);
                });
            }else {
                allJobInfos.stream().forEach(jobInfo->{
                    System.out.println();
                    if (jobInfo.getJobStatus().equalsIgnoreCase(status)&&jobInfo.getJobName().indexOf(jobName)>=0)
                        jobEntityList.add(jobInfo);
                });
            }
        }
        return paging(jobEntityList,pageNumber,pageSize);
    }

    public <T> PageBean paging(List<T> list, int pageNumber, int pageSize) throws Exception{
        List<T> pageList = new ArrayList<T>();
        int currIdx = (pageNumber > 1 ? (pageNumber -1) * pageSize : 0);
        for (int i = 0; i < pageSize && i < list.size() - currIdx; i++){
            T listNew = list.get(currIdx + i);
            pageList.add(listNew);
        }
        PageBean<T> searchResult = new PageBean<T>();
        searchResult.setItems(pageList);
        searchResult.setTotalNum(list.size());

        if (searchResult.getTotalNum()%pageSize == 0){
            searchResult.setTotalPage((int)searchResult.getTotalNum()/pageSize);
        }else {
            searchResult.setTotalPage((int)searchResult.getTotalNum()/pageSize + 1);
        }
        searchResult.setPageNum(pageNumber);
        searchResult.setPageSize(pageSize);
        searchResult.setPageSize(pageList.size());
        //是否是第一页
        if (pageNumber == 1){
            searchResult.setFirstPage(true);
        }else {
            searchResult.setFirstPage(false);
        }
        //是否是最后一页
        if ((searchResult.getTotalNum() - pageNumber*pageSize) > 0){
            searchResult.setLastPage(false);
        }else {
            searchResult.setLastPage(true);
        }
        return searchResult;
    }



    @ApiOperation(value = "校验cron表达式")
    @GetMapping(value = "/cron",params = "cron")
    public boolean checkCron(String cron) {
        return CronExpression.isValidExpression(cron);
    }

}
