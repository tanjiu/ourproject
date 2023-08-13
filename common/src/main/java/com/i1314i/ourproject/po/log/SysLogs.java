package com.i1314i.ourproject.po.log;

import com.i1314i.ourproject.po.BaseEntity;
import com.i1314i.ourproject.po.User;

import java.util.Date;

/**
 * @author 平行时空
 * @created 2018-11-23 16:45
 **/
public class SysLogs extends BaseEntity<Long> {
    private static final long serialVersionUID = -7809315432127036583L;
    private User user;
    private String module;
    private Boolean flag;
    private String remark;
    private Date time;
    private String ip;
    private String userId;

    /**
     * 执行开始时间
     */
    private Date startTime;
    /**
     * 执行结束时间
     */
    private Date endTime;
    //系统名称.'
    private String sysName;

    private String modelName;

    //描述
    private String descs;


//    private String

    //日志类型
    private String type;


    public String getDescs() {
        return descs;
    }

    public void setDescs(String descs) {
        this.descs = descs;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }


    public String getSysName() {
        return sysName;
    }

    public void setSysName(String sysName) {
        this.sysName = sysName;
    }

    public SysLogs() {
        time=new Date();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}
