package com.i1314i.ourproject.service;

import com.i1314i.ourproject.mapper.JuMinShengHuoXiaoFeiPinCopy1Mapper;
import com.i1314i.ourproject.po.javabean.JuMinShengHuoXiaoFeiPinCopy1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 叹久
 * @create 2018-11-19 18:11
 */
@Service
public class JuMinShengHuoXiaoFeiPinServiceCopy1 {

    @Autowired
    private JuMinShengHuoXiaoFeiPinCopy1Mapper juMinShengHuoXiaoFeiPinMapper;

    /**
     * 获得所有数据
     *
     * @return
     */
    public List<JuMinShengHuoXiaoFeiPinCopy1> getAll() {
        List<JuMinShengHuoXiaoFeiPinCopy1> list = juMinShengHuoXiaoFeiPinMapper.selectByExample(null);
        return list;
    }

    /**
     * 插入一条数据
     */
    public boolean insert(JuMinShengHuoXiaoFeiPinCopy1 juMinShengHuoXiaoFeiPin) {
        int n = juMinShengHuoXiaoFeiPinMapper.insertSelective(juMinShengHuoXiaoFeiPin);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键查询
     */
    public JuMinShengHuoXiaoFeiPinCopy1 getJuMinShengHuoXiaoFeiPinByPrimaryKey(int id) {
        JuMinShengHuoXiaoFeiPinCopy1 juMinShengHuoXiaoFeiPin = juMinShengHuoXiaoFeiPinMapper.selectByPrimaryKey(id);
        return juMinShengHuoXiaoFeiPin;
    }



    /**
     * 删除一条数据
     */
    public boolean deleteOneByPrimaryKey(int id){
        int n=juMinShengHuoXiaoFeiPinMapper.deleteByPrimaryKey(id);
        if(n>0)
            return true;
        return false;
    }


    /**
     * 根据主键更新一条数据
     */
    public boolean updateByPrimaryKey(JuMinShengHuoXiaoFeiPinCopy1 juMinShengHuoXiaoFeiPin){
        int n=juMinShengHuoXiaoFeiPinMapper.updateByPrimaryKeySelective(juMinShengHuoXiaoFeiPin);
        if(n>0)
            return true;
        return false;
    }



}
