package com.i1314i.ourproject.service.impl;

import com.i1314i.ourproject.mapper.HatchTerraceMapper;
import com.i1314i.ourproject.po.service.HatchTerrace;
import com.i1314i.ourproject.service.HatchTerrachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("hatechTerrachServiceImpl")
public class HatchTerraceServiceImpl implements HatchTerrachService {
    @Autowired
    HatchTerraceMapper hatchTerraceMapper;
    @Override
    public List<HatchTerrace> getAllHatechTerrach() {
        return hatchTerraceMapper.getAllHatchTerrace();
    }
}
