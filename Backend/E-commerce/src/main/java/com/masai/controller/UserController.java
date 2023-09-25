package com.masai.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Exception.NoUserFoundException;
import com.masai.models.User;
import com.masai.service.UserService;

@RestController
public class UserController {
	private UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@PostMapping("/user")
	public User addUser(@RequestBody User user) {
		return userService.adduser(user);
	}
	
	@GetMapping("/user")
	public List<User> viewallUser() {
		return userService.viewallUsers();
	}
	
	@PatchMapping("/user/{id}/{password}")
	public User updateUserPassword(@PathVariable Integer id, @PathVariable String password) throws NoUserFoundException {
		return userService.updateuser(id, password);
	}
	
	@DeleteMapping("/user/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable Integer id) throws NoUserFoundException {
		String message = userService.deleteUser(id);
		return new ResponseEntity<String>(message, HttpStatus.OK);
	}
	
}
