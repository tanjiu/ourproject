package com.i1314i.ourproject.service;

import com.i1314i.ourproject.po.service.HatchTerrace;
import com.i1314i.ourproject.po.service.WheatTerrace;
import org.springframework.stereotype.Service;

import java.util.List;

public interface WheatTerraceService {
    public List<WheatTerrace> getAllWheatTerrace();
}
