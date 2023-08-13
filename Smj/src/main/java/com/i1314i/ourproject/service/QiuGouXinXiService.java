package com.i1314i.ourproject.service;

import com.i1314i.ourproject.mapper.HuiNongChanPinZhongLeiMapper;
import com.i1314i.ourproject.mapper.QiuGouXinXiMapper;
import com.i1314i.ourproject.po.javabean.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author 叹久
 * @create 2018-12-20 10:01
 */
@Service
public class QiuGouXinXiService {
    @Autowired
    QiuGouXinXiMapper qiuGouXinXiMapper;
    @Autowired
    HuiNongChanPinZhongLeiService huiNongChanPinZhongLeiService;

    /**
     * 获得所有数据
     *
     * @return
     */
    public List<QiuGouXinXi> getAll() {
        List<QiuGouXinXi> list = qiuGouXinXiMapper.selectByExample(null);
        return list;
    }


    /**
     * 获得所有审核通过的数据
     *
     * @return
     */
    public List<QiuGouXinXi> getTongGuoData() {
        QiuGouXinXiExample example = new QiuGouXinXiExample();
        QiuGouXinXiExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause(" time desc ");
        criteria.andShenheEqualTo("true");
        List<QiuGouXinXi> list = qiuGouXinXiMapper.selectByExample(example);
        return list;
    }

    /**
     * 获得所有待审核通过的数据
     *
     * @return
     */
    public List<QiuGouXinXi> getBuTongGuoData() {
        QiuGouXinXiExample example = new QiuGouXinXiExample();
        QiuGouXinXiExample.Criteria criteria = example.createCriteria();
        criteria.andShenheEqualTo("false");
        example.setOrderByClause(" time desc ");
        List<QiuGouXinXi> list = qiuGouXinXiMapper.selectByExample(example);
        return list;
    }

    /**
     * 获得所有未审核通过的数据
     *
     * @return
     */
    public List<QiuGouXinXi> getWeiTongGuoData() {
        QiuGouXinXiExample example = new QiuGouXinXiExample();
        QiuGouXinXiExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause(" time desc ");
        criteria.andShenheEqualTo("wait");
        List<QiuGouXinXi> list = qiuGouXinXiMapper.selectByExample(example);
        return list;
    }

    /**
     * 插入一条数据,从产品-种类表中查出类别插入
     */
    public boolean insert(QiuGouXinXi qiuGouXinXi) {
        qiuGouXinXi.setTime(new Date());
        System.out.println(new Date());
        if (qiuGouXinXi.getChanPinMingCheng() != null) {
            HuiNongChanPinZhongLei huiNongChanPinZhongLei = huiNongChanPinZhongLeiService.getDataByMingCheng(qiuGouXinXi.getChanPinMingCheng());
            if (huiNongChanPinZhongLei != null && huiNongChanPinZhongLei.getLeiBie() != null)
                qiuGouXinXi.setBeiyong3(huiNongChanPinZhongLei.getLeiBie());
        }
        int n = qiuGouXinXiMapper.insertSelective(qiuGouXinXi);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键查询
     */
    public QiuGouXinXi getQiuGouXinXiByPrimaryKey(int id) {
        QiuGouXinXi qiuGouXinXi = qiuGouXinXiMapper.selectByPrimaryKey(id);
        return qiuGouXinXi;
    }

    /**
     * 根据多个名称进行模糊查询审核通过的数据
     */
    public List<QiuGouXinXi> getQiuGouXinXiByMoHu(List<String> lists) {
        List<QiuGouXinXi> listAll = new ArrayList<QiuGouXinXi>();
        for (String aaa : lists) {
            QiuGouXinXiExample example = new QiuGouXinXiExample();
            example.setOrderByClause(" time desc ");
            QiuGouXinXiExample.Criteria criteria = example.createCriteria();
            criteria.andChanPinMingChengLike("%" + aaa + "%");
            criteria.andShenheEqualTo("true");
            List<QiuGouXinXi> list = qiuGouXinXiMapper.selectByExample(example);
            if (list.size() > 0)
                listAll.addAll(list);
        }
        return listAll;
    }

    /**
     * 删除一条数据
     */
    public boolean deleteOneByPrimaryKey(int id) {
        int n = qiuGouXinXiMapper.deleteByPrimaryKey(id);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键进行批量删除
     */
    public boolean deleteAllByPrimaryKey(List<Integer> ids) {
        QiuGouXinXiExample example = new QiuGouXinXiExample();
        QiuGouXinXiExample.Criteria criteria = example.createCriteria();
        criteria.andQiuGouIdIn(ids);
        int n = qiuGouXinXiMapper.deleteByExample(example);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键更新一条数据，从产品-种类表中查出类别插入
     */
    public boolean updateByPrimaryKey(QiuGouXinXi qiuGouXinXi) {
        if (qiuGouXinXi.getChanPinMingCheng() != null) {
            HuiNongChanPinZhongLei huiNongChanPinZhongLei = huiNongChanPinZhongLeiService.getDataByMingCheng(qiuGouXinXi.getChanPinMingCheng());
            if (huiNongChanPinZhongLei != null && huiNongChanPinZhongLei.getLeiBie() != null)
                qiuGouXinXi.setBeiyong3(huiNongChanPinZhongLei.getLeiBie());
        }
        int n = qiuGouXinXiMapper.updateByPrimaryKeySelective(qiuGouXinXi);
        if (n > 0)
            return true;
        return false;
    }


    /**
     * 根据类别返回数据
     */
    public List<QiuGouXinXi> getDataByLeiBie(List<String> lists) {
        List<QiuGouXinXi> listAll=new ArrayList<QiuGouXinXi>();
        for(int i=0;i<lists.size();i++){
            QiuGouXinXiExample example=new QiuGouXinXiExample();
            example.setOrderByClause(" time desc ");
            QiuGouXinXiExample.Criteria criteria=example.createCriteria();
            criteria.andBeiyong3EqualTo(lists.get(i));
            List<QiuGouXinXi> list = qiuGouXinXiMapper.selectByExample(example);
            if(list.size()>0)
                listAll.addAll(list);
        }
        return listAll;
    }
}
