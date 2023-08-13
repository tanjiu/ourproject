package com.i1314i.ourproject.controller;

import com.i1314i.ourproject.mapper.TalentMapper;
import com.i1314i.ourproject.mapper.TalentTypeMapper;
import com.i1314i.ourproject.po.ResultInfo;
import com.i1314i.ourproject.po.ResultMap;
import com.i1314i.ourproject.po.TalentAbilityInformation;
import com.i1314i.ourproject.po.TalentInformation;
import com.i1314i.ourproject.po.service.Talent;
import com.i1314i.ourproject.po.service.TalentType;
import com.i1314i.ourproject.service.GetTalentService;
import com.i1314i.ourproject.service.TalentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * 获取人才信息
 */
@RestController
public class TalentController {
    @Autowired
    @Qualifier("getTalentServiceImpl")
    GetTalentService getTalentService;
    @Autowired
    @Qualifier("talentServiceImpl")
    TalentService talentService;


    /**
     * 获取全部普通人才人才信息
     * 前端需要的接口为key：value  key是人才类型，value是对象数组
     *
     * @return
     */


    @PostMapping("/talents")
    public ResultMap getTalent() {
        ResultMap resultMap = new ResultMap();
        Map<String, List<TalentInformation>> talents = getTalentService.getAllTalentInformation();
        resultMap.code("200").msg("success").data(talents);
        return resultMap;
    }

    /**
     * 获取全部普通人才人才信息
     * 前端需要的接口为key：value  key是人才类型，value是对象数组
     */
    @PostMapping("/talentAbilitys")
    public ResultMap getTalentAbilitys() {
        ResultMap resultMap = new ResultMap();
        Map<String, List<TalentAbilityInformation>> talents = getTalentService.getAllTalentAbilityInformation();
        resultMap.code("200").msg("success").data(talents);
        return resultMap;
    }

    /**
     * 人才种类数量接口
     */
    @PostMapping("/talentTypeCount")
    public ResultMap getTalentCountAndType() {
        System.out.println("talentType");
        ResultMap resultMap = new ResultMap();
        resultMap.code("200").msg("success").data(talentService.getAllTalentTypeCount());
        return resultMap;
    }
    /**
     * 地图画圆搜索人才
     */
    @PostMapping("/searchTalent")
    public ResultMap searchTalent(HttpServletRequest request){
        double x= Double.parseDouble(request.getParameter("x"));
        double y= Double.parseDouble(request.getParameter("y"));
        double r= Double.parseDouble(request.getParameter("r"));
        List<Map<String,String>>data=talentService.searchTalent(x,y,r);
        ResultMap resultMap=new ResultMap();
        if (data.size()==0){
            resultMap.code("700").msg("对不起在您搜索的范围未找到人才");
        }else {
            resultMap.code("200").msg("success").data(data);
        }
        return resultMap;
    }


}
