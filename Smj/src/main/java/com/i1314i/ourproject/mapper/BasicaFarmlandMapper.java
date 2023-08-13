package com.i1314i.ourproject.mapper;

import com.i1314i.ourproject.po.javabean.BasicaFarmland;
import com.i1314i.ourproject.po.javabean.BasicaFarmlandExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BasicaFarmlandMapper {
    long countByExample(BasicaFarmlandExample example);

    int deleteByExample(BasicaFarmlandExample example);

    int deleteByPrimaryKey(String nongtianId);

    int insert(BasicaFarmland record);

    int insertSelective(BasicaFarmland record);

    List<BasicaFarmland> selectByExample(BasicaFarmlandExample example);

    BasicaFarmland selectByPrimaryKey(String nongtianId);

    int updateByExampleSelective(@Param("record") BasicaFarmland record, @Param("example") BasicaFarmlandExample example);

    int updateByExample(@Param("record") BasicaFarmland record, @Param("example") BasicaFarmlandExample example);

    int updateByPrimaryKeySelective(BasicaFarmland record);

    int updateByPrimaryKey(BasicaFarmland record);
}