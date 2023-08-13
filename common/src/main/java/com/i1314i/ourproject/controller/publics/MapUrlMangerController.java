package com.i1314i.ourproject.controller.publics;

import com.i1314i.ourproject.mapper.MapUrlMangerMapper;
import com.i1314i.ourproject.po.ResultMap;
import com.i1314i.ourproject.po.ditu.MapUrlManger;
import com.i1314i.ourproject.utils.jedisUtils.other.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 平行时空
 * @created 2018-12-17 10:54
 **/
@RestController
@RequestMapping(value = "/public/mapurl")
public class MapUrlMangerController {

    @Autowired
    private MapUrlMangerMapper mapUrlMangerMapper;


    @RequestMapping(value = "/findAll")
    public ResultMap findAll(){
        return new ResultMap().code("200").msg("success").data(mapUrlMangerMapper.findAll());
    }


    @RequestMapping(value = "/findById")
    public ResultMap findById(@RequestBody MapUrlManger mapUrlManger){
        return new ResultMap().code("200").msg("success").data(mapUrlMangerMapper.findById(mapUrlManger));
    }


    @RequestMapping(value = "/insertMap")
    public ResultMap insertMap(@RequestBody MapUrlManger mapUrlManger){
        if(StringUtils.isEmpty(mapUrlManger.getHref())){
            return new ResultMap().code("100").msg("地址不能为空");
        }

        if (StringUtils.isEmpty(mapUrlManger.getCname())){
            return new ResultMap().code("100").msg("中文名不能为空");
        }
        if (StringUtils.isEmpty(mapUrlManger.getEname())){
            mapUrlManger.setEname("");
        }
        if (StringUtils.isEmpty(mapUrlManger.getDesc())){
            mapUrlManger.setDesc("");
        }

        if (mapUrlManger.getPid()==null||mapUrlManger.getPid()==0){
            mapUrlManger.setPid(0);
        }
        mapUrlMangerMapper.insertMap(mapUrlManger);
        return new ResultMap().code("200").msg("success");
    }

    @RequestMapping(value = "/updateMap")
    public ResultMap updateMap(@RequestBody MapUrlManger mapUrlManger){
        if(StringUtils.isEmpty(mapUrlManger.getHref())){
            return new ResultMap().code("100").msg("地址不能为空");
        }

        if (StringUtils.isEmpty(mapUrlManger.getCname())){
            return new ResultMap().code("100").msg("中文名不能为空");
        }
        if (StringUtils.isEmpty(mapUrlManger.getEname())){
            mapUrlManger.setEname("");
        }
        if (StringUtils.isEmpty(mapUrlManger.getDesc())){
            mapUrlManger.setDesc("");
        }

        if (mapUrlManger.getPid()==null||mapUrlManger.getPid()==0){
            mapUrlManger.setPid(0);
        }
        mapUrlMangerMapper.updateMap(mapUrlManger);
        return new ResultMap().code("200").msg("success");
    }

    @RequestMapping(value = "/deleteMap")
    public ResultMap deleteMap(@RequestBody MapUrlManger mapUrlManger){
        if(mapUrlManger.getId()==null||mapUrlManger.getId()==0){
            return new ResultMap().code("100").msg("id不能为空");
        }
        mapUrlMangerMapper.deleteMap(mapUrlManger);
        return new ResultMap().code("200").msg("delete success");
    }

}
