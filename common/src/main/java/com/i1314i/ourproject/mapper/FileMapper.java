package com.i1314i.ourproject.mapper;

import com.i1314i.ourproject.po.file.FileInfo;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

/**
 * @author 平行时空
 * @created 2018-10-14 14:07
 **/
public interface FileMapper {

    @Select("select * from file_info t where t.id = #{id}")
    FileInfo getById(String id);

    @Insert("insert into file_info(id, content_type, size, path, url, type, create_time, update_time) values(#{id}, #{contentType}, #{size}, #{path}, #{url}, #{type}, now(), now())")
    Integer save(FileInfo fileInfo);

    @Update("update file_info t set t.update_time = now() where t.id = #{id}")
    Integer update(FileInfo fileInfo);

    @Delete("delete from file_info where id = #{id}")
    Integer delete(String id);

    Integer count(@Param("params") Map<String, Object> params);

    List<FileInfo> list(@Param("params") Map<String, Object> params);

}
