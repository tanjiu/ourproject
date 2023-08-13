package com.i1314i.ourproject.service;

import java.util.List;
import java.util.Map;

public interface TalentService {
    public Map<String,Integer> getAllTalentTypeCount();

    List<Map<String,String>> searchTalent(double x, double y, double r);
}
