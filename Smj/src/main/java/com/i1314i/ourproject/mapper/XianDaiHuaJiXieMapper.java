package com.i1314i.ourproject.mapper;

import com.i1314i.ourproject.po.javabean.XianDaiHuaJiXie;
import com.i1314i.ourproject.po.javabean.XianDaiHuaJiXieExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XianDaiHuaJiXieMapper {
    long countByExample(XianDaiHuaJiXieExample example);

    int deleteByExample(XianDaiHuaJiXieExample example);

    int deleteByPrimaryKey(Integer mianJiId);

    int insert(XianDaiHuaJiXie record);

    int insertSelective(XianDaiHuaJiXie record);

    List<XianDaiHuaJiXie> selectByExample(XianDaiHuaJiXieExample example);

    XianDaiHuaJiXie selectByPrimaryKey(Integer mianJiId);

    int updateByExampleSelective(@Param("record") XianDaiHuaJiXie record, @Param("example") XianDaiHuaJiXieExample example);

    int updateByExample(@Param("record") XianDaiHuaJiXie record, @Param("example") XianDaiHuaJiXieExample example);

    int updateByPrimaryKeySelective(XianDaiHuaJiXie record);

    int updateByPrimaryKey(XianDaiHuaJiXie record);
}