package com.i1314i.ourproject.controller.images;



import com.i1314i.ourproject.controller.BaseController;
import com.i1314i.ourproject.po.ResultMap;
import com.i1314i.ourproject.po.images.Validate;
import com.i1314i.ourproject.utils.common.TemplateUtils;
import com.i1314i.ourproject.utils.images.VerifyCodeUtils;
import com.i1314i.ourproject.utils.jedisUtils.IJedisClient;
import com.i1314i.ourproject.utils.qr.QRCodeUtil;
import com.i1314i.ourproject.utils.redisToken.TokenUtils;
import org.apache.xmlbeans.impl.util.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.imageio.IIOException;
import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;

/**
 * @author 平行时空
 * @created 2018-05-09 21:55
 **/
@Controller
@RequestMapping("images")
public class ImageController extends BaseController {
    @Autowired
    IJedisClient jedisClient;
    @Autowired
    ResultMap resultMap;
    /**
     * 无logo二维码
     * @param response
     * @param request
     * @throws Exception
     */
    @RequestMapping("getqr")
    public void getQrcode(HttpServletResponse response, HttpServletRequest request, String content)throws Exception{
        response.setHeader("contentType", "text/html; charset=utf-8");
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");
        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        response.setContentType("image/jpeg");

        if(content==null||content.trim().equals("")){
            content="无内容";
        }

        QRCodeUtil.encode(content,response.getOutputStream());
    }

    /**
     * 带logo二维码
     * @param response
     * @param request
     * @throws Exception
     */
    @RequestMapping("getqrs")
    public void getQrcodes(HttpServletResponse response, HttpServletRequest request, String content)throws Exception{
        response.setHeader("contentType", "text/html; charset=utf-8");
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");
        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        response.setContentType("image/jpeg");
        if(content==null||content.trim().equals("")){
            content="无内容";
        }
        String basepath=QRCodeUtil.logopath();
        QRCodeUtil.encode(content,basepath,response.getOutputStream(),false);
    }

    /**
     * 验证码
     * @param response
     * @param request
     * @throws Exception
     */
    @RequestMapping(value = "/getimages",method = {RequestMethod.GET})
    public void getImage(HttpServletResponse response, HttpServletRequest request, @RequestParam("token") String token) throws Exception {
        token=newImgToken(token);
        response.setHeader("contentType", "text/html; charset=utf-8");
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");
        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        response.setContentType("image/jpeg");
        //生成随机字串
        String verifyCode = VerifyCodeUtils.generateVerifyCode(4);
        //存入redis
        HttpSession session = request.getSession(true);
        //删除以前的
        jedisClient.set(token,verifyCode,60*15); //15分钟
   //     session.removeAttribute("verCode");
   //     session.setAttribute("verCode", verifyCode.toLowerCase());
        //生成图片
        int w = 116, h = 36;
        VerifyCodeUtils.outputImage(w, h, response.getOutputStream(), verifyCode);
    }

    /**
     * 验证码
     * @param request
     * @throws Exception
     */
    @RequestMapping(value = "/getimages",method = {RequestMethod.POST})
    @ResponseBody
    public ResultMap getImage(HttpServletRequest request) throws Exception {
        //生成随机字串
        String verifyCode = VerifyCodeUtils.generateVerifyCode(4);
        //存入redis
        String gettoken= TokenUtils.makeToken();
        String newgettoken=newImgToken(gettoken);
        //删除以前的
        jedisClient.set(newgettoken,verifyCode,60*15); //15分钟
        //     session.removeAttribute("verCode");
        //     session.setAttribute("verCode", verifyCode.toLowerCase());
        //生成图片
        int w = 116, h = 36;
        Validate validate=VerifyCodeUtils.outputVerifyImageBase64(w, h, verifyCode);
        validate.setCodetoken(gettoken);
        return resultMap.start().code("200").msg("生成验证码成功").data(validate);
    }




    public String newImgToken(String token){
        return "img_"+token;
    }

    /**
     * 获取学生照片
     * @throws Exception
     */

