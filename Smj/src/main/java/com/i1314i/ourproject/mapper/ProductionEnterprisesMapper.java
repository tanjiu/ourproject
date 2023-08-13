package com.i1314i.ourproject.mapper;

import com.i1314i.ourproject.po.javabean.ProductionEnterprises;
import com.i1314i.ourproject.po.javabean.ProductionEnterprisesExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductionEnterprisesMapper {
    long countByExample(ProductionEnterprisesExample example);

    int deleteByExample(ProductionEnterprisesExample example);

    int deleteByPrimaryKey(Integer shengchanId);

    int insert(ProductionEnterprises record);

    int insertSelective(ProductionEnterprises record);

    List<ProductionEnterprises> selectByExample(ProductionEnterprisesExample example);

    ProductionEnterprises selectByPrimaryKey(Integer shengchanId);

    int updateByExampleSelective(@Param("record") ProductionEnterprises record, @Param("example") ProductionEnterprisesExample example);

    int updateByExample(@Param("record") ProductionEnterprises record, @Param("example") ProductionEnterprisesExample example);

    int updateByPrimaryKeySelective(ProductionEnterprises record);

    int updateByPrimaryKey(ProductionEnterprises record);
}