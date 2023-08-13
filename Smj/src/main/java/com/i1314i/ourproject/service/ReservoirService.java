package com.i1314i.ourproject.service;

import com.i1314i.ourproject.mapper.ReservoirMapper;
import com.i1314i.ourproject.po.javabean.Reservoir;
import com.i1314i.ourproject.po.javabean.ReservoirExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 叹久
 * @create 2018-10-04 21:12
 */
@Service
public class ReservoirService {
    @Autowired
    ReservoirMapper reservoirMapper;

    /**
     * 获取所有数据
     *
     * @return
     */
    public List<Reservoir> getAll() {
        return reservoirMapper.selectByExample(null);
    }

    /**
     * 插入一条数据
     */
    public boolean insert(Reservoir reservoir) {
        int n = reservoirMapper.insertSelective(reservoir);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键查询一条数据
     */
    public Reservoir getDataByPrimaryKey(int id) {
        Reservoir reservoir = reservoirMapper.selectByPrimaryKey(id);
        return reservoir;
    }



    /**
     * 删除一条数据
     */
    public boolean deleteOneByPrimaryKey(int id) {
        int n = reservoirMapper.deleteByPrimaryKey(id);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键进行批量删除
     */
    public boolean deleteAllByPrimaryKey(List<Integer> ids) {
        ReservoirExample example = new ReservoirExample();
        ReservoirExample.Criteria criteria = example.createCriteria();
        criteria.andShuikuIdIn(ids);
        int n = reservoirMapper.deleteByExample(example);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键更新一条数据
     */
    public boolean updateByPrimaryKey(Reservoir reservoir) {
        int n = reservoirMapper.updateByPrimaryKeySelective(reservoir);
        if (n > 0)
            return true;
        return false;
    }
}
