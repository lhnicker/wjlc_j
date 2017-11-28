package com.wjlc.permission.pojo;

import java.security.Timestamp;

/**
 * Author: LiuHan
 * Date: 2017/11/03
 */
public class Users {
	
	//***Private members***
	private long UserID;
	private String Mobile;
	private String UserName;
	private String NickName;
	private String UserPassword;
	private Timestamp CreateTime;
	private short IsValid;

	public Users() {
	}

	public Users(long userID, String mobile, String userName, String nickName, Timestamp createTime, short isValid) {
		this.setUserID(userID);
		this.setMobile(mobile);
		this.setUserName(userName);
		this.setNickName(nickName);
		this.setCreateTime(createTime);
		this.setIsValid(isValid);
	}

	/**
	 * @return the userID
	 */
	public long getUserID() {
		return UserID;
	}

	/**
	 * @param userID the userID to set
	 */
	public void setUserID(long userID) {
		UserID = userID;
	}

	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return Mobile;
	}

	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		Mobile = mobile;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return UserName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		UserName = userName;
	}

	/**
	 * @return the nickName
	 */
	public String getNickName() {
		return NickName;
	}

	/**
	 * @param nickName the nickName to set
	 */
	public void setNickName(String nickName) {
		NickName = nickName;
	}

	/**
	 * @return the userPassword
	 */
	public String getUserPassword() {
		return UserPassword;
	}

	/**
	 * @param userPassword the userPassword to set
	 */
	public void setUserPassword(String userPassword) {
		UserPassword = userPassword;
	}

	/**
	 * @return the createTime
	 */
	public Timestamp getCreateTime() {
		return CreateTime;
	}

	/**
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(Timestamp createTime) {
		CreateTime = createTime;
	}

	/**
	 * @return the isValid
	 */
	public short getIsValid() {
		return IsValid;
	}

	/**
	 * @param isValid the isValid to set
	 */
	public void setIsValid(short isValid) {
		IsValid = isValid;
	}
}
