package com.i1314i.ourproject.mapper;

import com.i1314i.ourproject.po.service.WheatTerrace;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface WheatTerraceMapper {
    public List<WheatTerrace> getAllWheatTerrace();
}
