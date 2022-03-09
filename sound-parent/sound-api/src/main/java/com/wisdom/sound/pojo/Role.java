package com.wisdom.sound.pojo;

import java.io.Serializable;

public class Role implements Serializable {
    private String roleId;

    private String roleName;

    private String roleCode;

    private String roleParentid;

    private String roleState;

    private String roleCreater;

    private String roleCreattime;

    private String roleEditer;

    private String roleEdittime;

    private String roleDescription;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getRoleParentid() {
        return roleParentid;
    }

    public void setRoleParentid(String roleParentid) {
        this.roleParentid = roleParentid;
    }

    public String getRoleState() {
        return roleState;
    }

    public void setRoleState(String roleState) {
        this.roleState = roleState;
    }

    public String getRoleCreater() {
        return roleCreater;
    }

    public void setRoleCreater(String roleCreater) {
        this.roleCreater = roleCreater;
    }

    public String getRoleCreattime() {
        return roleCreattime;
    }

    public void setRoleCreattime(String roleCreattime) {
        this.roleCreattime = roleCreattime;
    }

    public String getRoleEditer() {
        return roleEditer;
    }

    public void setRoleEditer(String roleEditer) {
        this.roleEditer = roleEditer;
    }

    public String getRoleEdittime() {
        return roleEdittime;
    }

    public void setRoleEdittime(String roleEdittime) {
        this.roleEdittime = roleEdittime;
    }

    public String getRoleDescription() {
        return roleDescription;
    }

    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
    }
}