package com.wisdom.sound.pojo;

import java.io.Serializable;

public class RoleGroup implements Serializable {
    private String roleGroupId;

    private String roleGroupGroupid;

    private String roleGroupRoleid;

    private String roleGroupCreater;

    private String roleGroupCreattime;

    private String roleGroupEditer;

    private String roleGroupEdittime;

    public String getRoleGroupId() {
        return roleGroupId;
    }

    public void setRoleGroupId(String roleGroupId) {
        this.roleGroupId = roleGroupId;
    }

    public String getRoleGroupGroupid() {
        return roleGroupGroupid;
    }

    public void setRoleGroupGroupid(String roleGroupGroupid) {
        this.roleGroupGroupid = roleGroupGroupid;
    }

    public String getRoleGroupRoleid() {
        return roleGroupRoleid;
    }

    public void setRoleGroupRoleid(String roleGroupRoleid) {
        this.roleGroupRoleid = roleGroupRoleid;
    }

    public String getRoleGroupCreater() {
        return roleGroupCreater;
    }

    public void setRoleGroupCreater(String roleGroupCreater) {
        this.roleGroupCreater = roleGroupCreater;
    }

    public String getRoleGroupCreattime() {
        return roleGroupCreattime;
    }

    public void setRoleGroupCreattime(String roleGroupCreattime) {
        this.roleGroupCreattime = roleGroupCreattime;
    }

    public String getRoleGroupEditer() {
        return roleGroupEditer;
    }

    public void setRoleGroupEditer(String roleGroupEditer) {
        this.roleGroupEditer = roleGroupEditer;
    }

    public String getRoleGroupEdittime() {
        return roleGroupEdittime;
    }

    public void setRoleGroupEdittime(String roleGroupEdittime) {
        this.roleGroupEdittime = roleGroupEdittime;
    }
}