package com.i1314i.ourproject.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.i1314i.ourproject.po.ResultMap;
import com.i1314i.ourproject.po.javabean.PlantingStructure;
import com.i1314i.ourproject.service.PlantingStructureService;
import com.i1314i.ourproject.utils.common.TemplateUtils;
import com.i1314i.ourproject.utils.excel.JavaPoiUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 叹久
 * @create 2018-10-04 17:52
 */
@Controller
@RequestMapping("/psc")
public class PlantingStructureController {
    @Autowired
    PlantingStructureService plantingStructureService;
    @Autowired
    ResultMap resultMap;

    private Logger logger = LoggerFactory.getLogger(PlantingStructureController.class);
    /**
     * 分页获取数据
     */
    @ResponseBody
    @RequestMapping("/getDataByPage")
    public ResultMap getDataByPage(@RequestParam(value  ="pn",defaultValue = "1") Integer pn){
        PageHelper.startPage(pn,5);
        List<PlantingStructure> list=plantingStructureService.getAll();
        PageInfo page=new PageInfo(list,5);
        return resultMap.start().msg("success").code("200").data(page);
    }

    /**
     * 得到所有数据
     */
    @ResponseBody
    @RequestMapping(value = "/getAll")
    public ResultMap getAll(){
        List<PlantingStructure> list=plantingStructureService.getAll();
        return resultMap.start().msg("success").code("200").data(list);
    }


    /**
     * 插入一条数据
     *
     * @param plantingStructure
     * @return
     */
    //由于ajax传过来的是一个字符串，所以要使用@RequestBody注解进行转换为po对象
    @ResponseBody
    @RequestMapping(value = "/insertapc", method = RequestMethod.POST)
    public ResultMap insert(@RequestBody PlantingStructure plantingStructure) {
        boolean flag = plantingStructureService.insert(plantingStructure);
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
    public ResultMap deleteById(@PathVariable("ids") String ids) {
        boolean flag = false;
        //批量删除
        if (ids.contains("-")) {
            String[] split = ids.split("-");
            List<Integer> list = new ArrayList<>();
            for (String str : split) {
                list.add(Integer.parseInt(str));
            }
            flag = plantingStructureService.deleteAllByPrimaryKey(list);
        } else {
            flag = plantingStructureService.deleteOneByPrimaryKey(Integer.parseInt(ids));
        }
        if (flag)
            return resultMap.start().msg("success").code("200");
        else
            return resultMap.start().msg("fail").code("500");
    }

    /**
     * 根据主键更新一条数据
     *
     * @param plantingStructure
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/updateapc", method = RequestMethod.POST)
    public ResultMap updateByPrimaryKey(@RequestBody PlantingStructure plantingStructure) {
        boolean flag = false;
        flag = plantingStructureService.updateByPrimaryKey(plantingStructure);
        if (flag)
            return resultMap.start().msg("success").code("200");
        return resultMap.start().msg("fail").code("500");
    }

    /**
     * 根据主键查询一条数据
     */
    @ResponseBody
    @RequestMapping(value = "/selectByPK/{id}", method = RequestMethod.GET)
    public ResultMap getDataByPrimaryKey(@PathVariable("id") int id) {
        PlantingStructure plantingStructure = plantingStructureService.getDataByPrimaryKey(id);
        if (plantingStructure != null)
            return resultMap.start().msg("success").code("200").data(plantingStructure);
        else
            return resultMap.start().msg("NoData").code("404");
    }

    /**
     * 下载导入的模板
     *
     * @param response
     * @throws Exception
     */
    @RequestMapping(value = "/downDemo")
    public void downDemo(HttpServletResponse response) throws Exception {
        JavaPoiUtil.setDownType(response, "导入模板", 2003);
        String[] keys = {"作物名称", "作物类型","种植面积", "地址"};
        String[] col = {"name", "category", "area", "address"};
        List<PlantingStructure> list = new ArrayList<>();
        JavaPoiUtil.createWorkBooks(PlantingStructure.class, list, col, keys).write(response.getOutputStream());
    }

    /**
     * 导出数据到excel中
     *
     * @param response
     * @throws Exception
     */
    @RequestMapping(value = "/down")
    public void down(HttpServletResponse response) throws Exception {
        JavaPoiUtil.setDownType(response, "种植结构数据文件", 2003);
        List<PlantingStructure> list = plantingStructureService.getAll();
        String[] keys = {"作物名称", "作物类型","种植面积", "地址"};
        String[] col = {"name", "category", "area", "address"};
        JavaPoiUtil.createWorkBooks(PlantingStructure.class, list, col, keys).write(response.getOutputStream());
    }

    //导入补充信息
    @ResponseBody
    @RequestMapping(value = "/daochu")
    public ResultMap uploadbc(@RequestParam(value = "file", required = false) MultipartFile file, HttpServletRequest request) throws Exception {

        String msg = "";
        int failnum = 0;
        int updatenum = 0;
        Integer all = 0;

        String pa = TemplateUtils.uuid();
        Map<String, String> map = new HashMap<>();
        String path = pa + file.getOriginalFilename();

        if (path.indexOf(".xls") <= 0 && path.indexOf(".xlsx") <= 0) {
            logger.info(":更新数据失败，文件格式不正确");
            msg = "更新数据失败，请上传正确格式的文件";
        } else {
            InputStream is = file.getInputStream();
            List<List<Object>> lists = JavaPoiUtil.getExcelList(is, path);
            all = lists.size();
            for (int i = 0; i < lists.size(); i++) {
                try {
                    List<Object> list = lists.get(i);
                    PlantingStructure plantingStructure=new PlantingStructure();
                    plantingStructure.setName(String.valueOf(list.get(0).toString()));
                    plantingStructure.setCategory(String.valueOf(list.get(1)));
                    plantingStructure.setArea(String.valueOf(list.get(2)));
                    plantingStructure.setAddress(String.valueOf(list.get(3)));
                    updatenum++;
                } catch (Exception e) {
                    failnum++;
                }

//                if (judgeExist.judgeExist(basicinfo.getSno()))     {
//                    basicinfoMapper.updateByPrimaryKeySelective(basicinfo);
//                    updatenum++;
//                } else {
//                    failnum++;
//                }

                msg = "成功更新" + updatenum + "条," + "更新失败" + failnum + "条";
            }
        }
//        map.put("msg", msg);
        return resultMap.start().msg(msg).code("200");
    }
}
