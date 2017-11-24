package com.wjlc.common;

public class BaseDto {
	public short Code;
	public String Msg;
	public Object UserData;
	
	public BaseDto() {
		this.Code = -1;
		this.Msg = "";
		this.UserData = null;
	}
	
	public BaseDto InitSuccObj(String msg, Object userObj) {
		this.Code = 200;
		this.Msg = msg; 
		this.UserData = userObj;
		return this;
	}
}
