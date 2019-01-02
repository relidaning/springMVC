package com.lidaning.sys.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lidaning.sys.user.bean.UserInfo;
import com.lidaning.sys.user.dao.UserInfoDao;

@Service
public class UserInfoServiceImpl implements UserInfoService{
	
	@Autowired
	private UserInfoDao userInfoDao;
	
	@Override
	public void insertUser(UserInfo u) throws Exception {
		
		u.setId("1");
		u.setName("lidaning");
		u.setPassword("***");
		userInfoDao.insertUser(u);
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




	@Override
	public List getUserList() {
		
		return this.userInfoDao.getUserList();
	}

}
