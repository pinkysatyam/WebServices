package com.psfroup.server.main.service;

import java.util.List;

import com.psfroup.server.main.model.User;

public interface UserService {
	public List<User> findAll();
	public User findOne(Integer id);
	public String deleteUser(Integer id);
	public User saveUser(User user);
	

}
