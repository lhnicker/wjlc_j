package com.wjlc.permission.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wjlc.permission.dtoes.GetUserParam;
import com.wjlc.permission.dtoes.UsersDto;

@RestController
public class UsersController {
	
	@RequestMapping(value = "/userinfo")
	public UsersDto GetUserInfo(GetUserParam getUserParam) {
		UsersDto usersDto = new UsersDto();
		return usersDto;
	}
}
