package com.i1314i.ourproject.mapper;

import com.i1314i.ourproject.po.service.PolicyInformation;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PolicyInformationMapper {
    public List<PolicyInformation> findPolicyInformationByPolicyInformationName(@Param("policyName")String policyName);
}
