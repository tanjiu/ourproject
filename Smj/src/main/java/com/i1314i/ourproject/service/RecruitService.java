package com.i1314i.ourproject.service;

import com.i1314i.ourproject.mapper.RecruitMapper;
import com.i1314i.ourproject.po.javabean.Recruit;
import com.i1314i.ourproject.po.javabean.RecruitExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 叹久
 * @create 2018-10-04 16:15
 */
@Service
public class RecruitService {

    @Autowired
    private RecruitMapper recruitMapper;

    /**
     * 获取所有数据
     *
     * @return
     */
    public List<Recruit> getAll() {
        return recruitMapper.selectByExample
                (null);
    }

    /**
     * 插入一条数据
     */
    public boolean insert(Recruit recruit) {
        int n = recruitMapper.insertSelective(recruit);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键查询一条数据
     */
    public Recruit getDataByPrimaryKey(String id) {
        Recruit recruit = recruitMapper.selectByPrimaryKey(id);
        return recruit;
    }


    /**
     * 删除一条数据
     */
    public boolean deleteOneByPrimaryKey(String id) {
        int n = recruitMapper.deleteByPrimaryKey(id);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键进行批量删除
     */
    public boolean deleteAllByPrimaryKey(List<String> ids) {
        RecruitExample example = new RecruitExample();
        RecruitExample.Criteria criteria = example.createCriteria();
        criteria.andZhaogongIdIn(ids);
        int n = recruitMapper.deleteByExample(example);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键更新一条数据
     */
    public boolean updateByPrimaryKey(Recruit recruit) {
        int n = recruitMapper.updateByPrimaryKeySelective(recruit);
        if (n > 0)
            return true;
        return false;
    }


}
