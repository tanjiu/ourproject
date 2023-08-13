package com.i1314i.ourproject.mapper;

import com.i1314i.ourproject.po.javabean.SoilTypeDistribution;
import com.i1314i.ourproject.po.javabean.SoilTypeDistributionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SoilTypeDistributionMapper {
    long countByExample(SoilTypeDistributionExample example);

    int deleteByExample(SoilTypeDistributionExample example);

    int deleteByPrimaryKey(String leixingId);

    int insert(SoilTypeDistribution record);

    int insertSelective(SoilTypeDistribution record);

    List<SoilTypeDistribution> selectByExample(SoilTypeDistributionExample example);

    SoilTypeDistribution selectByPrimaryKey(String leixingId);

    int updateByExampleSelective(@Param("record") SoilTypeDistribution record, @Param("example") SoilTypeDistributionExample example);

    int updateByExample(@Param("record") SoilTypeDistribution record, @Param("example") SoilTypeDistributionExample example);

    int updateByPrimaryKeySelective(SoilTypeDistribution record);

    int updateByPrimaryKey(SoilTypeDistribution record);
}