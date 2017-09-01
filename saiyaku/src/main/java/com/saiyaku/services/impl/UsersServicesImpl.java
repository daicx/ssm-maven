package com.saiyaku.services.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saiyaku.dao.UsersMapper;
import com.saiyaku.model.Users;
import com.saiyaku.services.UsersServices;
@Service
public class UsersServicesImpl implements UsersServices {

	@Autowired
	private UsersMapper userMapper;
	public Users getUserById(int id) {
		// TODO Auto-generated method stub
		Users users = userMapper.selectByPrimaryKey(id);
		
		return users;
	}
	@Override
	public Users selectUsersById(int id) {
		// TODO Auto-generated method stub
		Users users = userMapper.selectUsersById(id);
		return users;
	}

}
