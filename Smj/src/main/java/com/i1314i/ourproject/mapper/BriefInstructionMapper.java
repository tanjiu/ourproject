package com.i1314i.ourproject.mapper;

import com.i1314i.ourproject.po.javabean.BriefInstruction;
import com.i1314i.ourproject.po.javabean.BriefInstructionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BriefInstructionMapper {
    long countByExample(BriefInstructionExample example);

    int deleteByExample(BriefInstructionExample example);

    int deleteByPrimaryKey(Integer shichangId);

    int insert(BriefInstruction record);

    int insertSelective(BriefInstruction record);

    List<BriefInstruction> selectByExample(BriefInstructionExample example);

    BriefInstruction selectByPrimaryKey(Integer shichangId);

    int updateByExampleSelective(@Param("record") BriefInstruction record, @Param("example") BriefInstructionExample example);

    int updateByExample(@Param("record") BriefInstruction record, @Param("example") BriefInstructionExample example);

    int updateByPrimaryKeySelective(BriefInstruction record);

    int updateByPrimaryKey(BriefInstruction record);
}