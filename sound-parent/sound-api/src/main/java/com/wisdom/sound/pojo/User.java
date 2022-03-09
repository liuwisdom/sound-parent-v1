package com.wisdom.sound.pojo;

import java.io.Serializable;

public class User implements Serializable {
    private String userId;

    private String userAccount;

    private String userPassword;

    private String userType;

    private String userPhone;

    private String userInvitationCode;

    private String userPhoneCode;

    private String userWeixin;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserInvitationCode() {
        return userInvitationCode;
    }

    public void setUserInvitationCode(String userInvitationCode) {
        this.userInvitationCode = userInvitationCode;
    }

    public String getUserPhoneCode() {
        return userPhoneCode;
    }

    public void setUserPhoneCode(String userPhoneCode) {
        this.userPhoneCode = userPhoneCode;
    }

    public String getUserWeixin() {
        return userWeixin;
    }

    public void setUserWeixin(String userWeixin) {
        this.userWeixin = userWeixin;
    }
}