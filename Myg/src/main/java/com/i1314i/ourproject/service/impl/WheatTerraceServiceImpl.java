package com.i1314i.ourproject.service.impl;

import com.i1314i.ourproject.mapper.WheatTerraceMapper;
import com.i1314i.ourproject.po.service.WheatTerrace;
import com.i1314i.ourproject.service.WheatTerraceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("wheatTerraceServiceImpl")
public class WheatTerraceServiceImpl implements WheatTerraceService {
    @Autowired
    WheatTerraceMapper wheatTerraceMapper;
    @Override
    public List<WheatTerrace> getAllWheatTerrace() {
        return wheatTerraceMapper.getAllWheatTerrace();
    }

}
