package com.i1314i.ourproject.service;

import com.i1314i.ourproject.mapper.WaterInfrastructureMapper;
import com.i1314i.ourproject.po.javabean.WaterInfrastructure;
import com.i1314i.ourproject.po.javabean.WaterInfrastructureExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 叹久
 * @create 2018-10-04 18:11
 */
@Service
public class WaterInfrastructureService {
    @Autowired
    WaterInfrastructureMapper waterInfrastructureMapper;

    /**
     * 获取所有数据
     *
     * @return
     */
    public List<WaterInfrastructure> getAll() {
        return waterInfrastructureMapper.selectByExample(null);
    }

    /**
     * 插入一条数据
     */
    public boolean insert(WaterInfrastructure waterInfrastructure) {
        int n = waterInfrastructureMapper.insertSelective(waterInfrastructure);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键查询一条数据
     */
    public WaterInfrastructure getDataByPrimaryKey(String id) {
        WaterInfrastructure waterInfrastructure = waterInfrastructureMapper.selectByPrimaryKey(id);
        return waterInfrastructure;
    }



    /**
     * 删除一条数据
     */
    public boolean deleteOneByPrimaryKey(String id) {
        int n = waterInfrastructureMapper.deleteByPrimaryKey(id);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键进行批量删除
     */
    public boolean deleteAllByPrimaryKey(List<String> ids) {
        WaterInfrastructureExample example = new WaterInfrastructureExample();
        WaterInfrastructureExample.Criteria criteria = example.createCriteria();
        criteria.andShuiliJdIn(ids);
        int n = waterInfrastructureMapper.deleteByExample(example);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键更新一条数据
     */
    public boolean updateByPrimaryKey(WaterInfrastructure waterInfrastructure) {
        int n = waterInfrastructureMapper.updateByPrimaryKeySelective(waterInfrastructure);
        if (n > 0)
            return true;
        return false;
    }


    /**
     * 根据名称进行模糊查询
     */
    public List<WaterInfrastructure> getDataByName(String name){
        WaterInfrastructureExample example=new WaterInfrastructureExample();
        WaterInfrastructureExample.Criteria criteria=example.createCriteria();
        criteria.andNameLike("%"+name+"%");
        List<WaterInfrastructure> list=waterInfrastructureMapper.selectByExample(example);
        return list;
    }

}
