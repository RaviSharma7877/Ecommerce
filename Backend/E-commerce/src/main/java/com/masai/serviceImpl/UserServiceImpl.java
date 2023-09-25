package com.masai.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.masai.Exception.NoUserFoundException;
import com.masai.models.User;
import com.masai.repositry.UserRepo;
import com.masai.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private UserRepo userRepo;
	
	public UserServiceImpl(UserRepo userRepo) {
		this.userRepo = userRepo;
	}

	@Override
	public User adduser(User user) {
		return userRepo.save(user);
	}

	@Override
	public List<User> viewallUsers() {
		return userRepo.findAll();
	}

	@Override
	public User updateuser(Integer userId, String passwordHash) throws NoUserFoundException {
		User user = userRepo.findById(userId).orElseThrow(() -> new NoUserFoundException("No user exist"));
		user.setPasswordHash(passwordHash);
		return userRepo.save(user);
		 
	}

	@Override
	public String deleteUser(Integer userId) throws NoUserFoundException {
		User user = userRepo.findById(userId).orElseThrow(() -> new NoUserFoundException("No user exist"));
		userRepo.delete(user);
		return "User deleted successfully";
	}

}
