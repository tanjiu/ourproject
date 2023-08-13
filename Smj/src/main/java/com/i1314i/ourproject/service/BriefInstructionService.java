package com.i1314i.ourproject.service;

import com.i1314i.ourproject.mapper.BriefInstructionMapper;
import com.i1314i.ourproject.po.javabean.BriefInstruction;
import com.i1314i.ourproject.po.javabean.BriefInstructionExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 叹久
 * @create 2018-10-03 11:55
 */
@Service
public class BriefInstructionService {

    @Autowired
    private BriefInstructionMapper briefInstructionMapper;

    /**
     * 获取所有数据
     *
     * @return
     */
    public List<BriefInstruction> getAll() {
        return briefInstructionMapper.selectByExample
(null);
    }

    /**
     * 插入一条数据
     */
    public boolean insert(BriefInstruction briefInstruction) {
        int n = briefInstructionMapper.insertSelective(briefInstruction);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键查询一条数据
     */
    public BriefInstruction getDataByPrimaryKey(int id) {
        BriefInstruction briefInstruction = briefInstructionMapper.selectByPrimaryKey(id);
        return briefInstruction;
    }



    /**
     * 删除一条数据
     */
    public boolean deleteOneByPrimaryKey(int id) {
        int n = briefInstructionMapper.deleteByPrimaryKey(id);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键进行批量删除
     */
    public boolean deleteAllByPrimaryKey(List<Integer> ids) {
        BriefInstructionExample example = new BriefInstructionExample();
        BriefInstructionExample.Criteria criteria = example.createCriteria();
        criteria.andShichangIdIn(ids);
        int n = briefInstructionMapper.deleteByExample(example);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键更新一条数据
     */
    public boolean updateByPrimaryKey(BriefInstruction briefInstruction) {
        int n = briefInstructionMapper.updateByPrimaryKeySelective(briefInstruction);
        if (n > 0)
            return true;
        return false;
    }
}
