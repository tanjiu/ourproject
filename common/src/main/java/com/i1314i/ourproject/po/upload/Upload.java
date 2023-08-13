package com.i1314i.ourproject.po.upload;

import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;

/**
 * @author 平行时空
 * @created 2018-09-29 20:10
 **/
public class Upload implements Serializable {
    private String extraField;

    private MultipartFile[] files;

    public String getExtraField() {
        return extraField;
    }

    public void setExtraField(String extraField) {
        this.extraField = extraField;
    }

    public MultipartFile[] getFiles() {
        return files;
    }

    public void setFiles(MultipartFile[] files) {
        this.files = files;
    }
}
