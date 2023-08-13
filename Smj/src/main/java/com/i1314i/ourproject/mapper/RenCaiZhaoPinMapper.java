package com.i1314i.ourproject.mapper;

import com.i1314i.ourproject.po.javabean.RenCaiZhaoPin;
import com.i1314i.ourproject.po.javabean.RenCaiZhaoPinExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
public interface RenCaiZhaoPinMapper {
    long countByExample(RenCaiZhaoPinExample example);

    int deleteByExample(RenCaiZhaoPinExample example);

    int deleteByPrimaryKey(Integer zhaopinId);

    int insert(RenCaiZhaoPin record);

    int insertSelective(RenCaiZhaoPin record);

    List<RenCaiZhaoPin> selectByExample(RenCaiZhaoPinExample example);

    RenCaiZhaoPin selectByPrimaryKey(Integer zhaopinId);

    int updateByExampleSelective(@Param("record") RenCaiZhaoPin record, @Param("example") RenCaiZhaoPinExample example);

    int updateByExample(@Param("record") RenCaiZhaoPin record, @Param("example") RenCaiZhaoPinExample example);

    int updateByPrimaryKeySelective(RenCaiZhaoPin record);

    int updateByPrimaryKey(RenCaiZhaoPin record);
}