package com.i1314i.ourproject.service;

import com.i1314i.ourproject.po.ResultInfo;
import com.i1314i.ourproject.po.ResultMap;
import com.i1314i.ourproject.po.TalentAbilityInformation;
import com.i1314i.ourproject.po.TalentInformation;
import com.i1314i.ourproject.po.service.Talent;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


public interface GetTalentService{
    public List<TalentInformation> getAllTalent();
    public Map<String,List<TalentInformation>> getAllTalentInformation();
    public Map<String,List<TalentAbilityInformation>> getAllTalentAbilityInformation();
}
