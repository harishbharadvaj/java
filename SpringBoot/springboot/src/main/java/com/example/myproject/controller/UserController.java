package com.example.myproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.myproject.model.User;
import com.example.myproject.service.UserService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(method=RequestMethod.GET,value="/user/{userId}")
	ResponseEntity<User> getUser(@PathVariable("userId") Long userId) {
		User user = userService.getUser(userId);
		return new ResponseEntity<User>(user, HttpStatus.OK);
    }
	
	@RequestMapping(method=RequestMethod.GET,value="/user")
	ResponseEntity<List<User>> getAllUsers() {
		List<User> users = userService.getAllUsers();
		return new ResponseEntity<List<User>>(users, HttpStatus.OK);
    }
	
	@RequestMapping(method=RequestMethod.POST,value="/user")
	ResponseEntity<User> createUser(@RequestBody User user) {
		User createdUser = userService.createUser(user);
		return new ResponseEntity<User>(createdUser, HttpStatus.OK);
    }
}
