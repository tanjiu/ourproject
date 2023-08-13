package com.i1314i.ourproject.controller;

import com.i1314i.ourproject.po.ResultMap;
import com.i1314i.ourproject.po.service.FarmingTerrace;
import com.i1314i.ourproject.po.service.HatchTerrace;
import com.i1314i.ourproject.service.FarmingTerraceService;
import com.i1314i.ourproject.service.HatchTerrachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class FarmingTerraceController {
    @Autowired
    @Qualifier("farmingTerraceServiceImpl")
    FarmingTerraceService farmingTerraceService;
    @ResponseBody
    @PostMapping("/famingTerraces")
    public ResultMap getAllHatchTerraces(){
        List<FarmingTerrace> data=farmingTerraceService.getAllFarmingTerrace();
        ResultMap resultMap=new ResultMap();
        resultMap.code("200").msg("success").data(data);
        return resultMap;
    }
}
