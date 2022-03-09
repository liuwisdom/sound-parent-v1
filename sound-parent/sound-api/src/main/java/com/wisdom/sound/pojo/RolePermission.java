package com.wisdom.sound.pojo;

import java.io.Serializable;

public class RolePermission implements Serializable {
    private String rolePermissionId;

    private String rolePermissionRoleid;

    private String rolePermissionPermissionid;

    private String rolePermissionCreater;

    private String rolePermissionCreattime;

    private String rolePermissionEditer;

    private String rolePermissionEdittime;

    public String getRolePermissionId() {
        return rolePermissionId;
    }

    public void setRolePermissionId(String rolePermissionId) {
        this.rolePermissionId = rolePermissionId;
    }

    public String getRolePermissionRoleid() {
        return rolePermissionRoleid;
    }

    public void setRolePermissionRoleid(String rolePermissionRoleid) {
        this.rolePermissionRoleid = rolePermissionRoleid;
    }

    public String getRolePermissionPermissionid() {
        return rolePermissionPermissionid;
    }

    public void setRolePermissionPermissionid(String rolePermissionPermissionid) {
        this.rolePermissionPermissionid = rolePermissionPermissionid;
    }

    public String getRolePermissionCreater() {
        return rolePermissionCreater;
    }

    public void setRolePermissionCreater(String rolePermissionCreater) {
        this.rolePermissionCreater = rolePermissionCreater;
    }

    public String getRolePermissionCreattime() {
        return rolePermissionCreattime;
    }

    public void setRolePermissionCreattime(String rolePermissionCreattime) {
        this.rolePermissionCreattime = rolePermissionCreattime;
    }

    public String getRolePermissionEditer() {
        return rolePermissionEditer;
    }

    public void setRolePermissionEditer(String rolePermissionEditer) {
        this.rolePermissionEditer = rolePermissionEditer;
    }

    public String getRolePermissionEdittime() {
        return rolePermissionEdittime;
    }

    public void setRolePermissionEdittime(String rolePermissionEdittime) {
        this.rolePermissionEdittime = rolePermissionEdittime;
    }
}