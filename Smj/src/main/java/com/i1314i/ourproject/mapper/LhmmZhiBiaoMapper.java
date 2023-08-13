package com.i1314i.ourproject.mapper;

import com.i1314i.ourproject.po.javabean.LhmmZhiBiao;
import com.i1314i.ourproject.po.javabean.LhmmZhiBiaoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LhmmZhiBiaoMapper {
    long countByExample(LhmmZhiBiaoExample example);

    int deleteByExample(LhmmZhiBiaoExample example);

    int deleteByPrimaryKey(Integer zhiBiaoFangId);

    int insert(LhmmZhiBiao record);

    int insertSelective(LhmmZhiBiao record);

    List<LhmmZhiBiao> selectByExample(LhmmZhiBiaoExample example);

    LhmmZhiBiao selectByPrimaryKey(Integer zhiBiaoFangId);

    int updateByExampleSelective(@Param("record") LhmmZhiBiao record, @Param("example") LhmmZhiBiaoExample example);

    int updateByExample(@Param("record") LhmmZhiBiao record, @Param("example") LhmmZhiBiaoExample example);

    int updateByPrimaryKeySelective(LhmmZhiBiao record);

    int updateByPrimaryKey(LhmmZhiBiao record);
}