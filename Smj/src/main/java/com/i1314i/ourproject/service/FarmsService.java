package com.i1314i.ourproject.service;

import com.i1314i.ourproject.mapper.FarmsMapper;
import com.i1314i.ourproject.po.javabean.Farms;
import com.i1314i.ourproject.po.javabean.FarmsExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 叹久
 * @create 2018-10-03 11:58
 */
@Service
public class FarmsService {
    @Autowired
    private FarmsMapper farmsMapper;


    /**
     * 获取所有数据
     *
     * @return
     */
    public List<Farms> getAll() {
        return farmsMapper.selectByExample(null);
    }

    /**
     * 插入一条数据
     */
    public boolean insert(Farms farms) {
        int n = farmsMapper.insertSelective(farms);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键查询一条数据
     */
    public Farms getDataByPrimaryKey(int id) {
        Farms farms = farmsMapper.selectByPrimaryKey(id);
        return farms;
    }



    /**
     * 删除一条数据
     */
    public boolean deleteOneByPrimaryKey(int id) {
        int n = farmsMapper.deleteByPrimaryKey(id);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键进行批量删除
     */
    public boolean deleteAllByPrimaryKey(List<Integer> ids) {
        FarmsExample example = new FarmsExample();
        FarmsExample.Criteria criteria = example.createCriteria();
        criteria.andYangzhiIdIn(ids);
        int n = farmsMapper.deleteByExample(example);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键更新一条数据
     */
    public boolean updateByPrimaryKey(Farms farms) {
        int n = farmsMapper.updateByPrimaryKeySelective(farms);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据类型查询数据
     */
    public List<Farms> getDataByType(String type){
        FarmsExample example=new FarmsExample();
        FarmsExample.Criteria criteria=example.createCriteria();
        criteria.andTypeEqualTo(type);
        List<Farms> list=farmsMapper.selectByExample(example);
        return list;
    }

    /**
     * 根据名称查询数据（模糊查询）
     */
    public List<Farms> getDataByName(String name){
        FarmsExample example=new FarmsExample();
        FarmsExample.Criteria criteria=example.createCriteria();
        criteria.andNameLike("%"+name+"%");
        List<Farms> list=farmsMapper.selectByExample(example);
        return list;
    }

    /**
     * 根据联系人电话模糊查询
     */
    public List<Farms> getDataByTel(String tel){
        FarmsExample example=new FarmsExample();
        FarmsExample.Criteria criteria=example.createCriteria();
        criteria.andLianxirenTelLike("%"+tel+"%");
        List<Farms> list=farmsMapper.selectByExample(example);
        return list;
    }

}
