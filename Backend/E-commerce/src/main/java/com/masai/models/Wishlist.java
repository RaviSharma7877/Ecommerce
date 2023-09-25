package com.masai.models;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Wishlist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int wishlistId;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    private LocalDate addedDate;
	public Wishlist() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Wishlist(int wishlistId, User user, Product product, LocalDate addedDate) {
		super();
		this.wishlistId = wishlistId;
		this.user = user;
		this.product = product;
		this.addedDate = addedDate;
	}
	public int getWishlistId() {
		return wishlistId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public LocalDate getAddedDate() {
		return addedDate;
	}
	public void setAddedDate(LocalDate addedDate) {
		this.addedDate = addedDate;
	}

    
}

