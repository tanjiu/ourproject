package com.i1314i.ourproject.mapper;

import com.i1314i.ourproject.po.javabean.WaterInfrastructure;
import com.i1314i.ourproject.po.javabean.WaterInfrastructureExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WaterInfrastructureMapper {
    long countByExample(WaterInfrastructureExample example);

    int deleteByExample(WaterInfrastructureExample example);

    int deleteByPrimaryKey(String shuiliJd);

    int insert(WaterInfrastructure record);

    int insertSelective(WaterInfrastructure record);

    List<WaterInfrastructure> selectByExample(WaterInfrastructureExample example);

    WaterInfrastructure selectByPrimaryKey(String shuiliJd);

    int updateByExampleSelective(@Param("record") WaterInfrastructure record, @Param("example") WaterInfrastructureExample example);

    int updateByExample(@Param("record") WaterInfrastructure record, @Param("example") WaterInfrastructureExample example);

    int updateByPrimaryKeySelective(WaterInfrastructure record);

    int updateByPrimaryKey(WaterInfrastructure record);
}