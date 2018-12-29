package com.lidaning.sys.user.service;

import org.springframework.stereotype.Service;

import com.lidaning.sys.user.bean.UserInfo;

@Service
public interface UserInfoService {
	
	public void insertUser(UserInfo u) throws Exception;

	public boolean getUserByUsernamePassword(String username, String password);

}
