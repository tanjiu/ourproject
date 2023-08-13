package com.i1314i.ourproject.po.shiro;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

public class UserRole implements Serializable {
    private String userId;

    private Integer role;

    private String roleuserId;

    private List<Role> roleList;

    private Set<Permission> permissionList;

    public String getRoleuserId() {
        return roleuserId;
    }

    public void setRoleuserId(String roleuserId) {
        this.roleuserId = roleuserId;
    }


    public UserRole() {
    }

    public UserRole(String userId, Integer role, String roleuserId) {
        this.userId = userId;
        this.role = role;
        this.roleuserId = roleuserId;
    }

    public UserRole(String userId, Integer role) {
        this.userId = userId;
        this.role = role;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }

    public Set<Permission> getPermissionList() {
        return permissionList;
    }

    public void setPermissionList(Set<Permission> permissionList) {
        this.permissionList = permissionList;
    }

    @Override
    public String toString() {
        return "UserRole{" +
                "userId='" + userId + '\'' +
                ", role='" + role + '\'' +
                ", roleList=" + roleList +
                ", permissionList=" + permissionList +
                '}';
    }
}