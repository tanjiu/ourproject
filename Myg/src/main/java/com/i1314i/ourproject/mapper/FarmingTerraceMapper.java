package com.i1314i.ourproject.mapper;

import com.i1314i.ourproject.po.service.FarmingTerrace;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface FarmingTerraceMapper {
    public List<FarmingTerrace> getAllFarminTerrace();
}
