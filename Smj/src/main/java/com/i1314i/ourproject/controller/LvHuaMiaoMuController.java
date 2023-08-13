package com.i1314i.ourproject.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.i1314i.ourproject.po.ResultMap;
import com.i1314i.ourproject.po.javabean.*;
import com.i1314i.ourproject.service.HuiNongImageService;
import com.i1314i.ourproject.service.LhmmZhiBiaoService;
import com.i1314i.ourproject.service.LvHuaMiaoMuService;
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

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author 叹久
 * @create 2018-11-19 18:33
 */
@Controller
@RequestMapping("/lhmmc")
@Api("绿化苗木")
public class LvHuaMiaoMuController {
    @Autowired
    private LvHuaMiaoMuService lvHuaMiaoMuService;
    @Autowired
    private ResultMap resultMap;
    @Autowired
    private HuiNongImageService huiNongImageService;
    @Autowired
    private LhmmZhiBiaoService lhmmZhiBiaoService;

    private Logger logger = LoggerFactory.getLogger(LvHuaMiaoMuController.class);

    /**
     * 分页获取数据
     */
    @ResponseBody
    @RequestMapping("/getDataByPage")
    public ResultMap getDataByPage(@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
        PageHelper.startPage(pn, 5);
        List<LvHuaMiaoMu> list = lvHuaMiaoMuService.getAll();
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
        List<LvHuaMiaoMu> list = lvHuaMiaoMuService.getAll();
        return resultMap.start().msg("success").code("200").data(list);
    }


