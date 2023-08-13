package com.i1314i.ourproject.mapper;

import com.i1314i.ourproject.po.javabean.HuiNongImage;
import com.i1314i.ourproject.po.javabean.HuiNongImageExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HuiNongImageMapper {
    long countByExample(HuiNongImageExample example);

    int deleteByExample(HuiNongImageExample example);

    int deleteByPrimaryKey(Integer imageId);

    int insert(HuiNongImage record);

    int insertSelective(HuiNongImage record);

    List<HuiNongImage> selectByExample(HuiNongImageExample example);

    HuiNongImage selectByPrimaryKey(Integer imageId);

    int updateByExampleSelective(@Param("record") HuiNongImage record, @Param("example") HuiNongImageExample example);

    int updateByExample(@Param("record") HuiNongImage record, @Param("example") HuiNongImageExample example);

    int updateByPrimaryKeySelective(HuiNongImage record);

    int updateByPrimaryKey(HuiNongImage record);

    List<HuiNongImage> selectByName(String shuming);

   int updateByName(String shuming,String imageurl);


}