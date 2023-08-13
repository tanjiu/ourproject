package com.i1314i.ourproject.mapper;

import com.i1314i.ourproject.po.javabean.PlantingStructure;
import com.i1314i.ourproject.po.javabean.PlantingStructureExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PlantingStructureMapper {
    long countByExample(PlantingStructureExample example);

    int deleteByExample(PlantingStructureExample example);

    int deleteByPrimaryKey(Integer jiegouId);

    int insert(PlantingStructure record);

    int insertSelective(PlantingStructure record);

    List<PlantingStructure> selectByExample(PlantingStructureExample example);

    PlantingStructure selectByPrimaryKey(Integer jiegouId);

    int updateByExampleSelective(@Param("record") PlantingStructure record, @Param("example") PlantingStructureExample example);

    int updateByExample(@Param("record") PlantingStructure record, @Param("example") PlantingStructureExample example);

    int updateByPrimaryKeySelective(PlantingStructure record);

    int updateByPrimaryKey(PlantingStructure record);
}