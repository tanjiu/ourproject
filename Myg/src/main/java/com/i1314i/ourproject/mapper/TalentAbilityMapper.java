package com.i1314i.ourproject.mapper;

import com.i1314i.ourproject.po.TalentAbilityInformation;
import com.i1314i.ourproject.po.TalentInformation;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TalentAbilityMapper {
    public List<TalentAbilityInformation> getTalentAbilityInformationByTalentType(String type);

    public int getTalentAbilityTypeCount(@Param("type") String type);//高级人才类型的数量

    List<TalentAbilityInformation> getAllTalentAbility();
}
