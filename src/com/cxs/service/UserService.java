package com.cxs.service;

import java.util.List;

import com.cxs.Pojo.User;

public interface UserService {

	public List<User> userList() throws Exception;
	public User login(User user) throws Exception;
	
}
