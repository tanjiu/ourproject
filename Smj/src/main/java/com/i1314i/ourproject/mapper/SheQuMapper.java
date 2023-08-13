package com.i1314i.ourproject.mapper;

import com.i1314i.ourproject.po.javabean.SheQu;
import com.i1314i.ourproject.po.javabean.SheQuExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SheQuMapper {
    long countByExample(SheQuExample example);

    int deleteByExample(SheQuExample example);

    int deleteByPrimaryKey(Integer sheQuId);

    int insert(SheQu record);

    int insertSelective(SheQu record);

    List<SheQu> selectByExample(SheQuExample example);

    SheQu selectByPrimaryKey(Integer sheQuId);

    int updateByExampleSelective(@Param("record") SheQu record, @Param("example") SheQuExample example);

    int updateByExample(@Param("record") SheQu record, @Param("example") SheQuExample example);

    int updateByPrimaryKeySelective(SheQu record);

    int updateByPrimaryKey(SheQu record);
}