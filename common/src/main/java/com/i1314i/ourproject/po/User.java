package com.i1314i.ourproject.po;


import com.i1314i.ourproject.po.shiro.Permission;
import com.i1314i.ourproject.po.shiro.UserRole;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class User implements Serializable {
    private String userId;

    private String username;

    private String password;

    private String salt;
    private String headImgUrl;
    private Integer sex;
    private String telephone;

    private Integer status;

//    private String statusName;

    private UserRole userRole;
    private String nickName;

    private String department;
    private Integer type;

    private String[]roles;
    private Integer role;
    private Set<String>permissions;
    private String codetoken;
    private String code;
    private String joinTime;

    public String getJoinTime() {
        return joinTime;
    }

    public User(String userId) {
        this.userId = userId;
    }

    public User() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        this.joinTime=sdf.format(new Date());
    }

    public void setJoinTime(String joinTime) {
        this.joinTime = joinTime;
    }

    List<Permission>permissionList;
    private Date createTime = new Date();
    private Date updateTime = new Date();
    public Set<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(Set<String> permissions) {
        this.permissions = permissions;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String[] getRoles() {
        return roles;
    }

    public void setRoles(String[] roles) {
        this.roles = roles;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }



    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }


    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

    public String getCodetoken() {
        return codetoken;
    }

    public void setCodetoken(String codetoken) {
        this.codetoken = codetoken;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getHeadImgUrl() {
        return headImgUrl;
    }

    public void setHeadImgUrl(String headImgUrl) {
        this.headImgUrl = headImgUrl;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public List<Permission> getPermissionList() {
        return permissionList;
    }

    public void setPermissionList(List<Permission> permissionList) {
        this.permissionList = permissionList;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public interface Status {
        int DISABLED = 0;
        int VALID = 11;
        int LOCKED = 12;
    }
}