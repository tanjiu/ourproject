package com.i1314i.ourproject.service.impl;

import com.i1314i.ourproject.mapper.AffairsInformationMapper;
import com.i1314i.ourproject.po.service.AffairsInformation;
import com.i1314i.ourproject.service.AffairsInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AffairsInformationServiceImpl implements AffairsInformationService {
    @Autowired
    AffairsInformationMapper affairsInformationMapper;

    @Override
    public List<AffairsInformation> searchAffairsByName(String affirsInformationName) {
        return affairsInformationMapper.findAffirsByName(affirsInformationName);
    }
}
