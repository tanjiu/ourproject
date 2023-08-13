package com.i1314i.ourproject.mapper;

import com.i1314i.ourproject.po.TalentAbilityInformation;
import com.i1314i.ourproject.po.TalentInformation;
import com.i1314i.ourproject.po.service.Talent;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service

public interface TalentMapper {
    public List<TalentInformation> getAllTalentInformation();//查询全部普通人才，
    public List<TalentInformation> getTalentInformationByTalentType(String type);
    public int getTalentTypeCount(@Param("type")String type);//普通人才类型的数量

}
