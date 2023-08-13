package com.i1314i.ourproject.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.i1314i.ourproject.annotation.LogAnnotation;
import com.i1314i.ourproject.po.ResultMap;
import com.i1314i.ourproject.po.javabean.HuiNongChanPinZhongLei;
import com.i1314i.ourproject.service.HuiNongChanPinZhongLeiService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 叹久
 * @create 2019-03-27 19:49
 */
@Controller
@RequestMapping("/hncpzlc")
@Api(tags = "惠农产品-种类")
public class HuiNongChanPinZhongLeiController {
    @Autowired
    private HuiNongChanPinZhongLeiService huiNongChanPinZhongLeiService ;
    @Autowired
    private ResultMap resultMap;
   

    private Logger logger = LoggerFactory.getLogger(HuiNongChanPinZhongLeiController.class);

    /**
     * 分页获取数据
     */
    @ApiOperation("分页获取数据")
    @ResponseBody
    @RequestMapping("/getDataByPage")
    public ResultMap getDataByPage(@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
        PageHelper.startPage(pn, 5);
        List<HuiNongChanPinZhongLei> list = huiNongChanPinZhongLeiService.getAll();
        PageInfo page = new PageInfo(list, 5);
        return resultMap.start().msg("success").code("200").data(page);
    }

    /**
     * 得到所有数据
     *
     * @return
     */
    @ApiOperation("得到所有数据")
    @ResponseBody
    @RequestMapping(value = "/getAll")
    public ResultMap getALL() {
        List<HuiNongChanPinZhongLei> list = huiNongChanPinZhongLeiService.getAll();
        return resultMap.start().msg("success").code("200").data(list);
    }


    /**
     * 插入一条数据
     *
     * @param huiNongChanPinZhongLei
     * @return
     */
    @LogAnnotation(sysName = "惠农系统",module = "惠农产品-种类")
    @ApiOperation("插入一条数据,插入时会根据名称和类别查询，先删除已经存在的")
    //由于ajax传过来的是一个字符串，所以要使用@RequestBody注解进行转换为po对象
    @ResponseBody
    @RequestMapping(value = "/insertapc", method = RequestMethod.POST)
    public ResultMap insert(@RequestBody HuiNongChanPinZhongLei huiNongChanPinZhongLei) {
        boolean flag = huiNongChanPinZhongLeiService.insert(huiNongChanPinZhongLei);
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
    @LogAnnotation(sysName = "惠农系统",module = "惠农产品-种类")
    @ApiOperation("单个、批量删除二合一")
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
            flag = huiNongChanPinZhongLeiService.deleteAllByPrimaryKey(list);
        } else {
            flag = huiNongChanPinZhongLeiService.deleteOneByPrimaryKey(Integer.parseInt(ids));
        }
        if (flag)
            return resultMap.start().msg("success").code("200");
        else
            return resultMap.start().msg("fail").code("500");
    }


    /**
     * 根据主键更新一条数据
     *
     * @param huiNongChanPinZhongLei
     * @return
     */
    @LogAnnotation(sysName = "惠农系统",module = "惠农产品-种类")
    @ApiOperation("根据主键更新一条数据")
    @ResponseBody
    @RequestMapping(value = "/updateapc", method = RequestMethod.POST)
    public ResultMap updateByPrimaryKey(@RequestBody HuiNongChanPinZhongLei huiNongChanPinZhongLei) {
        boolean flag = false;
        flag = huiNongChanPinZhongLeiService.updateByPrimaryKey(huiNongChanPinZhongLei);
        if (flag)
            return resultMap.start().msg("success").code("200");
        return resultMap.start().msg("fail").code("500");
    }




    /**
     * 根据主键查询一条数据
     */
    @LogAnnotation(sysName = "惠农系统",module = "惠农产品-种类")
    @ApiOperation("根据主键查询一条数据，包含街镇名称")
    @ResponseBody
    @RequestMapping(value = "/selectByPK/{id}", method = RequestMethod.GET)
    public ResultMap getHuiNongChanPinZhongLeiByPrimaryKey(@PathVariable("id") int id) {
        HuiNongChanPinZhongLei huiNongChanPinZhongLei = huiNongChanPinZhongLeiService.getHuiNongChanPinZhongLeiByPrimaryKey(id);
        if (huiNongChanPinZhongLei != null)
            return resultMap.start().msg("success").code("200").data(huiNongChanPinZhongLei);
        else
            return resultMap.start().msg("NoData").code("404");
    }


    /**
     * 根据名称查询类别，返回一条数据
     */
    @LogAnnotation(sysName = "惠农系统",module = "惠农产品-种类")
    @ApiOperation("根据名称查询类别，返回一条数据")
    @ResponseBody
    @RequestMapping(value = "/getDataByMingCheng/{mingcheng}", method = RequestMethod.POST)
    public ResultMap getHuiNongChanPinZhongLeiByPrimaryKey(@PathVariable("mingcheng") String mingcheng) {
        HuiNongChanPinZhongLei huiNongChanPinZhongLei = huiNongChanPinZhongLeiService.getDataByMingCheng(mingcheng);
        if (huiNongChanPinZhongLei != null)
            return resultMap.start().msg("success").code("200").data(huiNongChanPinZhongLei);
        else
            return resultMap.start().msg("NoData").code("404");
    }




}
