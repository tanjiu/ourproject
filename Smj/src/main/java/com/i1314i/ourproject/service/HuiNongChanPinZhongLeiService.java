package com.i1314i.ourproject.service;

import com.i1314i.ourproject.mapper.HuiNongChanPinZhongLeiMapper;
import com.i1314i.ourproject.po.javabean.HuiNongChanPinZhongLei;
import com.i1314i.ourproject.po.javabean.HuiNongChanPinZhongLeiExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 叹久
 * @create 2019-03-27 19:27
 */
@Service
public class HuiNongChanPinZhongLeiService {
    @Autowired
    HuiNongChanPinZhongLeiMapper huiNongChanPinZhongLeiMapper;

    /**
     * 获得所有数据
     *
     * @return
     */
    public List<HuiNongChanPinZhongLei> getAll() {
        List<HuiNongChanPinZhongLei> list = huiNongChanPinZhongLeiMapper.selectByExample(null);
        return list;
    }

    /**
     * 插入一条数据,根据名称判断和类别判断，如果已经存在，就删除，保证只有一条数据
     */
    public boolean insert(HuiNongChanPinZhongLei huiNongChanPinZhongLei) {
        //先删除
        HuiNongChanPinZhongLeiExample example=new HuiNongChanPinZhongLeiExample();
        HuiNongChanPinZhongLeiExample.Criteria criteria=example.createCriteria();
        criteria.andChanPinMingChengEqualTo(huiNongChanPinZhongLei.getChanPinMingCheng());
        criteria.andLeiBieEqualTo(huiNongChanPinZhongLei.getLeiBie());
        huiNongChanPinZhongLeiMapper.deleteByExample(example);
        //后插入
        int n = huiNongChanPinZhongLeiMapper.insertSelective(huiNongChanPinZhongLei);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键查询
     */
    public HuiNongChanPinZhongLei getHuiNongChanPinZhongLeiByPrimaryKey(int id) {
        HuiNongChanPinZhongLei huiNongChanPinZhongLei = huiNongChanPinZhongLeiMapper.selectByPrimaryKey(id);
        return huiNongChanPinZhongLei;
    }


    /**
     * 删除一条数据
     */
    public boolean deleteOneByPrimaryKey(int id) {
        int n = huiNongChanPinZhongLeiMapper.deleteByPrimaryKey(id);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键进行批量删除
     */
    public boolean deleteAllByPrimaryKey(List<Integer> ids) {
        HuiNongChanPinZhongLeiExample example = new HuiNongChanPinZhongLeiExample();
        HuiNongChanPinZhongLeiExample.Criteria criteria = example.createCriteria();
        criteria.andChanPinZhongLeiIdIn(ids);
        int n = huiNongChanPinZhongLeiMapper.deleteByExample(example);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键更新一条数据
     */
    public boolean updateByPrimaryKey(HuiNongChanPinZhongLei huiNongChanPinZhongLei) {
        int n = huiNongChanPinZhongLeiMapper.updateByPrimaryKeySelective(huiNongChanPinZhongLei);
        if (n > 0)
            return true;
        return false;
    }


    /**
     * 根据名称返回数据
     */
    public HuiNongChanPinZhongLei getDataByMingCheng(String mingcheng) {
        HuiNongChanPinZhongLeiExample example = new HuiNongChanPinZhongLeiExample();
        HuiNongChanPinZhongLeiExample.Criteria criteria = example.createCriteria();
        criteria.andChanPinMingChengEqualTo(mingcheng);
        List<HuiNongChanPinZhongLei> list = huiNongChanPinZhongLeiMapper.selectByExample(example);
        if (list.size() > 0)
            return list.get(0);
        return null;
    }


}
