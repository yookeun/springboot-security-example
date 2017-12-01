package com.example.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.user.mapper.UserMapper;
import com.example.user.model.User;

@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;	
	
	public User selectUserForLogin(String username) {
		return userMapper.selectUserForLogin(username);
	}
}
