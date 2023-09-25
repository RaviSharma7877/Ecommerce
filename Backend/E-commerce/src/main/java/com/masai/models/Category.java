package com.masai.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int categoryId;
    private String categoryName;
    private String description;
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Category(int categoryId, String categoryName, String description) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.description = description;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

    
}
