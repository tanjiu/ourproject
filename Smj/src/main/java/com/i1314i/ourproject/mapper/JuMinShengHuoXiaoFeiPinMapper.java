package com.i1314i.ourproject.mapper;

import com.i1314i.ourproject.po.javabean.JuMinShengHuoXiaoFeiPin;
import com.i1314i.ourproject.po.javabean.JuMinShengHuoXiaoFeiPinExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface JuMinShengHuoXiaoFeiPinMapper {
    long countByExample(JuMinShengHuoXiaoFeiPinExample example);

    int deleteByExample(JuMinShengHuoXiaoFeiPinExample example);

    int deleteByPrimaryKey(Integer juMinShengHuoId);

    int insert(JuMinShengHuoXiaoFeiPin record);

    int insertSelective(JuMinShengHuoXiaoFeiPin record);

    List<JuMinShengHuoXiaoFeiPin> selectByExample(JuMinShengHuoXiaoFeiPinExample example);

    JuMinShengHuoXiaoFeiPin selectByPrimaryKey(Integer juMinShengHuoId);

    int updateByExampleSelective(@Param("record") JuMinShengHuoXiaoFeiPin record, @Param("example") JuMinShengHuoXiaoFeiPinExample example);

    int updateByExample(@Param("record") JuMinShengHuoXiaoFeiPin record, @Param("example") JuMinShengHuoXiaoFeiPinExample example);

    int updateByPrimaryKeySelective(JuMinShengHuoXiaoFeiPin record);

    int updateByPrimaryKey(JuMinShengHuoXiaoFeiPin record);

   JuMinShengHuoXiaoFeiPin  selectTypeOne(String mingcheng);

    List<String> slectTimes();
}