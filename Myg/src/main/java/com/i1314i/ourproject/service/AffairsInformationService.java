package com.i1314i.ourproject.service;

import com.i1314i.ourproject.po.service.AffairsInformation;

import java.util.List;

public interface AffairsInformationService {
    List<AffairsInformation> searchAffairsByName(String affirsName);
}
