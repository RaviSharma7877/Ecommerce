package com.masai.models;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")  // Specify the table name here
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private LocalDate orderDate;
    private String shippingAddress;
    private BigDecimal totalAmount;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int orderId, User user, LocalDate orderDate, String shippingAddress, BigDecimal totalAmount) {
		super();
		this.orderId = orderId;
		this.user = user;
		this.orderDate = orderDate;
		this.shippingAddress = shippingAddress;
		this.totalAmount = totalAmount;
	}
	public int getOrderId() {
		return orderId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public String getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public BigDecimal getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

    
}

