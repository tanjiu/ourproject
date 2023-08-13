package com.i1314i.ourproject.mapper;

import com.i1314i.ourproject.po.javabean.GongYingXinXi;
import com.i1314i.ourproject.po.javabean.GongYingXinXiExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GongYingXinXiMapper {
    long countByExample(GongYingXinXiExample example);

    int deleteByExample(GongYingXinXiExample example);

    int deleteByPrimaryKey(Integer gongYingId);

    int insert(GongYingXinXi record);

    int insertSelective(GongYingXinXi record);

    List<GongYingXinXi> selectByExample(GongYingXinXiExample example);

    GongYingXinXi selectByPrimaryKey(Integer gongYingId);

    int updateByExampleSelective(@Param("record") GongYingXinXi record, @Param("example") GongYingXinXiExample example);

    int updateByExample(@Param("record") GongYingXinXi record, @Param("example") GongYingXinXiExample example);

    int updateByPrimaryKeySelective(GongYingXinXi record);

    int updateByPrimaryKey(GongYingXinXi record);
}