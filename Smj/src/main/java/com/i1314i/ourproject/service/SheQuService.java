package com.i1314i.ourproject.service;

import com.i1314i.ourproject.mapper.JieDaoMapper;
import com.i1314i.ourproject.mapper.SheQuMapper;
import com.i1314i.ourproject.po.javabean.JieDao;
import com.i1314i.ourproject.po.javabean.SheQu;
import com.i1314i.ourproject.po.javabean.SheQuExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 叹久
 * @create 2018-12-21 11:10
 */
@Service
public class SheQuService {
    @Autowired
    SheQuMapper sheQuMapper;
    @Autowired
    JieDaoMapper jieDaoMapper;


    /**
     * 获得所有数据
     *
     * @return
     */
    public List<SheQu> getAll() {
        List<SheQu> list = sheQuMapper.selectByExample(null);
        for (SheQu sheQu:list){
            if(sheQu.getJieDaoId()!=null){
                JieDao jieDao=jieDaoMapper.selectByPrimaryKey(sheQu.getJieDaoId());
                sheQu.setJieDaoMingCheng(jieDao.getJieDaoMingCheng());
            }
        }
        return list;
    }

    /**
     * 插入一条数据
     */
    public boolean insert(SheQu sheQu) {
        int n = sheQuMapper.insertSelective(sheQu);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键查询
     */
    public SheQu getSheQuByPrimaryKey(int id) {
        SheQu sheQu = sheQuMapper.selectByPrimaryKey(id);
        if(sheQu.getJieDaoId()!=null){
            JieDao jieDao=jieDaoMapper.selectByPrimaryKey(sheQu.getJieDaoId());
            sheQu.setJieDaoMingCheng(jieDao.getJieDaoMingCheng());
        }
        return sheQu;
    }



    /**
     * 删除一条数据
     */
    public boolean deleteOneByPrimaryKey(int id){
        int n=sheQuMapper.deleteByPrimaryKey(id);
        if(n>0)
            return true;
        return false;
    }

    /**
     * 根据主键进行批量删除
     */
    public boolean deleteAllByPrimaryKey(List<Integer> ids){
        SheQuExample example=new SheQuExample();
        SheQuExample.Criteria criteria=example.createCriteria();
        criteria.andSheQuIdIn(ids);
        int n=sheQuMapper.deleteByExample(example);
        if(n>0)
            return true;
        return false;
    }

    /**
     * 根据主键更新一条数据
     */
    public boolean updateByPrimaryKey(SheQu sheQu){
        int n=sheQuMapper.updateByPrimaryKeySelective(sheQu);
        if(n>0)
            return true;
        return false;
    }

    /**
     * 根据街道编号获取所有的社区
     */
    public List<SheQu> getDataByJDID(int id){
        SheQuExample example=new SheQuExample();
        SheQuExample.Criteria criteria=example.createCriteria();
        criteria.andJieDaoIdEqualTo(id);
        List<SheQu> list=sheQuMapper.selectByExample(example);
        return list;
    }


    /**
     * 根据主键查询一条数据,带街道名称和社区名称
     */
   public SheQu  getSheQuByPrimaryKeyAndJD(int id){
       SheQuExample example=new SheQuExample();
       SheQuExample.Criteria criteria=example.createCriteria();
       criteria.andSheQuIdEqualTo(id);
       SheQu sheQu= (SheQu) sheQuMapper.selectByExample(example);
        if(sheQu!=null){
            JieDao jieDao=jieDaoMapper.selectByPrimaryKey(sheQu.getJieDaoId());
            sheQu.setJieDaoMingCheng(jieDao.getJieDaoMingCheng());
        }
       return sheQu;
   }
}
