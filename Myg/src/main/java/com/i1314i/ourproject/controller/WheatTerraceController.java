package com.i1314i.ourproject.controller;

import com.i1314i.ourproject.po.ResultMap;
import com.i1314i.ourproject.po.service.WheatTerrace;
import com.i1314i.ourproject.service.WheatTerraceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class WheatTerraceController {
    @Qualifier("wheatTerraceServiceImpl")
    @Autowired
    WheatTerraceService wheatTerraceService;
    @PostMapping("/wheaTerraces")
    public ResultMap getAllWheatTerrace(){
        List<WheatTerrace> data=wheatTerraceService.getAllWheatTerrace();
        ResultMap resultMap=new ResultMap();
        resultMap.data("200").msg("success").data(data);
        return resultMap;
    }
}
