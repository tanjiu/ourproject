package com.i1314i.ourproject.mapper;

import com.i1314i.ourproject.po.javabean.ZhongZhiXinXi;
import com.i1314i.ourproject.po.javabean.ZhongZhiXinXiExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ZhongZhiXinXiMapper {
    long countByExample(ZhongZhiXinXiExample example);

    int deleteByExample(ZhongZhiXinXiExample example);

    int deleteByPrimaryKey(Integer jieDaoId);

    int insert(ZhongZhiXinXi record);

    int insertSelective(ZhongZhiXinXi record);

    List<ZhongZhiXinXi> selectByExample(ZhongZhiXinXiExample example);

    ZhongZhiXinXi selectByPrimaryKey(Integer jieDaoId);

    int updateByExampleSelective(@Param("record") ZhongZhiXinXi record, @Param("example") ZhongZhiXinXiExample example);

    int updateByExample(@Param("record") ZhongZhiXinXi record, @Param("example") ZhongZhiXinXiExample example);

    int updateByPrimaryKeySelective(ZhongZhiXinXi record);

    int updateByPrimaryKey(ZhongZhiXinXi record);
}