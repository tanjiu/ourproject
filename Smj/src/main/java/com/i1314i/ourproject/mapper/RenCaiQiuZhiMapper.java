package com.i1314i.ourproject.mapper;

import com.i1314i.ourproject.po.javabean.RenCaiQiuZhi;
import com.i1314i.ourproject.po.javabean.RenCaiQiuZhiExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RenCaiQiuZhiMapper {
    long countByExample(RenCaiQiuZhiExample example);

    int deleteByExample(RenCaiQiuZhiExample example);

    int deleteByPrimaryKey(Integer rencaiId);

    int insert(RenCaiQiuZhi record);

    int insertSelective(RenCaiQiuZhi record);

    List<RenCaiQiuZhi> selectByExample(RenCaiQiuZhiExample example);

    RenCaiQiuZhi selectByPrimaryKey(Integer rencaiId);

    int updateByExampleSelective(@Param("record") RenCaiQiuZhi record, @Param("example") RenCaiQiuZhiExample example);

    int updateByExample(@Param("record") RenCaiQiuZhi record, @Param("example") RenCaiQiuZhiExample example);

    int updateByPrimaryKeySelective(RenCaiQiuZhi record);

    int updateByPrimaryKey(RenCaiQiuZhi record);
}