package com.i1314i.ourproject.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.i1314i.ourproject.annotation.LogAnnotation;
import com.i1314i.ourproject.po.ResultMap;
import com.i1314i.ourproject.po.javabean.RenCaiZhaoPin;
import com.i1314i.ourproject.service.RenCaiZhaoPinService;
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
 * @create 2018-12-20 10:43
 */
@Controller
@RequestMapping("/rczpc")
@Api(tags = "人才招聘")
public class RenCaiZhaoPinController {
    @Autowired
    private RenCaiZhaoPinService renCaiZhaoPinService;
    @Autowired
    private ResultMap resultMap;

    private Logger logger = LoggerFactory.getLogger(RenCaiZhaoPinController.class);

    /**
     * 分页获取数据
     */
    @ApiOperation("分页获取数据")
    @ResponseBody
    @RequestMapping("/getDataByPage")
    public ResultMap getDataByPage(@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
        PageHelper.startPage(pn, 5);
        List<RenCaiZhaoPin> list = renCaiZhaoPinService.getAll();
        PageInfo page = new PageInfo(list, 5);
        return resultMap.start().msg("success").code("200").data(page);
    }

    /**
     * 分页获取已审核数据
     */
    @ApiOperation("分页获取已审核数据")
    @ResponseBody
    @RequestMapping("/getDataByPageAndTG")
    public ResultMap getDataByPageAndTG(@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
        PageHelper.startPage(pn, 5);
        List<RenCaiZhaoPin> list = renCaiZhaoPinService.getTongGuoData();
        PageInfo page = new PageInfo(list, 5);
        return resultMap.start().msg("success").code("200").data(page);
    }

    /**
     * 分页获取待审核数据
     */
    @ApiOperation("分页获取待审核数据")
    @ResponseBody
    @RequestMapping("/getDataByPageAndBTG")
    public ResultMap getDataByPageAndBTG(@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
        PageHelper.startPage(pn, 5);
        List<RenCaiZhaoPin> list = renCaiZhaoPinService.getBuTongGuoData();
        PageInfo page = new PageInfo(list, 5);
        return resultMap.start().msg("success").code("200").data(page);
    }
    /**
     * 分页获取未审核通过数据
     */
    @ApiOperation("分页获取未审核通过数据")
    @ResponseBody
    @RequestMapping("/getDataByPageAndWTG")
    public ResultMap getDataByPageAndWTG(@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
        PageHelper.startPage(pn, 5);
        List<RenCaiZhaoPin> list = renCaiZhaoPinService.getWeiTongGuoData();
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
        List<RenCaiZhaoPin> list = renCaiZhaoPinService.getAll();
        return resultMap.start().msg("success").code("200").data(list);
    }


    /**
     * 获得所有审核通过的数据
     *
     * @return
     */
    @ApiOperation("获得所有审核通过的数据")
    @ResponseBody
    @RequestMapping(value = "/getTongGuoData",method = RequestMethod.GET)
    public ResultMap getTongGuoData() {
        List<RenCaiZhaoPin> list=renCaiZhaoPinService.getTongGuoData();
        if (list.size() != 0)
            return resultMap.start().msg("success").code("200").data(list);
        return resultMap.start().msg("NoData").code("500");
    }

