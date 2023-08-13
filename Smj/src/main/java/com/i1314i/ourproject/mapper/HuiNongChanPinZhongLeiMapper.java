package com.i1314i.ourproject.mapper;

import com.i1314i.ourproject.po.javabean.HuiNongChanPinZhongLei;
import com.i1314i.ourproject.po.javabean.HuiNongChanPinZhongLeiExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HuiNongChanPinZhongLeiMapper {
    long countByExample(HuiNongChanPinZhongLeiExample example);

    int deleteByExample(HuiNongChanPinZhongLeiExample example);

    int deleteByPrimaryKey(Integer chanPinZhongLeiId);

    int insert(HuiNongChanPinZhongLei record);

    int insertSelective(HuiNongChanPinZhongLei record);

    List<HuiNongChanPinZhongLei> selectByExample(HuiNongChanPinZhongLeiExample example);

    HuiNongChanPinZhongLei selectByPrimaryKey(Integer chanPinZhongLeiId);

    int updateByExampleSelective(@Param("record") HuiNongChanPinZhongLei record, @Param("example") HuiNongChanPinZhongLeiExample example);

    int updateByExample(@Param("record") HuiNongChanPinZhongLei record, @Param("example") HuiNongChanPinZhongLeiExample example);

    int updateByPrimaryKeySelective(HuiNongChanPinZhongLei record);

    int updateByPrimaryKey(HuiNongChanPinZhongLei record);
}