package com.i1314i.ourproject.service;

import com.i1314i.ourproject.mapper.ShuiLiSheShiMapper;
import com.i1314i.ourproject.po.javabean.ShuiLiSheShi;
import com.i1314i.ourproject.po.javabean.ShuiLiSheShiExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author 叹久
 * @create 2019-03-05 10:05
 */
@Service
public class ShuiLiSheShiService {
//    @Autowired
//    private ShuiLiSheShiMapper shuiLiSheShiMapper;
//
//    /**
//     * 管理端获得所有数据
//     *
//     * @return
//     */
//    public List<ShuiLiSheShi> getAllAdmin(HttpServletRequest request) {
//        HttpSession session = request.getSession(false);
//        Integer bumen = (Integer) session.getAttribute("fdepid");
//        if (bumen == 0 || bumen == null) {
//            ShuiLiSheShiExample shuiLiSheShiExample = new ShuiLiSheShiExample();
//            List<ShuiLiSheShi> list = shuiLiSheShiMapper.selectByExample(null);
//            return list;
//        } else {
//            ShuiLiSheShiExample shuiLiSheShiExample = new ShuiLiSheShiExample();
//            List<ShuiLiSheShi> list = shuiLiSheShiMapper.selectByExample(null);
//            return list;
//        }
//    }

//    /**
//     * 获得所有数据
//     *
//     * @return
//     */
//    public List<ShuiLiSheShi> getAll() {
//        ShuiLiSheShiExample shuiLiSheShiExample = new ShuiLiSheShiExample();
//        ShuiLiSheShiExample.Criteria criteria = shuiLiSheShiExample.createCriteria();
//        List<ShuiLiSheShi> list = shuiLiSheShiMapper.selectByExample(null);
//        return list;
//    }

//    /**
//     * 插入一条数据
//     */
//    public boolean insert(ShuiLiSheShi shuiLiSheShi) {
////        HttpSession session = request.getSession(false);
////        Integer bumen = (Integer) session.getAttribute("fdepid");
////        if (bumen != 0 && bumen != null) {
////            shuiLiSheShi.setBumen(bumen);
////        } else {
////            shuiLiSheShi.setBumen(0);
////        }
//        //判断如果存在该条数据，就删除后加入
//        ShuiLiSheShiExample example = new ShuiLiSheShiExample();
//        ShuiLiSheShiExample.Criteria criteria = example.createCriteria();
//        criteria.andShengChuMingChengEqualTo(shuiLiSheShi.getShengChuMingCheng());
//        List<ShuiLiSheShi> list = shuiLiSheShiMapper.selectByExample(example);
//        if (list.size() > 0) {
//            shuiLiSheShiMapper.deleteByExample(example);
//        }
//        int n = shuiLiSheShiMapper.insertSelective(shuiLiSheShi);
//        if (n > 0)
//            return true;
//        return false;
//    }
//
//    /**
//     * 根据主键查询
//     */
//    public ShuiLiSheShi getShuiLiSheShiByPrimaryKey(int id) {
//        ShuiLiSheShiExample example = new ShuiLiSheShiExample();
//        ShuiLiSheShiExample.Criteria criteria = example.createCriteria();
//        criteria.andShengChuIdEqualTo(id);
//        List<ShuiLiSheShi> list = shuiLiSheShiMapper.selectByExample(example);
//        if (list.size() > 0)
//            return list.get(0);
//        return null;
//    }


//    /**
//     * 删除一条数据
//     */
//    public boolean deleteOneByPrimaryKey(int id) {
//        ShuiLiSheShiExample example = new ShuiLiSheShiExample();
//        ShuiLiSheShiExample.Criteria criteria = example.createCriteria();
//        criteria.andShengChuIdEqualTo(id);
//        int n = shuiLiSheShiMapper.deleteByExample(example);
//        if (n > 0)
//            return true;
//        return false;
//    }
//
//    /**
//     * 根据主键进行批量删除
//     */
//    public boolean deleteAllByPrimaryKey(List<Integer> ids) {
//        ShuiLiSheShiExample example = new ShuiLiSheShiExample();
//        ShuiLiSheShiExample.Criteria criteria = example.createCriteria();
//        criteria.andShengChuIdIn(ids);
//        int n = shuiLiSheShiMapper.deleteByExample(example);
//        if (n > 0)
//            return true;
//        return false;
//    }

//    /**
//     * 根据主键更新一条数据
//     */
//    public boolean updateByPrimaryKey(ShuiLiSheShi shuiLiSheShi, HttpServletRequest request) {
//        HttpSession session = request.getSession(false);
//        Integer bumen = (Integer) session.getAttribute("fdepid");
//        ShuiLiSheShiExample example = new ShuiLiSheShiExample();
//        ShuiLiSheShiExample.Criteria criteria = example.createCriteria();
//        criteria.andShengChuIdEqualTo(shuiLiSheShi.getShengChuId());
//        int n = shuiLiSheShiMapper.updateByPrimaryKeySelective(shuiLiSheShi);
//        if (n > 0)
//            return true;
//        return false;
//    }
//
}
