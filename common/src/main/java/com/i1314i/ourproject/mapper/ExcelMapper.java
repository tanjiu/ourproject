package com.i1314i.ourproject.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author 平行时空
 * @created 2018-10-28 19:06
 **/

@Mapper
public interface ExcelMapper {
    List<Map<String, Object>> list(@Param("sql") String sql);
    Object queryForObject(@Param("sql")String sql);
}
