package com.i1314i.ourproject.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.i1314i.ourproject.po.ResultMap;
import com.i1314i.ourproject.po.javabean.BasicaFarmland;
import com.i1314i.ourproject.service.BasicFarmlandService;
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
 * @create 2018-10-04 18:06
 *基本农田表
 */
@Controller
@RequestMapping("/bfc")
public class BasicFarmlandController {
    @Autowired
    BasicFarmlandService basicFarmlandService;
    @Autowired
    ResultMap resultMap;

    private Logger logger = LoggerFactory.getLogger(BasicFarmlandController.class);
    /**
     * 分页获取数据
     */
    @ResponseBody
    @RequestMapping("/getDataByPage")
    public ResultMap getDataByPage(@RequestParam(value  ="pn",defaultValue = "1") Integer pn){
        PageHelper.startPage(pn,5);
        List<BasicaFarmland> list=basicFarmlandService.getAll();
        PageInfo page=new PageInfo(list,5);
        return resultMap.start().msg("success").code("200").data(page);
    }

    /**
     * 得到所有数据
     */
    @ResponseBody
    @RequestMapping(value = "/getAll")
    public ResultMap getAll(){
        List<BasicaFarmland> list=basicFarmlandService.getAll();
        return resultMap.start().msg("success").code("200").data(list);
    }


    /**
     * 插入一条数据
     *
     * @param basicaFarmland
     * @return
     */
    //由于ajax传过来的是一个字符串，所以要使用@RequestBody注解进行转换为po对象
    @ResponseBody
    @RequestMapping(value = "/insertapc", method = RequestMethod.POST)
    public ResultMap insert(@RequestBody BasicaFarmland basicaFarmland) {
        boolean flag = basicFarmlandService.insert(basicaFarmland);
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
            List<String> list = new ArrayList<>();
            for (String str : split) {
                list.add(str);
            }
            flag = basicFarmlandService.deleteAllByPrimaryKey(list);
        } else {
            flag = basicFarmlandService.deleteOneByPrimaryKey(ids);
        }
        if (flag)
            return resultMap.start().msg("success").code("200");
        else
            return resultMap.start().msg("fail").code("500");
    }

    /**
     * 根据主键更新一条数据
     *
     * @param basicaFarmland
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/updateapc", method = RequestMethod.POST)
    public ResultMap updateByPrimaryKey(@RequestBody BasicaFarmland basicaFarmland) {
        boolean flag = false;
        flag = basicFarmlandService.updateByPrimaryKey(basicaFarmland);
        if (flag)
            return resultMap.start().msg("success").code("200");
        return resultMap.start().msg("fail").code("500");
    }

    /**
     * 根据主键查询一条数据
     */
    @ResponseBody
    @RequestMapping(value = "/selectByPK/{id}", method = RequestMethod.GET)
    public ResultMap getDataByPrimaryKey(@PathVariable("id") String id) {
        BasicaFarmland basicaFarmland = basicFarmlandService.getDataByPrimaryKey(id);
        if (basicaFarmland != null)
            return resultMap.start().msg("success").code("200").data(basicaFarmland);
        else
            return resultMap.start().msg("NoData").code("404");
    }


    /**
     * 根据土地类型来查询数据
     */
    @ResponseBody
    @RequestMapping(value = "/selectByType/{leixing}", method = RequestMethod.GET)
    public ResultMap getDataByType(@PathVariable("leixing") String leixing) {
        List<BasicaFarmland> list = basicFarmlandService.getDataByType(leixing);
        if (list != null)
            return resultMap.start().msg("success").code("200").data(list);
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
        String[] keys = {"编号","地类", "名称","面积", "位置", "权属单位", "权属性值", "租赁人", "土地承包经营权证", "流转情况"};
        String[] col = {"nongtianId", "type", "name", "area", "location", "quanshuDanwei", "quanshuXingzhi", "zulinren", "zhengshu", "liuzhuanqingkuang"};
        List<BasicaFarmland> list = new ArrayList<>();
        JavaPoiUtil.createWorkBooks(BasicaFarmland.class, list, col, keys).write(response.getOutputStream());
    }

    /**
     * 导出数据到excel中
     *
     * @param response
     * @throws Exception
     */
    @RequestMapping(value = "/down")
    public void down(HttpServletResponse response) throws Exception {
        JavaPoiUtil.setDownType(response, "永久基本农田数据文件", 2003);
        List<BasicaFarmland> list = basicFarmlandService.getAll();
        String[] keys = {"编号","地类", "名称","面积", "位置", "权属单位", "权属性值", "租赁人", "土地承包经营权证", "流转情况"};
        String[] col = {"nongtianId", "type", "name", "area", "location", "quanshuDanwei", "quanshuXingzhi", "zulinren", "zhengshu", "liuzhuanqingkuang"};
        JavaPoiUtil.createWorkBooks(BasicaFarmland.class, list, col, keys).write(response.getOutputStream());
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
                    BasicaFarmland basicaFarmland=new BasicaFarmland();
                    basicaFarmland.setNongtianId(String.valueOf(list.get(0)));
                    basicaFarmland.setType(String.valueOf(list.get(1)));
                    basicaFarmland.setName(String.valueOf(list.get(2)));
                    basicaFarmland.setArea(Double.valueOf(list.get(3).toString()));
                    basicaFarmland.setLocation(String.valueOf(list.get(4)));
                    basicaFarmland.setQuanshuDanwei(String.valueOf(list.get(5)));
                    basicaFarmland.setQuanshuXingzhi(String.valueOf(list.get(6)));
                    basicaFarmland.setZulinren(String.valueOf(list.get(7)));
                    basicaFarmland.setZhengshu(String.valueOf(list.get(8)));
                    basicaFarmland.setLiuzhuanqingkuang(String.valueOf(list.get(9)));
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
