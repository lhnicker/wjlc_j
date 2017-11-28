package com.wjlc.permission.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.wjlc.common.BaseDto;
import com.wjlc.permission.entity.GetUserParam;
import com.wjlc.permission.entity.UsersDto;
import com.wjlc.permission.entity.Users_MobileRegistParam;
import com.wjlc.permission.mapper.UsersMapper;
import com.wjlc.util.MD5Tools;

@RestController
@RequestMapping(value = "/permission")
public class UsersController {
	
	@Autowired
	private UsersMapper usersMapper;
	
	@RequestMapping(value = "/mobile_reg", method = {RequestMethod.POST})
	public int MobileRegist(Users_MobileRegistParam parameters) {
		String mobile = parameters.getMobile();
		String pwd = parameters.getPassword();
		pwd = MD5Tools.MD5(pwd);		
		int regResult = usersMapper.MobileRegist(mobile, pwd);
		return regResult;
	}
}
