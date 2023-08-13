package com.i1314i.ourproject.mapper;

import com.i1314i.ourproject.po.javabean.YangZhiXinXi;
import com.i1314i.ourproject.po.javabean.YangZhiXinXiExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface YangZhiXinXiMapper {
    long countByExample(YangZhiXinXiExample example);

    int deleteByExample(YangZhiXinXiExample example);

    int deleteByPrimaryKey(Integer shengChuId);

    int insert(YangZhiXinXi record);

    int insertSelective(YangZhiXinXi record);

    List<YangZhiXinXi> selectByExample(YangZhiXinXiExample example);

    YangZhiXinXi selectByPrimaryKey(Integer shengChuId);

    int updateByExampleSelective(@Param("record") YangZhiXinXi record, @Param("example") YangZhiXinXiExample example);

    int updateByExample(@Param("record") YangZhiXinXi record, @Param("example") YangZhiXinXiExample example);

    int updateByPrimaryKeySelective(YangZhiXinXi record);

    int updateByPrimaryKey(YangZhiXinXi record);
}