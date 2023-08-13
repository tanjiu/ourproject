package com.i1314i.ourproject.service.file;

import com.i1314i.ourproject.po.file.FileInfo;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @author 平行时空
 * @created 2018-10-14 13:51
 **/
public interface FileService {

    FileInfo save(MultipartFile file) throws IOException;
    void delete(String id);
}
