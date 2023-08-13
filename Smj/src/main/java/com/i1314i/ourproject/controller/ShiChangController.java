package com.i1314i.ourproject.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.i1314i.ourproject.annotation.LogAnnotation;
import com.i1314i.ourproject.po.ResultMap;
import com.i1314i.ourproject.po.javabean.ShiChangXinXi;
import com.i1314i.ourproject.service.ShiChangService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 叹久
 * @create 2019-03-01 21:02
 */
@Controller
@RequestMapping("/scc")
@Api(tags = "市场信息")
public class ShiChangController {
    @Autowired
    private ShiChangService shiChangService;
    @Autowired
    private ResultMap resultMap;

    private Logger logger = LoggerFactory.getLogger(YangZhiController.class);


    /**
     * 分页获取数据
     */
    @ResponseBody
    @RequestMapping("/getDataByPage")
    @LogAnnotation(sysName = "惠农系统",module = "农业政策")
    @ApiOperation("分页获取数据")
    public ResultMap getDataByPage(@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
        PageHelper.startPage(pn, 3);
        List<ShiChangXinXi> list = shiChangService.getAll();
        PageInfo page = new PageInfo(list, 3);
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
    public ResultMap getALL(HttpServletRequest request) {
        List<ShiChangXinXi> list = shiChangService.getAll();
        return resultMap.start().msg("success").code("200").data(list);
    }


    /**
     * 插入一条数据
     *
     * @param shiChangXinXi
     * @return
     */
    //由于ajax传过来的是一个字符串，所以要使用@RequestBody注解进行转换为po对象
    @ResponseBody
    @ApiOperation("插入一条数据")
    @RequestMapping(value = "/insertapc", method = RequestMethod.POST)
    public ResultMap insert(@RequestBody ShiChangXinXi shiChangXinXi) {
        boolean flag = shiChangService.insert(shiChangXinXi);
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
            flag = shiChangService.deleteAllByPrimaryKey(list);
        } else {
            flag = shiChangService.deleteOneByPrimaryKey(Integer.parseInt(ids));
        }
        if (flag)
            return resultMap.start().msg("success").code("200");
        else
            return resultMap.start().msg("fail").code("500");
    }


    /**
     * 根据主键更新一条数据
     *
     * @param shiChangXinXi
     * @return
     */
    @ApiOperation("根据主键更新一条数据")
    @ResponseBody
    @RequestMapping(value = "/updateapc", method = RequestMethod.POST)
    public ResultMap updateByPrimaryKey(@RequestBody ShiChangXinXi shiChangXinXi, HttpServletRequest request) {
        boolean flag = false;
        flag = shiChangService.updateByPrimaryKey(shiChangXinXi,request);
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
    public ResultMap getShiChangXinXiByPrimaryKey(@PathVariable("id") int id) {
        ShiChangXinXi shiChangXinXi = shiChangService.getShiChangXinXiByPrimaryKey(id);
        if (shiChangXinXi != null)
            return resultMap.start().msg("success").code("200").data(shiChangXinXi);
        else
            return resultMap.start().msg("NoData").code("404");
    }
}
