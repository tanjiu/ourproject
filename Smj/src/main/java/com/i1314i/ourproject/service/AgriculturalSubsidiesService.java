package com.i1314i.ourproject.service;

import com.i1314i.ourproject.mapper.AgriculturalSubsidiesMapper;
import com.i1314i.ourproject.po.javabean.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author 叹久
 * @create 2018-10-03 11:48
 */
@Service
public class AgriculturalSubsidiesService {
    @Autowired
    private AgriculturalSubsidiesMapper agriculturalSubsidiesMapper;

    /**
     * 管理端获得所有数据
     *
     * @return
     */
    public List<AgriculturalSubsidies> getAllAdmin(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        Integer bumen = (Integer) session.getAttribute("fdepid");
        if (bumen == 0 || bumen == null) {
            AgriculturalSubsidiesExample agriculturalPolicyExample = new AgriculturalSubsidiesExample();
            agriculturalPolicyExample.setOrderByClause(" fabu_shijian desc ");
            List<AgriculturalSubsidies> list = agriculturalSubsidiesMapper.selectByExample(agriculturalPolicyExample);
            return list;
        } else {
            AgriculturalSubsidiesExample agriculturalPolicyExample = new AgriculturalSubsidiesExample();
            AgriculturalSubsidiesExample.Criteria criteria = agriculturalPolicyExample.createCriteria();
            criteria.andBumenEqualTo(bumen);
            agriculturalPolicyExample.setOrderByClause(" fabu_shijian desc ");
            List<AgriculturalSubsidies> list = agriculturalSubsidiesMapper.selectByExample(agriculturalPolicyExample);
            return list;
        }
    }

    /**
     * 获得所有数据
     *
     * @return
     */
    public List<AgriculturalSubsidies> getAll() {
        AgriculturalSubsidiesExample agriculturalPolicyExample = new AgriculturalSubsidiesExample();
        agriculturalPolicyExample.setOrderByClause(" fabu_shijian desc ");
        List<AgriculturalSubsidies> list = agriculturalSubsidiesMapper.selectByExample(agriculturalPolicyExample);
        return list;
    }

    /**
     * 插入一条数据
     */
    public boolean insert(AgriculturalSubsidies agriculturalSubsidies, HttpServletRequest request) {
//        HttpSession session = request.getSession(false);
//        Integer bumen = (Integer) session.getAttribute("fdepid");
//        if (bumen != 0 && bumen != null) {
//            agriculturalSubsidies.setBumen(bumen);
//        } else {
//            agriculturalSubsidies.setBumen(0);
//        }
        int n = agriculturalSubsidiesMapper.insertSelective(agriculturalSubsidies);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键查询
     */
    public AgriculturalSubsidies getDataByPrimaryKey(int id) {
        AgriculturalSubsidies agriculturalSubsidies = agriculturalSubsidiesMapper.selectByPrimaryKey(id);
        return agriculturalSubsidies;
    }

    /**
     * 根据标题进行模糊查询
     */
    public List<AgriculturalSubsidies> getDataByMoHu(String biaoti) {
        AgriculturalSubsidiesExample example = new AgriculturalSubsidiesExample();
        AgriculturalSubsidiesExample.Criteria criteria = example.createCriteria();
        criteria.andNameLike("%" + biaoti + "%");
        List<AgriculturalSubsidies> list = agriculturalSubsidiesMapper.selectByExample
                (example);
        return list;
    }

    /**
     * 删除一条数据
     */
    public boolean deleteOneByPrimaryKey(int id) {
        int n = agriculturalSubsidiesMapper.deleteByPrimaryKey(id);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键进行批量删除
     */
    public boolean deleteAllByPrimaryKey(List<Integer> ids) {
        AgriculturalSubsidiesExample example = new AgriculturalSubsidiesExample();
        AgriculturalSubsidiesExample.Criteria criteria = example.createCriteria();
        criteria.andButieIdIn(ids);
        int n = agriculturalSubsidiesMapper.deleteByExample(example);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键更新一条数据
     */
    public boolean updateByPrimaryKey(AgriculturalSubsidies agriculturalSubsidies, HttpServletRequest request) {
//        HttpSession session = request.getSession(false);
//        Integer bumen = (Integer) session.getAttribute("fdepid");
//        if (bumen != 0 && bumen != null) {
//            agriculturalSubsidies.setBumen(bumen);
//        } else {
//            agriculturalSubsidies.setBumen(0);
//        }
        int n = agriculturalSubsidiesMapper.updateByPrimaryKeySelective(agriculturalSubsidies);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据发放单位查询数据(精确）
     */
    public List<AgriculturalSubsidies> getDataByDanWei(String danwei) {
        AgriculturalSubsidiesExample example = new AgriculturalSubsidiesExample();
        AgriculturalSubsidiesExample.Criteria criteria = example.createCriteria();
        criteria.andFangfangdanweiEqualTo(danwei);
        List<AgriculturalSubsidies> list = agriculturalSubsidiesMapper.selectByExample
                (example);
        return list;
    }


    /**
     * 根据发放时间范围或者发放金额范围或者信息发布时间来检索
     */
    public List<AgriculturalSubsidies> getSouSuo(SouSuo souSuo) {
        AgriculturalSubsidiesExample example = new AgriculturalSubsidiesExample();
        AgriculturalSubsidiesExample.Criteria criteria = example.createCriteria();
        //对发放时间和Money和信息发布时间字段进行判断，是否为空
        if (souSuo.getMoney().size() != 0) {
            if (souSuo.getMoney().size() == 1) {
                criteria.andMoneyEqualTo(souSuo.getMoney().get(0));
            } else if (souSuo.getMoney().size() == 2) {
                criteria.andMoneyBetween(souSuo.getMoney().get(0), souSuo.getMoney().get(1));
            }
        }

        if (souSuo.getFafangtime().size() != 0) {
            if (souSuo.getFafangtime().size() == 1) {
                criteria.andFafangtimeEqualTo(souSuo.getFafangtime().get(0));
            } else if (souSuo.getFafangtime().size() == 2) {
                criteria.andFafangtimeBetween(souSuo.getFafangtime().get(0), souSuo.getFafangtime().get(1));
            }
        }
        if (souSuo.getFabuShijian().size() != 0) {
            if (souSuo.getFabuShijian().size() == 1) {
                criteria.andFabuShijianEqualTo(souSuo.getFabuShijian().get(0));
            } else if (souSuo.getFabuShijian().size() == 2) {
                criteria.andFabuShijianBetween(souSuo.getFabuShijian().get(0), souSuo.getFabuShijian().get(1));
            }
        }
        List<AgriculturalSubsidies> list = agriculturalSubsidiesMapper.selectByExample
                (example);
        return list;
    }


    public List<AgriculturalSubsidies> getByDateDesc() {
        AgriculturalSubsidiesExample agriculturalSubsidiesExample = new AgriculturalSubsidiesExample();
        agriculturalSubsidiesExample.setOrderByClause(" fabu_shijian desc");
        return agriculturalSubsidiesMapper.selectByExample(agriculturalSubsidiesExample);

    }

    /**
     * 返回数据库中数据的条数
     */
    public int selectCountAll(){
       int a= agriculturalSubsidiesMapper.selectCountAll();
       return a;
    }


}
