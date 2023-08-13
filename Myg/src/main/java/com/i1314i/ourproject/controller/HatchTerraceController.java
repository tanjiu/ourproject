package com.i1314i.ourproject.controller;

import com.i1314i.ourproject.po.ResultMap;
import com.i1314i.ourproject.po.service.HatchTerrace;
import com.i1314i.ourproject.service.HatchTerrachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HatchTerraceController {
    @Autowired
    @Qualifier("hatechTerrachServiceImpl")
     HatchTerrachService hatchTerrachService;
    @ResponseBody
    @PostMapping("/hatchTerraces")
    public ResultMap getAllHatchTerraces(){
        List<HatchTerrace> data=hatchTerrachService.getAllHatechTerrach();
        ResultMap resultMap=new ResultMap();
        resultMap.code("200").msg("success").data(data);
        return resultMap;
    }
}
