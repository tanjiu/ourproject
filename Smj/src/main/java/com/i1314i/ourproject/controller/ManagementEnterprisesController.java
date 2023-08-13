package com.i1314i.ourproject.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.i1314i.ourproject.po.ResultMap;
import com.i1314i.ourproject.po.javabean.ManagementEnterprises;
import com.i1314i.ourproject.service.ManagementEnterprisesService;
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
 * @create 2018-10-04 19:54
 * 农资经营企业表
 */
@Controller
@RequestMapping("/mec")
public class ManagementEnterprisesController {
    @Autowired
    ManagementEnterprisesService managementEnterprisesService;
    @Autowired
    ResultMap resultMap;

    private Logger logger = LoggerFactory.getLogger(ManagementEnterprisesController.class);
    /**
     * 分页获取数据
     */
    @ResponseBody
    @RequestMapping("/getDataByPage")
    public ResultMap getDataByPage(@RequestParam(value  ="pn",defaultValue = "1") Integer pn){
        PageHelper.startPage(pn,5);
        List<ManagementEnterprises> list=managementEnterprisesService.getAll();
        PageInfo page=new PageInfo(list,5);
        return resultMap.start().msg("success").code("200").data(page);
    }

    /**
     * 得到所有数据
     */
    @ResponseBody
    @RequestMapping(value = "/getAll")
    public ResultMap getAll(){
        List<ManagementEnterprises> list=managementEnterprisesService.getAll();
        return resultMap.start().msg("success").code("200").data(list);
    }


    /**
     * 插入一条数据
     *
     * @param managementEnterprises
     * @return
     */
    //由于ajax传过来的是一个字符串，所以要使用@RequestBody注解进行转换为po对象
    @ResponseBody
    @RequestMapping(value = "/insertapc", method = RequestMethod.POST)
    public ResultMap insert(@RequestBody ManagementEnterprises managementEnterprises) {
        boolean flag = managementEnterprisesService.insert(managementEnterprises);
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
            flag = managementEnterprisesService.deleteAllByPrimaryKey(list);
        } else {
            flag = managementEnterprisesService.deleteOneByPrimaryKey(Integer.parseInt(ids));
        }
        if (flag)
            return resultMap.start().msg("success").code("200");
        else
            return resultMap.start().msg("fail").code("500");
    }

    /**
     * 根据主键更新一条数据
     *
     * @param managementEnterprises
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/updateapc", method = RequestMethod.POST)
    public ResultMap updateByPrimaryKey(@RequestBody ManagementEnterprises managementEnterprises) {
        boolean flag = false;
        flag = managementEnterprisesService.updateByPrimaryKey(managementEnterprises);
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
        ManagementEnterprises managementEnterprises = managementEnterprisesService.getDataByPrimaryKey(id);
        if (managementEnterprises != null)
            return resultMap.start().msg("success").code("200").data(managementEnterprises);
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
        String[] keys = {"单位名称", "单位地址","生产经营品种", "法人代表", "联系方式", "x坐标", "y坐标"};
        String[] col = {"name", "address", "type", "legalRepresentative", "farenTelphone", "x", "y"};
        List<ManagementEnterprises> list = new ArrayList<>();
        JavaPoiUtil.createWorkBooks(ManagementEnterprises.class, list, col, keys).write(response.getOutputStream());
    }

    /**
     * 导出数据到excel中
     *
     * @param response
     * @throws Exception
     */
    @RequestMapping(value = "/down")
    public void down(HttpServletResponse response) throws Exception {
        JavaPoiUtil.setDownType(response, "农资经营企业数据文件", 2003);
        List<ManagementEnterprises> list = managementEnterprisesService.getAll();
        String[] keys = {"单位名称", "单位地址","生产经营品种", "法人代表", "联系方式", "x坐标", "y坐标"};
        String[] col = {"name", "address", "type", "legalRepresentative", "farenTelphone", "x", "y"};
        JavaPoiUtil.createWorkBooks(ManagementEnterprises.class, list, col, keys).write(response.getOutputStream());
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
                    ManagementEnterprises managementEnterprises=new ManagementEnterprises();
                    managementEnterprises.setName(String.valueOf(list.get(0)));
                    managementEnterprises.setAddress(String.valueOf(list.get(1)));
                    managementEnterprises.setType(String.valueOf(list.get(2)));
                    managementEnterprises.setLegalRepresentative(String.valueOf(list.get(3)));
                    managementEnterprises.setFarenTelphone(String.valueOf(list.get(4)));
                    managementEnterprises.setX(Double.valueOf(list.get(5).toString()));
                    managementEnterprises.setY(Double.valueOf(list.get(6).toString()));
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