    /**
     * 插入一条数据
     *
     * @param lvHuaMiaoMu
     * @return
     */
    //由于ajax传过来的是一个字符串，所以要使用@RequestBody注解进行转换为po对象
    @ResponseBody
    @RequestMapping(value = "/insertapc", method = RequestMethod.POST)
    public ResultMap insert(@RequestBody LvHuaMiaoMu lvHuaMiaoMu) {
        boolean flag = lvHuaMiaoMuService.insert(lvHuaMiaoMu);
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
            flag = lvHuaMiaoMuService.deleteAllByPrimaryKey(list);
        } else {
            flag = lvHuaMiaoMuService.deleteOneByPrimaryKey(Integer.parseInt(ids));
        }
        if (flag)
            return resultMap.start().msg("success").code("200");
        else
            return resultMap.start().msg("fail").code("500");
    }


    /**
     * 根据主键更新一条数据
     *
     * @param lvHuaMiaoMu
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/updateapc", method = RequestMethod.POST)
    public ResultMap updateByPrimaryKey(@RequestBody LvHuaMiaoMu lvHuaMiaoMu) {
        boolean flag = false;
        flag = lvHuaMiaoMuService.updateByPrimaryKey(lvHuaMiaoMu);
        if (flag)
            return resultMap.start().msg("success").code("200");
        return resultMap.start().msg("fail").code("500");
    }


    /**
     * 根据主键查询一条数据
     */
    @ResponseBody
    @RequestMapping(value = "/selectByPK/{id}", method = RequestMethod.GET)
    public ResultMap getLvHuaMiaoMuByPrimaryKey(@PathVariable("id") int id) {
        LvHuaMiaoMu lvHuaMiaoMu = lvHuaMiaoMuService.getLvHuaMiaoMuByPrimaryKey(id);
        if (lvHuaMiaoMu != null)
            return resultMap.start().msg("success").code("200").data(lvHuaMiaoMu);
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
    public ResultMap getLvHuaMiaoMuByMoHu(@RequestParam("name") String biaoti,@RequestParam("dengji") String dengji) {
        List<LvHuaMiaoMu> list = lvHuaMiaoMuService.getLvHuaMiaoMuByMoHu(biaoti,dengji);
        if (list.size() != 0)
            return resultMap.start().msg("success").code("200").data(list);
        return resultMap.start().msg("NoData").code("500");
    }


    /**
     * 查询出所有的时间
     */
    @ResponseBody
    @RequestMapping(value = "/selectTimes", method = RequestMethod.GET)
    public ResultMap slectTimes(@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
        PageHelper.startPage(pn, 5);
        List<String> list = lvHuaMiaoMuService.slectTimes();
        PageInfo page = new PageInfo(list, 5);
        if (list.size() != 0) {
            return resultMap.start().msg("success").code("200").data(page);
        }
        return resultMap.start().msg("NoData").code("500");
    }

    /**
     * 根据具体时间查询数据
     */
    @ApiOperation("根据具体时间查询数据")
    @ResponseBody
    @RequestMapping(value = "/getDataByTime/{date}", method = RequestMethod.GET)
    public ResultMap getDataByTime(@PathVariable("date") String time) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date date = format.parse(time);
        List<LvHuaMiaoMu> list = lvHuaMiaoMuService.getDataByTime(date);
        if (list.size() != 0)
            return resultMap.start().msg("success").code("200").data(list);
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
        boolean a = lvHuaMiaoMuService.deleteByTime(date);
        if (a)
            return resultMap.start().msg("success").code("200").data("删除成功");
        return resultMap.start().msg("NoData").code("删除失败");
    }

    /**
     * 返回所有的树名
     *
     * @return
     */
    @ApiOperation("返回所有的树名")
    @ResponseBody
    @RequestMapping(value = "/selectAllName", method = RequestMethod.GET)
    public ResultMap selectAllName() {
        List<String> list = lvHuaMiaoMuService.selectAllName();
        if (list.size() != 0)
            return resultMap.start().msg("success").code("200").data(list);
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
     * 导出数据到excel中、制表方需要做
     *
     * @param response
     * @throws Exception
     */
    @ApiOperation("导出excel")
    @RequestMapping(value = "/down")
    public void down(HttpServletResponse response) throws Exception {
        JavaPoiUtil.setDownType(response, "绿化苗木价格数据文件", 2003);
        List<LvHuaMiaoMu> list = lvHuaMiaoMuService.getAll();
        String[] map = {"name", "type", "content"};
        String[] name = {"名称", "类型", "内容"};
        JavaPoiUtil.createWorkBooks(LvHuaMiaoMu.class, list, map, name).write(response.getOutputStream());

    }


    //导入补充信息
    @ResponseBody
    @RequestMapping(value = "/daoruTest")
    @ApiOperation("test导入excel")
    public ResultMap uploadbc(@RequestParam(value = "file", required = true) MultipartFile file, HttpServletRequest request) throws Exception {

        String msg = "";
        int failnum = 0;
        int updatenum = 0;
        Integer all = 0;

        String pa = TemplateUtils.uuid();
        Map<String, String> map = new HashMap<>();
        String path = pa + file.getOriginalFilename();
        System.out.println("文件名是：" + path);
        if (path.indexOf(".xls") <= 0 && path.indexOf(".xlsx") <= 0) {
            logger.info(":更新数据失败，文件格式不正确");
            msg = "更新数据失败，请上传正确格式的文件";
        } else {
            InputStream is = file.getInputStream();
            List<List<Object>> lists = JavaPoiUtil.getExcelList(is, path);
            all = lists.size();
            //第0行是制表方和时间，分别为第一列和第三列，最上面的标题不读
            //第一行是表头，第二行开始是数据

            //读取excel表的第二行，制表方和时间
            List<Object> list1 = lists.get(0);
            LhmmZhiBiao lhmmZhiBiao = new LhmmZhiBiao();
            lhmmZhiBiao.setZhiBiaoDanWei(String.valueOf(list1.get(0)).trim());
            SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd");
            System.out.println("从excel中读出来的时间是：" + list1.get(3).toString());
            Date date;
            try {
                date = format.parse(String.valueOf(list1.get(3)));
            } catch (Exception e) {
                msg = "时间单元格位置错误或时间格式错误";
                return resultMap.start().msg(msg).code("500");
            }
            System.out.println("时间是：" + date.toString());
            //将制表方和时间插入到制表方表中
            lhmmZhiBiao.setShijian(date);
//            if(list1.get(3) instanceof  Date){
//                lhmmZhiBiao.setShijian(date);
//            }

            //将制表方和时间插入到绿化苗木制表方表中
            lhmmZhiBiaoService.insert(lhmmZhiBiao);

            //读取树名图片表的所有数据
            List<HuiNongImage> listImage = huiNongImageService.getAll();
            //读主干数据，价格
            for (int i = 2; i < lists.size(); i++) {
                try {
                    List<Object> list = lists.get(i);
                    LvHuaMiaoMu lvHuaMiaoMu = new LvHuaMiaoMu();
                    if ((StringUtils.isEmpty(list.get(0)) || list.get(0) == "null"))
                        continue;
                    lvHuaMiaoMu.setMingcheng(String.valueOf(list.get(1)).trim());
                    lvHuaMiaoMu.setGuiGe(String.valueOf(list.get(2)).trim());
                    if (isNumber(list.get(3).toString()))
                        lvHuaMiaoMu.setDanJia(Double.valueOf(list.get(3).toString()));
                    lvHuaMiaoMu.setBeizhu(String.valueOf(list.get(4)).trim());
                    System.out.println("插入到数据库之前的时间是：" + date);
                    lvHuaMiaoMu.setShijian(date);
                    //树名
                    String shuming = String.valueOf(list.get(1)).trim();
                    //结合树名-图片表，对数据的图片字段进行赋值
                    for (HuiNongImage huiNongImage : listImage) {
                        if (huiNongImage.getShuming().equals(shuming)) {
                            lvHuaMiaoMu.setImageId(huiNongImage.getImageId());
                            break;
                        }
                    }
                    //插入数据
                    boolean a = lvHuaMiaoMuService.insert(lvHuaMiaoMu);
                    if (a)
                        updatenum++;
                } catch (Exception e) {
                    failnum++;
                }
                msg = "成功更新" + updatenum + "条," + "更新失败" + failnum + "条";
//                msg = "成功更新";
            }
        }
        return resultMap.start().msg(msg).code("200");
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
    //通过文件名导入日期
    @ResponseBody
    @RequestMapping(value = "/daoru")
    @ApiOperation("导入excel")
    public ResultMap uploadbcTest(@RequestParam(value = "file", required = true) MultipartFile file, HttpServletRequest request) throws Exception {

        String msg = "";
        int failnum = 0;
        int updatenum = 0;
        Integer all = 0;
        //用来保存哪一行出错了
        String hangshu = "";


        String pa = TemplateUtils.uuid();
        Map<String, String> map = new HashMap<>();
        String path = pa + file.getOriginalFilename();
        System.out.println("文件名是：" + path);
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
            System.out.println("拼接后的时间是："+time);
            if (!isValidDate(time)) {
                return resultMap.start().msg("文件名只能为日期，如2018.2.6，同时请保证日期的正确性").code("500");
            }


            List<List<Object>> lists = JavaPoiUtil.getExcelList(is, path);
            all = lists.size();
            //第0行是制表方和时间，分别为第一列和第三列，最上面的标题不读
            //第一行是表头，第二行开始是数据

            //读取excel表的第二行，制表方和时间
            List<Object> list1 = lists.get(0);
            LhmmZhiBiao lhmmZhiBiao = new LhmmZhiBiao();
            lhmmZhiBiao.setZhiBiaoDanWei(String.valueOf(list1.get(0)).trim());
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");


            Date date;
            try {
                date = format.parse(time);
            } catch (Exception e) {
                msg = "时间单元格位置错误或时间格式错误";
                return resultMap.start().msg(msg).code("500");
            }
            System.out.println("时间是：" + date.toString());
            //将制表方和时间插入到制表方表中
            lhmmZhiBiao.setShijian(date);
//            if(list1.get(3) instanceof  Date){
//                lhmmZhiBiao.setShijian(date);
//            }

            //将制表方和时间插入到绿化苗木制表方表中
            lhmmZhiBiaoService.insert(lhmmZhiBiao);

            //读取树名图片表的所有数据
            List<HuiNongImage> listImage = huiNongImageService.getAll();
            //读主干数据，价格
            for (int i = 2; i < lists.size(); i++) {
                try {
                    List<Object> list = lists.get(i);
                    LvHuaMiaoMu lvHuaMiaoMu = new LvHuaMiaoMu();
                    if ((StringUtils.isEmpty(list.get(0)) || list.get(0) == "null"))
                        continue;
                    lvHuaMiaoMu.setMingcheng(String.valueOf(list.get(1)).trim());
                    lvHuaMiaoMu.setGuiGe(String.valueOf(list.get(2)).trim());
                    if (isNumber(list.get(3).toString()))
                        lvHuaMiaoMu.setDanJia(Double.valueOf(list.get(3).toString()));
                    lvHuaMiaoMu.setBeizhu(String.valueOf(list.get(4)).trim());
                    System.out.println("插入到数据库之前的时间是：" + date);
                    lvHuaMiaoMu.setShijian(date);
                    //树名
                    String shuming = String.valueOf(list.get(1)).trim();
                    //结合树名-图片表，对数据的图片字段进行赋值
                    for (HuiNongImage huiNongImage : listImage) {
                        if (huiNongImage.getShuming().equals(shuming)) {
                            lvHuaMiaoMu.setImageId(huiNongImage.getImageId());
                            break;
                        }
                    }
                    //插入数据
                    boolean a = lvHuaMiaoMuService.insert(lvHuaMiaoMu);
                    if (a)
                        updatenum++;
                } catch (Exception e) {
                    failnum++;
                    int a = i + 2;
                    hangshu += "第" + a + "行 ";
                }
                msg = "成功更新" + updatenum + "条," + "更新失败" + failnum + "条";
//                msg = "成功更新";
            }
        }
        if (hangshu.length() == 0) {
            System.out.println("长度为" + hangshu.length());
            System.out.println(hangshu);
            return resultMap.start().msg(msg).code("200");
        } else {
            return resultMap.start().msg(hangshu + "出错了，请查看并将以上数据重新导入\n" + msg+"\n若出错行数过多，请检查是否已经取消单元格锁定").code("500");
        }
    }


    //导入补充信息，通过excel表内的时间导入
    @ResponseBody
    @RequestMapping(value = "/daoru1")
    @ApiOperation("导入excel")
    public ResultMap uploadbcTest1(@RequestParam(value = "file", required = true) MultipartFile file, HttpServletRequest request) throws Exception {

        String msg = "";
        int failnum = 0;
        int updatenum = 0;
        Integer all = 0;
        //用来保存哪一行出错了
        String hangshu = "";


        String pa = TemplateUtils.uuid();
        Map<String, String> map = new HashMap<>();
        String path = pa + file.getOriginalFilename();
        System.out.println("文件名是：" + path);
        if (path.indexOf(".xls") <= 0 && path.indexOf(".xlsx") <= 0) {
            logger.info(":更新数据失败，文件格式不正确");
            msg = "更新数据失败，请上传正确格式的文件";
        } else {
            InputStream is = file.getInputStream();
            //根据文件名获得时间
            String dates = file.getOriginalFilename();

            //读的excel的文件名中的时间
            //将字符串中的文字全部换成空
//            dates= dates.replaceAll("[^0-9\\.]", "");
//            System.out.println("正则后的文件名是："+dates);
//            String[] dataList = dates.split("\\.");
//            if (dataList[0].length() == 1) {
//                dataList[0] = "0" + dataList[0];
//            }
//            if (dataList[1].length() == 1) {
//                dataList[1] = "0" + dataList[1];
//            }
//            //根据表名来拼接时间，只有月和日
//            String time =  dataList[0] + "." + dataList[1];


            List<List<Object>> lists = JavaPoiUtil.getExcelList(is, path);
            all = lists.size();
            //第0行是制表方和时间，分别为第一列和第三列，最上面的标题不读
            //第一行是表头，第二行开始是数据

            //读取excel表的第二行，制表方和时间
            List<Object> list1 = lists.get(0);
            LhmmZhiBiao lhmmZhiBiao = new LhmmZhiBiao();
            lhmmZhiBiao.setZhiBiaoDanWei(String.valueOf(list1.get(0)).trim());
            SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd");
            System.out.println("从excel中读出来的时间是：" + list1.get(3).toString());

            //excel里面的时间
//            String excelTime=list1.get(3).toString();
//            String[] times=excelTime.split("\\.");
//            if (times[1].length() == 1) {
//                times[1] = "0" + times[1];
//            }
//            if (times[2].length() == 1) {
//                times[2] = "0" + times[2];
//            }
//            String nianri=times[1]+"."+times[2];
//            //time的时间
//            System.out.println("excel中单元格的日期是："+time);
//            //excel中sheet的日期
//            System.out.println("excel中sheet的日期是："+nianri);
//            if(!nianri.equals(time)){
//                msg = "文件名中的时间与表中第一个sheet的时间不同！";
//                return resultMap.start().msg(msg).code("500");
//            }

            //判断excel中的日期是只有年月还是具体到日
            String excelTime = list1.get(3).toString();
            String[] times = excelTime.split("\\.");
            String nianyueri = "";
            if (times.length == 2) {
                if (times[2].length() == 1) {
                    times[2] = "0" + times[2];
                }
                nianyueri = times[1] + "." + times[2] + ".20";
            }


            Date date;
            try {
                if (nianyueri == "")
                    date = format.parse(String.valueOf(list1.get(3)));
                else
                    date = format.parse(nianyueri);
            } catch (Exception e) {
                msg = "时间单元格位置错误或时间格式错误";
                return resultMap.start().msg(msg).code("500");
            }
            System.out.println("时间是：" + date.toString());
            //将制表方和时间插入到制表方表中
            lhmmZhiBiao.setShijian(date);
//            if(list1.get(3) instanceof  Date){
//                lhmmZhiBiao.setShijian(date);
//            }

            //将制表方和时间插入到绿化苗木制表方表中
            lhmmZhiBiaoService.insert(lhmmZhiBiao);

            //读取树名图片表的所有数据
            List<HuiNongImage> listImage = huiNongImageService.getAll();
            //读主干数据，价格
            for (int i = 2; i < lists.size(); i++) {
                try {
                    List<Object> list = lists.get(i);
                    LvHuaMiaoMu lvHuaMiaoMu = new LvHuaMiaoMu();
                    if ((StringUtils.isEmpty(list.get(0)) || list.get(0) == "null"))
                        continue;
                    lvHuaMiaoMu.setMingcheng(String.valueOf(list.get(1)).trim());
                    lvHuaMiaoMu.setGuiGe(String.valueOf(list.get(2)).trim());
                    if (isNumber(list.get(3).toString()))
                        lvHuaMiaoMu.setDanJia(Double.valueOf(list.get(3).toString()));
                    lvHuaMiaoMu.setBeizhu(String.valueOf(list.get(4)).trim());
                    System.out.println("插入到数据库之前的时间是：" + date);
                    lvHuaMiaoMu.setShijian(date);
                    //树名
                    String shuming = String.valueOf(list.get(1)).trim();
                    //结合树名-图片表，对数据的图片字段进行赋值
                    for (HuiNongImage huiNongImage : listImage) {
                        if (huiNongImage.getShuming().equals(shuming)) {
                            lvHuaMiaoMu.setImageId(huiNongImage.getImageId());
                            break;
                        }
                    }
                    //插入数据
                    boolean a = lvHuaMiaoMuService.insert(lvHuaMiaoMu);
                    if (a)
                        updatenum++;
                } catch (Exception e) {
                    failnum++;
                    int a = i + 2;
                    hangshu += "第" + a + "行 ";
                }
                msg = "成功更新" + updatenum + "条," + "更新失败" + failnum + "条";
//                msg = "成功更新";
            }
        }
        if (hangshu.length() == 0) {
            System.out.println("长度为" + hangshu.length());
            System.out.println(hangshu);
            return resultMap.start().msg(msg).code("200");
        } else {
            return resultMap.start().msg(hangshu + "出错了，请查看并将以上数据重新导入\n" + msg).code("500");
        }
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
        List<LvHuaMiaoMu> lists = lvHuaMiaoMuService.getDataByTime(date);
        String[] map = {"shangpinMingcheng", "guiGeDengJi", "jiLiangDanWei", "lingShouChaoShiJiaGe", "lingShouJiShiJiaGe", "beizhu"};
        String[] name = {"商品名称", "规格等级", "计量单位", "零售超市价格", "零售集市价格", "备注"};
        JavaPoiUtil.createWorkBooks(LvHuaMiaoMu.class, lists, map, name).write(response.getOutputStream());
    }


}


