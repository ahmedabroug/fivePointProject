package com.example.demo.iserv;

import java.util.List;

import com.example.demo.dao.User;

public interface UserIService {
	
	public List<User> findAllUsers();
	public User findById(long id);
	public boolean isUserExist(User user);
	public User saveUser(User user);
	public User updateUser(User currentUser);
	public void deleteUserById(long id);
	public void deleteAllUsers();

}
