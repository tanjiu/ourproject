package com.i1314i.ourproject.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TalentTypeMapper {
    public List<String> getAllType();
    public List<String> getAllTalentType(@Param("flag") String flag);//获取高级人才或普通人才 flag
}
