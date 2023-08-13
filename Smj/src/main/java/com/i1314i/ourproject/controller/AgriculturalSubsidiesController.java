package com.i1314i.ourproject.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.i1314i.ourproject.po.ResultMap;
import com.i1314i.ourproject.po.javabean.AgriculturalSubsidies;
import com.i1314i.ourproject.po.javabean.SouSuo;
import com.i1314i.ourproject.service.AgriculturalSubsidiesService;
import com.i1314i.ourproject.utils.common.TemplateUtils;
import com.i1314i.ourproject.utils.excel.JavaPoiUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 叹久
 * @create 2018-10-06 11:09
 * 涉农补贴表
 */
@Controller
@RequestMapping("/asc")
@Api(tags = "涉农补贴")
public class AgriculturalSubsidiesController {
    @Autowired
    AgriculturalSubsidiesService agriculturalSubsidiesService;
    @Autowired
    ResultMap resultMap;

    private Logger logger = LoggerFactory.getLogger(AgriculturalSubsidiesController.class);
    /**
     * 管理端分页获取数据
     */
    @ResponseBody
    @RequestMapping("/getDataByPageAdmin")
    @ApiOperation("管理端分页获取数据")
    public ResultMap getDataByPageAdmin(@RequestParam(value = "pn", defaultValue = "1") Integer pn,HttpServletRequest request) {
        PageHelper.startPage(pn, 3);
        List<AgriculturalSubsidies> list = agriculturalSubsidiesService.getAllAdmin(request);
        PageInfo page = new PageInfo(list, 3);
        return resultMap.start().msg("success").code("200").data(page);
    }
    /**
     * 分页获取数据
     */
    @ResponseBody
    @RequestMapping("/getDataByPage")
    @ApiOperation("分页获取所有数据")
    public ResultMap getDataByPage(@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
        PageHelper.startPage(pn, 3);
        List<AgriculturalSubsidies> list = agriculturalSubsidiesService.getAll();
        PageInfo page = new PageInfo(list, 3);
        return resultMap.start().msg("success").code("200").data(page);
    }



    /**
     * 按照最新时间读取前三条数据
     */
    @ResponseBody
    @RequestMapping(value = "/getDataByDesc",method = RequestMethod.GET)
    @ApiOperation("按照最新时间读取前三条数据")
    public ResultMap getDataByDesc(){
        PageHelper.startPage(1, 3);
        List<AgriculturalSubsidies> list=agriculturalSubsidiesService.getByDateDesc();
        PageInfo page = new PageInfo(list, 3);
        if(list.size()!=0)
            return resultMap.start().msg("success").code("200").data(list);
        else
            return resultMap.start().msg("No Data").code("404");
    }


    /**
     * 得到所有数据
     */
    @ApiOperation("得到所有数据")
    @ResponseBody
    @RequestMapping(value = "/getAll")
    public ResultMap getAll() {
        List<AgriculturalSubsidies> list = agriculturalSubsidiesService.getAll();
        if (list != null)
            return resultMap.start().msg("success").code("200").data(list);
        else
            return resultMap.start().msg("NoData").code("404");
    }



