package com.i1314i.ourproject.mapper;

import com.i1314i.ourproject.po.javabean.HuiNongShouYe;
import com.i1314i.ourproject.po.javabean.HuiNongShouYeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HuiNongShouYeMapper {
    long countByExample(HuiNongShouYeExample example);

    int deleteByExample(HuiNongShouYeExample example);

    int deleteByPrimaryKey(Integer xinXiId);

    int insert(HuiNongShouYe record);

    int insertSelective(HuiNongShouYe record);

    List<HuiNongShouYe> selectByExample(HuiNongShouYeExample example);

    HuiNongShouYe selectByPrimaryKey(Integer xinXiId);

    int updateByExampleSelective(@Param("record") HuiNongShouYe record, @Param("example") HuiNongShouYeExample example);

    int updateByExample(@Param("record") HuiNongShouYe record, @Param("example") HuiNongShouYeExample example);

    int updateByPrimaryKeySelective(HuiNongShouYe record);

    int updateByPrimaryKey(HuiNongShouYe record);

    int updateByDaLeiBie(String biaoti,String dalei);
}