package com.i1314i.ourproject.mapper;

import com.i1314i.ourproject.po.javabean.LvHuaMiaoMu;
import com.i1314i.ourproject.po.javabean.LvHuaMiaoMuExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LvHuaMiaoMuMapper {
    long countByExample(LvHuaMiaoMuExample example);

    int deleteByExample(LvHuaMiaoMuExample example);

    int deleteByPrimaryKey(Integer miaoMuId);

    int insert(LvHuaMiaoMu record);

    int insertSelective(LvHuaMiaoMu record);

    List<LvHuaMiaoMu> selectByExample(LvHuaMiaoMuExample example);

    LvHuaMiaoMu selectByPrimaryKey(Integer miaoMuId);

    int updateByExampleSelective(@Param("record") LvHuaMiaoMu record, @Param("example") LvHuaMiaoMuExample example);

    int updateByExample(@Param("record") LvHuaMiaoMu record, @Param("example") LvHuaMiaoMuExample example);

    int updateByPrimaryKeySelective(LvHuaMiaoMu record);

    int updateByPrimaryKey(LvHuaMiaoMu record);

    List<String> slectTimes();

    //返回所有的树名
    List<String> selectAllName();
    //根据树名更新外键
    int updateWaiJianByShuMing(String shuming,Integer id);
}