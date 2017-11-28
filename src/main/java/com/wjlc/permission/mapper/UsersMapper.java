package com.wjlc.permission.mapper;

import org.apache.ibatis.annotations.*;

import com.wjlc.permission.pojo.Users;

public interface UsersMapper {

	/*
	 * 手机号注册
	 * 
	 */
	@Insert("insert into Users (Mobile, UserPassword) values (#{mobile}, #{password})")
	public int MobileRegist(@Param("mobile")String mobile, @Param("password")String pwd);
	
	/*
	 * 根据用户手机号查询有效用户信息
	 * 
	 */
	@Select("select * from Users where Mobile=#{mobile} and IsValid in (1)")
	public Users QueryByMobile(@Param("mobile")String mobile);
	
}
