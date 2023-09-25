package com.masai.models;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Analytics {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int logId;
	    @ManyToOne
	    @JoinColumn(name = "user_id")
	    private User user;
	    private String action;
	    private LocalDateTime timestamp;
		public Analytics() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Analytics(int logId, User user, String action, LocalDateTime timestamp) {
			super();
			this.logId = logId;
			this.user = user;
			this.action = action;
			this.timestamp = timestamp;
		}
		public int getLogId() {
			return logId;
		}
		public User getUser() {
			return user;
		}
		public void setUser(User user) {
			this.user = user;
		}
		public String getAction() {
			return action;
		}
		public void setAction(String action) {
			this.action = action;
		}
		public LocalDateTime getTimestamp() {
			return timestamp;
		}
		public void setTimestamp(LocalDateTime timestamp) {
			this.timestamp = timestamp;
		}

	   

}
