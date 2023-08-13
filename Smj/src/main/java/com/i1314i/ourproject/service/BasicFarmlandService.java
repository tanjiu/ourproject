package com.i1314i.ourproject.service;

import com.i1314i.ourproject.mapper.BasicaFarmlandMapper;
import com.i1314i.ourproject.po.javabean.BasicaFarmland;
import com.i1314i.ourproject.po.javabean.BasicaFarmlandExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 叹久
 * @create 2018-10-04 18:01
 */
@Service
public class BasicFarmlandService {
    
    @Autowired
    BasicaFarmlandMapper basicaFarmlandMapper;


    /**
     * 获取所有数据
     *
     * @return
     */
    public List<BasicaFarmland> getAll() {
        return basicaFarmlandMapper.selectByExample
(null);
    }

    /**
     * 插入一条数据
     */
    public boolean insert(BasicaFarmland basicaFarmland) {
        int n = basicaFarmlandMapper.insertSelective(basicaFarmland);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键查询一条数据
     */
    public BasicaFarmland getDataByPrimaryKey(String id) {
        BasicaFarmland basicaFarmland = basicaFarmlandMapper.selectByPrimaryKey(id);
        return basicaFarmland;
    }



    /**
     * 删除一条数据
     */
    public boolean deleteOneByPrimaryKey(String id) {
        int n = basicaFarmlandMapper.deleteByPrimaryKey(id);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键进行批量删除
     */
    public boolean deleteAllByPrimaryKey(List<String> ids) {
        BasicaFarmlandExample example = new BasicaFarmlandExample();
        BasicaFarmlandExample.Criteria criteria = example.createCriteria();
        criteria.andNongtianIdIn(ids);
        int n = basicaFarmlandMapper.deleteByExample(example);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键更新一条数据
     */
    public boolean updateByPrimaryKey(BasicaFarmland basicaFarmland) {
        int n = basicaFarmlandMapper.updateByPrimaryKeySelective(basicaFarmland);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据土地类型查询数据
     */
    public List<BasicaFarmland> getDataByType(String leixing){
        BasicaFarmlandExample example=new BasicaFarmlandExample();
        BasicaFarmlandExample.Criteria criteria=example.createCriteria();
        criteria.andTypeEqualTo(leixing);
        List<BasicaFarmland> list=basicaFarmlandMapper.selectByExample
(example);
        return list;
    }
}
