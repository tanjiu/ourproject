package com.i1314i.ourproject.mapper;

import com.i1314i.ourproject.po.service.AffairsInformation;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface AffairsInformationMapper {
    public List<AffairsInformation> findAffirsByName(String affirsName);
}
