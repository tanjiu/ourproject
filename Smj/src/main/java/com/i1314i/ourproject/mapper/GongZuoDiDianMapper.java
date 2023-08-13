package com.i1314i.ourproject.mapper;

import com.i1314i.ourproject.po.javabean.GongZuoDiDian;
import com.i1314i.ourproject.po.javabean.GongZuoDiDianExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GongZuoDiDianMapper {
    long countByExample(GongZuoDiDianExample example);

    int deleteByExample(GongZuoDiDianExample example);

    int deleteByPrimaryKey(Integer gongzuoId);

    int insert(GongZuoDiDian record);

    int insertSelective(GongZuoDiDian record);

    List<GongZuoDiDian> selectByExample(GongZuoDiDianExample example);

    GongZuoDiDian selectByPrimaryKey(Integer gongzuoId);

    int updateByExampleSelective(@Param("record") GongZuoDiDian record, @Param("example") GongZuoDiDianExample example);

    int updateByExample(@Param("record") GongZuoDiDian record, @Param("example") GongZuoDiDianExample example);

    int updateByPrimaryKeySelective(GongZuoDiDian record);

    int updateByPrimaryKey(GongZuoDiDian record);
}