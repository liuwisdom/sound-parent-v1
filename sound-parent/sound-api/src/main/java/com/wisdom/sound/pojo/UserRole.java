package com.wisdom.sound.pojo;

import java.io.Serializable;

public class UserRole implements Serializable {
    private String userRoleId;

    private String userRoleUserid;

    private String userRoleRoleid;

    private String userRoleCreater;

    private String userRoleCreattime;

    private String userRoleEditer;

    private String userRoleEdittime;

    public String getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(String userRoleId) {
        this.userRoleId = userRoleId;
    }

    public String getUserRoleUserid() {
        return userRoleUserid;
    }

    public void setUserRoleUserid(String userRoleUserid) {
        this.userRoleUserid = userRoleUserid;
    }

    public String getUserRoleRoleid() {
        return userRoleRoleid;
    }

    public void setUserRoleRoleid(String userRoleRoleid) {
        this.userRoleRoleid = userRoleRoleid;
    }

    public String getUserRoleCreater() {
        return userRoleCreater;
    }

    public void setUserRoleCreater(String userRoleCreater) {
        this.userRoleCreater = userRoleCreater;
    }

    public String getUserRoleCreattime() {
        return userRoleCreattime;
    }

    public void setUserRoleCreattime(String userRoleCreattime) {
        this.userRoleCreattime = userRoleCreattime;
    }

    public String getUserRoleEditer() {
        return userRoleEditer;
    }

    public void setUserRoleEditer(String userRoleEditer) {
        this.userRoleEditer = userRoleEditer;
    }

    public String getUserRoleEdittime() {
        return userRoleEdittime;
    }

    public void setUserRoleEdittime(String userRoleEdittime) {
        this.userRoleEdittime = userRoleEdittime;
    }
}