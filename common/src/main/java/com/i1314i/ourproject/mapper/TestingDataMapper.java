package com.i1314i.ourproject.mapper;

import com.i1314i.ourproject.po.testing.TestingDate;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * @author 平行时空
 * @created 2018-12-04 18:05
 **/
public interface TestingDataMapper {
    List<TestingDate> selectTestingDataListByTime(@Param("startTime") Date startTime, @Param("endTime")Date endTime);
    List<TestingDate> selectByThisMonth(Date startTime);
    List<TestingDate> selectAllData();
    Integer insertList(List<TestingDate>dateList);
}
