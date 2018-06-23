package com.example.demo.serv;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.dao.User;
import com.example.demo.iserv.UserIService;
import com.example.demo.repo.UserRepo;



public class UserService implements UserIService {
	@Autowired
	UserRepo userRepo;

	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	@Override
	public User findById(long id) {
		// TODO Auto-generated method stub
		return userRepo.getOne(id);
	}

	@Override
	public boolean isUserExist(User user) {
		// TODO Auto-generated method stub
		return userRepo.equals(user);
	}

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}

	@Override
	public User updateUser(User currentUser) {
		// TODO Auto-generated method stub
		return userRepo.save(currentUser);
	}

	@Override
	public void deleteUserById(long id) {
		// TODO Auto-generated method stub
		userRepo.delete(arg0);
		
	}

	@Override
	public void deleteAllUsers() {
		// TODO Auto-generated method stub
		userRepo.deleteAll();
		
	}

}
