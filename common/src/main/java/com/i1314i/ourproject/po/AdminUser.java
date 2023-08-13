package com.i1314i.ourproject.po;

import java.io.Serializable;
import java.util.List;

/**
 * @author 平行时空
 * @created 2018-09-21 14:06
 **/
public class AdminUser implements Serializable {
    private String adminid;
    private String username;
    private String password;
    private Integer type;
    private String college;
    private String phone;
    private String roleid;
//    private Role role;
//    private List<Role> roleList;

    public AdminUser() {
    }
//
//    public AdminUser(String adminid, String username, String password, Integer type, String college, String phone, String roleid, Role role, List<Role> roleList) {
//        this.adminid = adminid;
//        this.username = username;
//        this.password = password;
//        this.type = type;
//        this.college = college;
//        this.phone = phone;
//        this.roleid = roleid;
//        this.role = role;
//        this.roleList = roleList;
//    }

    public String getAdminid() {
        return adminid;
    }

    public void setAdminid(String adminid) {
        this.adminid = adminid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }
//
//    public Role getRole() {
//        return role;
//    }
//
//    public void setRole(Role role) {
//        this.role = role;
//    }
//
//    public List<Role> getRoleList() {
//        return roleList;
//    }
//
//    public void setRoleList(List<Role> roleList) {
//        this.roleList = roleList;
//    }
}
