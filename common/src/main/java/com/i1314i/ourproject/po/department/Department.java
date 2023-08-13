package com.i1314i.ourproject.po.department;


import com.i1314i.ourproject.utils.common.TemplateUtils;

import java.io.Serializable;
import java.util.List;

/**
 * 部门po类
 * @author 平行时空
 * @created 2018-10-14 11:40
 **/
public class Department implements Serializable {
    private String id;
    private String departmentId;
    private String departmentName;
    private String name;
    private String parentId;
    private Integer type;


    private List<Department> child;

    public String getId() {
        return this.departmentId;
    }



    public List<Department> getChildren() {
        return children;
    }

    public void setChildren(List<Department> children) {
        this.children = children;
    }

    private List<Department> children;
    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Department() {
    }



    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public List<Department> getChild() {
        return children;
    }

    public void setChild(List<Department> child) {
        this.children = child;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Department(String departmentName, String parentId,Integer type) {
        this.departmentName = departmentName;
        this.parentId = parentId;
        this.type=type;
    }


    public String getName() {
        return this.departmentName;
    }


    public void setId(String id) {
        this.departmentId = id;
    }

    public void setName(String name) {
        this.departmentName = name;
    }

    public static void main(String[] args) {
        System.out.println(TemplateUtils.uuid());
    }
}
