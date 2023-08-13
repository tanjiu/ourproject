package com.i1314i.ourproject.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.i1314i.ourproject.po.ResultMap;
import com.i1314i.ourproject.po.javabean.AgriculturalSubsidies;
import com.i1314i.ourproject.po.javabean.SlaughterHouse;
import com.i1314i.ourproject.service.SlaughterHouseService;
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
 * @create 2018-10-04 20:33
 */
@Controller
@RequestMapping("/shc")
public class SlaughterHouseController {
    @Autowired
    SlaughterHouseService slaughterHouseService;
    @Autowired
    ResultMap resultMap;

    private Logger logger = LoggerFactory.getLogger(SlaughterHouseController.class);
    /**
     * 分页获取数据
     */
    @ResponseBody
    @RequestMapping("/getDataByPage")
    public ResultMap getDataByPage(@RequestParam(value  ="pn",defaultValue = "1") Integer pn){
        PageHelper.startPage(pn,5);
        List<SlaughterHouse> list=slaughterHouseService.getAll();
        PageInfo page=new PageInfo(list,5);
        return resultMap.start().msg("success").code("200").data(page);
    }

    /**
     * 得到所有数据
     */
    @ResponseBody
    @RequestMapping(value = "/getAll")
    public ResultMap getAll(){
        List<SlaughterHouse> list=slaughterHouseService.getAll();
        return resultMap.start().msg("success").code("200").data(list);
    }


    /**
     * 插入一条数据
     *
     * @param slaughterHouse
     * @return
     */
    //由于ajax传过来的是一个字符串，所以要使用@RequestBody注解进行转换为po对象
    @ResponseBody
    @RequestMapping(value = "/insertapc", method = RequestMethod.POST)
    public ResultMap insert(@RequestBody SlaughterHouse slaughterHouse) {
        boolean flag = slaughterHouseService.insert(slaughterHouse);
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
            flag = slaughterHouseService.deleteAllByPrimaryKey(list);
        } else {
            flag = slaughterHouseService.deleteOneByPrimaryKey(Integer.parseInt(ids));
        }
        if (flag)
            return resultMap.start().msg("success").code("200");
        else
            return resultMap.start().msg("fail").code("500");
    }

    /**
     * 根据主键更新一条数据
     *
     * @param slaughterHouse
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/updateapc", method = RequestMethod.POST)
    public ResultMap updateByPrimaryKey(@RequestBody SlaughterHouse slaughterHouse) {
        boolean flag = false;
        flag = slaughterHouseService.updateByPrimaryKey(slaughterHouse);
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
        SlaughterHouse slaughterHouse = slaughterHouseService.getDataByPrimaryKey(id);
        if (slaughterHouse != null)
            return resultMap.start().msg("success").code("200").data(slaughterHouse);
        else
            return resultMap.start().msg("NoData").code("404");
    }


    /**
     * 根据类型查询数据
     */
    @ResponseBody
    @RequestMapping("/getDataByType/{type}")
    public ResultMap getDataByType(@PathVariable("type") String type){
        List<SlaughterHouse> list=slaughterHouseService.getDataByType(type);
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
        List<SlaughterHouse> list=slaughterHouseService.getDataByName(name);
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
        List<SlaughterHouse> list=slaughterHouseService.getDataByTel(tel);
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
        String[] keys = { "企业名称","地址", "品种", "法人", "法人联系电话", "屠宰量", "x坐标", "y坐标"};
        String[] col = {"name", "address", "type", "faren", "tel", "number", "x", "y"};
        List<SlaughterHouse> list = new ArrayList<>();
        JavaPoiUtil.createWorkBooks(SlaughterHouse.class, list, col, keys).write(response.getOutputStream());
    }

    /**
     * 导出数据到excel中
     *
     * @param response
     * @throws Exception
     */
    @RequestMapping(value = "/down")
    public void down(HttpServletResponse response) throws Exception {
        JavaPoiUtil.setDownType(response, "屠宰场数据文件", 2003);
        List<SlaughterHouse> list = slaughterHouseService.getAll();
        String[] keys = { "企业名称","地址", "品种", "法人", "法人联系电话", "屠宰量", "x坐标", "y坐标"};
        String[] col = {"name", "address", "type", "faren", "tel", "number", "x", "y"};
        JavaPoiUtil.createWorkBooks(SlaughterHouse.class, list, col, keys).write(response.getOutputStream());
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
                    AgriculturalSubsidies agriculturalSubsidies=new AgriculturalSubsidies();
                    agriculturalSubsidies.setName(String.valueOf(list.get(0)));
                    agriculturalSubsidies.setFangfangdanwei(String.valueOf(list.get(1)));
                    //日期类型转换
                    agriculturalSubsidies.setFafangtime(Date.valueOf(list.get(2).toString()));
                    agriculturalSubsidies.setShouYiQunTi(String.valueOf(list.get(3)));
                    agriculturalSubsidies.setFafangXingshi(String.valueOf(list.get(4)));
                    //数值类型转换
                    agriculturalSubsidies.setMoney(Double.parseDouble(list.get(5).toString()));
                    agriculturalSubsidies.setContent(String.valueOf(list.get(6)));
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
