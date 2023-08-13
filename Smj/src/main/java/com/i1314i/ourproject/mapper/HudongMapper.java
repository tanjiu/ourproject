package com.i1314i.ourproject.mapper;

import com.i1314i.ourproject.po.javabean.Hudong;
import com.i1314i.ourproject.po.javabean.HudongExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 叹久
 * @create 2018-12-10 21:41
 */
public interface HudongMapper {
    long countByExample(HudongExample example);

    int deleteByExample(HudongExample example);

    int deleteByPrimaryKey(Integer hudongId);

    int insert(Hudong record);

    int insertSelective(Hudong record);

    List<Hudong> selectByExample(HudongExample example);

    Hudong selectByPrimaryKey(Integer hudongId);

    int updateByExampleSelective(@Param("record") Hudong record, @Param("example") HudongExample example);

    int updateByExample(@Param("record") Hudong record, @Param("example") HudongExample example);

    int updateByPrimaryKeySelective(Hudong record);

    int updateByPrimaryKey(Hudong record);
}