package com.lidaning.sys.user.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lidaning.sys.user.bean.UserInfo;
import com.lidaning.sys.user.dao.UserInfoDao;

@Service
public class UserInfoServiceImpl implements UserInfoService{
	
	@Autowired
	private UserInfoDao userInfoDao;

	@Override
	public void insertUser(UserInfo u) {
		userInfoDao.insertUser(u);
	}
	
	
	

	public UserInfoDao getUserInfoDao() {
		return userInfoDao;
	}

	public void setUserInfoDao(UserInfoDao userInfoDao) {
		this.userInfoDao = userInfoDao;
	}




	@Override
	public boolean getUserByUsernamePassword(String username, String password) {
		int i = this.userInfoDao.getUserByUsernamePassword(username, password);
		return i>0?true:false;
	}

}