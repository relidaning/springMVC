package com.lidaning.sys.user.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lidaning.sys.base.BaseDao;
import com.lidaning.sys.user.bean.UserInfo;

@Repository
public class UserInfoDaoImpl extends BaseDao implements UserInfoDao{

	@Override
	public void insertUser(UserInfo u) {
		getSqlMapClientTemplate().insert("userInfo.insert", u);
	}

	@Override
	public int getUserByUsernamePassword(String username, String password) {
		return super.getJdbcTemplate().queryForInt(" select count(1) from user_info where name='"+username+"' and password = '"+password+"' ");
	}

	@Override
	public List getUserList() {
		
		return getSqlMapClientTemplate().queryForList("userInfo.select-list", 1, 10);
	}

}
