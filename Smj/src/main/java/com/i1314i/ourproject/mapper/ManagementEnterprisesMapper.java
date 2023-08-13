package com.i1314i.ourproject.mapper;

import com.i1314i.ourproject.po.javabean.ManagementEnterprises;
import com.i1314i.ourproject.po.javabean.ManagementEnterprisesExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ManagementEnterprisesMapper {
    long countByExample(ManagementEnterprisesExample example);

    int deleteByExample(ManagementEnterprisesExample example);

    int deleteByPrimaryKey(Integer jingyingId);

    int insert(ManagementEnterprises record);

    int insertSelective(ManagementEnterprises record);

    List<ManagementEnterprises> selectByExample(ManagementEnterprisesExample example);

    ManagementEnterprises selectByPrimaryKey(Integer jingyingId);

    int updateByExampleSelective(@Param("record") ManagementEnterprises record, @Param("example") ManagementEnterprisesExample example);

    int updateByExample(@Param("record") ManagementEnterprises record, @Param("example") ManagementEnterprisesExample example);

    int updateByPrimaryKeySelective(ManagementEnterprises record);

    int updateByPrimaryKey(ManagementEnterprises record);
}