package com.i1314i.ourproject.service.impl;

import com.i1314i.ourproject.mapper.TalentAbilityMapper;
import com.i1314i.ourproject.mapper.TalentMapper;
import com.i1314i.ourproject.mapper.TalentTypeMapper;
import com.i1314i.ourproject.po.ResultInfo;
import com.i1314i.ourproject.po.ResultMap;
import com.i1314i.ourproject.po.TalentAbilityInformation;
import com.i1314i.ourproject.po.TalentInformation;
import com.i1314i.ourproject.po.service.Talent;
import com.i1314i.ourproject.service.GetTalentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("getTalentServiceImpl")
public class GetTalentServiceImpl implements GetTalentService {
    @Autowired
    TalentMapper talentMapper;
    @Autowired
    TalentTypeMapper talentTypeMapper;
    @Autowired
    TalentAbilityMapper talentAbilityMapper;

    /**
     * 获取全部人才，不分类型
     * @return
     */
    public List<TalentInformation> getAllTalent(){
        List<TalentInformation> talents=talentMapper.getAllTalentInformation();
        return talents;
    }
    /**
     * 根据类型获取全部普通人才
     */
    public Map<String,List<TalentInformation>> getAllTalentInformation(){
        String flag="2";
        List<String> types=talentTypeMapper.getAllTalentType(flag);//获取普通人才全部类型
        Map<String,List<TalentInformation>> result=new HashMap<>();
        for (String type:types){
            System.out.println(type);
            List<TalentInformation> informations=talentMapper.getTalentInformationByTalentType(type);
            result.put(type,informations);
        }
        return result;
    }

    /**
     * 根据类型获取全部高级人才
     * @return
     */
    @Override
    public Map<String, List<TalentAbilityInformation>> getAllTalentAbilityInformation() {
        String flag="1";
        List<String> types=talentTypeMapper.getAllTalentType(flag);//获取高级人才全部类型
        Map<String,List<TalentAbilityInformation>> result=new HashMap<>();
        for (String type:types){
            List<TalentAbilityInformation> informations=talentAbilityMapper.getTalentAbilityInformationByTalentType(type);
            result.put(type,informations);
        }
        return result;
    }

}
