package com.i1314i.ourproject.service;

import com.i1314i.ourproject.mapper.NongYeShengChanZiLiaoMapper;
import com.i1314i.ourproject.po.javabean.JuMinShengHuoXiaoFeiPin;
import com.i1314i.ourproject.po.javabean.JuMinShengHuoXiaoFeiPinExample;
import com.i1314i.ourproject.po.javabean.NongYeShengChanZiLiao;
import com.i1314i.ourproject.po.javabean.NongYeShengChanZiLiaoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * @author 叹久
 * @create 2018-11-19 18:26
 */
@Service
public class NongYeShengChanZiLiaoService {
    @Autowired
    private NongYeShengChanZiLiaoMapper nongYeShengChanZiLiaoMapper;

    /**
     * 获得所有数据
     *
     * @return
     */
    public List<NongYeShengChanZiLiao> getAll() {
        List<NongYeShengChanZiLiao> list = nongYeShengChanZiLiaoMapper.selectByExample(null);
        return list;
    }

    /**
     * 插入一条数据
     */
    public boolean insert(NongYeShengChanZiLiao nongYeShengChanZiLiao) {
        int n = nongYeShengChanZiLiaoMapper.insertSelective(nongYeShengChanZiLiao);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键查询
     */
    public NongYeShengChanZiLiao getNongYeShengChanZiLiaoByPrimaryKey(int id) {
        NongYeShengChanZiLiao nongYeShengChanZiLiao = nongYeShengChanZiLiaoMapper.selectByPrimaryKey(id);
        return nongYeShengChanZiLiao;
    }

    /**
     * 根据名称进行模糊查询,此方法未用
     */
    public List<NongYeShengChanZiLiao> getNongYeShengChanZiLiaoByMoHu(String biaoti) {
        NongYeShengChanZiLiaoExample example = new NongYeShengChanZiLiaoExample();
        example.setOrderByClause(" shijian desc");
        NongYeShengChanZiLiaoExample.Criteria criteria = example.createCriteria();
        criteria.andShangpinMingchengEqualTo(biaoti);
        List<NongYeShengChanZiLiao> list = nongYeShengChanZiLiaoMapper.selectByExample(example);
        return list;
    }

    /**
     * 根据商品名称和规格等级查询，返回全部数据，升序
     */
    public List<NongYeShengChanZiLiao> getNongYeShengChanZiLiaoByMoHus(List<String> lists,List<String> dengjis) {
        List<NongYeShengChanZiLiao> listAll=new ArrayList<NongYeShengChanZiLiao>();
         for(int i=0;i<lists.size();i++){
            NongYeShengChanZiLiaoExample example=new NongYeShengChanZiLiaoExample();
            example.setOrderByClause(" shijian asc");
            NongYeShengChanZiLiaoExample.Criteria criteria=example.createCriteria();
            criteria.andShangpinMingchengEqualTo(lists.get(i));
            criteria.andGuiGeDengJiEqualTo(dengjis.get(i));
            List<NongYeShengChanZiLiao> list = nongYeShengChanZiLiaoMapper.selectByExample(example);
            if(list.size()>0)
                listAll.addAll(list);
        }
        return listAll;
    }


    /**
     * 根据多个商品名称和规格等级进行查询，每种返回最新的七条数据,每组数据升序
     */
    public List<NongYeShengChanZiLiao> getNYSCZLByMoHuReturnSeven(List<String> lists,List<String> dengjis) {
        List<NongYeShengChanZiLiao> listAll=new ArrayList<NongYeShengChanZiLiao>();
        for(int i=0;i<lists.size();i++){
            NongYeShengChanZiLiaoExample example=new NongYeShengChanZiLiaoExample();
            example.setOrderByClause(" shijian desc ");
            NongYeShengChanZiLiaoExample.Criteria criteria=example.createCriteria();
            criteria.andShangpinMingchengEqualTo(lists.get(i));
            criteria.andGuiGeDengJiEqualTo(dengjis.get(i));
            List<NongYeShengChanZiLiao> list = nongYeShengChanZiLiaoMapper.selectByExample(example);
            if(list.size()>0){
                List<NongYeShengChanZiLiao> listee=list.subList(0,7);
//                Collections.reverse(listee);
                listAll.addAll(listee);
            }
        }
        return listAll;
    }




    /**
     * 根据商品名称查询，返回全部数据，升序
     */
    public List<NongYeShengChanZiLiao> getNongYeShengChanZiLiaoByMoHuAndMingCheng(List<String> lists) {
        List<NongYeShengChanZiLiao> listAll=new ArrayList<NongYeShengChanZiLiao>();
        for(int i=0;i<lists.size();i++){
            NongYeShengChanZiLiaoExample example=new NongYeShengChanZiLiaoExample();
            example.setOrderByClause(" shijian asc");
            NongYeShengChanZiLiaoExample.Criteria criteria=example.createCriteria();
            criteria.andShangpinMingchengEqualTo(lists.get(i));
            List<NongYeShengChanZiLiao> list = nongYeShengChanZiLiaoMapper.selectByExample(example);
            if(list.size()>0)
                listAll.addAll(list);
        }
        return listAll;
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
     * 根据主键进行批量删除
     */
    public boolean deleteAllByPrimaryKey(List<Integer> ids) {
        NongYeShengChanZiLiaoExample example = new NongYeShengChanZiLiaoExample();
        NongYeShengChanZiLiaoExample.Criteria criteria = example.createCriteria();
        criteria.andShangPinIdIn(ids);
        int n = nongYeShengChanZiLiaoMapper.deleteByExample(example);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键更新一条数据
     */
    public boolean updateByPrimaryKey(NongYeShengChanZiLiao nongYeShengChanZiLiao) {
        int n = nongYeShengChanZiLiaoMapper.updateByPrimaryKeySelective(nongYeShengChanZiLiao);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据名称查询出一条数据
     * @param mingcheng
     * @return
     */
    public NongYeShengChanZiLiao selectTypeOne(String mingcheng){
        NongYeShengChanZiLiao nongYeShengChanZiLiao=nongYeShengChanZiLiaoMapper.selectTypeOne(mingcheng);
        return  nongYeShengChanZiLiao;
    }
    /**
     * 多个名称同时查询
     */
    public List<NongYeShengChanZiLiao> selectByMingCheng(List<String> list) {
        NongYeShengChanZiLiaoExample example = new NongYeShengChanZiLiaoExample();
        NongYeShengChanZiLiaoExample.Criteria criteria = example.createCriteria();
        criteria.andShangpinMingchengIn(list);
        List<NongYeShengChanZiLiao> lists = nongYeShengChanZiLiaoMapper.selectByExample(example);
        return lists;
    }

    /**
     * 查询从当前时间到过去某一时刻的数据
     */
    public List<NongYeShengChanZiLiao> selectByTimes(){
        List<NongYeShengChanZiLiao> list=nongYeShengChanZiLiaoMapper.selectByTimes();
        return list;
    }

    /**
     * 查询出所有的时间
     */
    public List<String> slectTimes(){
        List<String> list=nongYeShengChanZiLiaoMapper.slectTimes();
        return  list;
    }

    /**
     *   根据具体时间查询数据
     */
    public List<NongYeShengChanZiLiao> getDataByTime(Date time){
        NongYeShengChanZiLiaoExample example=new NongYeShengChanZiLiaoExample();
        NongYeShengChanZiLiaoExample.Criteria criteria=example.createCriteria();
        criteria.andShijianEqualTo(time);
        List<NongYeShengChanZiLiao> list=nongYeShengChanZiLiaoMapper.selectByExample(example);
        return list;
    }

    /**
     * 根据时间删除数据
     */
    public boolean deleteByTime(Date time){
        NongYeShengChanZiLiaoExample example=new NongYeShengChanZiLiaoExample();
        NongYeShengChanZiLiaoExample.Criteria criteria=example.createCriteria();
        criteria.andShijianEqualTo(time);
        int a=nongYeShengChanZiLiaoMapper.deleteByExample(example);
        if(a>0)
            return true;
        return false;
    }
}
