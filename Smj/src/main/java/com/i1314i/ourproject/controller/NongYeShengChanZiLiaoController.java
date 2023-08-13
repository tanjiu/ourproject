package com.i1314i.ourproject.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.i1314i.ourproject.po.ResultMap;
import com.i1314i.ourproject.po.javabean.*;
import com.i1314i.ourproject.service.NongYeShengChanZiLiaoService;
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
import java.io.InputStream;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 叹久
 * @create 2018-11-19 18:29
 */
@Api("农业生产资料")
@Controller
@RequestMapping("/nysczlc")
public class NongYeShengChanZiLiaoController {
    @Autowired
    private NongYeShengChanZiLiaoService nongYeShengChanZiLiaoService;
    @Autowired
    private ResultMap resultMap;

    private Logger logger = LoggerFactory.getLogger(NongYeShengChanZiLiaoController.class);

    /**
     * 分页获取数据
     */
    @ResponseBody
    @RequestMapping("/getDataByPage")
    public ResultMap getDataByPage(@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
        PageHelper.startPage(pn, 5);
        List<NongYeShengChanZiLiao> list = nongYeShengChanZiLiaoService.getAll();
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
        List<NongYeShengChanZiLiao> list = nongYeShengChanZiLiaoService.getAll();
        return resultMap.start().msg("success").code("200").data(list);
    }


