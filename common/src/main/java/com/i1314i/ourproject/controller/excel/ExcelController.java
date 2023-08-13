package com.i1314i.ourproject.controller.excel;

import com.i1314i.ourproject.annotation.LogAnnotation;
import com.i1314i.ourproject.service.excel.ExcelService;
import com.i1314i.ourproject.utils.excel.JavaPoiUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * @author 平行时空
 * @created 2018-10-28 19:11
 **/
@RestController
@Api(tags = "excel下载")
@RequestMapping("/excels")
public class ExcelController {
    @Autowired
    private ExcelService excelServices;
    @ApiOperation("校验sql，并返回sql返回的数量")
    @PostMapping("/sql-count")
    public Long checkSql(String sql) {
        sql = getAndCheckSql(sql);

        long count=0;
        try {
            count = excelServices.queryForObject("select count(1) from (" + sql + ") t", Long.class);
        } catch (Exception e) {
            throw new IllegalArgumentException(e.getMessage());
        }

        return count;
    }

    private String getAndCheckSql(String sql) {
        sql = sql.trim().toLowerCase();
        if (sql.endsWith(";") || sql.endsWith("；")) {
            sql = sql.substring(0, sql.length() - 1);
        }
        if (!sql.startsWith("select")) {
            throw new IllegalArgumentException("仅支持select语句");
        }
        return sql;
    }




    @LogAnnotation
    @ApiOperation("根据sql导出excel")
    @PostMapping
//    @RequiresPermissions("excel:down")
    public void downloadExcel(String sql, String fileName, HttpServletResponse response) throws IOException {
        JavaPoiUtil.setDownType(response, fileName, 2003);
        sql = getAndCheckSql(sql);
        List<Map<String, Object>> list = excelServices.list(sql);
        JavaPoiUtil.createWorkBook(list,2003).write(response.getOutputStream());
    }

    @LogAnnotation
    @ApiOperation("根据sql在页面显示结果")
    @PostMapping("/show-datas")
    @RequiresPermissions("excel:show:datas")
    public List<Object[]> showData(String sql) {
        sql = getAndCheckSql(sql);
        List<Map<String, Object>> list = excelServices.list(sql);

        if (!CollectionUtils.isEmpty(list)) {
            Map<String, Object> map = list.get(0);

            String[] headers = new String[map.size()];
            int i = 0;
            for (String key : map.keySet()) {
                headers[i++] = key;
            }

            List<Object[]> datas = new ArrayList<>(list.size());
            datas.add(headers);
            for (Map<String, Object> m : list) {
                Object[] objects = new Object[headers.length];
                for (int j = 0; j < headers.length; j++) {
                    objects[j] = m.get(headers[j]);
                }

                datas.add(objects);
            }

            return datas;
        }

        return Collections.emptyList();
    }
}
