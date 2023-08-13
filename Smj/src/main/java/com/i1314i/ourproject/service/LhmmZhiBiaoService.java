package com.i1314i.ourproject.service;

import com.i1314i.ourproject.mapper.LhmmZhiBiaoMapper;
import com.i1314i.ourproject.po.javabean.LhmmZhiBiao;
import com.i1314i.ourproject.po.javabean.LhmmZhiBiaoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 叹久
 * @create 2018-12-22 14:56
 */
@Service
public class LhmmZhiBiaoService {
    
    @Autowired
    LhmmZhiBiaoMapper lhmmZhiBiaoMapper;
    /**
     * 获得所有数据
     *
     * @return
     */
    public List<LhmmZhiBiao> getAll() {
        List<LhmmZhiBiao> list = lhmmZhiBiaoMapper.selectByExample(null);
        return list;
    }

    /**
     * 插入一条数据
     */
    public boolean insert(LhmmZhiBiao lhmmZhiBiao) {
        int n = lhmmZhiBiaoMapper.insertSelective(lhmmZhiBiao);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键查询
     */
    public LhmmZhiBiao getLhmmZhiBiaoByPrimaryKey(int id) {
        LhmmZhiBiao lhmmZhiBiao = lhmmZhiBiaoMapper.selectByPrimaryKey(id);
        return lhmmZhiBiao;
    }

    /**
     * 根据名称进行模糊查询
     */
    public List<LhmmZhiBiao> getLhmmZhiBiaoByMoHu(String biaoti) {
        LhmmZhiBiaoExample example=new LhmmZhiBiaoExample();
        LhmmZhiBiaoExample.Criteria criteria=example.createCriteria();
        criteria.andZhiBiaoDanWeiLike("%"+biaoti+"%");
        List<LhmmZhiBiao> list = lhmmZhiBiaoMapper.selectByExample(example);
        return list;
    }

    /**
     * 删除一条数据
     */
    public boolean deleteOneByPrimaryKey(int id){
        int n=lhmmZhiBiaoMapper.deleteByPrimaryKey(id);
        if(n>0)
            return true;
        return false;
    }

    /**
     * 根据主键进行批量删除
     */
    public boolean deleteAllByPrimaryKey(List<Integer> ids){
        LhmmZhiBiaoExample example=new LhmmZhiBiaoExample();
        LhmmZhiBiaoExample.Criteria criteria=example.createCriteria();
        criteria.andZhiBiaoFangIdIn(ids);
        int n=lhmmZhiBiaoMapper.deleteByExample(example);
        if(n>0)
            return true;
        return false;
    }

    /**
     * 根据主键更新一条数据
     */
    public boolean updateByPrimaryKey(LhmmZhiBiao lhmmZhiBiao){
        int n=lhmmZhiBiaoMapper.updateByPrimaryKeySelective(lhmmZhiBiao);
        if(n>0)
            return true;
        return false;
    }

}
