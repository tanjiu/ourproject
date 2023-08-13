package com.i1314i.ourproject.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.i1314i.ourproject.annotation.LogAnnotation;
import com.i1314i.ourproject.po.ResultMap;
import com.i1314i.ourproject.po.javabean.HuiNongImage;
import com.i1314i.ourproject.po.javabean.LvHuaMiaoMu;
import com.i1314i.ourproject.service.HuiNongImageService;
import com.i1314i.ourproject.service.LvHuaMiaoMuService;
import com.i1314i.ourproject.utils.UploadUtil;
import com.i1314i.ourproject.utils.common.TemplateUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 叹久
 * @create 2018-12-20 9:57
 */
@Controller
@RequestMapping("/hnic")
@Api(tags = "惠农图片")
public class HuiNongImageController {
    @Autowired
    private HuiNongImageService huiNongImageService;
    @Autowired
    LvHuaMiaoMuService lvHuaMiaoMuService;
    @Autowired
    private ResultMap resultMap;

    private Logger logger = LoggerFactory.getLogger(HuiNongImageController.class);

    /**
     * 分页获取数据
     */
    @ApiOperation("分页获取数据")
    @ResponseBody
    @RequestMapping("/getDataByPage")
    public ResultMap getDataByPage(@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
        PageHelper.startPage(pn, 5);
        List<HuiNongImage> list = huiNongImageService.getAll();
        for(HuiNongImage  huiNongImage:list){
            huiNongImage.setImageUrl(huiNongImage.getImageUrls());
        }
        PageInfo page = new PageInfo(list, 5);
        return resultMap.start().msg("success").code("200").data(page);
    }

    /**
     * 得到所有数据
     *
     * @return
     */
    @ApiOperation("得到所有数据")
    @ResponseBody
    @RequestMapping(value = "/getAll")
    public ResultMap getALL() {
        List<HuiNongImage> list = huiNongImageService.getAll();
        for(HuiNongImage  huiNongImage:list){
            huiNongImage.setImageUrl(huiNongImage.getImageUrls());
        }
        return resultMap.start().msg("success").code("200").data(list);
    }


    /**
     * 插入一条数据
     *
     * @param huiNongImage
     * @return
     */
    @LogAnnotation(sysName = "惠农系统", module = "惠民图片")
    @ApiOperation("插入一条数据，每个品种只能有一条数据，如果数据已经存在，就更新，没有就插入")
    //由于ajax传过来的是一个字符串，所以要使用@RequestBody注解进行转换为po对象
    @ResponseBody
    @RequestMapping(value = "/insertapc", method = RequestMethod.POST)
    public ResultMap insert(@RequestBody HuiNongImage huiNongImage) {
        int flag = huiNongImageService.insert(huiNongImage);
        if (flag > 0)
            return resultMap.start().msg("success").code("200");
        return resultMap.start().msg("fail").code("500");
    }

