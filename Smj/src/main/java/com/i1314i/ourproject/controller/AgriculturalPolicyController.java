package com.i1314i.ourproject.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.i1314i.ourproject.annotation.LogAnnotation;
import com.i1314i.ourproject.po.ResultMap;
import com.i1314i.ourproject.po.javabean.AgriculturalPolicy;
import com.i1314i.ourproject.po.javabean.CountType;
import com.i1314i.ourproject.service.AgriculturalPolicyService;
import com.i1314i.ourproject.utils.common.TemplateUtils;
import com.i1314i.ourproject.utils.excel.JavaPoiUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* @author 叹久
 * @create 2018-10-03 10:01
 * 农业政策表
 */

@Controller
@RequestMapping("/apc")
@Api(tags = "农业政策")
public class AgriculturalPolicyController {

    @Autowired
    private AgriculturalPolicyService agriculturalPolicyService;
    @Autowired
    private ResultMap resultMap;

    private Logger logger = LoggerFactory.getLogger(AgriculturalPolicyController.class);

    /**
     * 管理端分页获取数据
     */
    @ResponseBody
    @RequestMapping("/getDataByPageAdmin")
    @LogAnnotation(sysName = "惠农系统",module = "农业政策")
    @ApiOperation("管理端分页获取数据")
    public ResultMap getDataByPageAdmin(@RequestParam(value = "pn", defaultValue = "1") Integer pn,HttpServletRequest request) {
        PageHelper.startPage(pn, 3);
        List<AgriculturalPolicy> list = agriculturalPolicyService.getAllAdmin(request);
        PageInfo page = new PageInfo(list, 3);
        return resultMap.start().msg("success").code("200").data(page);
    }
    /**
     * 分页获取数据
     */
    @ResponseBody
    @RequestMapping("/getDataByPage")
    @LogAnnotation(sysName = "惠农系统",module = "农业政策")
    @ApiOperation("分页获取数据")
    public ResultMap getDataByPage(@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
        PageHelper.startPage(pn, 3);
        List<AgriculturalPolicy> list = agriculturalPolicyService.getAll();
        PageInfo page = new PageInfo(list, 3);
        return resultMap.start().msg("success").code("200").data(page);
    }
    /**
     * 管理端根据类型获取分页获取数据
     */
    @ResponseBody
    @RequestMapping("/getDataByPageAndTypeAdmin")
    @LogAnnotation(sysName = "惠农系统",module = "农业政策")
    @ApiOperation("管理端根据类型获取分页获取数据")
    public ResultMap getDataByPageAndTypeAdmin(@RequestParam(value = "pn", defaultValue = "1") Integer pn,@RequestParam("type") String type,HttpServletRequest request) {
        PageHelper.startPage(pn, 5);
        List<AgriculturalPolicy> list = agriculturalPolicyService.selectByTypeAdmin(type,request);
        PageInfo page = new PageInfo(list, 5);
        return resultMap.start().msg("success").code("200").data(page);
    }

    /**
     * 根据类型获取分页获取数据
     */
    @ResponseBody
    @RequestMapping("/getDataByPageAndType")
    public ResultMap getDataByPageAndType(@RequestParam(value = "pn", defaultValue = "1") Integer pn,@RequestParam("type") String type) {
        PageHelper.startPage(pn, 5);
        List<AgriculturalPolicy> list = agriculturalPolicyService.selectByType(type);
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
    public ResultMap getALL(HttpServletRequest request) {
        List<AgriculturalPolicy> list = agriculturalPolicyService.getAll();
        return resultMap.start().msg("success").code("200").data(list);
    }


    /**
     * 插入一条数据
     *
     * @param agriculturalPolicy
     * @return
     */
    //由于ajax传过来的是一个字符串，所以要使用@RequestBody注解进行转换为po对象
    @ResponseBody
    @RequestMapping(value = "/insertapc", method = RequestMethod.POST)
    public ResultMap insert(@RequestBody AgriculturalPolicy agriculturalPolicy,HttpServletRequest request) {
        boolean flag = agriculturalPolicyService.insert(agriculturalPolicy,request);
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
            flag = agriculturalPolicyService.deleteAllByPrimaryKey(list);
        } else {
            flag = agriculturalPolicyService.deleteOneByPrimaryKey(Integer.parseInt(ids));
        }
        if (flag)
            return resultMap.start().msg("success").code("200");
        else
            return resultMap.start().msg("fail").code("500");
    }


