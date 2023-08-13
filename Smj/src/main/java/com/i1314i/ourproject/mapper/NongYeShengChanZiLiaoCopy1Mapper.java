package com.i1314i.ourproject.mapper;

import com.i1314i.ourproject.po.javabean.NongYeShengChanZiLiaoCopy1;
import com.i1314i.ourproject.po.javabean.NongYeShengChanZiLiaoCopy1Example;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NongYeShengChanZiLiaoCopy1Mapper {
    long countByExample(NongYeShengChanZiLiaoCopy1Example example);

    int deleteByExample(NongYeShengChanZiLiaoCopy1Example example);

    int deleteByPrimaryKey(Integer shangPinId);

    int insert(NongYeShengChanZiLiaoCopy1 record);

    int insertSelective(NongYeShengChanZiLiaoCopy1 record);

    List<NongYeShengChanZiLiaoCopy1> selectByExample(NongYeShengChanZiLiaoCopy1Example example);

    NongYeShengChanZiLiaoCopy1 selectByPrimaryKey(Integer shangPinId);

    int updateByExampleSelective(@Param("record") NongYeShengChanZiLiaoCopy1 record, @Param("example") NongYeShengChanZiLiaoCopy1Example example);

    int updateByExample(@Param("record") NongYeShengChanZiLiaoCopy1 record, @Param("example") NongYeShengChanZiLiaoCopy1Example example);

    int updateByPrimaryKeySelective(NongYeShengChanZiLiaoCopy1 record);

    int updateByPrimaryKey(NongYeShengChanZiLiaoCopy1 record);
}