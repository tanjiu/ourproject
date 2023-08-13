package com.i1314i.ourproject.service;

import com.i1314i.ourproject.mapper.SoilTypeDistributionMapper;
import com.i1314i.ourproject.po.javabean.SoilTypeDistribution;
import com.i1314i.ourproject.po.javabean.SoilTypeDistributionExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 叹久
 * @create 2018-10-04 21:05
 */
@Service
public class SoilTypeDistributionService {
    @Autowired
    SoilTypeDistributionMapper soilTypeDistributionMapper;

    /**
     * 获取所有数据
     *
     * @return
     */
    public List<SoilTypeDistribution> getAll() {
        return soilTypeDistributionMapper.selectByExample(null);
    }

    /**
     * 插入一条数据
     */
    public boolean insert(SoilTypeDistribution soilTypeDistribution) {
        int n = soilTypeDistributionMapper.insertSelective(soilTypeDistribution);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键查询一条数据
     */
    public SoilTypeDistribution getDataByPrimaryKey(String id) {
        SoilTypeDistribution soilTypeDistribution = soilTypeDistributionMapper.selectByPrimaryKey(id);
        return soilTypeDistribution;
    }



    /**
     * 删除一条数据
     */
    public boolean deleteOneByPrimaryKey(String id) {
        int n = soilTypeDistributionMapper.deleteByPrimaryKey(id);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键进行批量删除
     */
    public boolean deleteAllByPrimaryKey(List<String> ids) {
        SoilTypeDistributionExample example = new SoilTypeDistributionExample();
        SoilTypeDistributionExample.Criteria criteria = example.createCriteria();
        criteria.andLeixingIdIn(ids);
        int n = soilTypeDistributionMapper.deleteByExample(example);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键更新一条数据
     */
    public boolean updateByPrimaryKey(SoilTypeDistribution soilTypeDistribution) {
        int n = soilTypeDistributionMapper.updateByPrimaryKeySelective(soilTypeDistribution);
        if (n > 0)
            return true;
        return false;
    }



}
