package com.i1314i.ourproject.mapper;

import com.i1314i.ourproject.po.service.HatchTerrace;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface HatchTerraceMapper {
    public List<HatchTerrace> getAllHatchTerrace();
}
