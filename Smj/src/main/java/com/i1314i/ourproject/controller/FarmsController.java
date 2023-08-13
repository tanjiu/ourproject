package com.i1314i.ourproject.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.i1314i.ourproject.po.ResultMap;
import com.i1314i.ourproject.po.javabean.Farms;
import com.i1314i.ourproject.service.FarmsService;
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
 * @create 2018-10-04 20:28
 * 养殖场表
 */
@Controller
@RequestMapping("/fc")
public class FarmsController {
    @Autowired
    FarmsService farmsService;
    @Autowired
    ResultMap resultMap;

    private Logger logger = LoggerFactory.getLogger(FarmsController.class);
    /**
     * 分页获取数据
     */
    @ResponseBody
    @RequestMapping("/getDataByPage")
    public ResultMap getDataByPage(@RequestParam(value  ="pn",defaultValue = "1") Integer pn){
        PageHelper.startPage(pn,5);
        List<Farms> list=farmsService.getAll();
        PageInfo page=new PageInfo(list,5);
        return resultMap.start().msg("success").code("200").data(page);
    }

    /**
     * 得到所有数据
     */
    @ResponseBody
    @RequestMapping(value = "/getAll")
    public ResultMap getAll(){
        List<Farms> list=farmsService.getAll();
        return resultMap.start().msg("success").code("200").data(list);
    }


    /**
     * 插入一条数据
     *
     * @param farms
     * @return
     */
    //由于ajax传过来的是一个字符串，所以要使用@RequestBody注解进行转换为po对象
    @ResponseBody
    @RequestMapping(value = "/insertapc", method = RequestMethod.POST)
    public ResultMap insert(@RequestBody Farms farms) {
        boolean flag = farmsService.insert(farms);
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
            flag = farmsService.deleteAllByPrimaryKey(list);
        } else {
            flag = farmsService.deleteOneByPrimaryKey(Integer.parseInt(ids));
        }
        if (flag)
            return resultMap.start().msg("success").code("200");
        else
            return resultMap.start().msg("fail").code("500");
    }

    /**
     * 根据主键更新一条数据
     *
     * @param farms
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/updateapc", method = RequestMethod.POST)
    public ResultMap updateByPrimaryKey(@RequestBody Farms farms) {
        boolean flag = false;
        flag = farmsService.updateByPrimaryKey(farms);
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
        Farms farms = farmsService.getDataByPrimaryKey(id);
        if (farms != null)
            return resultMap.start().msg("success").code("200").data(farms);
        else
            return resultMap.start().msg("NoData").code("404");
    }


    /**
     * 根据类型查询数据
     */
    @ResponseBody
    @RequestMapping("/getDataByType/{type}")
    public ResultMap getDataByType(@PathVariable("type") String type){
        List<Farms> list=farmsService.getDataByType(type);
        if(list.size()!=0)
            return resultMap.start().msg("success").code("200").data(list);
        return resultMap.start().msg("NoData").code("404");
    }

    /**
     * 根据名称查询数据（模糊查询）
     */
    @ResponseBody
    @RequestMapping("/getDataByName/{name}")
    public ResultMap getDataByName(@PathVariable("name") String name){
        List<Farms> list=farmsService.getDataByName(name);
        if(list.size()!=0)
            return resultMap.start().msg("success").code("200").data(list);
        return resultMap.start().msg("NoData").code("404");
    }


    /**
     * 根据联系人电话模糊查询
     */
    @ResponseBody
    @RequestMapping("/getDataByName/{tel}")
    public ResultMap getDataByTel(@PathVariable("tel") String tel){
        List<Farms> list=farmsService.getDataByTel(tel);
        if(list.size()!=0)
            return resultMap.start().msg("success").code("200").data(list);
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
        String[] keys = { "名称","镇街", "地址", "饲养畜禽品种", "年份","存栏规模", "年出栏量", "负责人", "联系人", "联系人联系方式", "x", "y"};
        String[] col = { "name", "zhenJie", "address", "type", "year", "cunLanGuimo", "nianChulanLiang", "fuzeren", "lianxiren", "lianxirenTel", "x", "y"};
        List<Farms> list = new ArrayList<>();
        JavaPoiUtil.createWorkBooks(Farms.class, list, col, keys).write(response.getOutputStream());
    }

    /**
     * 导出数据到excel中
     *
     * @param response
     * @throws Exception
     */
    @RequestMapping(value = "/down")
    public void down(HttpServletResponse response) throws Exception {
        JavaPoiUtil.setDownType(response, "养殖场数据文件", 2003);
        List<Farms> list = farmsService.getAll();
        String[] keys = { "名称","镇街", "地址", "饲养畜禽品种", "年份","存栏规模", "年出栏量", "负责人", "联系人", "联系人联系方式", "x", "y"};
        String[] col = { "name", "zhenJie", "address", "type", "year", "cunLanGuimo", "nianChulanLiang", "fuzeren", "lianxiren", "lianxirenTel", "x", "y"};
        JavaPoiUtil.createWorkBooks(Farms.class, list, col, keys).write(response.getOutputStream());
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
                    Farms farms=new Farms();
                    farms.setName(String.valueOf(list.get(0)));
                    farms.setZhenJie(String.valueOf(list.get(1)));
                    farms.setAddress(String.valueOf(list.get(2)));
                    farms.setType(String.valueOf(list.get(3)));
                    farms.setYear(Date.valueOf(list.get(4).toString()));
                    farms.setCunLanGuimo(String.valueOf(list.get(5)));
                    farms.setNianChulanLiang(String.valueOf(list.get(6)));
                    farms.setFuzeren(String.valueOf(list.get(7)));
                    farms.setLianxiren(String.valueOf(list.get(8)));
                    farms.setLianxirenTel(String.valueOf(list.get(9)));
                    farms.setX(Double.valueOf(list.get(10).toString()));
                    farms.setY(Double.valueOf(list.get(11).toString()));
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
