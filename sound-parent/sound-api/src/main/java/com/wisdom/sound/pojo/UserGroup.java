package com.wisdom.sound.pojo;

import java.io.Serializable;

public class UserGroup implements Serializable {
    private String userGroupId;

    private String userGroupUserid;

    private String userGroupGroupid;

    private String userGroupCreater;

    private String userGroupCreattime;

    private String userGroupEditer;

    private String userGroupEdittime;

    public String getUserGroupId() {
        return userGroupId;
    }

    public void setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
    }

    public String getUserGroupUserid() {
        return userGroupUserid;
    }

    public void setUserGroupUserid(String userGroupUserid) {
        this.userGroupUserid = userGroupUserid;
    }

    public String getUserGroupGroupid() {
        return userGroupGroupid;
    }

    public void setUserGroupGroupid(String userGroupGroupid) {
        this.userGroupGroupid = userGroupGroupid;
    }

    public String getUserGroupCreater() {
        return userGroupCreater;
    }

    public void setUserGroupCreater(String userGroupCreater) {
        this.userGroupCreater = userGroupCreater;
    }

    public String getUserGroupCreattime() {
        return userGroupCreattime;
    }

    public void setUserGroupCreattime(String userGroupCreattime) {
        this.userGroupCreattime = userGroupCreattime;
    }

    public String getUserGroupEditer() {
        return userGroupEditer;
    }

    public void setUserGroupEditer(String userGroupEditer) {
        this.userGroupEditer = userGroupEditer;
    }

    public String getUserGroupEdittime() {
        return userGroupEdittime;
    }

    public void setUserGroupEdittime(String userGroupEdittime) {
        this.userGroupEdittime = userGroupEdittime;
    }
}