package com.i1314i.ourproject.po.zTree;

/**
 * zTree po类
 * @author 平行时空
 * @created 2018-10-04 11:16
 **/
public class Node {

    // 节点id
    private String id;
    // 父节点id
    private String pId;
    // 节点名称
    private String name;
    // 需要自定义图片时，使用该属性
    private String iconSkin;
    // 通过该属性，设置图片
    private Integer level;
    // 当需要设置某个节点被选中的时候，通过该属性定义
    private Boolean checked;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setIconSkin(String iconSkin) {
        this.iconSkin = iconSkin;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
//    public String getIconSkin() {//根据level的值来返回节点图片
//        String icon;
//        switch(this.level){
//            case 0:
//                icon = "icon0";
//                break;
//            case 1:
//                icon = "icon1";
//                break;
//            case 2:
//                icon = "icon2";
//                break;
//            default:
//                icon = "icon3";
//                break;
//        }
//        return icon;
//    }
    public Integer getLevel() {
        return level;
    }
    public void setLevel(Integer level) {
        this.level = level;
    }
    public Boolean getChecked() {
        return checked;
    }
    public void setChecked(Boolean checked) {
        this.checked = checked;
    }
    @Override
    public String toString() {
        return "Node [id=" + id + ", pId=" + pId + ", name=" + name
                + ", iconSkin=" + iconSkin + ", level=" + level + ", checked="
                + checked + "]";
    }

}
