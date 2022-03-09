package com.wisdom.sound.pojo;

import java.io.Serializable;

public class Group  implements Serializable {
    private String groupId;

    private String groupName;

    private String groupCode;

    private String groupParentid;

    private String groupState;

    private String groupCreater;

    private String groupCreattime;

    private String groupEditer;

    private String groupEdittime;

    private String groupDescription;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public String getGroupParentid() {
        return groupParentid;
    }

    public void setGroupParentid(String groupParentid) {
        this.groupParentid = groupParentid;
    }

    public String getGroupState() {
        return groupState;
    }

    public void setGroupState(String groupState) {
        this.groupState = groupState;
    }

    public String getGroupCreater() {
        return groupCreater;
    }

    public void setGroupCreater(String groupCreater) {
        this.groupCreater = groupCreater;
    }

    public String getGroupCreattime() {
        return groupCreattime;
    }

    public void setGroupCreattime(String groupCreattime) {
        this.groupCreattime = groupCreattime;
    }

    public String getGroupEditer() {
        return groupEditer;
    }

    public void setGroupEditer(String groupEditer) {
        this.groupEditer = groupEditer;
    }

    public String getGroupEdittime() {
        return groupEdittime;
    }

    public void setGroupEdittime(String groupEdittime) {
        this.groupEdittime = groupEdittime;
    }

    public String getGroupDescription() {
        return groupDescription;
    }

    public void setGroupDescription(String groupDescription) {
        this.groupDescription = groupDescription;
    }
}