package com.i1314i.ourproject.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.i1314i.ourproject.annotation.LogAnnotation;
import com.i1314i.ourproject.po.ResultMap;
import com.i1314i.ourproject.po.javabean.JieDao;
import com.i1314i.ourproject.po.javabean.SheQu;
import com.i1314i.ourproject.service.JieDaoService;
import com.i1314i.ourproject.service.SheQuService;
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
 * @create 2018-12-21 11:13
 */
@Controller
@RequestMapping("/sqc")
@Api("社区表")
public class SheQuController {
    @Autowired
    private SheQuService sheQuService ;
    @Autowired
    private ResultMap resultMap;
    @Autowired
    JieDaoService jieDaoService;

    private Logger logger = LoggerFactory.getLogger(SheQuController.class);

    /**
     * 分页获取数据
     */
    @ApiOperation("分页获取数据，包含街镇名称")
    @ResponseBody
    @RequestMapping("/getDataByPage")
    public ResultMap getDataByPage(@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
        PageHelper.startPage(pn, 5);
        List<SheQu> list = sheQuService.getAll();
        PageInfo page = new PageInfo(list, 5);
        return resultMap.start().msg("success").code("200").data(page);
    }

    /**
     * 得到所有数据
     *
     * @return
     */
    @ApiOperation("得到所有数据，包含街镇名称")
    @ResponseBody
    @RequestMapping(value = "/getAll")
    public ResultMap getALL() {
        List<SheQu> list = sheQuService.getAll();
        return resultMap.start().msg("success").code("200").data(list);
    }


    /**
     * 插入一条数据
     *
     * @param sheQu
     * @return
     */
    @LogAnnotation(sysName = "惠农系统",module = "社区")
    @ApiOperation("插入一条数据")
    //由于ajax传过来的是一个字符串，所以要使用@RequestBody注解进行转换为po对象
    @ResponseBody
    @RequestMapping(value = "/insertapc", method = RequestMethod.POST)
    public ResultMap insert(@RequestBody SheQu sheQu) {
        boolean flag = sheQuService.insert(sheQu);
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
    @LogAnnotation(sysName = "惠农系统",module = "社区")
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
            flag = sheQuService.deleteAllByPrimaryKey(list);
        } else {
            flag = sheQuService.deleteOneByPrimaryKey(Integer.parseInt(ids));
        }
        if (flag)
            return resultMap.start().msg("success").code("200");
        else
            return resultMap.start().msg("fail").code("500");
    }


    /**
     * 根据主键更新一条数据
     *
     * @param sheQu
     * @return
     */
    @LogAnnotation(sysName = "惠农系统",module = "社区")
    @ApiOperation("根据主键更新一条数据")
    @ResponseBody
    @RequestMapping(value = "/updateapc", method = RequestMethod.POST)
    public ResultMap updateByPrimaryKey(@RequestBody SheQu sheQu) {
        boolean flag = false;
        flag = sheQuService.updateByPrimaryKey(sheQu);
        if (flag)
            return resultMap.start().msg("success").code("200");
        return resultMap.start().msg("fail").code("500");
    }




    /**
     * 根据主键查询一条数据
     */
    @LogAnnotation(sysName = "惠农系统",module = "社区")
    @ApiOperation("根据主键查询一条数据，包含街镇名称")
    @ResponseBody
    @RequestMapping(value = "/selectByPK/{id}", method = RequestMethod.GET)
    public ResultMap getSheQuByPrimaryKey(@PathVariable("id") int id) {
        SheQu sheQu = sheQuService.getSheQuByPrimaryKey(id);
        if (sheQu != null)
            return resultMap.start().msg("success").code("200").data(sheQu);
        else
            return resultMap.start().msg("NoData").code("404");
    }

    /**
     * 根据主键查询一条数据，包含街镇名称
     */
    @LogAnnotation(sysName = "惠农系统",module = "社区")
    @ApiOperation("根据主键查询一条数据，包含街镇名称")
    @ResponseBody
    @RequestMapping(value = "/getSheQuByPrimaryKeyAndJD/{id}", method = RequestMethod.GET)
    public ResultMap getSheQuByPrimaryKeyAndJD(@PathVariable("id") int id) {
        SheQu sheQu = sheQuService.getSheQuByPrimaryKey(id);
        if (sheQu != null)
            return resultMap.start().msg("success").code("200").data(sheQu);
        else
            return resultMap.start().msg("NoData").code("404");
    }

    /**
     * 根据街道编号获取所有的社区
     */
    @ApiOperation("根据街道编号获取所有的社区")
    @ResponseBody
    @RequestMapping(value = "/getDataByJDID/{id}", method = RequestMethod.GET)
    public ResultMap getDataByJDID(@PathVariable("id") int id) {
        List<SheQu> list=sheQuService.getDataByJDID(id);
        if (list.size()>0)
            return resultMap.start().msg("success").code("200").data(list);
        else
            return resultMap.start().msg("NoData").code("404");
    }

}
