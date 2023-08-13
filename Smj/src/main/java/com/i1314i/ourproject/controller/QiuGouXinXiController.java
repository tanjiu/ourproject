package com.i1314i.ourproject.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.i1314i.ourproject.annotation.LogAnnotation;
import com.i1314i.ourproject.po.ResultMap;
import com.i1314i.ourproject.po.javabean.QiuGouXinXi;
import com.i1314i.ourproject.service.QiuGouXinXiService;
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
 * @create 2018-12-20 10:04
 */
@Controller
@RequestMapping(value = "/qgxxc")
@Api(tags = "求购信息")
public class QiuGouXinXiController {

    @Autowired
    private QiuGouXinXiService qiuGouXinXiService;
    @Autowired
    private ResultMap resultMap;

    private Logger logger = LoggerFactory.getLogger(QiuGouXinXiController.class);

    /**
     * 分页获取数据
     */
    @ApiOperation("分页获取数据")
    @ResponseBody
    @RequestMapping("/getDataByPage")
    public ResultMap getDataByPage(@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
        PageHelper.startPage(pn, 5);
        List<QiuGouXinXi> list = qiuGouXinXiService.getAll();
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
        List<QiuGouXinXi> list = qiuGouXinXiService.getTongGuoData();
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
        List<QiuGouXinXi> list = qiuGouXinXiService.getBuTongGuoData();
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
        List<QiuGouXinXi> list = qiuGouXinXiService.getWeiTongGuoData();
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
        List<QiuGouXinXi> list = qiuGouXinXiService.getAll();
        return resultMap.start().msg("success").code("200").data(list);
    }


    /**
     * 获得所有审核通过的数据
     *
     * @return
     */
    @LogAnnotation(sysName = "惠农系统",module = "求购信息")
    @ApiOperation("获得所有审核通过的数据")
    @ResponseBody
    @RequestMapping(value = "/getTongGuoData",method = RequestMethod.GET)
    public ResultMap getTongGuoData() {
        List<QiuGouXinXi> list=qiuGouXinXiService.getTongGuoData();
        if (list.size() != 0)
            return resultMap.start().msg("success").code("200").data(list);
        return resultMap.start().msg("NoData").code("500");
    }

    /**
     * 获得所有待审核通过的数据
     *
     * @return
     */
    @LogAnnotation(sysName = "惠农系统",module = "求购信息")
    @ApiOperation("获得所有待审核通过的数据")
    @ResponseBody
    @RequestMapping(value = "/getBuTongGuoData",method = RequestMethod.GET)
    public ResultMap getBuTongGuoData() {
        List<QiuGouXinXi> list=qiuGouXinXiService.getBuTongGuoData();
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
        List<QiuGouXinXi> list=qiuGouXinXiService.getWeiTongGuoData();
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
    @LogAnnotation(sysName = "惠农系统",module = "求购信息")
    @ApiOperation("插入一条数据")
    //由于ajax传过来的是一个字符串，所以要使用@RequestBody注解进行转换为po对象
    @ResponseBody
    @RequestMapping(value = "/insertapc", method = RequestMethod.POST)
    public ResultMap insert(@RequestBody QiuGouXinXi gongYingXinXi) {
        boolean flag = qiuGouXinXiService.insert(gongYingXinXi);
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
    @LogAnnotation(sysName = "惠农系统",module = "求购信息")
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
            flag = qiuGouXinXiService.deleteAllByPrimaryKey(list);
        } else {
            flag = qiuGouXinXiService.deleteOneByPrimaryKey(Integer.parseInt(ids));
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
    @LogAnnotation(sysName = "惠农系统",module = "求购信息")
    @ApiOperation("根据主键更新一条数据")
    @ResponseBody
    @RequestMapping(value = "/updateapc", method = RequestMethod.POST)
    public ResultMap updateByPrimaryKey(@RequestBody QiuGouXinXi gongYingXinXi) {
        boolean flag = false;
        flag = qiuGouXinXiService.updateByPrimaryKey(gongYingXinXi);
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
    public ResultMap getQiuGouXinXiByPrimaryKey(@PathVariable("id") int id) {
        QiuGouXinXi gongYingXinXi = qiuGouXinXiService.getQiuGouXinXiByPrimaryKey(id);
        if (gongYingXinXi != null)
            return resultMap.start().msg("success").code("200").data(gongYingXinXi);
        else
            return resultMap.start().msg("NoData").code("404");
    }

    /**
     * 根据产品名称进行模糊查询
     * 请求中的参数要与po对象中的属性名一致才可以使用@RequestBody进行自动转换
     */
    //http://localhost:8081/APC/selectByBiaoTi?name=6
    @LogAnnotation(sysName = "惠农系统",module = "求购信息")
    @ApiOperation("根据多个产品名称进行模糊查询审核通过的")
    @ResponseBody
    @RequestMapping(value = "/selectByBiaoTi", method = RequestMethod.POST)
    public ResultMap getQiuGouXinXiByMoHu(@RequestParam  List<String> name) {
        List<QiuGouXinXi> list = qiuGouXinXiService.getQiuGouXinXiByMoHu(name);
        if (list.size() != 0)
            return resultMap.start().msg("success").code("200").data(list);
        return resultMap.start().msg("NoData").code("500");
    }


    /**
     * 根据类别返回数据
     */
    @LogAnnotation(sysName = "惠农系统",module = "求购信息")
    @ApiOperation("根据类别返回数据")
    @ResponseBody
    @RequestMapping(value = "/getDataByLeiBie", method = RequestMethod.POST)
    public ResultMap getDataByLeiBie(@RequestParam List<String> leibie) {
        List<QiuGouXinXi> list = qiuGouXinXiService.getDataByLeiBie(leibie);
        if (list.size() != 0)
            return resultMap.start().msg("success").code("200").data(list);
        return resultMap.start().msg("NoData").code("500");
    }

}
