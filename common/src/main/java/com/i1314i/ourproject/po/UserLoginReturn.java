package com.i1314i.ourproject.po;

import java.util.List;
import java.util.Set;

/**
 * @author 平行时空
 * @created 2018-10-02 10:51
 **/
public class UserLoginReturn {
    private String token;
//    private List<Role>roleList;
    private String[]roles;
//    private Set<Permission>permissionSet;
    private Set<String> permissons;
    private String status;
    private Integer type;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

//    public List<Role> getRoleList() {
//        return roleList;
//    }
//
//    public void setRoleList(List<Role> roleList) {
//        this.roleList = roleList;
//    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getType() {
        return type;
    }

    public String[] getRoles() {
        return roles;
    }


    public Set<String> getPermissons() {
        return permissons;
    }

    public void setPermissons(Set<String> permissons) {
        this.permissons = permissons;
    }

    public void setRoles(String[] roles) {
        this.roles = roles;
    }

    public void setType(Integer type) {
        this.type = type;
    }

//    public Set<Permission> getPermissionSet() {
//        return permissionSet;
//    }
//
//    public void setPermissionSet(Set<Permission> permissionSet) {
//        this.permissionSet = permissionSet;
//    }
}
