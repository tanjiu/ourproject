package com.i1314i.ourproject.mapper;

import com.i1314i.ourproject.po.javabean.Recruit;
import com.i1314i.ourproject.po.javabean.RecruitExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RecruitMapper {
    long countByExample(RecruitExample example);

    int deleteByExample(RecruitExample example);

    int deleteByPrimaryKey(String zhaogongId);

    int insert(Recruit record);

    int insertSelective(Recruit record);

    List<Recruit> selectByExample(RecruitExample example);

    Recruit selectByPrimaryKey(String zhaogongId);

    int updateByExampleSelective(@Param("record") Recruit record, @Param("example") RecruitExample example);

    int updateByExample(@Param("record") Recruit record, @Param("example") RecruitExample example);

    int updateByPrimaryKeySelective(Recruit record);

    int updateByPrimaryKey(Recruit record);
}