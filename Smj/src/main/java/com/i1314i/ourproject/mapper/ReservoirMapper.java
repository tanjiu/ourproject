package com.i1314i.ourproject.mapper;

import com.i1314i.ourproject.po.javabean.Reservoir;
import com.i1314i.ourproject.po.javabean.ReservoirExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ReservoirMapper {
    long countByExample(ReservoirExample example);

    int deleteByExample(ReservoirExample example);

    int deleteByPrimaryKey(Integer shuikuId);

    int insert(Reservoir record);

    int insertSelective(Reservoir record);

    List<Reservoir> selectByExample(ReservoirExample example);

    Reservoir selectByPrimaryKey(Integer shuikuId);

    int updateByExampleSelective(@Param("record") Reservoir record, @Param("example") ReservoirExample example);

    int updateByExample(@Param("record") Reservoir record, @Param("example") ReservoirExample example);

    int updateByPrimaryKeySelective(Reservoir record);

    int updateByPrimaryKey(Reservoir record);
}