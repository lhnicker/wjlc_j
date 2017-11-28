package com.wjlc.permission.entity;

public class GetUserParam {
	private long UserID;
	private String UserMobile;

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
	 * @return the userMobile
	 */
	public String getUserMobile() {
		return UserMobile;
	}

	/**
	 * @param userMobile the userMobile to set
	 */
	public void setUserMobile(String userMobile) {
		UserMobile = userMobile;
	}
}
