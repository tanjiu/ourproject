package com.i1314i.ourproject.service;

import com.i1314i.ourproject.po.service.PolicyInformation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PolicyInformationService {
    List<PolicyInformation> fandPolicyByPolicyName(@Param("policyName") String policyName);
}
