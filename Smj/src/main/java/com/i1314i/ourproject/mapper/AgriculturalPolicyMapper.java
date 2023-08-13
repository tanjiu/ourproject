package com.i1314i.ourproject.mapper;

import com.i1314i.ourproject.po.javabean.AgriculturalPolicy;
import com.i1314i.ourproject.po.javabean.AgriculturalPolicyExample;
import com.i1314i.ourproject.po.javabean.CountType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AgriculturalPolicyMapper {
    long countByExample(AgriculturalPolicyExample example);

    int deleteByExample(AgriculturalPolicyExample example);

    int deleteByPrimaryKey(Integer zhengceId);

    int insert(AgriculturalPolicy record);

    int insertSelective(AgriculturalPolicy record);

    List<AgriculturalPolicy> selectByExample(AgriculturalPolicyExample example);

    AgriculturalPolicy selectByPrimaryKey(Integer zhengceId);

    int updateByExampleSelective(@Param("record") AgriculturalPolicy record, @Param("example") AgriculturalPolicyExample example);

    int updateByExample(@Param("record") AgriculturalPolicy record, @Param("example") AgriculturalPolicyExample example);

    int updateByPrimaryKeySelective(AgriculturalPolicy record);

    int updateByPrimaryKey(AgriculturalPolicy record);

    List<CountType> selectCountByType();
}