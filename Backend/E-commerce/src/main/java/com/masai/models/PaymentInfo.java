package com.masai.models;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class PaymentInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int paymentId;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    private String cardNumber;
    private LocalDate expiryDate;
    private String cvv;
	public PaymentInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PaymentInfo(int paymentId, User user, String cardNumber, LocalDate expiryDate, String cvv) {
		super();
		this.paymentId = paymentId;
		this.user = user;
		this.cardNumber = cardNumber;
		this.expiryDate = expiryDate;
		this.cvv = cvv;
	}
	public int getPaymentId() {
		return paymentId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public LocalDate getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

    
}

