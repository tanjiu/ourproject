package com.i1314i.ourproject.service;

import com.i1314i.ourproject.mapper.ProductionEnterprisesMapper;
import com.i1314i.ourproject.po.javabean.ProductionEnterprises;
import com.i1314i.ourproject.po.javabean.ProductionEnterprisesExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 叹久
 * @create 2018-10-04 20:03
 */
@Service
public class ProductionEnterprisesService {
    @Autowired
    ProductionEnterprisesMapper productionEnterprisesMapper;

    /**
     * 获取所有数据
     *
     * @return
     */
    public List<ProductionEnterprises> getAll() {
        return productionEnterprisesMapper.selectByExample(null);
    }

    /**
     * 插入一条数据
     */
    public boolean insert(ProductionEnterprises productionEnterprises) {
        int n = productionEnterprisesMapper.insertSelective(productionEnterprises);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键查询一条数据
     */
    public ProductionEnterprises getDataByPrimaryKey(int id) {
        ProductionEnterprises productionEnterprises = productionEnterprisesMapper.selectByPrimaryKey(id);
        return productionEnterprises;
    }



    /**
     * 删除一条数据
     */
    public boolean deleteOneByPrimaryKey(int id) {
        int n = productionEnterprisesMapper.deleteByPrimaryKey(id);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键进行批量删除
     */
    public boolean deleteAllByPrimaryKey(List<Integer> ids) {
        ProductionEnterprisesExample example = new ProductionEnterprisesExample();
        ProductionEnterprisesExample.Criteria criteria = example.createCriteria();
        criteria.andShengchanIdIn(ids);
        int n = productionEnterprisesMapper.deleteByExample(example);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键更新一条数据
     */
    public boolean updateByPrimaryKey(ProductionEnterprises productionEnterprises) {
        int n = productionEnterprisesMapper.updateByPrimaryKeySelective(productionEnterprises);
        if (n > 0)
            return true;
        return false;
    }

}
