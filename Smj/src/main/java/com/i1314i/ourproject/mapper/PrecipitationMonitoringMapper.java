package com.i1314i.ourproject.mapper;

import com.i1314i.ourproject.po.javabean.PrecipitationMonitoring;
import com.i1314i.ourproject.po.javabean.PrecipitationMonitoringExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PrecipitationMonitoringMapper {
    long countByExample(PrecipitationMonitoringExample example);

    int deleteByExample(PrecipitationMonitoringExample example);

    int deleteByPrimaryKey(Integer jiangshuiId);

    int insert(PrecipitationMonitoring record);

    int insertSelective(PrecipitationMonitoring record);

    List<PrecipitationMonitoring> selectByExample(PrecipitationMonitoringExample example);

    PrecipitationMonitoring selectByPrimaryKey(Integer jiangshuiId);

    int updateByExampleSelective(@Param("record") PrecipitationMonitoring record, @Param("example") PrecipitationMonitoringExample example);

    int updateByExample(@Param("record") PrecipitationMonitoring record, @Param("example") PrecipitationMonitoringExample example);

    int updateByPrimaryKeySelective(PrecipitationMonitoring record);

    int updateByPrimaryKey(PrecipitationMonitoring record);
}