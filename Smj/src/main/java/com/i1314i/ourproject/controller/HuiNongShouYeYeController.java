package com.i1314i.ourproject.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.i1314i.ourproject.annotation.LogAnnotation;
import com.i1314i.ourproject.po.ResultMap;
import com.i1314i.ourproject.po.javabean.HuiNongShouYe;
import com.i1314i.ourproject.service.HuiNongShouYeYeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.POST;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 叹久
 * @create 2019-03-05 20:39
 */
@Api(tags = "惠农首页数据")
@RequestMapping("/hnsyyc")
@Controller
public class HuiNongShouYeYeController {
    @Autowired
    private HuiNongShouYeYeService huiNongShouYeService;
    @Autowired
    private ResultMap resultMap;

    private Logger logger = LoggerFactory.getLogger(YangZhiController.class);

    /**
     * 分页获取数据(根据大类值）
     */
    @ResponseBody
    @RequestMapping("/getDataByPage")
    @LogAnnotation(sysName = "惠农系统", module = "惠农首页")
    @ApiOperation("分页获取数据(根据大类值）")
    public ResultMap getDataByPage(@RequestParam(value = "pn", defaultValue = "1") Integer pn,@RequestParam String dalei) {
        PageHelper.startPage(pn, 5);
        List<HuiNongShouYe> list = huiNongShouYeService.getDataByDaType(dalei);
        PageInfo page = new PageInfo(list, 5);
        return resultMap.start().msg("success").code("200").data(page);
    }

    /**
     * 分页获取数据(根据大类值和名称）
     */
    @ResponseBody
    @RequestMapping("/getDataByPageAndMC")
    @LogAnnotation(sysName = "惠农系统", module = "惠农首页")
    @ApiOperation("分页获取数据(根据大类值和名称）")
    public ResultMap getDataByPageAndMC(@RequestParam(value = "pn", defaultValue = "1") Integer pn,@RequestParam String dalei,@RequestParam String mingcheng) {
        PageHelper.startPage(pn, 5);
        List<HuiNongShouYe> list = huiNongShouYeService.getDataByPageAndMC(dalei,mingcheng);
        PageInfo page = new PageInfo(list, 5);
        return resultMap.start().msg("success").code("200").data(page);
    }



    /**
     * 获取所有数据(根据大类值）
     */
    @ResponseBody
    @RequestMapping("/getDataByDL/{mc}")
    @LogAnnotation(sysName = "惠农系统", module = "惠农首页")
    @ApiOperation("获取所有数据(根据大类值）")
    public ResultMap getDataByDL(@PathVariable("mc") String mc){
        List<HuiNongShouYe> list=huiNongShouYeService.getDataByDaType(mc);
        if(list.size()>0)
            return resultMap.start().msg("success").code("200").data(list);
        return resultMap.start().msg("NoData").code("500");
    }


    /**
     * 获取所有数据(根据大类和名称来获取数据）
     */
    @ResponseBody
    @RequestMapping("/getDataByPageAndMCheng")
    @LogAnnotation(sysName = "惠农系统", module = "惠农首页")
    @ApiOperation("获取所有数据(根据大类和名称来获取数据）")
    public ResultMap getDataByPageAndMCheng(@RequestParam String dalei,@RequestParam String mingcheng){
        List<HuiNongShouYe> list=huiNongShouYeService.getDataByPageAndMC(dalei,mingcheng);
        if(list.size()>0)
            return resultMap.start().msg("success").code("200").data(list);
        return resultMap.start().msg("NoData").code("500");
    }


    /**
     * 插入一条数据
     *
     * @param huiNongShouYe
     * @return
     */
    //由于ajax传过来的是一个字符串，所以要使用@RequestBody注解进行转换为po对象
    @ResponseBody
    @ApiOperation("插入一条数据")
    @RequestMapping(value = "/insertapc", method = RequestMethod.POST)
    public ResultMap insert(@RequestBody HuiNongShouYe huiNongShouYe) {
        boolean flag = huiNongShouYeService.insert(huiNongShouYe);
        if (flag)
            return resultMap.start().msg("success").code("200");
        return resultMap.start().msg("fail").code("500");
    }

    /**
     * 单个、批量删除二合一
     *
     * @param ids
     * @return
     */
    @ApiOperation(" 单个、批量删除二合一")
    @ResponseBody
    @RequestMapping(value = "/deletes/{ids}", method = RequestMethod.POST)
    public ResultMap deleteAPCById(@PathVariable("ids") String ids) {
        boolean flag = false;
        //批量删除
        if (ids.contains("-")) {
            String[] split = ids.split("-");
            List<Integer> list = new ArrayList<>();
            for (String str : split) {
                list.add(Integer.parseInt(str));
            }
            flag = huiNongShouYeService.deleteAllByPrimaryKey(list);
        } else {
            flag = huiNongShouYeService.deleteOneByPrimaryKey(Integer.parseInt(ids));
        }
        if (flag)
            return resultMap.start().msg("success").code("200");
        else
            return resultMap.start().msg("fail").code("500");
    }


    /**
     * 根据主键更新一条数据
     *
     * @param huiNongShouYe
     * @return
     */
    @ApiOperation("根据主键更新一条数据")
    @ResponseBody
    @RequestMapping(value = "/updateapc", method = RequestMethod.POST)
    public ResultMap updateByPrimaryKey(@RequestBody HuiNongShouYe huiNongShouYe) {
        boolean flag = false;
        flag = huiNongShouYeService.updateByPrimaryKey(huiNongShouYe);
        if (flag)
            return resultMap.start().msg("success").code("200");
        return resultMap.start().msg("fail").code("500");
    }


    /**
     * 根据主键查询一条数据
     */
    @ApiOperation("根据主键查询一条数据")
    @ResponseBody
    @RequestMapping(value = "/selectByPK/{id}", method = RequestMethod.GET)
    public ResultMap getHuiNongShouYeByPrimaryKey(@PathVariable("id") int id) {
        HuiNongShouYe huiNongShouYe = huiNongShouYeService.getHuiNongShouYeByPrimaryKey(id);
        if (huiNongShouYe != null)
            return resultMap.start().msg("success").code("200").data(huiNongShouYe);
        else
            return resultMap.start().msg("NoData").code("404");
    }

    /**
     * 根据大类别更新数据的标题
     */
    @ResponseBody
    @RequestMapping(value="/updateByDaLeiBie",method = RequestMethod.POST)
    @LogAnnotation(sysName = "惠农系统", module = "惠农首页")
    @ApiOperation("根据大类别更新数据的标题")
    public ResultMap updateByDaLeiBie(@RequestParam("biaoti") String biaoti,@RequestParam("daType") String daType){
        boolean flag = false;
        flag = huiNongShouYeService.updateByDaLeiBie(biaoti,daType);
        if (flag)
            return resultMap.start().msg("success").code("200");
        return resultMap.start().msg("fail").code("500");
    }
}
