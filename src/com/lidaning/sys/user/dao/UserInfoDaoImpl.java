package com.lidaning.sys.user.dao;

import org.springframework.stereotype.Repository;

import com.lidaning.sys.base.BaseDao;
import com.lidaning.sys.user.bean.UserInfo;

@Repository
public class UserInfoDaoImpl extends BaseDao implements UserInfoDao{

	@Override
	public void insertUser(UserInfo u) {
		
		super.getJdbcTemplate().execute(" insert into tab1 (id) values ('3') "); 
	}

	@Override
	public int getUserByUsernamePassword(String username, String password) {
		return super.getJdbcTemplate().queryForInt(" select count(1) from user_info where username='"+username+"' and password = '"+password+"' ");
	}

}
