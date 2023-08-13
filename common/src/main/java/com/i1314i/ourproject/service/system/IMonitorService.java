package com.i1314i.ourproject.service.system;

import com.i1314i.ourproject.po.ResultMap;
import com.i1314i.ourproject.po.system.MonitorInfoBean;

/**
 * 获取系统信息的业务逻辑类接口
 * @author 平行时空
 * @created 2018-10-27 9:32
 **/
public interface IMonitorService {
    ResultMap getMonitor();
    public MonitorInfoBean getMonitorInfoBean() throws Exception;
}
