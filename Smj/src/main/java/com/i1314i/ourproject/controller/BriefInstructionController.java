package com.i1314i.ourproject.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.i1314i.ourproject.po.ResultMap;
import com.i1314i.ourproject.po.javabean.BriefInstruction;
import com.i1314i.ourproject.service.BriefInstructionService;
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
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 叹久
 * @create 2018-10-04 20:47
 * 市场表（供求发布表）
 */
@Controller
@RequestMapping("/bic")
public class BriefInstructionController {
    @Autowired
    BriefInstructionService briefInstructionService;
    @Autowired
    ResultMap resultMap;

    private Logger logger = LoggerFactory.getLogger(BriefInstructionController.class);
    /**
     * 分页获取数据
     */
    @ResponseBody
    @RequestMapping("/getDataByPage")
    public ResultMap getDataByPage(@RequestParam(value  ="pn",defaultValue = "1") Integer pn){
        PageHelper.startPage(pn,5);
        List<BriefInstruction> list=briefInstructionService.getAll();
        PageInfo page=new PageInfo(list,5);
        return resultMap.start().msg("success").code("200").data(page);
    }

    /**
     * 得到所有数据
     */
    @ResponseBody
    @RequestMapping(value = "/getAll")
    public ResultMap getAll(){
        List<BriefInstruction> list=briefInstructionService.getAll();
        return resultMap.start().msg("success").code("200").data(list);
    }


    /**
     * 插入一条数据
     * 注意：供方的标志是"gong"
     *      需求方的标志是"xu"
     *
     * @param briefInstruction
     * @return
     */
    //由于ajax传过来的是一个字符串，所以要使用@RequestBody注解进行转换为po对象
    @ResponseBody
    @RequestMapping(value = "/insertapc", method = RequestMethod.POST)
    public ResultMap insert(@RequestBody BriefInstruction briefInstruction) {
        boolean flag = briefInstructionService.insert(briefInstruction);
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
            flag = briefInstructionService.deleteAllByPrimaryKey(list);
        } else {
            flag = briefInstructionService.deleteOneByPrimaryKey(Integer.parseInt(ids));
        }
        if (flag)
            return resultMap.start().msg("success").code("200");
        else
            return resultMap.start().msg("fail").code("500");
    }

    /**
     * 根据主键更新一条数据
     *
     * @param briefInstruction
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/updateapc", method = RequestMethod.POST)
    public ResultMap updateByPrimaryKey(@RequestBody BriefInstruction briefInstruction) {
        boolean flag = false;
        flag = briefInstructionService.updateByPrimaryKey(briefInstruction);
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
        BriefInstruction briefInstruction = briefInstructionService.getDataByPrimaryKey(id);
        if (briefInstruction != null)
            return resultMap.start().msg("success").code("200").data(briefInstruction);
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
        String[] keys = {"市场名称","地址", "经营产品", "联系方式","供需标志","发布时间","x坐标", "y坐标","介绍"};
        String[] col = { "name", "address", "product", "telphone", "gongXu", "fabutime", "x", "y","jieshao"};
        List<BriefInstruction> list = new ArrayList<>();
        JavaPoiUtil.createWorkBooks(BriefInstruction.class, list, col, keys).write(response.getOutputStream());
    }

    /**
     * 导出数据到excel中
     *
     * @param response
     * @throws Exception
     */
    @RequestMapping(value = "/down")
    public void down(HttpServletResponse response) throws Exception {
        JavaPoiUtil.setDownType(response, "供求发布数据文件", 2003);
        List<BriefInstruction> list = briefInstructionService.getAll();
        String[] keys = { "市场名称","地址", "经营产品", "联系方式","供需标志","发布时间","x坐标", "y坐标","介绍"};
        String[] col = { "name", "address", "product", "telphone", "gongXu", "fabutime", "x", "y","jieshao"};
        JavaPoiUtil.createWorkBooks(BriefInstruction.class, list, col, keys).write(response.getOutputStream());
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
                    BriefInstruction briefInstruction=new BriefInstruction();
                    briefInstruction.setName(String.valueOf(list.get(0)));
                    briefInstruction.setAddress(String.valueOf(list.get(1)));
                    briefInstruction.setProduct(String.valueOf(list.get(2)));
                    briefInstruction.setTelphone(String.valueOf(list.get(3)));
                    briefInstruction.setGongXu(String.valueOf(list.get(4)));
                    briefInstruction.setFabutime(Date.valueOf(list.get(5).toString()));
                    briefInstruction.setX(Double.valueOf(list.get(6).toString()));
                    briefInstruction.setY(Double.valueOf(list.get(7).toString()));
                    briefInstruction.setJieshao(String.valueOf(list.get(8)));
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