    /**
     * 根据主键更新一条数据
     *
     * @param agriculturalPolicy
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/updateapc", method = RequestMethod.POST)
    public ResultMap updateByPrimaryKey(@RequestBody AgriculturalPolicy agriculturalPolicy,HttpServletRequest request) {
        boolean flag = false;
        flag = agriculturalPolicyService.updateByPrimaryKey(agriculturalPolicy,request);
        if (flag)
            return resultMap.start().msg("success").code("200");
        return resultMap.start().msg("fail").code("500");
    }

    /**
     * 根据类型查询数据
     */
    @ResponseBody
    @RequestMapping(value = "/selectByType/{id}", method = RequestMethod.GET)
    public ResultMap selectByType(@PathVariable("id") String id) {
//        JSON.parseObject(AgriculturalPolicy.class)
        List<AgriculturalPolicy> list = agriculturalPolicyService.selectByType(id);
        if (list.size() != 0)
            return resultMap.start().msg("success").code("200").data(list);
        return resultMap.start().msg("NoData").code("500");
    }
    /**
     * 管理端根据类型查询数据
     */
    @ResponseBody
    @RequestMapping(value = "/selectByTypeAdmin/{id}", method = RequestMethod.GET)
    @LogAnnotation(sysName = "惠农系统",module = "农业政策")
    @ApiOperation("管理端根据类型查询数据")
    public ResultMap selectByTypeAdmin(@PathVariable("id") String id,HttpServletRequest request) {
//        JSON.parseObject(AgriculturalPolicy.class)
        List<AgriculturalPolicy> list = agriculturalPolicyService.selectByTypeAdmin(id,request);
        if (list.size() != 0)
            return resultMap.start().msg("success").code("200").data(list);
        return resultMap.start().msg("NoData").code("500");
    }

    /**
     * 根据主键查询一条数据
     */
    @ResponseBody
    @RequestMapping(value = "/selectByPK/{id}", method = RequestMethod.GET)
    public ResultMap getAgriculturalPolicyByPrimaryKey(@PathVariable("id") int id) {
        AgriculturalPolicy agriculturalPolicy = agriculturalPolicyService.getAgriculturalPolicyByPrimaryKey(id);
        if (agriculturalPolicy != null)
            return resultMap.start().msg("success").code("200").data(agriculturalPolicy);
        else
            return resultMap.start().msg("NoData").code("404");
    }

    /**
     * 根据标题进行模糊查询
     * 请求中的参数要与po对象中的属性名一致才可以使用@RequestBody进行自动转换
     */
    //http://localhost:8081/APC/selectByBiaoTi?name=6
    @ResponseBody
    @RequestMapping(value = "/selectByBiaoTi", method = RequestMethod.GET)
    public ResultMap getAgriculturalPolicyByMoHu(@RequestParam("name") String biaoti) {
        List<AgriculturalPolicy> list = agriculturalPolicyService.getAgriculturalPolicyByMoHu(biaoti);
        if (list.size() != 0)
            return resultMap.start().msg("success").code("200").data(list);
        return resultMap.start().msg("NoData").code("500");
    }

    /**
     * 返回每种类型数据的个数
     */
    @ApiOperation("返回每种类型数据的个数")
    @ResponseBody
    @RequestMapping(value = "/selectCountByType",method = RequestMethod.GET)
    public ResultMap selectCountByType(){
        try{
            List<CountType> list = agriculturalPolicyService.selectCountByType();
            if (list.size() != 0)
                return resultMap.start().msg("success").code("200").data(list);
        }catch (Exception e){
            logger.info(e.getMessage());
        }

        return resultMap.start().msg("NoData").code("500");
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
        String[] keys = {"标题", "类型", "内容"};
        String[] col = {"name", "type", "content"};
        List<AgriculturalPolicy> agriculturalPolicyList = new ArrayList<>();

        JavaPoiUtil.createWorkBooks(AgriculturalPolicy.class, agriculturalPolicyList, col, keys).write(response.getOutputStream());
    }

