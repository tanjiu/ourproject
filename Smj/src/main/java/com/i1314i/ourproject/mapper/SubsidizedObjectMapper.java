package com.i1314i.ourproject.mapper;

import com.i1314i.ourproject.po.javabean.SubsidizedObject;
import com.i1314i.ourproject.po.javabean.SubsidizedObjectExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SubsidizedObjectMapper {
    long countByExample(SubsidizedObjectExample example);

    int deleteByExample(SubsidizedObjectExample example);

    int deleteByPrimaryKey(Integer butieId);

    int insert(SubsidizedObject record);

    int insertSelective(SubsidizedObject record);

    List<SubsidizedObject> selectByExample(SubsidizedObjectExample example);

    SubsidizedObject selectByPrimaryKey(Integer butieId);

    int updateByExampleSelective(@Param("record") SubsidizedObject record, @Param("example") SubsidizedObjectExample example);

    int updateByExample(@Param("record") SubsidizedObject record, @Param("example") SubsidizedObjectExample example);

    int updateByPrimaryKeySelective(SubsidizedObject record);

    int updateByPrimaryKey(SubsidizedObject record);
}