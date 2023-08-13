package com.i1314i.ourproject.mapper;

import com.i1314i.ourproject.po.javabean.AgriculturalSubsidies;
import com.i1314i.ourproject.po.javabean.AgriculturalSubsidiesExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AgriculturalSubsidiesMapper {
    long countByExample(AgriculturalSubsidiesExample example);

    int deleteByExample(AgriculturalSubsidiesExample example);

    int deleteByPrimaryKey(Integer butieId);

    int insert(AgriculturalSubsidies record);

    int insertSelective(AgriculturalSubsidies record);

    List<AgriculturalSubsidies> selectByExample(AgriculturalSubsidiesExample example);

    AgriculturalSubsidies selectByPrimaryKey(Integer butieId);

    int updateByExampleSelective(@Param("record") AgriculturalSubsidies record, @Param("example") AgriculturalSubsidiesExample example);

    int updateByExample(@Param("record") AgriculturalSubsidies record, @Param("example") AgriculturalSubsidiesExample example);

    int updateByPrimaryKeySelective(AgriculturalSubsidies record);

    int updateByPrimaryKey(AgriculturalSubsidies record);

    //自加
    int selectCountAll();
}