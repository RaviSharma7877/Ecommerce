package com.masai.service;

import java.util.List;

import com.masai.Exception.NoUserFoundException;
import com.masai.models.User;

public interface UserService {
	/**
	 * This method is to add User in database;
	 * @param user: User object that contains details of user to be saved
	 * @return: User object which is saved in database;
	 */
	public User adduser(User user);
	
	/**
	 * This method is to get all the Users;
	 * @return: List of Users
	 */
	public List<User> viewallUsers();
	
	/**
	 * This method is to update password of user
	 * @param userId: user id to find user
	 * @param passwordHash: new password 
	 * @return: User object
	 */
	public User updateuser(Integer userId, String passwordHash) throws NoUserFoundException;
	
	/**
	 * This method is to delete user 
	 * @param userId : User id to find the user
	 * @return: String message 
	 */
	public String deleteUser(Integer userId) throws NoUserFoundException;
}
