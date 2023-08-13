package com.i1314i.ourproject.controller;

import com.i1314i.ourproject.mapper.PolicyInformationMapper;
import com.i1314i.ourproject.mapper.TalentMapper;
import com.i1314i.ourproject.mapper.TalentTypeMapper;
import com.i1314i.ourproject.po.service.PolicyInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    TalentMapper talentMapper;
    @Autowired
    TalentTypeMapper talentTypeMapper;
    @Autowired
    PolicyInformationMapper policyInformationMapper;

    @PostMapping("/test3")
    public int getCount() {
        return talentMapper.getTalentTypeCount("泰山产业领军人物");
    }

    @PostMapping("/test4")
    public List<PolicyInformation> test2() {
        return policyInformationMapper.findPolicyInformationByPolicyInformationName(null);

    }

}
