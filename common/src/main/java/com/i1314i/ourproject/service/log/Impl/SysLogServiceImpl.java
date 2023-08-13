package com.i1314i.ourproject.service.log.Impl;

import com.i1314i.ourproject.mapper.SysLogsMapper;
import com.i1314i.ourproject.po.User;
import com.i1314i.ourproject.po.log.SysLogs;
import com.i1314i.ourproject.service.log.ISysLogService;
import com.i1314i.ourproject.utils.redisToken.user.UserUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author 平行时空
 * @created 2018-11-23 16:47
 **/

@Service("sysLogService")
public class SysLogServiceImpl implements ISysLogService {
    @Autowired
    private UserUtils userUtils;
    private static final Logger log = LoggerFactory.getLogger("adminLogger");

    @Autowired
    private SysLogsMapper sysLogsMapper;

    @Override
    public void save(SysLogs sysLogs) {
        User user = userUtils.getCurrentUser("");
        if (user == null || user.getUserId() == null) {
            //未登陆接口日志赋空值
            user=new User("");
        }

        sysLogs.setUser(user);
        sysLogsMapper.save(sysLogs);
    }

    @Async
    @Override
    public void save(String userId, String module, Boolean flag, String remark) {
        SysLogs sysLogs = new SysLogs();
        sysLogs.setFlag(flag);
        sysLogs.setModule(module);
        sysLogs.setRemark(remark);

        User user = new User();
        user.setUserId(userId);
        sysLogs.setUser(user);

        sysLogsMapper.save(sysLogs);

    }

    @Override
    public void deleteLogs() {
        Date date = DateUtils.addMonths(new Date(), -3);
        String time = DateFormatUtils.format(date, DateFormatUtils.ISO_8601_EXTENDED_DATE_FORMAT.getPattern());

        int n = sysLogsMapper.deleteLogs(date);
        log.info("删除{}之前日志{}条", time, n);
    }

}
