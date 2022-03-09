package com.wisdom.sound.pojo;

import java.io.Serializable;

public class Permission implements Serializable {
    private String permissionId;

    private String permissionName;

    private String permissionCode;

    private String permissionParentid;

    private String permissionUrl;

    private String permissionState;

    private String permissionCreater;

    private String permissionCreattime;

    private String permissionEditer;

    private String permissionEdittime;

    private String permissionDescription;

    public String getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public String getPermissionCode() {
        return permissionCode;
    }

    public void setPermissionCode(String permissionCode) {
        this.permissionCode = permissionCode;
    }

    public String getPermissionParentid() {
        return permissionParentid;
    }

    public void setPermissionParentid(String permissionParentid) {
        this.permissionParentid = permissionParentid;
    }

    public String getPermissionUrl() {
        return permissionUrl;
    }

    public void setPermissionUrl(String permissionUrl) {
        this.permissionUrl = permissionUrl;
    }

    public String getPermissionState() {
        return permissionState;
    }

    public void setPermissionState(String permissionState) {
        this.permissionState = permissionState;
    }

    public String getPermissionCreater() {
        return permissionCreater;
    }

    public void setPermissionCreater(String permissionCreater) {
        this.permissionCreater = permissionCreater;
    }

    public String getPermissionCreattime() {
        return permissionCreattime;
    }

    public void setPermissionCreattime(String permissionCreattime) {
        this.permissionCreattime = permissionCreattime;
    }

    public String getPermissionEditer() {
        return permissionEditer;
    }

    public void setPermissionEditer(String permissionEditer) {
        this.permissionEditer = permissionEditer;
    }

    public String getPermissionEdittime() {
        return permissionEdittime;
    }

    public void setPermissionEdittime(String permissionEdittime) {
        this.permissionEdittime = permissionEdittime;
    }

    public String getPermissionDescription() {
        return permissionDescription;
    }

    public void setPermissionDescription(String permissionDescription) {
        this.permissionDescription = permissionDescription;
    }
}