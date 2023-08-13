package com.i1314i.ourproject.service;

import com.i1314i.ourproject.mapper.ProductPriceMapper;
import com.i1314i.ourproject.po.javabean.ProductPrice;
import com.i1314i.ourproject.po.javabean.ProductPriceExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 叹久
 * @create 2018-10-04 20:57
 */
@Service
public class ProductPriceService {
    @Autowired
    ProductPriceMapper productPriceMapper;

    /**
     * 获取所有数据
     *
     * @return
     */
    public List<ProductPrice> getAll() {
        return productPriceMapper.selectByExample(null);
    }

    /**
     * 插入一条数据
     */
    public boolean insert(ProductPrice productPrice) {
        int n = productPriceMapper.insertSelective(productPrice);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键查询一条数据
     */
    public ProductPrice getDataByPrimaryKey(int id) {
        ProductPrice productPrice = productPriceMapper.selectByPrimaryKey(id);
        return productPrice;
    }



    /**
     * 删除一条数据
     */
    public boolean deleteOneByPrimaryKey(int id) {
        int n = productPriceMapper.deleteByPrimaryKey(id);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键进行批量删除
     */
    public boolean deleteAllByPrimaryKey(List<Integer> ids) {
        ProductPriceExample example = new ProductPriceExample();
        ProductPriceExample.Criteria criteria = example.createCriteria();
        criteria.andJiageIdIn(ids);
        int n = productPriceMapper.deleteByExample(example);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键更新一条数据
     */
    public boolean updateByPrimaryKey(ProductPrice productPrice) {
        int n = productPriceMapper.updateByPrimaryKeySelective(productPrice);
        if (n > 0)
            return true;
        return false;
    }


    /**
     * 根据市场名称查询数据（精确）
     */
    public List<ProductPrice> getByMarket(String shichang){
        ProductPriceExample example = new ProductPriceExample();
        ProductPriceExample.Criteria criteria = example.createCriteria();
        criteria.andMarketEqualTo(shichang);
        List<ProductPrice> list=productPriceMapper.selectByExample(example);
        return list;
    }

    /**
     * 通过产品名称查询数据(模糊）
     */
    public List<ProductPrice> getByName(String name){
        ProductPriceExample example = new ProductPriceExample();
        ProductPriceExample.Criteria criteria = example.createCriteria();
        criteria.andNameLike("%"+name+"%");
        List<ProductPrice> list=productPriceMapper.selectByExample(example);
        return list;
    }


}
