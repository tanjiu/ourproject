package com.i1314i.ourproject.service.impl;

import com.i1314i.ourproject.mapper.TalentAbilityMapper;
import com.i1314i.ourproject.mapper.TalentMapper;
import com.i1314i.ourproject.mapper.TalentTypeMapper;
import com.i1314i.ourproject.po.TalentAbilityInformation;
import com.i1314i.ourproject.po.TalentInformation;
import com.i1314i.ourproject.service.TalentService;
import com.i1314i.ourproject.utils.LocationUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("talentServiceImpl")
public class TalentServiceImpl implements TalentService {
    @Autowired
    TalentTypeMapper talentTypeMapper;
    @Autowired
    TalentMapper talentMapper;
    @Autowired
    TalentAbilityMapper talentAbilityMapper;

    @Override
    public Map<String, Integer> getAllTalentTypeCount() {
        Map<String, Integer> result = new HashMap<>();
        List<String> types = talentTypeMapper.getAllType();
        for (String type : types) {
            int count = talentMapper.getTalentTypeCount(type)+talentAbilityMapper.getTalentAbilityTypeCount(type);
            result.put(type, count);
        }

        return result;
    }

    /**
     * 根据圆心半径搜素人才
     * 首先查处数据库所有高级人才&普通人才然后遍历
     *
     * @param x
     * @param y
     * @param r
     * @return
     */
    @Override
    public List<Map<String, String>> searchTalent(double x, double y, double r) {
        System.out.println("------");
        List<TalentInformation> talentInformations = talentMapper.getAllTalentInformation();//获得全部人才
        System.out.println(talentInformations.toString());
        List<TalentAbilityInformation> talentAbilityInformations = talentAbilityMapper.getAllTalentAbility();//获得全部高级人才
        System.out.println(talentAbilityInformations.toString());
        List<Map<String, String>> res = new ArrayList<>();
        for (TalentInformation talentInformation : talentInformations) {
            if (talentInformation.getX()==null||talentInformation.getY()==null) continue;//数据库中没有该人才位置信息
            double distance = LocationUtils.getDistance(talentInformation.getX(), talentInformation.getY(), x, y);//当前人才距离要搜索位置的圆心的距离
            if (distance < r) {//如果在范围中则加入返回的list
                Map<String, String> thisTalentMap = new HashMap<>();
                thisTalentMap.put("name", talentInformation.getTalentName());
                thisTalentMap.put("type", talentInformation.getTalentTypeName());
                thisTalentMap.put("x", talentInformation.getX().toString());
                thisTalentMap.put("y", talentInformation.getY().toString());
                thisTalentMap.put("sex", talentInformation.getSex());
                res.add(thisTalentMap);
            }
        }
        for (TalentAbilityInformation talentAbilityInformation : talentAbilityInformations) {//高级人才
            double distance = LocationUtils.getDistance(talentAbilityInformation.getX(), talentAbilityInformation.getY(), x, y);//当前人才距离要搜索位置的圆心的距离
            if (distance < r) {//如果在范围中则加入返回的list
                Map<String, String> thisTalentMap = new HashMap<>();
                thisTalentMap.put("name", talentAbilityInformation.getTalentName());
                thisTalentMap.put("type", talentAbilityInformation.getTalentTypeName());
                thisTalentMap.put("x", talentAbilityInformation.getX().toString());
                thisTalentMap.put("y", talentAbilityInformation.getY().toString());
                thisTalentMap.put("sex", talentAbilityInformation.getSex());
                res.add(thisTalentMap);
            }
        }
        return res;
    }
}
