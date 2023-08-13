package com.i1314i.ourproject.mapper;

import com.i1314i.ourproject.po.javabean.ShiChangXinXi;
import com.i1314i.ourproject.po.javabean.ShiChangXinXiExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShiChangXinXiMapper {
    long countByExample(ShiChangXinXiExample example);

    int deleteByExample(ShiChangXinXiExample example);

    int deleteByPrimaryKey(Integer zuoWuId);

    int insert(ShiChangXinXi record);

    int insertSelective(ShiChangXinXi record);

    List<ShiChangXinXi> selectByExample(ShiChangXinXiExample example);

    ShiChangXinXi selectByPrimaryKey(Integer zuoWuId);

    int updateByExampleSelective(@Param("record") ShiChangXinXi record, @Param("example") ShiChangXinXiExample example);

    int updateByExample(@Param("record") ShiChangXinXi record, @Param("example") ShiChangXinXiExample example);

    int updateByPrimaryKeySelective(ShiChangXinXi record);

    int updateByPrimaryKey(ShiChangXinXi record);
}