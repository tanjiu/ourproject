package com.i1314i.ourproject.service;

import com.i1314i.ourproject.mapper.PrecipitationMonitoringMapper;
import com.i1314i.ourproject.po.javabean.PrecipitationMonitoring;
import com.i1314i.ourproject.po.javabean.PrecipitationMonitoringExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 叹久
 * @create 2018-10-03 12:05
 */
@Service
public class PrecipitationMonitoringService {

    @Autowired
    private PrecipitationMonitoringMapper precipitationMonitoringMapper;


    /**
     * 获取所有数据
     *
     * @return
     */
    public List<PrecipitationMonitoring> getAll() {
        return precipitationMonitoringMapper.selectByExample(null);
    }

    /**
     * 插入一条数据
     */
    public boolean insert(PrecipitationMonitoring precipitationMonitoring) {
        int n = precipitationMonitoringMapper.insertSelective(precipitationMonitoring);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键查询一条数据
     */
    public PrecipitationMonitoring getDataByPrimaryKey(int id) {
        PrecipitationMonitoring precipitationMonitoring = precipitationMonitoringMapper.selectByPrimaryKey(id);
        return precipitationMonitoring;
    }



    /**
     * 删除一条数据
     */
    public boolean deleteOneByPrimaryKey(int id) {
        int n = precipitationMonitoringMapper.deleteByPrimaryKey(id);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键进行批量删除
     */
    public boolean deleteAllByPrimaryKey(List<Integer> ids) {
        PrecipitationMonitoringExample example = new PrecipitationMonitoringExample();
        PrecipitationMonitoringExample.Criteria criteria = example.createCriteria();
        criteria.andJiangshuiIdIn(ids);
        int n = precipitationMonitoringMapper.deleteByExample(example);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键更新一条数据
     */
    public boolean updateByPrimaryKey(PrecipitationMonitoring precipitationMonitoring) {
        int n = precipitationMonitoringMapper.updateByPrimaryKeySelective(precipitationMonitoring);
        if (n > 0)
            return true;
        return false;
    }
}
