package com.wisdom.sound.pojo;

import java.io.Serializable;

public class Resource implements Serializable {
    private Integer resourceId;

    private String resourceName;

    private String resourceCode;

    private String resourceParentid;

    private String resourceUrl;

    private String resourceState;

    private String resourceCreater;

    private String resourceCreattime;

    private String resourceEditer;

    private String resourceEdittime;

    private String resourceDescription;

    public Integer getResourceId() {
        return resourceId;
    }

    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getResourceCode() {
        return resourceCode;
    }

    public void setResourceCode(String resourceCode) {
        this.resourceCode = resourceCode;
    }

    public String getResourceParentid() {
        return resourceParentid;
    }

    public void setResourceParentid(String resourceParentid) {
        this.resourceParentid = resourceParentid;
    }

    public String getResourceUrl() {
        return resourceUrl;
    }

    public void setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl;
    }

    public String getResourceState() {
        return resourceState;
    }

    public void setResourceState(String resourceState) {
        this.resourceState = resourceState;
    }

    public String getResourceCreater() {
        return resourceCreater;
    }

    public void setResourceCreater(String resourceCreater) {
        this.resourceCreater = resourceCreater;
    }

    public String getResourceCreattime() {
        return resourceCreattime;
    }

    public void setResourceCreattime(String resourceCreattime) {
        this.resourceCreattime = resourceCreattime;
    }

    public String getResourceEditer() {
        return resourceEditer;
    }

    public void setResourceEditer(String resourceEditer) {
        this.resourceEditer = resourceEditer;
    }

    public String getResourceEdittime() {
        return resourceEdittime;
    }

    public void setResourceEdittime(String resourceEdittime) {
        this.resourceEdittime = resourceEdittime;
    }

    public String getResourceDescription() {
        return resourceDescription;
    }

    public void setResourceDescription(String resourceDescription) {
        this.resourceDescription = resourceDescription;
    }
}