package com.example.myproject.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myproject.dao.UserDao;
import com.example.myproject.model.User;

@Service("userService")
public class UserService {

	@Autowired
	private UserDao userDao;
	
	public User createUser(User user){
		return userDao.save(user);
	}
	
	public User getUser(Long userId){
		return userDao.findOne(userId);
	}

	public List<User> getAllUsers() {
		return userDao.findAll();
	}
}
