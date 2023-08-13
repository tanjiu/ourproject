package com.i1314i.ourproject.service;

import com.i1314i.ourproject.mapper.ManagementEnterprisesMapper;
import com.i1314i.ourproject.po.javabean.ManagementEnterprises;
import com.i1314i.ourproject.po.javabean.ManagementEnterprisesExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 叹久
 * @create 2018-10-03 12:02
 */
@Service
public class ManagementEnterprisesService {

    @Autowired
    private ManagementEnterprisesMapper managementEnterprisesMapper;

    /**
     * 获取所有数据
     *
     * @return
     */
    public List<ManagementEnterprises> getAll() {
        return managementEnterprisesMapper.selectByExample(null);
    }

    /**
     * 插入一条数据
     */
    public boolean insert(ManagementEnterprises managementEnterprises) {
        int n = managementEnterprisesMapper.insertSelective(managementEnterprises);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键查询一条数据
     */
    public ManagementEnterprises getDataByPrimaryKey(int id) {
        ManagementEnterprises managementEnterprises = managementEnterprisesMapper.selectByPrimaryKey(id);
        return managementEnterprises;
    }



    /**
     * 删除一条数据
     */
    public boolean deleteOneByPrimaryKey(int id) {
        int n = managementEnterprisesMapper.deleteByPrimaryKey(id);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键进行批量删除
     */
    public boolean deleteAllByPrimaryKey(List<Integer> ids) {
        ManagementEnterprisesExample example = new ManagementEnterprisesExample();
        ManagementEnterprisesExample.Criteria criteria = example.createCriteria();
        criteria.andJingyingIdIn(ids);
        int n = managementEnterprisesMapper.deleteByExample(example);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键更新一条数据
     */
    public boolean updateByPrimaryKey(ManagementEnterprises managementEnterprises) {
        int n = managementEnterprisesMapper.updateByPrimaryKeySelective(managementEnterprises);
        if (n > 0)
            return true;
        return false;
    }
}
