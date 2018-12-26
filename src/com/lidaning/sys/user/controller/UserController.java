package com.lidaning.sys.user.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lidaning.sys.user.service.UserInfoService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserInfoService userInfoService;
	
	@RequestMapping("/hello")
	public String hello() {
		
		return "index";
	}
	
	
	@RequestMapping(value="login")
	public String login() {
		return "user/login";
	}
	
	@RequestMapping(value="logon")
	public String logon(HttpServletRequest req) {
		
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		
		boolean b = this.userInfoService.getUserByUsernamePassword(username, password);
		if(b)
			return "user/seccess";
		else
			return "user/failed";
	}
	
	public UserInfoService getUserInfoService() {
		return userInfoService;
	}

	public void setUserInfoService(UserInfoService userInfoService) {
		this.userInfoService = userInfoService;
	}
	
}
