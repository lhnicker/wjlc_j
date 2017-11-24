package com.wjlc.permission.controllers;

import java.util.Locale;
import java.util.TimeZone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.wjlc.common.BaseDto;
import com.wjlc.permission.dto.GetUserParam;
import com.wjlc.permission.dto.UsersDto;

@RestController
@RequestMapping(value = "/permission")
public class UsersController {
	
	private Logger log = LoggerFactory.getLogger(UsersController.class);
	
	@RequestMapping(value = "/userinfo", method = {RequestMethod.POST})
	public BaseDto GetUserInfo(GetUserParam getUserParam) {
		UsersDto usersDto = new UsersDto();
		return new BaseDto().InitSuccObj("success", usersDto);
	}
	
	@RequestMapping(value = "/userinfo_xml", method = {RequestMethod.POST, RequestMethod.GET})
	public ModelAndView GetUserInfoXml(GetUserParam getUserParam, TimeZone timeZone, Locale locale) {
		ModelAndView mView = new ModelAndView();
		mView.addObject(new UsersDto());
		log.info("Successful create user object");
		return mView;
	}
}
