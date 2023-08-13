package com.i1314i.ourproject.mapper;

import com.i1314i.ourproject.po.javabean.ProductPrice;
import com.i1314i.ourproject.po.javabean.ProductPriceExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductPriceMapper {
    long countByExample(ProductPriceExample example);

    int deleteByExample(ProductPriceExample example);

    int deleteByPrimaryKey(Integer jiageId);

    int insert(ProductPrice record);

    int insertSelective(ProductPrice record);

    List<ProductPrice> selectByExample(ProductPriceExample example);

    ProductPrice selectByPrimaryKey(Integer jiageId);

    int updateByExampleSelective(@Param("record") ProductPrice record, @Param("example") ProductPriceExample example);

    int updateByExample(@Param("record") ProductPrice record, @Param("example") ProductPriceExample example);

    int updateByPrimaryKeySelective(ProductPrice record);

    int updateByPrimaryKey(ProductPrice record);
}