package com.i1314i.ourproject.mapper;


import com.i1314i.ourproject.po.Dict;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface DictMapper {

//	@Select("select * from t_dict t where t.id = #{id}")
	Dict getById(Long id);

	@Delete("delete from t_dict where id = #{id}")
	Integer delete(Long id);

	Integer update(Dict dict);

	@Options(useGeneratedKeys = true, keyProperty = "id")
	@Insert("insert into t_dict(type, k, val, create_time, update_time) values(#{type}, #{k}, #{val}, #{createTime}, #{updateTime})")
	Integer save(Dict dict);

	Integer count(@Param("params") Map<String, Object> params);

	List<Dict> list(Dict dict);

//	@Select("select * from t_dict t where t.type = #{type} and k = #{k}")
	Dict getByTypeAndK(@Param("type") String type, @Param("k") String k);

//	@Select("select * from t_dict t where t.type = #{type}")
	List<Dict> listByType(String type);
}
