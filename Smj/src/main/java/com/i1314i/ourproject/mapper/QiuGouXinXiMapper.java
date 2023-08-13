package com.i1314i.ourproject.mapper;

import com.i1314i.ourproject.po.javabean.QiuGouXinXi;
import com.i1314i.ourproject.po.javabean.QiuGouXinXiExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface QiuGouXinXiMapper {
    long countByExample(QiuGouXinXiExample example);

    int deleteByExample(QiuGouXinXiExample example);

    int deleteByPrimaryKey(Integer qiuGouId);

    int insert(QiuGouXinXi record);

    int insertSelective(QiuGouXinXi record);

    List<QiuGouXinXi> selectByExample(QiuGouXinXiExample example);

    QiuGouXinXi selectByPrimaryKey(Integer qiuGouId);

    int updateByExampleSelective(@Param("record") QiuGouXinXi record, @Param("example") QiuGouXinXiExample example);

    int updateByExample(@Param("record") QiuGouXinXi record, @Param("example") QiuGouXinXiExample example);

    int updateByPrimaryKeySelective(QiuGouXinXi record);

    int updateByPrimaryKey(QiuGouXinXi record);
}