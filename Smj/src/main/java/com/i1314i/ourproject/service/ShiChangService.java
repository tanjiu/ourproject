package com.i1314i.ourproject.service;

import com.i1314i.ourproject.mapper.ShiChangXinXiMapper;
import com.i1314i.ourproject.po.javabean.ShiChangXinXi;
import com.i1314i.ourproject.po.javabean.ShiChangXinXiExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author 叹久
 * @create 2019-03-01 20:59
 */
@Service
public class ShiChangService {
    @Autowired
    private ShiChangXinXiMapper shiChangXinXiMapper;

    /**
     * 管理端获得所有数据
     *
     * @return
     */
    public List<ShiChangXinXi> getAllAdmin(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        Integer bumen = (Integer) session.getAttribute("fdepid");
        if (bumen == 0 || bumen == null) {
            ShiChangXinXiExample shiChangXinXiExample = new ShiChangXinXiExample();
            List<ShiChangXinXi> list = shiChangXinXiMapper.selectByExample(null);
            return list;
        } else {
            ShiChangXinXiExample shiChangXinXiExample = new ShiChangXinXiExample();
            List<ShiChangXinXi> list = shiChangXinXiMapper.selectByExample(null);
            return list;
        }
    }

    /**
     * 获得所有数据
     *
     * @return
     */
    public List<ShiChangXinXi> getAll() {
        ShiChangXinXiExample shiChangXinXiExample = new ShiChangXinXiExample();
        ShiChangXinXiExample.Criteria criteria = shiChangXinXiExample.createCriteria();
        List<ShiChangXinXi> list = shiChangXinXiMapper.selectByExample(null);
        return list;
    }

    /**
     * 插入一条数据
     */
    public boolean insert(ShiChangXinXi shiChangXinXi) {
//        HttpSession session = request.getSession(false);
//        Integer bumen = (Integer) session.getAttribute("fdepid");
//        if (bumen != 0 && bumen != null) {
//            shiChangXinXi.setBumen(bumen);
//        } else {
//            shiChangXinXi.setBumen(0);
//        }
        //判断如果存在该条数据，就删除后加入
        ShiChangXinXiExample example = new ShiChangXinXiExample();
        ShiChangXinXiExample.Criteria criteria = example.createCriteria();
        criteria.andZuoWuMingChengEqualTo(shiChangXinXi.getZuoWuMingCheng());
        List<ShiChangXinXi> list = shiChangXinXiMapper.selectByExample(example);
        if (list.size() > 0) {
            shiChangXinXiMapper.deleteByExample(example);
        }
        int n = shiChangXinXiMapper.insertSelective(shiChangXinXi);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键查询
     */
    public ShiChangXinXi getShiChangXinXiByPrimaryKey(int id) {
        ShiChangXinXiExample example = new ShiChangXinXiExample();
        ShiChangXinXiExample.Criteria criteria = example.createCriteria();
        criteria.andZuoWuIdEqualTo(id);
        List<ShiChangXinXi> list = shiChangXinXiMapper.selectByExample(example);
        if (list.size() > 0)
            return list.get(0);
        return null;
    }


    /**
     * 删除一条数据
     */
    public boolean deleteOneByPrimaryKey(int id) {
        ShiChangXinXiExample example = new ShiChangXinXiExample();
        ShiChangXinXiExample.Criteria criteria = example.createCriteria();
        criteria.andZuoWuIdEqualTo(id);
        int n = shiChangXinXiMapper.deleteByExample(example);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键进行批量删除
     */
    public boolean deleteAllByPrimaryKey(List<Integer> ids) {
        ShiChangXinXiExample example = new ShiChangXinXiExample();
        ShiChangXinXiExample.Criteria criteria = example.createCriteria();
        criteria.andZuoWuIdIn(ids);
        int n = shiChangXinXiMapper.deleteByExample(example);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键更新一条数据
     */
    public boolean updateByPrimaryKey(ShiChangXinXi shiChangXinXi, HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        Integer bumen = (Integer) session.getAttribute("fdepid");
        ShiChangXinXiExample example = new ShiChangXinXiExample();
        ShiChangXinXiExample.Criteria criteria = example.createCriteria();
        criteria.andZuoWuIdEqualTo(shiChangXinXi.getZuoWuId());
        int n = shiChangXinXiMapper.updateByPrimaryKeySelective(shiChangXinXi);
        if (n > 0)
            return true;
        return false;
    }

}
