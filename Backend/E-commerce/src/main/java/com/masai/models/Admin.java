package com.masai.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int adminId;
    private String username;
    private String email;
    private String passwordHash;
    private String role;
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admin(int adminId, String username, String email, String passwordHash, String role) {
		super();
		this.adminId = adminId;
		this.username = username;
		this.email = email;
		this.passwordHash = passwordHash;
		this.role = role;
	}
	public int getAdminId() {
		return adminId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPasswordHash() {
		return passwordHash;
	}
	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

    
}

