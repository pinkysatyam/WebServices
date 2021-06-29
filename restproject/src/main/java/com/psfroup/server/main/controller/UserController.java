package com.psfroup.server.main.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.psfroup.server.main.exception.UserNotFoundException;
import com.psfroup.server.main.model.User;
import com.psfroup.server.main.service.UserService;

@RestController
public class UserController {
	@Autowired
 private UserService userService;
	@GetMapping("/get-all-user")
public List<User> getAllUser(){
	return userService.findAll();
}
	@GetMapping("/user/{id}")
	public User getOneUser(@PathVariable Integer id) {
		/*User user = userService.findOne(id);
		if(user==null)throw new UserNotFoundException("id: "+id);
		return user;*/
		return userService.findOne(id);
		}
		
/*	@GetMapping("/user/{id}")
	public Resource<User> getOneUser(@PathVariable Integer id) {
		User user = userService.findOne(id);
		if(user==null)throw new UserNotFoundException("id: "+id);
		
		Resource<User> resource = new Resource<User>(user);
		ContollerLinkBuilder linkTo =linkTo(methodOn(this.getClass().getAllUser()));
		resource.add(linkTo.withRel("all-users"));  
		return resource;  
		}*/
	@PostMapping("/create")
	public User addUser(@Valid @RequestBody User user) {
		return userService.saveUser(user);
		}
	@DeleteMapping("/delete/{id}")
	public String deleteUser(@PathVariable Integer id) {
		/*User deleteUser = userService.deleteUser(id);
		if(deleteUser==null) throw new UserNotFoundException("id :"+id);
		return deleteUser;*/
		return userService.deleteUser(id);
	}
	
	}
