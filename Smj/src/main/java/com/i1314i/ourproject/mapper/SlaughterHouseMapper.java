package com.i1314i.ourproject.mapper;

import com.i1314i.ourproject.po.javabean.SlaughterHouse;
import com.i1314i.ourproject.po.javabean.SlaughterHouseExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SlaughterHouseMapper {
    long countByExample(SlaughterHouseExample example);

    int deleteByExample(SlaughterHouseExample example);

    int deleteByPrimaryKey(Integer tuzaiId);

    int insert(SlaughterHouse record);

    int insertSelective(SlaughterHouse record);

    List<SlaughterHouse> selectByExample(SlaughterHouseExample example);

    SlaughterHouse selectByPrimaryKey(Integer tuzaiId);

    int updateByExampleSelective(@Param("record") SlaughterHouse record, @Param("example") SlaughterHouseExample example);

    int updateByExample(@Param("record") SlaughterHouse record, @Param("example") SlaughterHouseExample example);

    int updateByPrimaryKeySelective(SlaughterHouse record);

    int updateByPrimaryKey(SlaughterHouse record);
}