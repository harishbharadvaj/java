package com.example.myproject.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.myproject.model.User;

@Repository("userDao")
public interface UserDao extends JpaRepository<User, Long>{

	@Transactional
	public List<User> findByFirstNameAndLastName(String firstName,String lastName);
	
	@Transactional
	public List<User>  findAll();
	
	@SuppressWarnings("unchecked")
	@Transactional
	public User save(User user);

	@Transactional
	public User findOne(Long userId);
}
