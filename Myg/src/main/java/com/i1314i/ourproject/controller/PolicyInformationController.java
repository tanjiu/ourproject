package com.i1314i.ourproject.controller;

import com.i1314i.ourproject.po.ResultMap;
import com.i1314i.ourproject.po.service.PolicyInformation;
import com.i1314i.ourproject.service.PolicyInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class PolicyInformationController {
    @Autowired
    @Qualifier("policyInformationServiceImpl")
    PolicyInformationService policyInformationServiceImpl;

    /**
     * 根据政策名查找政策
     *
     * @param policyName
     * @return
     */
    @PostMapping("/serchPolicy")
    public ResultMap searchPolicy(HttpServletRequest request) {
        String policyName=request.getParameter("policyName");
        ResultMap res = new ResultMap();
        if (policyName == null)
            return res.code("701").msg("对不起您未输入政策名");
        List<PolicyInformation> policyInformations = policyInformationServiceImpl.fandPolicyByPolicyName(policyName);//防止sql注入 sql拼接
        if (policyInformations.size() == 0)
            return res.code("701").msg("对不起未找到该政策");
        else return res.code("200").msg("success").data(policyInformations);
    }
}
