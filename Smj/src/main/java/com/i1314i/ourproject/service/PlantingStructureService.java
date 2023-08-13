package com.i1314i.ourproject.service;

import com.i1314i.ourproject.mapper.PlantingStructureMapper;
import com.i1314i.ourproject.po.javabean.PlantingStructure;
import com.i1314i.ourproject.po.javabean.PlantingStructureExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 叹久
 * @create 2018-10-03 12:03
 */
@Service
public class PlantingStructureService {

    @Autowired
    private PlantingStructureMapper plantingStructureMapper;

    /**
     * 获取所有数据
     *
     * @return
     */
    public List<PlantingStructure> getAll() {
        return plantingStructureMapper.selectByExample(null);
    }

    /**
     * 插入一条数据
     */
    public boolean insert(PlantingStructure plantingStructure) {
        int n = plantingStructureMapper.insertSelective(plantingStructure);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键查询一条数据
     */
    public PlantingStructure getDataByPrimaryKey(int id) {
        PlantingStructure plantingStructure = plantingStructureMapper.selectByPrimaryKey(id);
        return plantingStructure;
    }



    /**
     * 删除一条数据
     */
    public boolean deleteOneByPrimaryKey(int id) {
        int n = plantingStructureMapper.deleteByPrimaryKey(id);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键进行批量删除
     */
    public boolean deleteAllByPrimaryKey(List<Integer> ids) {
        PlantingStructureExample example = new PlantingStructureExample();
        PlantingStructureExample.Criteria criteria = example.createCriteria();
        criteria.andJiegouIdIn(ids);
        int n = plantingStructureMapper.deleteByExample(example);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键更新一条数据
     */
    public boolean updateByPrimaryKey(PlantingStructure plantingStructure) {
        int n = plantingStructureMapper.updateByPrimaryKeySelective(plantingStructure);
        if (n > 0)
            return true;
        return false;
    }


}
