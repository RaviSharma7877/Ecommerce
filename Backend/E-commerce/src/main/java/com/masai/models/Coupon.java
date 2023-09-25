package com.masai.models;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Coupon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int couponId;
    private String couponCode;
    private BigDecimal discountPercentage;
    private LocalDate expirationDate;
	public Coupon() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Coupon(int couponId, String couponCode, BigDecimal discountPercentage, LocalDate expirationDate) {
		super();
		this.couponId = couponId;
		this.couponCode = couponCode;
		this.discountPercentage = discountPercentage;
		this.expirationDate = expirationDate;
	}
	public int getCouponId() {
		return couponId;
	}
	public String getCouponCode() {
		return couponCode;
	}
	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}
	public BigDecimal getDiscountPercentage() {
		return discountPercentage;
	}
	public void setDiscountPercentage(BigDecimal discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	public LocalDate getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(LocalDate expirationDate) {
		this.expirationDate = expirationDate;
	}

    
}

