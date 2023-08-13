package com.i1314i.ourproject.mapper;

import com.i1314i.ourproject.po.javabean.JieDao;
import com.i1314i.ourproject.po.javabean.JieDaoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface JieDaoMapper {
    long countByExample(JieDaoExample example);

    int deleteByExample(JieDaoExample example);

    int deleteByPrimaryKey(Integer jieDaoId);

    int insert(JieDao record);

    int insertSelective(JieDao record);

    List<JieDao> selectByExample(JieDaoExample example);

    JieDao selectByPrimaryKey(Integer jieDaoId);

    int updateByExampleSelective(@Param("record") JieDao record, @Param("example") JieDaoExample example);

    int updateByExample(@Param("record") JieDao record, @Param("example") JieDaoExample example);

    int updateByPrimaryKeySelective(JieDao record);

    int updateByPrimaryKey(JieDao record);
}