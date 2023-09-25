package com.masai.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "review")
public class Review {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int reviewId;
    private String comment;
    private int rating;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    
    private LocalDate reviewDate;
	public Review() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Review(String comment, int rating) {
		super();
		this.comment = comment;
		this.rating = rating;
		this.reviewDate = LocalDate.now();
	}
	public int getReviewId() {
		return reviewId;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public LocalDate getReviewDate() {
		return reviewDate;
	}
	
    
}