    /**
     * 获得所有待审核通过的数据
     *
     * @return
     */
    @LogAnnotation(sysName = "惠农系统",module = "人才招聘")
    @ApiOperation("获得所有待审核通过的数据")
    @ResponseBody
    @RequestMapping(value = "/getBuTongGuoData",method = RequestMethod.GET)
    public ResultMap getBuTongGuoData() {
        List<RenCaiZhaoPin> list=renCaiZhaoPinService.getBuTongGuoData();
        if (list.size() != 0)
            return resultMap.start().msg("success").code("200").data(list);
        return resultMap.start().msg("NoData").code("500");
    }
    /**
     * 获得所有未审核通过的数据
     *
     * @return
     */
    @ApiOperation("获得所有未审核通过的数据")
    @LogAnnotation(sysName = "惠农系统",module = "供应信息")
    @ResponseBody
    @RequestMapping(value = "/getWeiTongGuoData",method = RequestMethod.GET)
    public ResultMap getWeiTongGuoData() {
        List<RenCaiZhaoPin> list=renCaiZhaoPinService.getWeiTongGuoData();
        if (list.size() != 0)
            return resultMap.start().msg("success").code("200").data(list);
        return resultMap.start().msg("NoData").code("500");
    }
    /**
     * 插入一条数据
     *
     * @param gongYingXinXi
     * @return
     */
    @LogAnnotation(sysName = "惠农系统",module = "人才招聘")
    @ApiOperation("插入一条数据")
    //由于ajax传过来的是一个字符串，所以要使用@RequestBody注解进行转换为po对象
    @ResponseBody
    @RequestMapping(value = "/insertapc1", method = RequestMethod.POST)
    public ResultMap insert(@RequestBody RenCaiZhaoPin gongYingXinXi) {
        boolean flag = renCaiZhaoPinService.insert(gongYingXinXi);
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
    @LogAnnotation(sysName = "惠农系统",module = "人才招聘")
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
            flag = renCaiZhaoPinService.deleteAllByPrimaryKey(list);
        } else {
            flag = renCaiZhaoPinService.deleteOneByPrimaryKey(Integer.parseInt(ids));
        }
        if (flag)
            return resultMap.start().msg("success").code("200");
        else
            return resultMap.start().msg("fail").code("500");
    }


    /**
     * 根据主键更新一条数据
     *
     * @param gongYingXinXi
     * @return
     */
    @LogAnnotation(sysName = "惠农系统",module = "人才招聘")
    @ApiOperation("根据主键更新一条数据")
    @ResponseBody
    @RequestMapping(value = "/updateapc", method = RequestMethod.POST)
    public ResultMap updateByPrimaryKey(@RequestBody RenCaiZhaoPin gongYingXinXi) {
        boolean flag = false;
        flag = renCaiZhaoPinService.updateByPrimaryKey(gongYingXinXi);
        if (flag)
            return resultMap.start().msg("success").code("200");
        return resultMap.start().msg("fail").code("500");
    }


    /**
     * 根据主键查询一条数据
     */
    @LogAnnotation(sysName = "惠农系统",module = "人才招聘")
    @ApiOperation("根据主键查询一条数据")
    @ResponseBody
    @RequestMapping(value = "/selectByPK/{id}", method = RequestMethod.GET)
    public ResultMap getRenCaiZhaoPinByPrimaryKey(@PathVariable("id") int id) {
        RenCaiZhaoPin renCaiZhaoPin = renCaiZhaoPinService.getRenCaiZhaoPinByPrimaryKey(id);
        if (renCaiZhaoPin != null)
            return resultMap.start().msg("success").code("200").data(renCaiZhaoPin);
        else
            return resultMap.start().msg("NoData").code("404");
    }


    /**
     * 根据职位进行模糊查询审核通过的
     */
    @LogAnnotation(sysName = "惠农系统",module = "人才招聘")
    @ApiOperation("根据职位进行模糊查询审核通过的")
    @ResponseBody
    @RequestMapping(value = "/selectByZW/{zhiwei}", method = RequestMethod.GET)
    public ResultMap getRenCaiZhaoPinByZhiWei(@PathVariable("zhiwei") String zhiwei) {
        List<RenCaiZhaoPin> list=renCaiZhaoPinService.getRenCaiZhaoPinByZhiWei(zhiwei);
        if (list.size() != 0)
            return resultMap.start().msg("success").code("200").data(list);
        return resultMap.start().msg("NoData").code("500");
    }

    /**
     * 根据性别进行精确查询审核通过的
     */
    @LogAnnotation(sysName = "惠农系统",module = "人才招聘")
    @ApiOperation("根据性别进行精确查询审核通过的")
    @ResponseBody
    @RequestMapping(value = "/selectBySex/{sex}", method = RequestMethod.GET)
    public ResultMap getRenCaiZhaoPinBySex( @PathVariable("sex")  String sex) {
        List<RenCaiZhaoPin> list=renCaiZhaoPinService.getRenCaiZhaoPinBySex(sex);
        if (list.size() != 0)
            return resultMap.start().msg("success").code("200").data(list);
        return resultMap.start().msg("NoData").code("500");
    }
    /**
     * 根据学历进行精确查询审核通过的
     */
    @LogAnnotation(sysName = "惠农系统",module = "人才招聘")
    @ApiOperation("根据学历进行精确查询审核通过的")
    @ResponseBody
    @RequestMapping(value = "/selectByXL/{xueli}", method = RequestMethod.GET)
    public ResultMap getRenCaiZhaoPinByXueLi( @PathVariable("xueli")String xueli) {
        List<RenCaiZhaoPin> list=renCaiZhaoPinService.getRenCaiZhaoPinByXueLi(xueli);
        if (list.size() != 0)
            return resultMap.start().msg("success").code("200").data(list);
        return resultMap.start().msg("NoData").code("500");
    }

    /**
     * 根据年龄进行范围查询审核通过的
     */
    @LogAnnotation(sysName = "惠农系统",module = "人才招聘")
    @ApiOperation("根据年龄进行范围查询审核通过的")
    @ResponseBody
    @RequestMapping(value = "/selectByAge", method = RequestMethod.GET)
    public ResultMap getRenCaiZhaoPinByAge(@RequestParam("age1") int age1, @RequestParam("age2") int age2) {
        List<RenCaiZhaoPin> list=renCaiZhaoPinService.getRenCaiZhaoPinByAge(age1,age2);
        if (list.size() != 0)
            return resultMap.start().msg("success").code("200").data(list);
        return resultMap.start().msg("NoData").code("500");
    }

}
