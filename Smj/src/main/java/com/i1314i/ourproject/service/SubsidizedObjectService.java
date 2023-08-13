package com.i1314i.ourproject.service;

import com.i1314i.ourproject.mapper.SubsidizedObjectMapper;
import com.i1314i.ourproject.po.javabean.SouSuo;
import com.i1314i.ourproject.po.javabean.SubsidizedObject;
import com.i1314i.ourproject.po.javabean.SubsidizedObjectExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 叹久
 * @create 2018-10-06 11:22
 */
@Service
public class SubsidizedObjectService {
    @Autowired
    SubsidizedObjectMapper subsidizedObjectMapper;


    /**
     * 获得所有数据
     *
     * @return
     */
    public List<SubsidizedObject> getAll() {
        List<SubsidizedObject> list = subsidizedObjectMapper.selectByExample(null);
        return list;
    }

    /**
     * 插入一条数据
     */
    public boolean insert(SubsidizedObject subsidizedObject) {
        int n = subsidizedObjectMapper.insertSelective(subsidizedObject);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键查询
     */
    public SubsidizedObject getDataByPrimaryKey(int id) {
        SubsidizedObject subsidizedObject = subsidizedObjectMapper.selectByPrimaryKey(id);
        return subsidizedObject;
    }

    /**
     * 根据补贴名称进行模糊查询
     */
    public List<SubsidizedObject> getDataByMoHu(String mingcheng) {
        SubsidizedObjectExample example=new SubsidizedObjectExample();
        SubsidizedObjectExample.Criteria criteria=example.createCriteria();
        criteria.andButieMingchengLike("%"+mingcheng+"%");
        List<SubsidizedObject> list = subsidizedObjectMapper.selectByExample(example);
        return list;
    }

    /**
     * 删除一条数据
     */
    public boolean deleteOneByPrimaryKey(int id){
        int n=subsidizedObjectMapper.deleteByPrimaryKey(id);
        if(n>0)
            return true;
        return false;
    }

    /**
     * 根据主键进行批量删除
     */
    public boolean deleteAllByPrimaryKey(List<Integer> ids){
        SubsidizedObjectExample example=new SubsidizedObjectExample();
        SubsidizedObjectExample.Criteria criteria=example.createCriteria();
        criteria.andButieIdIn(ids);
        int n=subsidizedObjectMapper.deleteByExample(example);
        if(n>0)
            return true;
        return false;
    }

    /**
     * 根据主键更新一条数据
     */
    public boolean updateByPrimaryKey(SubsidizedObject subsidizedObject){
        int n=subsidizedObjectMapper.updateByPrimaryKeySelective(subsidizedObject);
        if(n>0)
            return true;
        return false;
    }

    /**
     * 根据发放单位查询数据(精确）
     */
    public List<SubsidizedObject> getDataByDanWei(String danwei){
        SubsidizedObjectExample example=new SubsidizedObjectExample();
        SubsidizedObjectExample.Criteria criteria=example.createCriteria();
        criteria.andFafangBumenEqualTo(danwei);
        List<SubsidizedObject> list=subsidizedObjectMapper.selectByExample(example);
        return list;
    }


    /**
     *根据发放时间范围或者发放金额范围来检索
     */
    public List<SubsidizedObject> getSouSuo(SouSuo souSuo){
        SubsidizedObjectExample example=new SubsidizedObjectExample();
        SubsidizedObjectExample.Criteria criteria=example.createCriteria();
        //对时间字段进行判断，是否为空
        if(souSuo.getFabuShijian().size()!=0){
            if(souSuo.getFabuShijian().size()==1){
                criteria.andFafangShijianEqualTo(souSuo.getFabuShijian().get(0));
            }else if(souSuo.getFabuShijian().size()==2){
                criteria.andFafangShijianBetween(souSuo.getFabuShijian().get(0),souSuo.getFabuShijian().get(1));
            }
        }
        List<SubsidizedObject> list=subsidizedObjectMapper.selectByExample(example);
        return list;
    }
}