    /**
     * 插入一条数据
     *
     * @param nongYeShengChanZiLiao
     * @return
     */
    //由于ajax传过来的是一个字符串，所以要使用@RequestBody注解进行转换为po对象
    @ResponseBody
    @RequestMapping(value = "/insertapc", method = RequestMethod.POST)
    public ResultMap insert(@RequestBody NongYeShengChanZiLiao nongYeShengChanZiLiao) {
        boolean flag = nongYeShengChanZiLiaoService.insert(nongYeShengChanZiLiao);
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
            flag = nongYeShengChanZiLiaoService.deleteAllByPrimaryKey(list);
        } else {
            flag = nongYeShengChanZiLiaoService.deleteOneByPrimaryKey(Integer.parseInt(ids));
        }
        if (flag)
            return resultMap.start().msg("success").code("200");
        else
            return resultMap.start().msg("fail").code("500");
    }


    /**
     * 根据主键更新一条数据
     *
     * @param nongYeShengChanZiLiao
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/updateapc", method = RequestMethod.POST)
    public ResultMap updateByPrimaryKey(@RequestBody NongYeShengChanZiLiao nongYeShengChanZiLiao) {
        boolean flag = false;
        flag = nongYeShengChanZiLiaoService.updateByPrimaryKey(nongYeShengChanZiLiao);
        if (flag)
            return resultMap.start().msg("success").code("200");
        return resultMap.start().msg("fail").code("500");
    }


    /**
     * 根据主键查询一条数据
     */
    @ResponseBody
    @RequestMapping(value = "/selectByPK/{id}", method = RequestMethod.GET)
    public ResultMap getNongYeShengChanZiLiaoByPrimaryKey(@PathVariable("id") int id) {
        NongYeShengChanZiLiao nongYeShengChanZiLiao = nongYeShengChanZiLiaoService.getNongYeShengChanZiLiaoByPrimaryKey(id);
        if (nongYeShengChanZiLiao != null)
            return resultMap.start().msg("success").code("200").data(nongYeShengChanZiLiao);
        else
            return resultMap.start().msg("NoData").code("404");
    }

    /**
     * 根据名称进行模糊查询
     * 请求中的参数要与po对象中的属性名一致才可以使用@RequestBody进行自动转换
     */
    //http://localhost:8081/APC/selectByBiaoTi?name=6
    @ApiOperation("根据名称进行模糊查询")
    @ResponseBody
    @RequestMapping(value = "/selectByBiaoTi", method = RequestMethod.GET)
    public ResultMap getNongYeShengChanZiLiaoByMoHu(@RequestParam("name") String biaoti) {
        List<NongYeShengChanZiLiao> list = nongYeShengChanZiLiaoService.getNongYeShengChanZiLiaoByMoHu(biaoti);
        if (list.size() != 0)
            return resultMap.start().msg("success").code("200").data(list);
        return resultMap.start().msg("NoData").code("500");
    }

    /**
     * 多个名称进行同时查询
     */
    @ResponseBody
    @RequestMapping(value = "/selectByName", method = RequestMethod.POST)
    public ResultMap selectByMingCheng(@RequestParam List<String> name) {
        List<NongYeShengChanZiLiao> list = nongYeShengChanZiLiaoService.selectByMingCheng(name);
        if (list.size() != 0)
            return resultMap.start().msg("success").code("200").data(list);
        return resultMap.start().msg("NoData").code("500");
    }

    /**
     * 根据商品名称和规格等级查询出某种产品的全部数据，升序
     */
    //http://localhost:8081/APC/selectByBiaoTi?name=6
    @ApiOperation("根据商品名称和规格等级查询出某种产品的全部数据，升序")
    @ResponseBody
    @RequestMapping(value = "/selectByBiaoTis", method = RequestMethod.POST)
    public ResultMap getNongYeShengChanZiLiaoByMoHus(@RequestParam List<String> name, @RequestParam List<String> dengji) {
        List<NongYeShengChanZiLiao> list = nongYeShengChanZiLiaoService.getNongYeShengChanZiLiaoByMoHus(name, dengji);
        if (list.size() != 0)
            return resultMap.start().msg("success").code("200").data(list);
        return resultMap.start().msg("NoData").code("500");
    }


    /**
     * 根据多个商品名称和规格等级进行查询，每种返回最新的七条数据,每组数据升序
     */
    //http://localhost:8081/APC/selectByBiaoTi?name=6
    @ApiOperation("根据多个商品名称和规格等级进行查询，每种返回最新的七条数据,每组数据升序")
    @ResponseBody
    @RequestMapping(value = "/getNYSCZLByMoHuReturnSeven", method = RequestMethod.POST)
    public ResultMap getNYSCZLByMoHuReturnSeven(@RequestParam List<String> name, @RequestParam List<String> dengji) {
        List<NongYeShengChanZiLiao> list = nongYeShengChanZiLiaoService.getNYSCZLByMoHuReturnSeven(name, dengji);
        if (list.size() != 0)
            return resultMap.start().msg("success").code("200").data(list);
        return resultMap.start().msg("NoData").code("500");
    }


    /**
     * 根据名称查询出某种产品的全部数据，升序
     */
    //http://localhost:8081/APC/selectByBiaoTi?name=6
    @ApiOperation("根据名称查询出某种产品的全部数据，升序")
    @ResponseBody
    @RequestMapping(value = "/getNongYeShengChanZiLiaoByMoHuAndMingCheng", method = RequestMethod.POST)
    public ResultMap getNongYeShengChanZiLiaoByMoHuAndMingCheng(@RequestParam List<String> name) {
        List<NongYeShengChanZiLiao> list = nongYeShengChanZiLiaoService.getNongYeShengChanZiLiaoByMoHuAndMingCheng(name);
        if (list.size() != 0)
            return resultMap.start().msg("success").code("200").data(list);
        return resultMap.start().msg("NoData").code("500");
    }


    /**
     * 根据具体时间查询数据
     */
    @ApiOperation("根据具体时间查询数据")
    @ResponseBody
    @RequestMapping(value = "/getDataByTime/{date}", method = RequestMethod.GET)
    public ResultMap getDataByTime(@PathVariable("date") Date time, @RequestParam(value = "pn", defaultValue = "1") Integer pn) {
        PageHelper.startPage(pn, 10);
        List<NongYeShengChanZiLiao> list = nongYeShengChanZiLiaoService.getDataByTime(time);
        PageInfo page = new PageInfo(list, 10);
        if (list.size() != 0)
            return resultMap.start().msg("success").code("200").data(page);
        return resultMap.start().msg("NoData").code("500");
    }

    /**
     * 根据时间删除数据
     */
    @ApiOperation("根据时间删除数据")
    @ResponseBody
    @RequestMapping(value = "/deleteByTime/{date}", method = RequestMethod.GET)
    public ResultMap deleteByTime(@PathVariable("date") String time) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date date = format.parse(time);
        boolean a = nongYeShengChanZiLiaoService.deleteByTime(date);
        if (a)
            return resultMap.start().msg("success").code("200").data("删除成功");
        return resultMap.start().msg("NoData").code("删除失败");
    }

    /**
     * 查询出过去7天内的数据
     */
    @ApiOperation("查询出过去7天内的数据")
    @ResponseBody
    @RequestMapping(value = "/selectByTimes", method = RequestMethod.GET)
    public ResultMap selectByTimes(@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
        PageHelper.startPage(pn, 5);
        List<NongYeShengChanZiLiao> list = nongYeShengChanZiLiaoService.selectByTimes();
        PageInfo page = new PageInfo(list, 5);
        if (list.size() != 0)
            return resultMap.start().msg("success").code("200").data(page);
        return resultMap.start().msg("NoData").code("500");
    }

    /**
     * 查询出一条数据，测试用
     */
    @ApiOperation("根据名称查询出一条相关数据")
    @ResponseBody
    @RequestMapping(value = "/selectByTypeOness", method = RequestMethod.POST)
    public NongYeShengChanZiLiao selectByTypeOne(@RequestParam("mingcheng") String mingcheng) {
        NongYeShengChanZiLiao nongYeShengChanZiLiao = nongYeShengChanZiLiaoService.selectTypeOne(mingcheng);
        return nongYeShengChanZiLiao;
    }

    /**
     * 查询出所有的时间
     */
    @ApiOperation("查询出所有的时间,返回一个时间列表")
    @ResponseBody
    @RequestMapping(value = "/selectTimes", method = RequestMethod.GET)
    public ResultMap slectTimes(@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
        PageHelper.startPage(pn, 5);
        List<String> list = nongYeShengChanZiLiaoService.slectTimes();
        PageInfo page = new PageInfo(list, 5);
        if (list.size() != 0) {
            return resultMap.start().msg("success").code("200").data(page);
        }
        return resultMap.start().msg("NoData").code("500");
    }


    //判断是否可以转换成数数字
    public boolean isNumber(Object obj) {
        if (obj instanceof Number) {
            return true;
        } else if (obj instanceof String) {
            try {
                Double.parseDouble((String) obj);
                return true;
            } catch (Exception e) {
                return false;
            }
        }
        return false;
    }

    /**
     * 判断是否可以转换为合法的日期
     *
     * @param str
     * @return
     */
    public static boolean isValidDate(String str) {
        boolean convertSuccess = true;
//　　　　　// 指定日期格式为四位年/两位月份/两位日期，注意yyyy/MM/dd区分大小写；
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
//　　　　　// 设置lenient为false. 否则SimpleDateFormat会比较宽松地验证日期，比如2007/02/29会被接受，并转换成2007/03/01
            format.setLenient(false);
            format.parse(str);
        } catch (ParseException e) {
            // e.printStackTrace();
// 如果throw java.text.ParseException或者NullPointerException，就说明格式不对
            convertSuccess = false;
        }
        return convertSuccess;
    }

    //导入补充信息
    @ApiOperation("农业生产资料导入接口")
    @ResponseBody
    @RequestMapping(value = "/daoru")
    public ResultMap uploadbc(@RequestParam(value = "file", required = false) MultipartFile file, HttpServletRequest request) throws Exception {

        String msg = "";
        int failnum = 0;
        int updatenum = 0;
        Integer all = 0;
        //用来保存哪一行出错了
        String hangshu = "";

        String pa = TemplateUtils.uuid();
        Map<String, String> map = new HashMap<>();
        String path = pa + file.getOriginalFilename();


        if (path.indexOf(".xls") <= 0 && path.indexOf(".xlsx") <= 0) {
            logger.info(":更新数据失败，文件格式不正确");
            msg = "更新数据失败，请上传正确格式的文件";
        } else {
            InputStream is = file.getInputStream();

            //根据文件名获得时间
            String dates = file.getOriginalFilename();
            //将文件名中的除数字以外的字符全部转换成空
            dates= dates.replaceAll("[^0-9\\.]", "");
            logger.info("正则后的文件名是："+dates);
            System.out.println("正则后的文件名是："+dates);

            String[] dataList = dates.split("\\.");
            System.out.println(dates);
            if (dataList[1].length() == 1) {
                dataList[1] = "0" + dataList[1];
            }
            if (dataList[2].length() == 1) {
                dataList[2] = "0" + dataList[2];
            }
            //根据表名来拼接时间
            String time = dataList[0] + "-" + dataList[1] + "-" + dataList[2];
//            System.out.println("文件名称的时间拼接-----" + time);
            if (!isValidDate(time)) {
                return resultMap.start().msg("文件名只能为日期，如2018.2.6，同时请保证日期的正确性").code("500");
            }

            List<List<Object>> lists = JavaPoiUtil.getExcelList(is, path);
            all = lists.size();

            //从哪一行开始，看找商品名称这个字段
            int h = 0;
            int x = 0;
            for (h = 0; h < lists.size(); h++) {
                try {
                    List<Object> list = lists.get(h);
                    String col1 = String.valueOf(list.get(0));
                    if ("商品名称".equals(col1)) {
                        x = h + 1;
                        break;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    msg = "商品名称应该在第一列，未找到此列！";
                    return resultMap.start().msg(msg).code("500");
                }
            }
            for (int i = x; i < lists.size(); i++) {
                try {
                    List<Object> list = new ArrayList<>();
                    list = lists.get(i);
//                    logger.info(JSON.toJSONString(list));

//                    if(null==list){
//                        System.out.println("list is null");
//
//                    }
//
//
//
//                    try{
//                        System.out.println(list.size());
//                    }catch (Exception e){
//
//                    }

                    System.out.println("第" + i + "行的内容是：" + lists.get(i).toString());
                    logger.info("第" + i + "行的内容是：" + lists.get(i).toString());
                    NongYeShengChanZiLiao nongYeShengChanZiLiao = new NongYeShengChanZiLiao();
                    System.out.println("第" + i + "行的第二列的值是：" + list.get(1));
                    if ((StringUtils.isEmpty(list.get(0)) ||list.get(0) == "null")){
                        continue;
                    }
                   else if ((!StringUtils.isEmpty(list.get(0)) && list.get(0) != "null"))
                        nongYeShengChanZiLiao.setShangpinMingcheng(String.valueOf(list.get(0)).trim());
                    if ((!StringUtils.isEmpty(list.get(1)) && list.get(1) != "null"))
                        nongYeShengChanZiLiao.setGuiGeDengJi(String.valueOf(list.get(1)).trim());
                    if ((!StringUtils.isEmpty(list.get(2)) && list.get(2) != "null"))
                        nongYeShengChanZiLiao.setJiLiangDanWei(String.valueOf(list.get(2)).trim());
//                    System.out.println("价格是：------------------------------------" + Double.valueOf(list.get(3).toString().trim()));
                    //判断是否可以进行类型转换
                    if (isNumber(list.get(3)))
                        nongYeShengChanZiLiao.setPrice(Double.valueOf(list.get(3).toString().trim()));
                    if ((!StringUtils.isEmpty(list.get(4)) && list.get(4) != "null"))
                        nongYeShengChanZiLiao.setBeizhu(String.valueOf(list.get(4)).trim());
                    if ((!StringUtils.isEmpty(list.get(5)) && list.get(5) != "null"))
                        nongYeShengChanZiLiao.setZhiBiaoJieShi(String.valueOf(list.get(5)).trim());
                    //插入时间
                    nongYeShengChanZiLiao.setShijian(Date.valueOf(time));

                    //查找该类的品种
                    NongYeShengChanZiLiao nongYeShengChanZiLiao1 = nongYeShengChanZiLiaoService.selectTypeOne(String.valueOf(list.get(0)).trim());
                    if (nongYeShengChanZiLiao1 != null && nongYeShengChanZiLiao1.getLeibie() != null && nongYeShengChanZiLiao1.getLeibie() != "null") {
                        nongYeShengChanZiLiao.setLeibie(nongYeShengChanZiLiao1.getLeibie().trim());
                    }
                    //插入数据
                    boolean a = nongYeShengChanZiLiaoService.insert(nongYeShengChanZiLiao);
                    if (a)
                        updatenum++;
                } catch (Exception e) {
//                    e.printStackTrace();
                    failnum++;
                    int a = i + 2;
                    hangshu += "第" + a + "行 ";
                }

                msg = "成功更新" + updatenum + "条," + "更新失败" + failnum + "条";
//                msg = "成功更新";
            }
        }
//        map.put("msg", msg);
        if (hangshu.length() == 0) {
            System.out.println("长度为" + hangshu.length());
            System.out.println(hangshu);
            return resultMap.start().msg(msg).code("200");
        } else {
            return resultMap.start().msg(hangshu + "出错了，请查看并将以上数据重新导入\n" + msg+"\n若出错行数过多，请检查是否已经取消单元格锁定").code("500");
        }
    }

    //导入补充信息
    @ApiOperation("测试-农业生产资料导入接口")
    @ResponseBody
    @RequestMapping(value = "/daoruTest")
    public ResultMap uploadbcTest(@RequestParam(value = "file", required = false) MultipartFile file, HttpServletRequest request) throws Exception {

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

            //根据文件名获得时间
            String dates = file.getOriginalFilename();
            String[] dataList = dates.split("\\.");
            System.out.println(dates);
            if (dataList[1].length() == 1) {
                dataList[1] = "0" + dataList[1];
            }
            if (dataList[2].length() == 1) {
                dataList[2] = "0" + dataList[2];
            }
            //根据表名来拼接时间
            String time = dataList[0] + "-" + dataList[1] + "-" + dataList[2];
//            System.out.println("文件名称的时间拼接-----" + time);

            List<List<Object>> lists = JavaPoiUtil.getExcelList(is, path);
            all = lists.size();

            //从哪一行开始，看找商品名称这个字段
            int h = 0;
            int x = 0;
            for (h = 0; h < lists.size(); h++) {
                try {
                    List<Object> list = lists.get(h);
                    String col1 = String.valueOf(list.get(0));
//                    System.out.println("col1的值是"+col1);
                    if ("商品名称".equals(col1)) {
                        x = h + 1;
                        break;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            for (int i = x; i < lists.size(); i++) {
                try {
                    List<Object> list = lists.get(i);
                    NongYeShengChanZiLiao nongYeShengChanZiLiao = new NongYeShengChanZiLiao();
                    nongYeShengChanZiLiao.setShangpinMingcheng(String.valueOf(list.get(0)).trim());
                    nongYeShengChanZiLiao.setGuiGeDengJi(String.valueOf(list.get(1)).trim());
                    nongYeShengChanZiLiao.setJiLiangDanWei(String.valueOf(list.get(2)).trim());
//                    System.out.println("价格是：------------------------------------" + Double.valueOf(list.get(3).toString().trim()));
                    //判断是否可以进行类型转换
                    if (isNumber(list.get(3)))
                        nongYeShengChanZiLiao.setPrice(Double.valueOf(list.get(3).toString().trim()));
                    if ((!StringUtils.isEmpty(list.get(4)) && list.get(4) != "null"))
                        nongYeShengChanZiLiao.setBeizhu(String.valueOf(list.get(4)).trim());
                    if (isNumber(list.get(3)))
                        nongYeShengChanZiLiao.setPrice(Double.valueOf(list.get(3).toString().trim()));
                    if ((!StringUtils.isEmpty(list.get(4)) && list.get(4) != "null"))
                        nongYeShengChanZiLiao.setBeizhu(String.valueOf(list.get(4)).trim());
                    if ((!StringUtils.isEmpty(list.get(5)) && list.get(5) != "null"))
                        nongYeShengChanZiLiao.setZhiBiaoJieShi(String.valueOf(list.get(5)).trim());
                    //插入时间
                    nongYeShengChanZiLiao.setShijian(Date.valueOf(time));

                    //查找该类的品种
                    NongYeShengChanZiLiao nongYeShengChanZiLiao1 = nongYeShengChanZiLiaoService.selectTypeOne(String.valueOf(list.get(0)).trim());
                    if (nongYeShengChanZiLiao1 != null) {
                        nongYeShengChanZiLiao.setLeibie(nongYeShengChanZiLiao1.getLeibie().trim());
                    }
                    //插入数据
                    boolean a = nongYeShengChanZiLiaoService.insert(nongYeShengChanZiLiao);
                    if (a)
                        updatenum++;
                } catch (Exception e) {
                    failnum++;
                }

                msg = "成功更新" + updatenum + "条," + "更新失败" + failnum + "条";
            }
        }
//        map.put("msg", msg);
        return resultMap.start().msg(msg).
                code("200");
    }

    /**
     * 导出数据到excel中
     *
     * @param response
     * @param time
     * @throws Exception
     */
    @ApiOperation("按照时间导出到excel,参数格式为2018-1-12")
    @RequestMapping(value = "/down/{shijian}")
    public void down(HttpServletResponse response, @PathVariable("shijian") String time) throws Exception {
        JavaPoiUtil.setDownType(response, time.toString(), 2003);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date date = format.parse(time);
        List<NongYeShengChanZiLiao> lists = nongYeShengChanZiLiaoService.getDataByTime(date);
        String[] map = {"shangpinMingcheng", "guiGeDengJi", "jiLiangDanWei", "price", "beizhu", "zhiBiaoJieShi"};
        String[] name = {"商品名称", "规格等级", "计量单位", "价格", "备注", "指标解释"};
        JavaPoiUtil.createWorkBooks(NongYeShengChanZiLiao.class, lists, map, name).write(response.getOutputStream());
    }


    /**
     * 导出数据到excel中
     *
     * @param response
     * @param time
     * @throws Exception
     */
    @ApiOperation("将全部数据导出到excel,参数格式为2018-1-12")
    @RequestMapping(value = "/downall/{shijian}")
    public void downs(HttpServletResponse response, @PathVariable("shijian") String time) throws Exception {
        JavaPoiUtil.setDownType(response, time.toString(), 2003);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date date = format.parse(time);
        List<NongYeShengChanZiLiao> lists = nongYeShengChanZiLiaoService.getAll();
        String[] map = {"shangpinMingcheng", "guiGeDengJi", "jiLiangDanWei", "price", "beizhu", "zhiBiaoJieShi"};
        String[] name = {"商品名称", "规格等级", "计量单位", "价格", "备注", "指标解释"};
        JavaPoiUtil.createWorkBooks(NongYeShengChanZiLiao.class, lists, map, name).write(response.getOutputStream());
    }

}
