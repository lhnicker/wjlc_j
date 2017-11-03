package com.wjlc.permission.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wjlc.common.BaseDto;
import com.wjlc.permission.dtoes.GetUserParam;
import com.wjlc.permission.dtoes.UsersDto;

@RestController
@RequestMapping(value = "/permission")
public class UsersController {
	
	@RequestMapping(value = "/userinfo")
	public BaseDto GetUserInfo(GetUserParam getUserParam) {
		UsersDto usersDto = new UsersDto();
		BaseDto retDto = new BaseDto();
		retDto.Code = 200;
		retDto.Msg = "success";
		retDto.UserData = usersDto;
		return retDto;
	}
}
