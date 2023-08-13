package com.i1314i.ourproject.mapper;

import com.i1314i.ourproject.po.log.SysLogs;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.mapstruct.Mapper;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author 平行时空
 * @created 2018-11-23 16:58
 **/
@Mapper
public interface SysLogsMapper {

    int save(SysLogs sysLogs);

    int count(@Param("params") Map<String, Object> params);

    List<SysLogs> list(@Param("params") Map<String, Object> params);

    List<SysLogs> listByTime(@Param("startTime") Date startTime,@Param("endTime") Date endTime);

    @Delete("delete from sys_logs where create_time <= #{time}")
    int deleteLogs(Date time);
}
