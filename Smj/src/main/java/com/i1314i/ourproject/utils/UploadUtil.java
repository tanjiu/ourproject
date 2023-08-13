package com.i1314i.ourproject.utils;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @author 叹久
 * @create 2018-12-21 14:19
 */
public class UploadUtil {
    public static String uploadFile(MultipartFile file, String path) throws IOException {
        String name = file.getOriginalFilename();//上传文件的真实名称
        String suffixName = name.substring(name.lastIndexOf("."));//获取后缀名
//		String hash = Integer.toHexString(new Random().nextInt());//自定义随机数（字母加数字）
        String hash = UUID.randomUUID().toString();
        String fileName = hash + suffixName;
        File tempFile = new File(path, fileName);
        if (!tempFile.getParentFile().exists()) {
            tempFile.getParentFile().mkdirs();
        }
        if (tempFile.exists()) {
            tempFile.delete();
        }
        tempFile.createNewFile();
        file.transferTo(tempFile);
        return tempFile.getName();
    }

}
