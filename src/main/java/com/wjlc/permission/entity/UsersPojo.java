package com.wjlc.permission.entity;

import java.security.Timestamp;

/**
 * Author: LiuHan
 * Date: 2017/11/03
 */
public class UsersPojo {
	
	//***Private members***
	private long UserID;
	private String UserMobile;
	private String UserName;
	private String NickName;
	private short Sex;
	private short Age;
	private Timestamp RegistTime;
	private short IsActive;
	private Timestamp CreateTime;

	public UsersPojo() {
	}

	public UsersPojo(long userID, String userMobile, String userName, String nickName, short sex, short age,
			Timestamp registTime, short isActive, Timestamp createTime) {
		this.UserID = userID;
		this.UserMobile = userMobile;
		this.UserName = userName;
		this.NickName = nickName;
		this.Sex = sex;
		this.Age = age;
		this.RegistTime = registTime;
		this.IsActive = isActive;
		this.CreateTime = createTime;
	}

	/**
	 * @return the userID
	 */
	public long getUserID() {
		return UserID;
	}

	/**
	 * @param userID
	 *            the userID to set
	 */
	public void setUserID(long userID) {
		UserID = userID;
	}

	/**
	 * @return the userMobile
	 */
	public String getUserMobile() {
		return UserMobile;
	}

	/**
	 * @param userMobile
	 *            the userMobile to set
	 */
	public void setUserMobile(String userMobile) {
		UserMobile = userMobile;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return UserName;
	}

	/**
	 * @param userName
	 *            the userName to set
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
	 * @param nickName
	 *            the nickName to set
	 */
	public void setNickName(String nickName) {
		NickName = nickName;
	}

	/**
	 * @return the sex
	 */
	public short getSex() {
		return Sex;
	}

	/**
	 * @param sex
	 *            the sex to set
	 */
	public void setSex(short sex) {
		Sex = sex;
	}

	/**
	 * @return the age
	 */
	public short getAge() {
		return Age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(short age) {
		Age = age;
	}

	/**
	 * @return the registTime
	 */
	public Timestamp getRegistTime() {
		return RegistTime;
	}

	/**
	 * @param registTime
	 *            the registTime to set
	 */
	public void setRegistTime(Timestamp registTime) {
		RegistTime = registTime;
	}

	/**
	 * @return the isActive
	 */
	public short getIsActive() {
		return IsActive;
	}

	/**
	 * @param isActive
	 *            the isActive to set
	 */
	public void setIsActive(short isActive) {
		IsActive = isActive;
	}

	/**
	 * @return the createTime
	 */
	public Timestamp getCreateTime() {
		return CreateTime;
	}

	/**
	 * @param createTime
	 *            the createTime to set
	 */
	public void setCreateTime(Timestamp createTime) {
		CreateTime = createTime;
	}
}
