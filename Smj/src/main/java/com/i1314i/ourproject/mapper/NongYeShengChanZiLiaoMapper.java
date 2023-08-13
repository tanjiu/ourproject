package com.i1314i.ourproject.mapper;

import com.i1314i.ourproject.po.javabean.JuMinShengHuoXiaoFeiPin;
import com.i1314i.ourproject.po.javabean.NongYeShengChanZiLiao;
import com.i1314i.ourproject.po.javabean.NongYeShengChanZiLiaoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NongYeShengChanZiLiaoMapper {
    long countByExample(NongYeShengChanZiLiaoExample example);

    int deleteByExample(NongYeShengChanZiLiaoExample example);

    int deleteByPrimaryKey(Integer shangPinId);

    int insert(NongYeShengChanZiLiao record);

    int insertSelective(NongYeShengChanZiLiao record);

    List<NongYeShengChanZiLiao> selectByExample(NongYeShengChanZiLiaoExample example);

    NongYeShengChanZiLiao selectByPrimaryKey(Integer shangPinId);

    int updateByExampleSelective(@Param("record") NongYeShengChanZiLiao record, @Param("example") NongYeShengChanZiLiaoExample example);

    int updateByExample(@Param("record") NongYeShengChanZiLiao record, @Param("example") NongYeShengChanZiLiaoExample example);

    int updateByPrimaryKeySelective(NongYeShengChanZiLiao record);

    int updateByPrimaryKey(NongYeShengChanZiLiao record);

    List<NongYeShengChanZiLiao> selectByTimes();

    List<String> slectTimes();

    NongYeShengChanZiLiao selectTypeOne(String mingcheng);
}