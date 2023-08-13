package com.i1314i.ourproject.service.log;

import com.i1314i.ourproject.po.log.SysLogs;

/**
 * @author 平行时空
 * @created 2018-11-23 16:44
 **/
public interface ISysLogService {
    void save(SysLogs sysLogs);

    void save(String userId, String module, Boolean flag, String remark);

    void deleteLogs();
}
