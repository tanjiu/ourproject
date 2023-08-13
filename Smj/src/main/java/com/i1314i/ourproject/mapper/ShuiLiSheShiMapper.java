package com.i1314i.ourproject.mapper;

import com.i1314i.ourproject.po.javabean.ShuiLiSheShi;
import com.i1314i.ourproject.po.javabean.ShuiLiSheShiExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShuiLiSheShiMapper {
    long countByExample(ShuiLiSheShiExample example);

    int deleteByExample(ShuiLiSheShiExample example);

    int deleteByPrimaryKey(Integer shuiLiId);

    int insert(ShuiLiSheShi record);

    int insertSelective(ShuiLiSheShi record);

    List<ShuiLiSheShi> selectByExample(ShuiLiSheShiExample example);

    ShuiLiSheShi selectByPrimaryKey(Integer shuiLiId);

    int updateByExampleSelective(@Param("record") ShuiLiSheShi record, @Param("example") ShuiLiSheShiExample example);

    int updateByExample(@Param("record") ShuiLiSheShi record, @Param("example") ShuiLiSheShiExample example);

    int updateByPrimaryKeySelective(ShuiLiSheShi record);

    int updateByPrimaryKey(ShuiLiSheShi record);
}