    @RequestMapping(value = "/getpicture")
    public void studentShowImg(HttpServletRequest request, HttpServletResponse response)throws Exception{

        String imagesPath = TemplateUtils.getPropertiesdata("other.properties","picturefilepath");

        Integer status = Integer.valueOf(TemplateUtils.getPropertiesdata("other.properties","picturefilestatus"));

        String imgFile = "a.png";
        String userid= (String) request.getSession().getAttribute("userId");
        if(userid!=null){
            imgFile=imagesPath + "/" + userid+".jpg";
        }

        String imgType = imgFile.substring(imgFile.indexOf('.') + 1 , imgFile.length());
        response.setDateHeader("Expires", 0);
        response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
        response.addHeader("Cache-Control", "post-check=0, pre-check=0");
        response.setHeader("Pragma", "no-cache");

        response.setContentType("image/"+imgType);

        BufferedImage bi = null;
        ServletOutputStream out = response.getOutputStream();

        if(userid==null){
            if(status==1){
                try{
                imgFile=imagesPath + "/default.jpg";
                bi = ImageIO.read(new File(imgFile));
                ImageIO.write(bi, imgType, out);
                }catch (IIOException e){
                    bi = getCrystalImage(200, 300);   //如果没有该文件，则显示默认的透明图片
                    ImageIO.write(bi, "png", out);
                }
            }else {
                bi = getCrystalImage(200, 300);   //如果没有该文件，则显示默认的透明图片
                ImageIO.write(bi, "png", out);
            }

        }

        try {

            bi = ImageIO.read(new File(imgFile));
            ImageIO.write(bi, imgType, out);
        } catch (IIOException e) {
            if(status==1){
                imgFile=imagesPath + "/default.jpg";
                bi = ImageIO.read(new File(imgFile));
                ImageIO.write(bi, imgType, out);
            }else {
                //            logger.info("读取不出图片:"+imgFile, e);
                bi = getCrystalImage(1, 1);   //如果没有该文件，则显示默认的透明图片
                ImageIO.write(bi, "png", out);
//            throw new ServiceException("读取不出图片");   //ServiceException是自己定义的异常，可忽略。
            }

        } finally {
            try {
                out.flush();
            } finally {
                out.close();
            }
        }
    }


    /**
     * 透明图片
     * @param width
     * @param height
     * @return
     */

    public static BufferedImage getCrystalImage(Integer width, Integer height){
        width = width==null?710 : width;
        height = height == null ? 285: height;

        // 创建BufferedImage对象
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        // 获取Graphics2D
        Graphics2D g2d = image.createGraphics();
        // ---------- 增加下面的代码使得背景透明 -----------------
        image = g2d.getDeviceConfiguration().createCompatibleImage(width, height, Transparency.TRANSLUCENT);
        g2d.dispose();
        g2d = image.createGraphics();
        // ---------- 背景透明代码结束 -----------------
        // 画图
        g2d.setColor(Color.WHITE);
        g2d.setStroke(new BasicStroke(1));
        //释放对象
        g2d.dispose();

        return image;
    }

    /**
     * 下载图片
     * @param fileName
     * @param request
     * @param response
     */
    public void downloadFile(String fileName, HttpServletRequest request, HttpServletResponse response) {
        String filepath =  "/" + fileName;//修改这个路径
        String downloadName = fileName;

        File file = new File(filepath);
        FileInputStream inputStream = null;
        ServletOutputStream outputStream = null;
        byte[] b = new byte[1024];
        int len = 0;
        try{
            inputStream = new FileInputStream(file);
            outputStream = response.getOutputStream();

            response.setContentType("application/force-download");
            String downloadFileName = null;
            String agent = (String)request.getHeader("USER-AGENT");
            if(agent!=null && agent.toLowerCase().indexOf("firefox") >0) {
                downloadFileName = "=?UTF-8?B?" + (new String(Base64.encode(downloadName.getBytes("UTF-8")))) + "?=";
            }else if(agent!=null && (agent.toLowerCase().indexOf("msie") >0 || agent.toLowerCase().indexOf("trident") >0)){
                downloadFileName = URLEncoder.encode(downloadName,"UTF-8");
                downloadFileName = downloadFileName.replaceAll("\\+", "%20");
            }else{
                downloadFileName = new String(downloadName.getBytes("UTF-8"),"ISO-8859-1");
            }
            response.addHeader("Content-Disposition", "attachment;filename=" + downloadFileName);
            response.setContentLength((int) file.length());
            while((len = inputStream.read(b)) != -1) {
                outputStream.write(b,0,len);
            }
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            if(inputStream != null) {
                try{
                    inputStream.close();
                    inputStream = null;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
