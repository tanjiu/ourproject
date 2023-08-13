package com.i1314i.ourproject.controller;

import com.i1314i.ourproject.po.ResultMap;
import com.i1314i.ourproject.po.service.AffairsInformation;
import com.i1314i.ourproject.service.AffairsInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class AffairsInformationController {
    @Autowired
    @Qualifier("affairsInformationServiceImpl")
    AffairsInformationService affairsInformationService;

    /**
     * 查找事务接口
     */
    @PostMapping("/searchAffirs")
    public ResultMap searchAffirsInformation(HttpServletRequest request) {
        String affirsInformationName = request.getParameter("affirsName");
        ResultMap res = new ResultMap();
        if (affirsInformationName == null)
            return res.data("703").msg("请输入正确的事务名");
        List<AffairsInformation> affairsInformations = affairsInformationService.searchAffairsByName(affirsInformationName);
        if (affairsInformations.size() == 0)
            return res.code("704").msg("未找到您搜索的事务");
        else res.code("200").msg("success").data(affairsInformations);
        return res;
    }
}
