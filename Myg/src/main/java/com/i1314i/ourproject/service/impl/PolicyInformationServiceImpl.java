package com.i1314i.ourproject.service.impl;

import com.i1314i.ourproject.mapper.PolicyInformationMapper;
import com.i1314i.ourproject.po.service.PolicyInformation;
import com.i1314i.ourproject.service.PolicyInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service
public class PolicyInformationServiceImpl implements PolicyInformationService {
    @Autowired
    PolicyInformationMapper policyInformationMapper;
    @Override
    public List<PolicyInformation> fandPolicyByPolicyName(String policyName) {
        return policyInformationMapper.findPolicyInformationByPolicyInformationName(policyName);
    }
}