package com.masai.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.models.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
