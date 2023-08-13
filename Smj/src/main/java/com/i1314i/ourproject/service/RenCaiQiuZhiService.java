package com.i1314i.ourproject.service;


import com.i1314i.ourproject.mapper.RenCaiQiuZhiMapper;
import com.i1314i.ourproject.po.javabean.RenCaiQiuZhi;
import com.i1314i.ourproject.po.javabean.RenCaiQiuZhiExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 叹久
 * @create 2018-12-20 10:10
 */
@Service
public class RenCaiQiuZhiService {
    @Autowired
    RenCaiQiuZhiMapper renCaiQiuZhiMapper;
    @Autowired
    SheQuService sheQuService;
    /**
     * 获得所有数据
     *
     * @return
     */
    public List<RenCaiQiuZhi> getAll() {
        List<RenCaiQiuZhi> list = renCaiQiuZhiMapper.selectByExample(null);
//        for (RenCaiQiuZhi renCaiQiuZhi:list
//        ) {
//            if(renCaiQiuZhi.getGongzuodidian()!=null){
//                SheQu sheQu=sheQuService.getSheQuByPrimaryKeyAndJD(renCaiQiuZhi.getGongzuodidian());
//                if(sheQu!=null){
//                    renCaiQiuZhi.setJieDaoMingCheng(sheQu.getJieDaoMingCheng());
//                    renCaiQiuZhi.setSheQuMingCheng(sheQu.getSheQuMingCheng());
//                }
//            }
//        }
        return list;
    }


    /**
     * 获得所有审核通过的数据
     *
     * @return
     */
    public List<RenCaiQiuZhi> getTongGuoData() {
        RenCaiQiuZhiExample example=new RenCaiQiuZhiExample();
        RenCaiQiuZhiExample.Criteria criteria=example.createCriteria();
        criteria.andShenheEqualTo("true");
        example.setOrderByClause(" rencai_id desc");
        List<RenCaiQiuZhi> list = renCaiQiuZhiMapper.selectByExample(example);
        return list;
    }

    /**
     * 获得所有未审核通过的数据
     *
     * @return
     */
    public List<RenCaiQiuZhi> getWeiTongGuoData() {
        RenCaiQiuZhiExample example=new RenCaiQiuZhiExample();
        RenCaiQiuZhiExample.Criteria criteria=example.createCriteria();
        criteria.andShenheEqualTo("wait");
        example.setOrderByClause(" rencai_id desc");
        List<RenCaiQiuZhi> list = renCaiQiuZhiMapper.selectByExample(example);
        return list;
    }
    /**
     * 获得所有待审核通过的数据
     *
     * @return
     */
    public List<RenCaiQiuZhi> getBuTongGuoData() {
        RenCaiQiuZhiExample example=new RenCaiQiuZhiExample();
        RenCaiQiuZhiExample.Criteria criteria=example.createCriteria();
        criteria.andShenheEqualTo("false");
        example.setOrderByClause(" rencai_id desc");
        List<RenCaiQiuZhi> list = renCaiQiuZhiMapper.selectByExample(example);
        return list;
    }

    /**
     * 插入一条数据
     */
    public boolean insert(RenCaiQiuZhi gongYingXinXi) {
        int n = renCaiQiuZhiMapper.insertSelective(gongYingXinXi);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键查询
     */
    public RenCaiQiuZhi getRenCaiQiuZhiByPrimaryKey(int id) {
        RenCaiQiuZhi gongYingXinXi = renCaiQiuZhiMapper.selectByPrimaryKey(id);
        return gongYingXinXi;
    }

    /**
     * 根据职位进行模糊查询审核通过的
     */
    public List<RenCaiQiuZhi> getRenCaiQiuZhiByZhiWei(String biaoti) {
        RenCaiQiuZhiExample example=new RenCaiQiuZhiExample();
        RenCaiQiuZhiExample.Criteria criteria=example.createCriteria();
        criteria.andQiuzhifangxiangLike("%"+biaoti+"%");
        criteria.andShenheEqualTo("true");
        example.setOrderByClause(" rencai_id desc");
        List<RenCaiQiuZhi> list = renCaiQiuZhiMapper.selectByExample(example);
        return list;
    }

    /**
     * 根据性别进行精确查询审核通过的
     */
    public List<RenCaiQiuZhi> getRenCaiQiuZhiBySex(String biaoti) {
        RenCaiQiuZhiExample example=new RenCaiQiuZhiExample();
        RenCaiQiuZhiExample.Criteria criteria=example.createCriteria();
        criteria.andSexEqualTo(biaoti);
        criteria.andShenheEqualTo("true");
        example.setOrderByClause(" rencai_id desc");
        List<RenCaiQiuZhi> list = renCaiQiuZhiMapper.selectByExample(example);
        return list;
    }
    /**
     * 根据学历进行精确查询审核通过的
     */
    public List<RenCaiQiuZhi> getRenCaiQiuZhiByXueLi(String biaoti) {
        RenCaiQiuZhiExample example=new RenCaiQiuZhiExample();
        RenCaiQiuZhiExample.Criteria criteria=example.createCriteria();
        criteria.andXueliEqualTo(biaoti);
        criteria.andShenheEqualTo("true");
        example.setOrderByClause(" rencai_id desc");
        List<RenCaiQiuZhi> list = renCaiQiuZhiMapper.selectByExample(example);
        return list;
    }
    /**
     * 根据年龄进行精确查询审核通过的
     */
    public List<RenCaiQiuZhi> getRenCaiQiuZhiByAge(int age1,int age2) {
        RenCaiQiuZhiExample example=new RenCaiQiuZhiExample();
        RenCaiQiuZhiExample.Criteria criteria=example.createCriteria();
        criteria.andAgeBetween(age1,age2);
        criteria.andShenheEqualTo("true");
        example.setOrderByClause(" rencai_id desc");
        List<RenCaiQiuZhi> list = renCaiQiuZhiMapper.selectByExample(example);
        return list;
    }

    /**
     * 删除一条数据
     */
    public boolean deleteOneByPrimaryKey(int id){
        int n=renCaiQiuZhiMapper.deleteByPrimaryKey(id);
        if(n>0)
            return true;
        return false;
    }

    /**
     * 根据主键进行批量删除
     */
    public boolean deleteAllByPrimaryKey(List<Integer> ids){
        RenCaiQiuZhiExample example=new RenCaiQiuZhiExample();
        RenCaiQiuZhiExample.Criteria criteria=example.createCriteria();
        criteria.andRencaiIdIn(ids);
        int n=renCaiQiuZhiMapper.deleteByExample(example);
        if(n>0)
            return true;
        return false;
    }

    /**
     * 根据主键更新一条数据
     */
    public boolean updateByPrimaryKey(RenCaiQiuZhi gongYingXinXi){
        int n=renCaiQiuZhiMapper.updateByPrimaryKeySelective(gongYingXinXi);
        if(n>0)
            return true;
        return false;
    }
}
