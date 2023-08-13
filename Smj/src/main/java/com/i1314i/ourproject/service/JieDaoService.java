package com.i1314i.ourproject.service;

import com.i1314i.ourproject.mapper.JieDaoMapper;
import com.i1314i.ourproject.po.javabean.JieDao;
import com.i1314i.ourproject.po.javabean.JieDaoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 叹久
 * @create 2018-12-21 11:06
 */
@Service
public class JieDaoService {
    @Autowired
    JieDaoMapper jieDaoMapper;
    /**
     * 获得所有数据
     *
     * @return
     */
    public List<JieDao> getAll() {
        List<JieDao> list = jieDaoMapper.selectByExample(null);
        return list;
    }

    /**
     * 插入一条数据
     */
    public boolean insert(JieDao jieDao) {
        int n = jieDaoMapper.insertSelective(jieDao);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键查询
     */
    public JieDao getJieDaoByPrimaryKey(int id) {
        JieDao jieDao = jieDaoMapper.selectByPrimaryKey(id);
        return jieDao;
    }



    /**
     * 删除一条数据
     */
    public boolean deleteOneByPrimaryKey(int id){
        int n=jieDaoMapper.deleteByPrimaryKey(id);
        if(n>0)
            return true;
        return false;
    }

    /**
     * 根据主键进行批量删除
     */
    public boolean deleteAllByPrimaryKey(List<Integer> ids){
        JieDaoExample example=new JieDaoExample();
        JieDaoExample.Criteria criteria=example.createCriteria();
        criteria.andJieDaoIdIn(ids);
        int n=jieDaoMapper.deleteByExample(example);
        if(n>0)
            return true;
        return false;
    }

    /**
     * 根据主键更新一条数据
     */
    public boolean updateByPrimaryKey(JieDao jieDao){
        int n=jieDaoMapper.updateByPrimaryKeySelective(jieDao);
        if(n>0)
            return true;
        return false;
    }

}
