package com.i1314i.ourproject.service;


import com.i1314i.ourproject.mapper.AgriculturalPolicyMapper;
import com.i1314i.ourproject.po.javabean.AgriculturalPolicy;
import com.i1314i.ourproject.po.javabean.AgriculturalPolicyExample;
import com.i1314i.ourproject.po.javabean.CountType;
import net.sf.ehcache.search.aggregator.Count;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author 叹久
 * @create 2018-10-03 10:03
 */
@Service("agriculturalPolicyService")
public class AgriculturalPolicyService {

    @Autowired
    private AgriculturalPolicyMapper agriculturalPolicyMapper;

    /**
     * 管理端获得所有数据
     *
     * @return
     */
    public List<AgriculturalPolicy> getAllAdmin(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        Integer bumen = (Integer) session.getAttribute("fdepid");
        if (bumen == 0 || bumen == null) {
            AgriculturalPolicyExample agriculturalPolicyExample = new AgriculturalPolicyExample();
            agriculturalPolicyExample.setOrderByClause(" fabushijian desc ");
            List<AgriculturalPolicy> list = agriculturalPolicyMapper.selectByExample(agriculturalPolicyExample);
            return list;
        } else {
            AgriculturalPolicyExample agriculturalPolicyExample = new AgriculturalPolicyExample();
            AgriculturalPolicyExample.Criteria criteria = agriculturalPolicyExample.createCriteria();
            criteria.andBumenEqualTo(bumen);
            agriculturalPolicyExample.setOrderByClause(" fabushijian desc ");
            List<AgriculturalPolicy> list = agriculturalPolicyMapper.selectByExample(agriculturalPolicyExample);
            return list;
        }
    }

    /**
     * 获得所有数据
     *
     * @return
     */
    public List<AgriculturalPolicy> getAll() {
            AgriculturalPolicyExample agriculturalPolicyExample = new AgriculturalPolicyExample();
            AgriculturalPolicyExample.Criteria criteria = agriculturalPolicyExample.createCriteria();
            agriculturalPolicyExample.setOrderByClause(" fabushijian desc ");
            List<AgriculturalPolicy> list = agriculturalPolicyMapper.selectByExample(agriculturalPolicyExample);
            return list;
    }

    /**
     * 插入一条数据
     */
    public boolean insert(AgriculturalPolicy agriculturalPolicy, HttpServletRequest request) {
//        HttpSession session = request.getSession(false);
//        Integer bumen = (Integer) session.getAttribute("fdepid");
//        if (bumen != 0 && bumen != null) {
//            agriculturalPolicy.setBumen(bumen);
//        } else {
//            agriculturalPolicy.setBumen(0);
//        }
        int n = agriculturalPolicyMapper.insertSelective(agriculturalPolicy);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键查询
     */
    public AgriculturalPolicy getAgriculturalPolicyByPrimaryKey(int id) {
        AgriculturalPolicy agriculturalPolicy = agriculturalPolicyMapper.selectByPrimaryKey(id);
        return agriculturalPolicy;
    }

    /**
     * 根据标题进行模糊查询
     */
    public List<AgriculturalPolicy> getAgriculturalPolicyByMoHu(String biaoti) {
        AgriculturalPolicyExample example = new AgriculturalPolicyExample();
        AgriculturalPolicyExample.Criteria criteria = example.createCriteria();
        criteria.andNameLike("%" + biaoti + "%");
        List<AgriculturalPolicy> list = agriculturalPolicyMapper.selectByExample(example);
        return list;
    }

    /**
     * 删除一条数据
     */
    public boolean deleteOneByPrimaryKey(int id) {
        int n = agriculturalPolicyMapper.deleteByPrimaryKey(id);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键进行批量删除
     */
    public boolean deleteAllByPrimaryKey(List<Integer> ids) {
        AgriculturalPolicyExample example = new AgriculturalPolicyExample();
        AgriculturalPolicyExample.Criteria criteria = example.createCriteria();
        criteria.andZhengceIdIn(ids);
        int n = agriculturalPolicyMapper.deleteByExample(example);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键更新一条数据
     */
    public boolean updateByPrimaryKey(AgriculturalPolicy agriculturalPolicy, HttpServletRequest request) {
//        HttpSession session = request.getSession(false);
//        Integer bumen = (Integer) session.getAttribute("fdepid");
//        if (bumen != 0 && bumen != null) {
//            agriculturalPolicy.setBumen(bumen);
//        } else {
//            agriculturalPolicy.setBumen(0);
//        }
        int n = agriculturalPolicyMapper.updateByPrimaryKeySelective(agriculturalPolicy);
        if (n > 0)
            return true;
        return false;
    }
    /**
     * 管理端根据类型查询数据
     */
    public List<AgriculturalPolicy> selectByTypeAdmin(String leixing, HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        Integer bumen = (Integer) session.getAttribute("fdepid");
        AgriculturalPolicyExample agriculturalPolicyExample = new AgriculturalPolicyExample();
        AgriculturalPolicyExample.Criteria criteria = agriculturalPolicyExample.createCriteria();
        agriculturalPolicyExample.setOrderByClause(" fabushijian desc ");
//        if (bumen == 0 || bumen == null) {
//            criteria.andBumenEqualTo(bumen);
//        }
        criteria.andTypeEqualTo(leixing);
        List<AgriculturalPolicy> list = agriculturalPolicyMapper.selectByExample(agriculturalPolicyExample);
        return list;
    }

    /**
     * 根据类型查询数据
     */
    public List<AgriculturalPolicy> selectByType(String leixing) {
        AgriculturalPolicyExample agriculturalPolicyExample = new AgriculturalPolicyExample();
        AgriculturalPolicyExample.Criteria criteria = agriculturalPolicyExample.createCriteria();
        agriculturalPolicyExample.setOrderByClause(" fabushijian desc ");
        criteria.andTypeEqualTo(leixing);
        List<AgriculturalPolicy> list = agriculturalPolicyMapper.selectByExample(agriculturalPolicyExample);
        return list;
    }


    /**
     * 返回每种类型数据的个数
     */
    public List<CountType> selectCountByType(){
        List<CountType> list=agriculturalPolicyMapper.selectCountByType();
        return list;
    }
}