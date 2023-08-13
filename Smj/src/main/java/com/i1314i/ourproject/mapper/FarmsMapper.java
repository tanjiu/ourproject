package com.i1314i.ourproject.mapper;

import com.i1314i.ourproject.po.javabean.Farms;
import com.i1314i.ourproject.po.javabean.FarmsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FarmsMapper {
    long countByExample(FarmsExample example);

    int deleteByExample(FarmsExample example);

    int deleteByPrimaryKey(Integer yangzhiId);

    int insert(Farms record);

    int insertSelective(Farms record);

    List<Farms> selectByExample(FarmsExample example);

    Farms selectByPrimaryKey(Integer yangzhiId);

    int updateByExampleSelective(@Param("record") Farms record, @Param("example") FarmsExample example);

    int updateByExample(@Param("record") Farms record, @Param("example") FarmsExample example);

    int updateByPrimaryKeySelective(Farms record);

    int updateByPrimaryKey(Farms record);
}