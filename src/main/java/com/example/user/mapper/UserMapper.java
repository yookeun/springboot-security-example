package com.example.user.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.user.model.User;

@Mapper
public interface UserMapper {	
	public User selectUserForLogin(String username);
}