    /**
     * 插入一条数据
     *
     * @param agriculturalSubsidies
     * @return
     */
    //由于ajax传过来的是一个字符串，所以要使用@RequestBody注解进行转换为po对象
    @ResponseBody
    @ApiOperation("插入一条数据")
    @RequestMapping(value = "/insertapc", method = RequestMethod.POST)
    public ResultMap insert(@RequestBody AgriculturalSubsidies agriculturalSubsidies,HttpServletRequest request) {
        boolean flag = agriculturalSubsidiesService.insert(agriculturalSubsidies,request);
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
    @ApiOperation("单个、批量删除二合一")
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
            flag = agriculturalSubsidiesService.deleteAllByPrimaryKey(list);
        } else {
            flag = agriculturalSubsidiesService.deleteOneByPrimaryKey(Integer.parseInt(ids));
        }
        if (flag)
            return resultMap.start().msg("success").code("200");
        else
            return resultMap.start().msg("fail").code("500");
    }

    /**
     * 根据主键更新一条数据
     *
     * @param agriculturalSubsidies
     * @return
     */
    @ResponseBody
    @ApiOperation("根据主键更新一条数据")
    @RequestMapping(value = "/updateapc", method = RequestMethod.POST)
    public ResultMap updateByPrimaryKey(@RequestBody AgriculturalSubsidies agriculturalSubsidies,HttpServletRequest request) {
        boolean flag = false;
        flag = agriculturalSubsidiesService.updateByPrimaryKey(agriculturalSubsidies,request);
        if (flag)
            return resultMap.start().msg("success").code("200");
        return resultMap.start().msg("fail").code("500");
    }

    /**
     * 根据主键查询一条数据
     */
    @ResponseBody
    @ApiOperation("根据主键查询一条数据")
    @RequestMapping(value = "/selectByPK/{id}", method = RequestMethod.GET)
    public ResultMap getDataByPrimaryKey(@PathVariable("id") int id) {
        AgriculturalSubsidies agriculturalSubsidies = agriculturalSubsidiesService.getDataByPrimaryKey(id);
        if (agriculturalSubsidies != null)
            return resultMap.start().msg("success").code("200").data(agriculturalSubsidies);
        else
            return resultMap.start().msg("NoData").code("404");
    }


    /**
     * 根据发放时间范围或者发放金额范围或者信息发布时间范围来检索
     */
    @ApiOperation("根据发放时间范围或者发放金额范围或者信息发布时间范围来检索")
    @ResponseBody
    @RequestMapping("/getSouSuo")
    public ResultMap getSouSuo(@RequestBody SouSuo souSuo) {
        List<AgriculturalSubsidies> list = agriculturalSubsidiesService.getSouSuo(souSuo);
        if (list != null)
            return resultMap.start().msg("success").code("200").data(list);
        else
            return resultMap.start().msg("NoData").code("404");
    }

    /**
     * 根据标题进行模糊搜索
     */
    @ApiOperation("根据标题进行模糊搜索")
    @ResponseBody
    @RequestMapping("/getDataByMoHu/{biaoti}")
    public ResultMap getDataByMoHu(@PathVariable("biaoti") String biaoti){
        List<AgriculturalSubsidies> list = agriculturalSubsidiesService.getDataByMoHu(biaoti);
        if (list != null)
            return resultMap.start().msg("success").code("200").data(list);
        else
            return resultMap.start().msg("NoData").code("404");
    }

    /**
     * 根据发放单位进行搜索（精确）
     */
    @ResponseBody
    @ApiOperation("根据发放单位进行搜索（精确）")
    @RequestMapping("/getDataByDanWei/{danwei}")
    public ResultMap getDataByDanWei(@PathVariable("danwei") String danwei){
        List<AgriculturalSubsidies> list = agriculturalSubsidiesService.getDataByDanWei(danwei);
        if (list != null)
            return resultMap.start().msg("success").code("200").data(list);
        else
            return resultMap.start().msg("NoData").code("404");
    }
    /**
     * 返回数据库中数据的条数
     */
    @ResponseBody
    @ApiOperation("返回数据库中数据的条数")
    @RequestMapping("/selectCountAll")
    public ResultMap selectCountAll(){
        int a=agriculturalSubsidiesService.selectCountAll();
        return resultMap.start().msg("success").code("200").data(a);
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
        String[] keys = {"名称", "发放单位","发放时间", "受益群体", "发放形式", "发放金额", "内容"};
        String[] col = {"name", "fangfangdanwei", "fafangtime", "shouYiQunTi", "fafangXingshi", "money", "content"};
        List<AgriculturalSubsidies> list = new ArrayList<>();
        JavaPoiUtil.createWorkBooks(AgriculturalSubsidies.class, list, col, keys).write(response.getOutputStream());
    }

    /**
     * 导出数据到excel中
     *
     * @param response
     * @throws Exception
     */
    @RequestMapping(value = "/down")
    public void down(HttpServletResponse response) throws Exception {
        JavaPoiUtil.setDownType(response, "涉农补贴数据文件", 2003);
        List<AgriculturalSubsidies> list = agriculturalSubsidiesService.getAll();
        String[] keys = {"名称", "发放单位","发放时间", "受益群体", "发放形式", "发放金额", "内容"};
        String[] col = {"name", "fangfangdanwei", "fafangtime", "shouYiQunTi", "fafangXingshi", "money", "content"};
        JavaPoiUtil.createWorkBooks(AgriculturalSubsidies.class, list, col, keys).write(response.getOutputStream());
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


            for (int i=0; i < lists.size(); i++) {
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

                    agriculturalSubsidiesService.insert(agriculturalSubsidies,request);
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

        List<List<Object>>yuanliang1=new ArrayList<>();
        List<List<Object>>chengpinliang1=new ArrayList<>();
        List<List<Object>>shiyongyou1=new ArrayList<>();
        List<List<Object>>fushipinlei1=new ArrayList<>();
        List<List<Object>>rouqindan1=new ArrayList<>();
        List<List<Object>>shuichanpin1=new ArrayList<>();
        List<List<Object>>shucailei1=new ArrayList<>();
        List<List<Object>>shuiguo1=new ArrayList<>();
        List<List<Object>>shengzhu1=new ArrayList<>();
        List<File> fileList = new ArrayList<File>();
        File file = new File("C:\\Users\\22894\\Desktop\\居民生活消费品、农业生产资料历史价格\\居民生活消费周报表\\6.4\\");
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
            datas.add("原粮");
            datas.add("成品粮");
            datas.add("食用油");
            datas.add("副食品类");
            datas.add("肉禽蛋");
            datas.add("水产品");
            datas.add("蔬菜类");
            datas.add("水果");
            datas.add("生猪");
//        datas.add("")


            List<List<Object>>yuanliang=new ArrayList<>();
            List<List<Object>>chengpinliang=new ArrayList<>();
            List<List<Object>>shiyongyou=new ArrayList<>();
            List<List<Object>>fushipinlei=new ArrayList<>();
            List<List<Object>>rouqindan=new ArrayList<>();
            List<List<Object>>shuichanpin=new ArrayList<>();
            List<List<Object>>shucailei=new ArrayList<>();
            List<List<Object>>shuiguo=new ArrayList<>();
            List<List<Object>>shengzhu=new ArrayList<>();


            for (int j=0;j<datas.size();j++
            ) {
                //代表一个大类名
                String tableName=datas.get(j);
                boolean stsus=false;

                for (int i=0;i<ss.size()-1;i++){
                    //代表一行数据
                    List<Object>objects=ss.get(i);

                    String p= (String) objects.get(0);
                    if (StringUtils.isEmpty(p)) {
                        p="";
                    }
//                    System.out.println(p);
                    //判断是哪个大类
                    if(tableName.equals(p.trim())){
                        stsus=true;
                    }


                    if(i==ss.size()-1){
                        stsus=false;
                        break;
                        //一个大类读完了，跳出循环
                    }else if(j<8&&p.trim().equals(datas.get( j+1))) {
                        stsus=false;
                        break;
                    }



                    if(stsus){
                        //将类名和时间添加到每一行数据的后面
                        objects.add(tableName);
                        objects.add(sss);

                        //将每一行数据添加对对应的类别的表中
                        if(tableName.equals("原粮")){
                            if(!p.equals("原粮")){
                                yuanliang.add(objects);
                            }

                        }else if(tableName.equals("成品粮")){
                            if(!p.equals("成品粮")){
                                chengpinliang.add(objects);
                            }
                        }else if(tableName.equals("食用油")){
                            if(!p.equals("食用油")){
                                shiyongyou.add(objects);
                            }
                        }else if(tableName.equals("副食品类")){
                            if(!p.equals("副食品类")){
                                fushipinlei.add(objects);
                            }
                        }else if ((tableName.equals("肉禽蛋"))){
                            if(!p.equals("肉禽蛋")){
                                rouqindan.add(objects);
                            }
                        }else if ((tableName.equals("水产品"))){
                            if(!p.equals("水产品")){
                                shuichanpin.add(objects);
                            }
                        }else if ((tableName.equals("蔬菜类"))){
                            if(!p.equals("蔬菜类")){
                                shucailei.add(objects);
                            }
                        }else if ((tableName.equals("水果"))){
                            if(!p.equals("水果")){
                                shuiguo.add(objects);
                            }
                        }else if ((tableName.equals("生猪"))){
                            if(!p.equals("生猪")){
                                shengzhu.add(objects);
                            }
                        }
                    }
                }

            }

            yuanliang1.addAll(yuanliang);
            chengpinliang1.addAll(chengpinliang);
            shiyongyou1.addAll(shiyongyou);
            fushipinlei1.addAll(fushipinlei);
            rouqindan1.addAll(rouqindan);
            shuichanpin1.addAll(shuichanpin);
            shucailei1.addAll(shucailei);
            shuiguo1.addAll(shuiguo);
            shengzhu1.addAll(shengzhu);
        }

        String []col=new String[10];
        col[0]="shangpin_mingcheng";
        col[1]="gui_ge_deng_ji";
        col[2]="ji_liang_dan_wei";
        col[3]="ling_shou_chao_shi_jia_ge";
        col[4]="ling_shou_ji_shi_jia_ge";
        col[5]="cai_jia_shi_chang";
        col[6]="beizhu";
        col[7]="zhi_biao_jie_shi";
        col[8]="leibie";
        col[9]="shijian";



        JavaPoiUtil.createWorkBook(yuanliang1,col,"sheet1",2003).write(new FileOutputStream(new File("D:\\原粮.xls")));
        JavaPoiUtil.createWorkBook(chengpinliang1,col,"sheet1",2003).write(new FileOutputStream(new File("D:\\成品粮.xls")));
        JavaPoiUtil.createWorkBook(shiyongyou1,col,"sheet1",2003).write(new FileOutputStream(new File("D:\\食用油.xls")));
        JavaPoiUtil.createWorkBook(fushipinlei1,col,"sheet1",2003).write(new FileOutputStream(new File("D:\\副食品类.xls")));
        JavaPoiUtil.createWorkBook(rouqindan1,col,"sheet1",2003).write(new FileOutputStream(new File("D:\\肉禽蛋.xls")));
        JavaPoiUtil.createWorkBook(shuichanpin1,col,"sheet1",2003).write(new FileOutputStream(new File("D:\\水产品.xls")));
        JavaPoiUtil.createWorkBook(shucailei1,col,"sheet1",2003).write(new FileOutputStream(new File("D:\\蔬菜类.xls")));
        JavaPoiUtil.createWorkBook(shuiguo1,col,"sheet1",2003).write(new FileOutputStream(new File("D:\\水果.xls")));
        JavaPoiUtil.createWorkBook(shengzhu1,col,"sheet1",2003).write(new FileOutputStream(new File("D:\\生猪.xls")));

    }
}
