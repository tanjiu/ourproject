package com.i1314i.ourproject.service;

import com.i1314i.ourproject.mapper.NongYeShengChanZiLiaoCopy1Mapper;
import com.i1314i.ourproject.po.javabean.NongYeShengChanZiLiao;
import com.i1314i.ourproject.po.javabean.NongYeShengChanZiLiaoCopy1;
import com.i1314i.ourproject.po.javabean.NongYeShengChanZiLiaoCopy1Example;
import com.i1314i.ourproject.po.javabean.NongYeShengChanZiLiaoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 叹久
 * @create 2018-12-24 10:22
 */
@Service
public class NongYeShengChanCopy1Service {

    @Autowired
    private NongYeShengChanZiLiaoCopy1Mapper nongYeShengChanZiLiaoMapper;

    /**
     * 获得所有数据
     *
     * @return
     */
    public List<NongYeShengChanZiLiaoCopy1> getAll() {
        List<NongYeShengChanZiLiaoCopy1> list = nongYeShengChanZiLiaoMapper.selectByExample(null);
        return list;
    }

    /**
     * 插入一条数据
     */
    public boolean insert(NongYeShengChanZiLiaoCopy1 nongYeShengChanZiLiao) {
        int n = nongYeShengChanZiLiaoMapper.insertSelective(nongYeShengChanZiLiao);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键查询
     */
    public NongYeShengChanZiLiaoCopy1 getNongYeShengChanZiLiaoByPrimaryKey(int id) {
        NongYeShengChanZiLiaoCopy1 nongYeShengChanZiLiao = nongYeShengChanZiLiaoMapper.selectByPrimaryKey(id);
        return nongYeShengChanZiLiao;
    }



    /**
     * 删除一条数据
     */
    public boolean deleteOneByPrimaryKey(int id) {
        int n = nongYeShengChanZiLiaoMapper.deleteByPrimaryKey(id);
        if (n > 0)
            return true;
        return false;
    }



    /**
     * 根据主键更新一条数据
     */
    public boolean updateByPrimaryKey(NongYeShengChanZiLiaoCopy1 nongYeShengChanZiLiao) {
        int n = nongYeShengChanZiLiaoMapper.updateByPrimaryKeySelective(nongYeShengChanZiLiao);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据名称进行模糊查询
     */
    public List<NongYeShengChanZiLiaoCopy1> getNongYeShengChanZiLiaoByMoHu(String biaoti) {
        NongYeShengChanZiLiaoCopy1Example example = new NongYeShengChanZiLiaoCopy1Example();
        NongYeShengChanZiLiaoCopy1Example.Criteria criteria = example.createCriteria();
        criteria.andShangpinMingchengLike("%" + biaoti + "%");
        List<NongYeShengChanZiLiaoCopy1> list = nongYeShengChanZiLiaoMapper.selectByExample(example);
        return list;
    }

}
