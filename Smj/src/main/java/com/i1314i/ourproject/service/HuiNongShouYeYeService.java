package com.i1314i.ourproject.service;

import com.i1314i.ourproject.mapper.HuiNongShouYeMapper;
import com.i1314i.ourproject.po.javabean.HuiNongShouYe;
import com.i1314i.ourproject.po.javabean.HuiNongShouYeExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @author 叹久
 * @create 2019-03-05 17:05
 */
@Service
public class HuiNongShouYeYeService {
    @Autowired
    private HuiNongShouYeMapper huiNongShouYeMapper;



    /**
     * 插入一条数据
     * 所有数据插入时必须要有名称，雨量分析要有年份，棕壤土的数据必须要有xi_type字段，保证只有一条数据
     */
    public boolean insert(HuiNongShouYe huiNongShouYe) {

        //判断如果存在该条数据，就删除后加入
        HuiNongShouYeExample example = new HuiNongShouYeExample();
        HuiNongShouYeExample.Criteria criteria = example.createCriteria();
        criteria.andDaTypeEqualTo(huiNongShouYe.getDaType());
        criteria.andMingChengEqualTo(huiNongShouYe.getMingCheng());
        if(huiNongShouYe.getXiType()!=null&&huiNongShouYe.getXiType()!=""){
            criteria.andXiTypeEqualTo(huiNongShouYe.getXiType());
        }
        //降雨量，根据年份判断，每个地区每个年份的数据只能有一条
        if(huiNongShouYe.getTime()!=null&&!"".equals(huiNongShouYe.getTime())){
            criteria.andTimeEqualTo(huiNongShouYe.getTime());
        }
        List<HuiNongShouYe> list = huiNongShouYeMapper.selectByExample(example);
        if (list.size() > 0) {
            huiNongShouYeMapper.deleteByExample(example);
        }
        int n = huiNongShouYeMapper.insertSelective(huiNongShouYe);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据大类来获取数据
     */
    public List<HuiNongShouYe> getDataByDaType(String dalei){
        HuiNongShouYeExample example = new HuiNongShouYeExample();
        HuiNongShouYeExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause("  xin_xi_id desc ");
        criteria.andDaTypeEqualTo(dalei);
        List<HuiNongShouYe> list = huiNongShouYeMapper.selectByExample(example);
        return list;
    }

    /**
     * 根据大类和名称来获取数据
     */
    public List<HuiNongShouYe> getDataByPageAndMC(String dalei,String mingcheng){
        HuiNongShouYeExample example = new HuiNongShouYeExample();
        HuiNongShouYeExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause("  xin_xi_id desc ");
        criteria.andDaTypeEqualTo(dalei);
        criteria.andMingChengEqualTo(mingcheng);
        List<HuiNongShouYe> list = huiNongShouYeMapper.selectByExample(example);
        return list;
    }
    /**
     * 根据主键查询
     */
    public HuiNongShouYe getHuiNongShouYeByPrimaryKey(int id) {
        HuiNongShouYeExample example = new HuiNongShouYeExample();
        HuiNongShouYeExample.Criteria criteria = example.createCriteria();
        criteria.andXinXiIdEqualTo(id);
        List<HuiNongShouYe> list = huiNongShouYeMapper.selectByExample(example);
        if (list.size() > 0)
            return list.get(0);
        return null;
    }


    /**
     * 删除一条数据
     */
    public boolean deleteOneByPrimaryKey(int id) {
        HuiNongShouYeExample example = new HuiNongShouYeExample();
        HuiNongShouYeExample.Criteria criteria = example.createCriteria();
        criteria.andXinXiIdEqualTo(id);
        int n = huiNongShouYeMapper.deleteByExample(example);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键进行批量删除
     */
    public boolean deleteAllByPrimaryKey(List<Integer> ids) {
        HuiNongShouYeExample example = new HuiNongShouYeExample();
        HuiNongShouYeExample.Criteria criteria = example.createCriteria();
        criteria.andXinXiIdIn(ids);
        int n = huiNongShouYeMapper.deleteByExample(example);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键更新一条数据
     */
    public boolean updateByPrimaryKey(HuiNongShouYe huiNongShouYe) {
        HuiNongShouYeExample example = new HuiNongShouYeExample();
        HuiNongShouYeExample.Criteria criteria = example.createCriteria();
        criteria.andXinXiIdEqualTo(huiNongShouYe.getXinXiId());
        int n = huiNongShouYeMapper.updateByPrimaryKeySelective(huiNongShouYe);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据大类别更新数据的标题
     */
    public boolean updateByDaLeiBie(String biaoti,String dalei){
        int n = huiNongShouYeMapper.updateByDaLeiBie(biaoti,dalei);
        if (n > 0)
            return true;
        return false;
    }
}
