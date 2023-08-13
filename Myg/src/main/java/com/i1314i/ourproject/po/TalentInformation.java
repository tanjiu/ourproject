package com.i1314i.ourproject.po;

import com.i1314i.ourproject.po.service.Talent;

/**
 * 人才信息类
 * 人才的扩展对象，用于完成人才和人才类型查询的结果映射
 */
public class TalentInformation extends Talent {

    private String talentTypeName;

    public String getTalentTypeName() {
        return talentTypeName;
    }

    public void setTalentTypeName(String talentTypeName) {
        this.talentTypeName = talentTypeName;
    }
}