    /**
     * 单个、批量删除二合一
     *
     * @param ids
     * @return
     */
    @LogAnnotation(sysName = "惠农系统", module = "惠民图片")
    @ApiOperation("单个、批量删除二合一")
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
            flag = huiNongImageService.deleteAllByPrimaryKey(list);
        } else {
            flag = huiNongImageService.deleteOneByPrimaryKey(Integer.parseInt(ids));
        }
        if (flag)
            return resultMap.start().msg("success").code("200");
        else
            return resultMap.start().msg("fail").code("500");
    }


    /**
     * 根据主键更新一条数据
     *
     * @param huiNongImage
     * @return
     */
    @LogAnnotation(sysName = "惠农系统", module = "惠民图片")
    @ApiOperation("根据主键更新一条数据")
    @ResponseBody
    @RequestMapping(value = "/updateapc", method = RequestMethod.POST)
    public ResultMap updateByPrimaryKey(@RequestBody HuiNongImage huiNongImage) {
        boolean flag = false;
        flag = huiNongImageService.updateByPrimaryKey(huiNongImage);
        if (flag)
            return resultMap.start().msg("success").code("200");
        return resultMap.start().msg("fail").code("500");
    }


    /**
     * 根据主键查询一条数据
     */
    @LogAnnotation(sysName = "惠农系统", module = "惠民图片")
    @ApiOperation("根据主键查询一条数据")
    @ResponseBody
    @RequestMapping(value = "/selectByPK/{id}", method = RequestMethod.GET)
    public ResultMap getHuiNongImageByPrimaryKey(@PathVariable("id") int id) {
        HuiNongImage huiNongImage = huiNongImageService.getHuiNongImageByPrimaryKey(id);
        if (huiNongImage != null){
            huiNongImage.setImageUrl(huiNongImage.getImageUrls());
            return resultMap.start().msg("success").code("200").data(huiNongImage);
        }
        else
            return resultMap.start().msg("NoData").code("404");
    }

    //上传图片
    @ApiOperation("测试接口，不能使用，上传图片,data里面是图片的id")
    @RequestMapping(value = "/uploads/{shuming}", method = RequestMethod.POST)
    public @ResponseBody
    ResultMap image(@RequestBody MultipartFile file, HttpServletRequest request, @PathVariable("shuming") String shuming) {
        try {
            String paths = TemplateUtils.getPropertiesdata("other.properties", "ckeditor.image.service.location");
            String name = file.getOriginalFilename();//上传文件的真实名称
            String suffixName = name.substring(name.lastIndexOf(".") + 1);//获取后缀名
            //图片的存储位置
            String path = request.getSession().getServletContext().getRealPath("\\upload\\" + suffixName + "\\");
            System.out.println("路径是---------------" + path);
            String imageName = UploadUtil.uploadFile(file, paths);
            //图片路径加图片名
            String imageUrls = path + "\\" + imageName;

            //项目的绝对路径
//            String aaaa= ClassUtilss.getDefaultClassLoader().getResource("classpath:").getPath();
//            System.out.println("----------------------------------------------------------------------------"+aaaa);

            //将图片路径保存到数据库
            HuiNongImage huiNongImage = new HuiNongImage();
            huiNongImage.setImageUrl(imageUrls);
            huiNongImage.setShuming(shuming);
            //获取插入后的主键
            int id = huiNongImageService.insert(huiNongImage);
            //将主键返回
            if (id != 0)
                return resultMap.start().code("200").msg("success").data(id);
            else
                return resultMap.start().code("500").msg("插入失败,检查错误");
        } catch (Exception e) {
            e.printStackTrace();
            return resultMap.start().code("500").msg("error");
        }

    }


    //上传图片，也可以上传供应信息的图片
    @ApiOperation("可用接口 上传图片,，也可以上传供应信息的图片，data里面是图片的id")
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public @ResponseBody
    ResultMap images(@RequestBody MultipartFile file, HttpServletRequest request, @RequestParam("name") String shuming,@RequestParam("type") String type) {
        try {

           String path1= TemplateUtils.getPropertiesdata("other.properties","ckeditor.image.service.location");
            System.out.println(path1);
//            //判断图片后缀，不符合要求直接返回
//            String filenames=file.getOriginalFilename();
//            String suffix = filenames.substring(filenames.lastIndexOf(".") + 1);
//            //判断是否为图片的标志
//            int flagimage=0;
//            String[] imageArray ={"bmp","gif","jpg","jpeg","png"};

            //获取根目录
            File path = new File(path1);
            if (!path.exists())
                path = new File("");

            File upload = new File(path1);
            if (!upload.exists()) upload.mkdirs();


          //获取图片名,生成的是一个唯一的随机码
            String imageName = UploadUtil.uploadFile(file, path1);
            System.out.println("imageName"+imageName);

            //将图片路径保存到数据库
            HuiNongImage huiNongImage = new HuiNongImage();
            huiNongImage.setImageUrl(imageName);
            huiNongImage.setShuming(shuming);
            huiNongImage.setBeiyong1(type);
            //获取插入后的主键
            int id = huiNongImageService.insert(huiNongImage);
            //如果主键不为空，则更新绿化苗木数据库中数据的外键
            if (id != 0){
                if (type.equals("1")){
                    List<LvHuaMiaoMu> listLvHua=lvHuaMiaoMuService.getAllAndNoUrl();
                    for(LvHuaMiaoMu lvHuaMiaoMu:listLvHua){
                        if(lvHuaMiaoMu.getMingcheng().equals(shuming)){
                            lvHuaMiaoMu.setImageId(id);
                            lvHuaMiaoMuService.updateByPrimaryKey(lvHuaMiaoMu);
                        }
                    }
                }
                return resultMap.start().code("200").msg("success").data(id);
            }
            else
                return resultMap.start().code("500").msg("插入失败,检查错误");
        } catch (Exception e) {
            e.printStackTrace();
            return resultMap.start().code("500").msg("error");
        }

    }
    //修改图片，只能修改绿化苗木的图片，不能修改供应信息的图片
    @ApiOperation("可用接口 修改图片,data里面是图片的id，只能修改绿化苗木的图片，不能修改供应信息的图片")
    @RequestMapping(value = "/Updateimages", method = RequestMethod.POST)
    public @ResponseBody
    ResultMap Updateimages(@RequestBody MultipartFile file, HttpServletRequest request, @RequestParam("name") String shuming,@RequestParam("type") String type) {
        try {

            String path1= TemplateUtils.getPropertiesdata("other.properties","ckeditor.image.service.location");
            System.out.println(path1);
            //获取根目录
            File path = new File(path1);
            if (!path.exists())
                path = new File("");

            File upload = new File(path1);
            if (!upload.exists()) upload.mkdirs();


            //获取图片名,生成的是一个唯一的随机码
            String imageName = UploadUtil.uploadFile(file, path1);
            System.out.println("imageName"+imageName);

            //将图片路径保存到数据库
            HuiNongImage huiNongImage = new HuiNongImage();
            huiNongImage.setImageUrl(imageName);
            huiNongImage.setShuming(shuming);
            huiNongImage.setBeiyong1(type);
            //获取插入后的主键
            int id = huiNongImageService.insert(huiNongImage);
            //如果主键不为空，则更新绿化苗木数据库中数据的外键
            if (id != 0){
                List<LvHuaMiaoMu> listLvHua=lvHuaMiaoMuService.getAllAndNoUrl();
                for(LvHuaMiaoMu lvHuaMiaoMu:listLvHua){
                    if(lvHuaMiaoMu.getMingcheng().equals(shuming)){
                        lvHuaMiaoMu.setImageId(id);
                        lvHuaMiaoMuService.updateByPrimaryKey(lvHuaMiaoMu);
                    }
                }
                return resultMap.start().code("200").msg("success").data(id);
            }
            else
                return resultMap.start().code("500").msg("插入失败,检查错误");
        } catch (Exception e) {
            e.printStackTrace();
            return resultMap.start().code("500").msg("error");
        }
    }

    @RequestMapping("/testUrl")
    public void testUrl() throws FileNotFoundException {

        //获取跟目录
        File path = new File(ResourceUtils.getURL("classpath:").getPath());
        if (!path.exists()) path = new File("");
        System.out.println("path:" + path.getAbsolutePath());
        //如果上传目录为/static/images/upload/，则可以如下获取：
        File upload = new File(path.getAbsolutePath(), "static/images/upload/");
        if (!upload.exists()) upload.mkdirs();
        System.out.println("upload url:" + upload.getAbsolutePath());
        //在开发测试模式时，得到的地址为：{项目跟目录}/target/static/images/upload/
        //在打包成jar正式发布时，得到的地址为：{发布jar包目录}/static/images/upload/
    }

}
