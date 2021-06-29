package com.psfroup.server.main.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.psfroup.server.main.model.User;
import com.psfroup.server.main.reposetory.UserReposetory;
@Service
//@Component
public class UserServiceImpl implements UserService {
	@Autowired
	private UserReposetory userReposetory;
//static public int userCount=5;	
//static private List<User> users = new ArrayList<>();
/*static{
	users.add(new User(001,"mohan"));
	users.add(new User(002,"sohan"));
	users.add(new User(003,"rohan"));
	users.add(new User(004,"pinky"));
	users.add(new User(005,"satyam"));
}*/
@Override
public List<User> findAll() {
	return userReposetory.findAll();
}
@Override
public User findOne(Integer id) {
	/*for(User user:users) {
		if(user.getId()==id)
			return user;
	}
	return null;*/
	return userReposetory.getById(id);
}
@Override
public String deleteUser(Integer id) {
	/*for(User user:users) {
		if(user.getId()==id) {
			users.remove(user);
			return user;
		}
	}
	return null;*/
	 userReposetory.deleteById(id);
	 return "delete user";
}
@Override
public User saveUser(User user) {
	/*if(user.getId()==null) {
		user.setId(++userCount);
	}
	users.add(user);
	return user;*/
	return userReposetory.save(user);
}


}
