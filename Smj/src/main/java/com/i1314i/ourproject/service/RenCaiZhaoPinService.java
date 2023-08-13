package com.i1314i.ourproject.service;

import com.i1314i.ourproject.mapper.RenCaiZhaoPinMapper;
import com.i1314i.ourproject.po.javabean.RenCaiZhaoPin;
import com.i1314i.ourproject.po.javabean.RenCaiZhaoPinExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 叹久
 * @create 2018-12-20 10:32
 */
@Service
public class RenCaiZhaoPinService {
    @Autowired
    RenCaiZhaoPinMapper renCaiZhaoPinMapper;

    /**
     * 获得所有数据
     *
     * @return
     */
    public List<RenCaiZhaoPin> getAll() {
        List<RenCaiZhaoPin> list = renCaiZhaoPinMapper.selectByExample(null);
        return list;
    }


    /**
     * 获得所有审核通过的数据
     *
     * @return
     */
    public List<RenCaiZhaoPin> getTongGuoData() {
        RenCaiZhaoPinExample example=new RenCaiZhaoPinExample();
        RenCaiZhaoPinExample.Criteria criteria=example.createCriteria();
        criteria.andShenheEqualTo("true");
        example.setOrderByClause(" zhaopin_id desc");
        List<RenCaiZhaoPin> list = renCaiZhaoPinMapper.selectByExample(example);
        return list;
    }

    /**
     * 获得所有待审核通过的数据
     *
     * @return
     */
    public List<RenCaiZhaoPin> getBuTongGuoData() {
        RenCaiZhaoPinExample example=new RenCaiZhaoPinExample();
        RenCaiZhaoPinExample.Criteria criteria=example.createCriteria();
        criteria.andShenheEqualTo("false");
        example.setOrderByClause(" zhaopin_id desc");
        List<RenCaiZhaoPin> list = renCaiZhaoPinMapper.selectByExample(example);
        return list;
    }

    /**
     * 获得所有未审核核通过的数据
     *
     * @return
     */
    public List<RenCaiZhaoPin> getWeiTongGuoData() {
        RenCaiZhaoPinExample example=new RenCaiZhaoPinExample();
        RenCaiZhaoPinExample.Criteria criteria=example.createCriteria();
        criteria.andShenheEqualTo("wait");
        example.setOrderByClause(" zhaopin_id desc");
        List<RenCaiZhaoPin> list = renCaiZhaoPinMapper.selectByExample(example);
        return list;
    }
    /**
     * 插入一条数据
     */
    public boolean insert(RenCaiZhaoPin gongYingXinXi) {
        int n = renCaiZhaoPinMapper.insertSelective(gongYingXinXi);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键查询
     */
    public RenCaiZhaoPin getRenCaiZhaoPinByPrimaryKey(int id) {
       RenCaiZhaoPin gongYingXinXi = renCaiZhaoPinMapper.selectByPrimaryKey(id);
        return gongYingXinXi;
    }

    /**
     * 根据职位进行模糊查询审核通过的
     */
    public List<RenCaiZhaoPin> getRenCaiZhaoPinByZhiWei(String biaoti) {
        RenCaiZhaoPinExample example=new RenCaiZhaoPinExample();
        RenCaiZhaoPinExample.Criteria criteria=example.createCriteria();
        criteria.andZhiweiLike("%"+biaoti+"%");
        criteria.andShenheEqualTo("true");
        example.setOrderByClause(" zhaopin_id desc");
        List<RenCaiZhaoPin> list = renCaiZhaoPinMapper.selectByExample(example);
        return list;
    }

    /**
     * 根据性别进行精确查询审核通过的
     */
    public List<RenCaiZhaoPin> getRenCaiZhaoPinBySex(String biaoti) {
        RenCaiZhaoPinExample example=new RenCaiZhaoPinExample();
        RenCaiZhaoPinExample.Criteria criteria=example.createCriteria();
        criteria.andSexEqualTo(biaoti);
        criteria.andShenheEqualTo("true");
        example.setOrderByClause(" zhaopin_id desc");
        List<RenCaiZhaoPin> list = renCaiZhaoPinMapper.selectByExample(example);
        return list;
    }
    /**
     * 根据学历进行精确查询审核通过的
     */
    public List<RenCaiZhaoPin> getRenCaiZhaoPinByXueLi(String biaoti) {
        RenCaiZhaoPinExample example=new RenCaiZhaoPinExample();
        RenCaiZhaoPinExample.Criteria criteria=example.createCriteria();
        criteria.andXueliEqualTo(biaoti);
        criteria.andShenheEqualTo("true");
        example.setOrderByClause(" zhaopin_id desc");
        List<RenCaiZhaoPin> list = renCaiZhaoPinMapper.selectByExample(example);
        return list;
    }
    /**
     * 根据年龄进行精确查询审核通过的
     */
    public List<RenCaiZhaoPin> getRenCaiZhaoPinByAge(int age1, int age2) {
        RenCaiZhaoPinExample example=new RenCaiZhaoPinExample();
        RenCaiZhaoPinExample.Criteria criteria=example.createCriteria();
        criteria.andMinAgeLessThanOrEqualTo(age1);
        criteria.andMaxAgeLessThan(age2);
        criteria.andShenheEqualTo("true");
        example.setOrderByClause(" zhaopin_id desc");
        List<RenCaiZhaoPin> list = renCaiZhaoPinMapper.selectByExample(example);
        return list;
    }

    /**
     * 删除一条数据
     */
    public boolean deleteOneByPrimaryKey(int id){
        int n=renCaiZhaoPinMapper.deleteByPrimaryKey(id);
        if(n>0)
            return true;
        return false;
    }

    /**
     * 根据主键进行批量删除
     */
    public boolean deleteAllByPrimaryKey(List<Integer> ids){
        RenCaiZhaoPinExample example=new RenCaiZhaoPinExample();
        RenCaiZhaoPinExample.Criteria criteria=example.createCriteria();
        criteria.andZhaopinIdIn(ids);
        int n=renCaiZhaoPinMapper.deleteByExample(example);
        if(n>0)
            return true;
        return false;
    }

    /**
     * 根据主键更新一条数据
     */
    public boolean updateByPrimaryKey(RenCaiZhaoPin gongYingXinXi){
        int n=renCaiZhaoPinMapper.updateByPrimaryKeySelective(gongYingXinXi);
        if(n>0)
            return true;
        return false;
    }
}
