package com.i1314i.ourproject.mapper;

import com.i1314i.ourproject.po.javabean.JobWanted;
import com.i1314i.ourproject.po.javabean.JobWantedExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface JobWantedMapper {
    long countByExample(JobWantedExample example);

    int deleteByExample(JobWantedExample example);

    int deleteByPrimaryKey(Integer qiuzhiId);

    int insert(JobWanted record);

    int insertSelective(JobWanted record);

    List<JobWanted> selectByExample(JobWantedExample example);

    JobWanted selectByPrimaryKey(Integer qiuzhiId);

    int updateByExampleSelective(@Param("record") JobWanted record, @Param("example") JobWantedExample example);

    int updateByExample(@Param("record") JobWanted record, @Param("example") JobWantedExample example);

    int updateByPrimaryKeySelective(JobWanted record);

    int updateByPrimaryKey(JobWanted record);
}