package com.i1314i.ourproject.service;

import com.i1314i.ourproject.mapper.GongZuoDiDianMapper;
import com.i1314i.ourproject.po.javabean.GongZuoDiDian;
import com.i1314i.ourproject.po.javabean.GongZuoDiDianExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 叹久
 * @create 2018-12-20 9:49
 */
@Service
public class GongZuoDiDianService {

    @Autowired
    GongZuoDiDianMapper gongZuoDiDianMapper;
    /**
     * 获得所有数据
     *
     * @return
     */
    public List<GongZuoDiDian> getAll() {
        List<GongZuoDiDian> list = gongZuoDiDianMapper.selectByExample(null);
        return list;
    }

    /**
     * 插入一条数据
     */
    public boolean insert(GongZuoDiDian gongZuoDiDian) {
        int n = gongZuoDiDianMapper.insertSelective(gongZuoDiDian);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键查询
     */
    public GongZuoDiDian getGongZuoDiDianByPrimaryKey(int id) {
        GongZuoDiDian gongZuoDiDian = gongZuoDiDianMapper.selectByPrimaryKey(id);
        return gongZuoDiDian;
    }



    /**
     * 删除一条数据
     */
    public boolean deleteOneByPrimaryKey(int id){
        int n=gongZuoDiDianMapper.deleteByPrimaryKey(id);
        if(n>0)
            return true;
        return false;
    }

    /**
     * 根据主键进行批量删除
     */
    public boolean deleteAllByPrimaryKey(List<Integer> ids){
        GongZuoDiDianExample example=new GongZuoDiDianExample();
        GongZuoDiDianExample.Criteria criteria=example.createCriteria();
        criteria.andGongzuoIdIn(ids);
        int n=gongZuoDiDianMapper.deleteByExample(example);
        if(n>0)
            return true;
        return false;
    }

    /**
     * 根据主键更新一条数据
     */
    public boolean updateByPrimaryKey(GongZuoDiDian gongZuoDiDian){
        int n=gongZuoDiDianMapper.updateByPrimaryKeySelective(gongZuoDiDian);
        if(n>0)
            return true;
        return false;
    }

}
