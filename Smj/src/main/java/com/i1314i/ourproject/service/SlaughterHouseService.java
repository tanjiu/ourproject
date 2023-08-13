package com.i1314i.ourproject.service;

import com.i1314i.ourproject.mapper.SlaughterHouseMapper;
import com.i1314i.ourproject.po.javabean.SlaughterHouse;
import com.i1314i.ourproject.po.javabean.SlaughterHouseExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 叹久
 * @create 2018-10-04 20:31
 */
@Service
public class SlaughterHouseService {
    @Autowired
    SlaughterHouseMapper slaughterHouseMapper;


    /**
     * 获取所有数据
     *
     * @return
     */
    public List<SlaughterHouse> getAll() {
        return slaughterHouseMapper.selectByExample(null);
    }

    /**
     * 插入一条数据
     */
    public boolean insert(SlaughterHouse slaughterHouse) {
        int n = slaughterHouseMapper.insertSelective(slaughterHouse);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键查询一条数据
     */
    public SlaughterHouse getDataByPrimaryKey(int id) {
        SlaughterHouse slaughterHouse = slaughterHouseMapper.selectByPrimaryKey(id);
        return slaughterHouse;
    }



    /**
     * 删除一条数据
     */
    public boolean deleteOneByPrimaryKey(int id) {
        int n = slaughterHouseMapper.deleteByPrimaryKey(id);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键进行批量删除
     */
    public boolean deleteAllByPrimaryKey(List<Integer> ids) {
        SlaughterHouseExample example = new SlaughterHouseExample();
        SlaughterHouseExample.Criteria criteria = example.createCriteria();
        criteria.andTuzaiIdIn(ids);
        int n = slaughterHouseMapper.deleteByExample(example);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键更新一条数据
     */
    public boolean updateByPrimaryKey(SlaughterHouse slaughterHouse) {
        int n = slaughterHouseMapper.updateByPrimaryKeySelective(slaughterHouse);
        if (n > 0)
            return true;
        return false;
    }



    /**
     * 根据类型查询数据
     */
    public List<SlaughterHouse> getDataByType(String type){
        SlaughterHouseExample example=new SlaughterHouseExample();
        SlaughterHouseExample.Criteria criteria=example.createCriteria();
        criteria.andTypeEqualTo(type);
        List<SlaughterHouse> list=slaughterHouseMapper.selectByExample(example);
        return list;
    }

    /**
     * 根据名称查询数据（模糊查询）
     */
    public List<SlaughterHouse> getDataByName(String name){
        SlaughterHouseExample example=new SlaughterHouseExample();
        SlaughterHouseExample.Criteria criteria=example.createCriteria();
        criteria.andNameLike("%"+name+"%");
        List<SlaughterHouse> list=slaughterHouseMapper.selectByExample(example);
        return list;
    }

    /**
     * 根据联系人电话模糊查询
     */
    public List<SlaughterHouse> getDataByTel(String tel){
        SlaughterHouseExample example=new SlaughterHouseExample();
        SlaughterHouseExample.Criteria criteria=example.createCriteria();
        criteria.andTelLike("%"+tel+"%");
        List<SlaughterHouse> list=slaughterHouseMapper.selectByExample(example);
        return list;
    }

}