    /**
     * 导出数据到excel中
     *
     * @param response
     * @throws Exception
     */
    @RequestMapping(value = "/down")
    public void down(HttpServletResponse response) throws Exception {
        JavaPoiUtil.setDownType(response, "农业政策法规数据文件", 2003);
        List<AgriculturalPolicy> list = agriculturalPolicyService.getAll();
        String[] map = {"name", "type", "content"};
        String[] name = {"名称", "类型", "内容"};
        JavaPoiUtil.createWorkBooks(AgriculturalPolicy.class, list, map, name).write(response.getOutputStream());

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
                    AgriculturalPolicy agriculturalPolicy = new AgriculturalPolicy();
                    agriculturalPolicy.setName(String.valueOf(list.get(0)));
                    agriculturalPolicy.setContent(String.valueOf(list.get(2)));
                    agriculturalPolicy.setType(String.valueOf(list.get(1)));
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





    public static void main(String[] args) throws Exception {

        List<List<Object>>huafei1=new ArrayList<>();
        List<List<Object>>nongmo1=new ArrayList<>();
        List<List<Object>>nongyao1=new ArrayList<>();
        List<List<Object>>siliaojizaizhu1=new ArrayList<>();
        List<List<Object>>nongjiyongyou1=new ArrayList<>();

        List<File> fileList = new ArrayList<File>();
        File file = new File("C:\\Users\\22894\\Desktop\\居民生活消费品、农业生产资料历史价格\\农业生产资料旬报表\\农业生产资料旬报表2018年 - 副本\\");
        File[] files = file.listFiles();// 获取目录下的所有文件或文件夹
        if (files == null) {// 如果目录为空，直接退出
            return;
        }

        System.out.println(files.length);

        for (File filely:files
        ) {
            String dates=filely.getName();
            String[]dataList=dates.split("\\.");
            System.out.println(dates);
            if(dataList[1].length()==1){
                dataList[1]="0"+ dataList[1];
            }
            if(dataList[2].length()==1){
                dataList[2]="0"+ dataList[2];
            }
            //根据表名来拼接时间
            String sss=dataList[0]+"-"+dataList[1]+"-"+dataList[2];
//            System.out.println(sss);
            List<List<Object>>ss= JavaPoiUtil.getExcelList(filely);
            //大类集合
            List<String>datas=new ArrayList<>();
            datas.add("化肥");
            datas.add("农膜");
            datas.add("农药");
            datas.add("饲料及仔猪");
            datas.add("农机用油");

//        datas.add("")


            List<List<Object>>huafei=new ArrayList<>();
            List<List<Object>>nongmo=new ArrayList<>();
            List<List<Object>>nongyao=new ArrayList<>();
            List<List<Object>>siliaojizaizhu=new ArrayList<>();
            List<List<Object>>nongjiyongyou=new ArrayList<>();


            for (int j=0;j<datas.size();j++
            ) {
                //代表一个大类名
                String tableName=datas.get(j);
                boolean stsus=false;

                for (int i=0;i<ss.size()-1;i++){
                    //代表一行数据
                    List<Object>objects=ss.get(i);

                    String p= (String) objects.get(0);
//                    System.out.println(p);
                    //判断是哪个大类
                    if(p.trim().equals(tableName)){
                        stsus=true;
                    }


                    if(i==ss.size()-1){
                        stsus=false;
                        break;
                        //一个大类读完了，跳出循环
                    }else if(j<4&&p.trim().equals(datas.get( j+1))) {
                        stsus=false;
                        break;
                    }



                    if(stsus){
                        //将类名和时间添加到每一行数据的后面
                        objects.add(tableName);
                        objects.add(sss);

                        //将每一行数据添加对对应的类别的表中
                        if(tableName.equals("化肥")){
                            if(!p.equals("化肥")){
                                huafei.add(objects);
                            }

                        }else if(tableName.equals("农膜")){
                            if(!p.equals("农膜")){
                                nongmo.add(objects);
                            }
                        }else if(tableName.equals("农药")){
                            if(!p.equals("农药")){
                                nongyao.add(objects);
                            }
                        }else if(tableName.equals("饲料及仔猪")){
                            if(!p.equals("饲料及仔猪")){
                                siliaojizaizhu.add(objects);
                            }
                        }else if ((tableName.equals("农机用油"))){
                            if(!p.equals("农机用油")){
                                nongjiyongyou.add(objects);
                            }
                        }
                    }
                }

            }

           huafei1.addAll(huafei);
            nongmo1.addAll(nongmo);
            nongyao1.addAll(nongyao);
            siliaojizaizhu1.addAll(siliaojizaizhu);
            nongjiyongyou1.addAll(nongjiyongyou);

        }

        String []col=new String[10];
        col[0]="shangpin_mingcheng";
        col[1]="gui_ge_deng_ji";
        col[2]="ji_liang_dan_wei";
        col[3]="price";
        col[4]="cai_bao_jia_dan_wei";
        col[5]="zhi_biao_jie_shi";
        col[6]="beizhu";
        col[7]="leibie";
        col[8]="shijian";
        JavaPoiUtil.createWorkBook(huafei1,col,"sheet1",2003).write(new FileOutputStream(new File("D:\\化肥.xls")));
        JavaPoiUtil.createWorkBook(nongmo1,col,"sheet1",2003).write(new FileOutputStream(new File("D:\\农膜.xls")));
        JavaPoiUtil.createWorkBook(nongyao1,col,"sheet1",2003).write(new FileOutputStream(new File("D:\\农药.xls")));
        JavaPoiUtil.createWorkBook(siliaojizaizhu1,col,"sheet1",2003).write(new FileOutputStream(new File("D:\\饲料及仔猪.xls")));
        JavaPoiUtil.createWorkBook(nongjiyongyou1,col,"sheet1",2003).write(new FileOutputStream(new File("D:\\农机用油.xls")));

//        File file =new File("C:\\Users\\22894\\Desktop\\居民生活消费品、农业生产资料历史价格\\农业生产资料旬报表\\农业生产资料旬报表2016年\\2016.1.5.xls");
    }
}
