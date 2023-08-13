package com.i1314i.ourproject.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.i1314i.ourproject.po.ResultMap;
import com.i1314i.ourproject.po.javabean.LhmmZhiBiao;
import com.i1314i.ourproject.service.LhmmZhiBiaoService;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 叹久
 * @create 2018-12-22 14:59
 */
@Controller
@RequestMapping("/lhmmzbc")
@Api("绿化苗木制表方表")
public class LhmmZhiBiaoController {
    @Autowired
    LhmmZhiBiaoService lhmmZhiBiaoService;
 
    @Autowired
    private ResultMap resultMap;

    private Logger logger = LoggerFactory.getLogger(LhmmZhiBiaoController.class);

    /**
     * 分页获取数据
     */
    @ResponseBody
    @RequestMapping("/getDataByPage")
    public ResultMap getDataByPage(@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
        PageHelper.startPage(pn, 5);
        List<LhmmZhiBiao> list = lhmmZhiBiaoService.getAll();
        PageInfo page = new PageInfo(list, 5);
        return resultMap.start().msg("success").code("200").data(page);
    }

    /**
     * 得到所有数据
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getAll")
    public ResultMap getALL() {
        List<LhmmZhiBiao> list = lhmmZhiBiaoService.getAll();
        return resultMap.start().msg("success").code("200").data(list);
    }


    /**
     * 插入一条数据
     *
     * @param lhmmZhiBiao
     * @return
     */
    //由于ajax传过来的是一个字符串，所以要使用@RequestBody注解进行转换为po对象
    @ResponseBody
    @RequestMapping(value = "/insertapc", method = RequestMethod.POST)
    public ResultMap insert(@RequestBody LhmmZhiBiao lhmmZhiBiao) {
        boolean flag = lhmmZhiBiaoService.insert(lhmmZhiBiao);
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
            flag = lhmmZhiBiaoService.deleteAllByPrimaryKey(list);
        } else {
            flag = lhmmZhiBiaoService.deleteOneByPrimaryKey(Integer.parseInt(ids));
        }
        if (flag)
            return resultMap.start().msg("success").code("200");
        else
            return resultMap.start().msg("fail").code("500");
    }


    /**
     * 根据主键更新一条数据
     *
     * @param lhmmZhiBiao
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/updateapc", method = RequestMethod.POST)
    public ResultMap updateByPrimaryKey(@RequestBody LhmmZhiBiao lhmmZhiBiao) {
        boolean flag = false;
        flag = lhmmZhiBiaoService.updateByPrimaryKey(lhmmZhiBiao);
        if (flag)
            return resultMap.start().msg("success").code("200");
        return resultMap.start().msg("fail").code("500");
    }




    /**
     * 根据主键查询一条数据
     */
    @ResponseBody
    @RequestMapping(value = "/selectByPK/{id}", method = RequestMethod.GET)
    public ResultMap getLhmmZhiBiaoByPrimaryKey(@PathVariable("id") int id) {
        LhmmZhiBiao lhmmZhiBiao = lhmmZhiBiaoService.getLhmmZhiBiaoByPrimaryKey(id);
        if (lhmmZhiBiao != null)
            return resultMap.start().msg("success").code("200").data(lhmmZhiBiao);
        else
            return resultMap.start().msg("NoData").code("404");
    }

    /**
     * 根据名称进行模糊查询
     * 请求中的参数要与po对象中的属性名一致才可以使用@RequestBody进行自动转换
     */
    //http://localhost:8081/APC/selectByBiaoTi?name=6
    @ResponseBody
    @RequestMapping(value = "/selectByBiaoTi", method = RequestMethod.GET)
    public ResultMap getLhmmZhiBiaoByMoHu(@RequestParam("name") String biaoti) {
        List<LhmmZhiBiao> list = lhmmZhiBiaoService.getLhmmZhiBiaoByMoHu(biaoti);
        if (list.size() != 0)
            return resultMap.start().msg("success").code("200").data(list);
        return resultMap.start().msg("NoData").code("500");
    }
}
