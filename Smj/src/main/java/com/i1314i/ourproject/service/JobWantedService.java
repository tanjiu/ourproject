package com.i1314i.ourproject.service;

import com.i1314i.ourproject.mapper.JobWantedMapper;
import com.i1314i.ourproject.po.javabean.JobWanted;
import com.i1314i.ourproject.po.javabean.JobWantedExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 叹久
 * @create 2018-10-03 11:59
 */
@Service
public class JobWantedService {

    @Autowired
    private JobWantedMapper jobWantedMapper;

    /**
     * 获取所有数据
     *
     * @return
     */
    public List<JobWanted> getAll() {
        return jobWantedMapper.selectByExample
(null);
    }

    /**
     * 插入一条数据
     */
    public boolean insert(JobWanted jobWanted) {
        int n = jobWantedMapper.insertSelective(jobWanted);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键查询一条数据
     */
    public JobWanted getDataByPrimaryKey(int id) {
        JobWanted jobWanted = jobWantedMapper.selectByPrimaryKey(id);
        return jobWanted;
    }



    /**
     * 删除一条数据
     */
    public boolean deleteOneByPrimaryKey(int id) {
        int n = jobWantedMapper.deleteByPrimaryKey(id);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键进行批量删除
     */
    public boolean deleteAllByPrimaryKey(List<Integer> ids) {
        JobWantedExample example = new JobWantedExample();
        JobWantedExample.Criteria criteria = example.createCriteria();
        criteria.andQiuzhiIdIn(ids);
        int n = jobWantedMapper.deleteByExample(example);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键更新一条数据
     */
    public boolean updateByPrimaryKey(JobWanted jobWanted) {
        int n = jobWantedMapper.updateByPrimaryKeySelective(jobWanted);
        if (n > 0)
            return true;
        return false;
    }






}
