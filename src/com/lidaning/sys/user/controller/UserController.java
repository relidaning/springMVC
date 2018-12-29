package com.lidaning.sys.user.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lidaning.sys.user.bean.UserInfo;
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
			return index();
		else {
			req.setAttribute("msg", "用户或密码错误！");
			return "user/login";
		}
	}
	
	public String index() {
		
		//查询登录用户的分类，标签，笔记
		
		
		return "user/index";
	}
	
	@RequestMapping("insertUser")
	public String insertUser() {
		
		try {
			
			this.userInfoService.insertUser(new UserInfo());
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return index();
	}
	
	public UserInfoService getUserInfoService() {
		return userInfoService;
	}

	public void setUserInfoService(UserInfoService userInfoService) {
		this.userInfoService = userInfoService;
	}
	
}
