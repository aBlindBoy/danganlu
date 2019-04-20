package com.blog.tenyears.bean;

import java.io.Serializable;

public class UserInfo implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -294631837156014979L;

	private Integer userId;

    private String userName;

    private String userPhone;

    private String userAccount;

    private String userPassword;

    private String userMark;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount == null ? null : userAccount.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserMark() {
        return userMark;
    }

    public void setUserMark(String userMark) {
        this.userMark = userMark == null ? null : userMark.trim();
    }

	@Override
	public String toString() {
		return "UserInfo [userId=" + userId + ", userName=" + userName + ", userPhone=" + userPhone + ", userAccount="
				+ userAccount + ", userPassword=" + userPassword + ", userMark=" + userMark + "]";
	}
    
    
}