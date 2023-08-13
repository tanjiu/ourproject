package com.i1314i.ourproject.mapper;

import com.i1314i.ourproject.po.javabean.JuMinShengHuoXiaoFeiPinCopy1;
import com.i1314i.ourproject.po.javabean.JuMinShengHuoXiaoFeiPinCopy1Example;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface JuMinShengHuoXiaoFeiPinCopy1Mapper {
    long countByExample(JuMinShengHuoXiaoFeiPinCopy1Example example);

    int deleteByExample(JuMinShengHuoXiaoFeiPinCopy1Example example);

    int deleteByPrimaryKey(Integer juMinShengHuoId);

    int insert(JuMinShengHuoXiaoFeiPinCopy1 record);

    int insertSelective(JuMinShengHuoXiaoFeiPinCopy1 record);

    List<JuMinShengHuoXiaoFeiPinCopy1> selectByExample(JuMinShengHuoXiaoFeiPinCopy1Example example);

    JuMinShengHuoXiaoFeiPinCopy1 selectByPrimaryKey(Integer juMinShengHuoId);

    int updateByExampleSelective(@Param("record") JuMinShengHuoXiaoFeiPinCopy1 record, @Param("example") JuMinShengHuoXiaoFeiPinCopy1Example example);

    int updateByExample(@Param("record") JuMinShengHuoXiaoFeiPinCopy1 record, @Param("example") JuMinShengHuoXiaoFeiPinCopy1Example example);

    int updateByPrimaryKeySelective(JuMinShengHuoXiaoFeiPinCopy1 record);

    int updateByPrimaryKey(JuMinShengHuoXiaoFeiPinCopy1 record);
}