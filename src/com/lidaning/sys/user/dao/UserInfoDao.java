package com.lidaning.sys.user.dao;

import java.util.List;

import com.lidaning.sys.user.bean.UserInfo;


public interface UserInfoDao {
	
	public void insertUser(UserInfo u);

	public int getUserByUsernamePassword(String username, String password);

	public List getUserList();

}
