package com.i1314i.ourproject.service.excel;






import java.util.List;
import java.util.Map;

/**
 * @author 平行时空
 * @created 2018-10-28 19:15
 **/

public interface ExcelService {
    List<Map<String, Object>> list(String sql);
    <T> T queryForObject(String sql, Class<T> clazz);
}
