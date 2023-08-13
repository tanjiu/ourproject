package com.i1314i.ourproject.service.excel.impl;

import com.i1314i.ourproject.mapper.ExcelMapper;
import com.i1314i.ourproject.service.excel.ExcelService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author 平行时空
 * @created 2018-10-28 19:16
 **/

@Service("excelServices")
public class ExcelServiceImpl implements ExcelService{
    @Autowired
   private ExcelMapper excelMapper;
    @Override
    public List<Map<String, Object>> list(String sql) {
        return excelMapper.list(sql);
    }

    @Override
    public <T>T queryForObject(String sql, Class<T> clazz) {

        return (T) excelMapper.queryForObject(sql);

    }
}
