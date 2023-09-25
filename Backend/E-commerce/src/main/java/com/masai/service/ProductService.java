package com.masai.service;

import java.math.BigDecimal;
import java.util.List;

import com.masai.Exception.NoProductFountException;
import com.masai.models.Product;
import com.masai.models.Review;

public interface ProductService {

	public Product addproduct(Product product);
	
	public Product updateProductPrice(int productId, BigDecimal price) throws NoProductFountException;
	
	public Product updateProductOffer(int productId, int offer) throws NoProductFountException;
	
	public Product updateProductStockquantity(int productId, int stockQuantity) throws NoProductFountException;
	
	public List<Product> getallProduct();
	
//	public void saveReviewWithProductId(int productId, String comment, int rating) throws NoProductFountException;
	
	public List<Review> getAllReviewsForProduct(int productId) throws NoProductFountException;
	
	public Product getProductById(int productId) throws NoProductFountException;
	
	public String deleteProduct(int id) throws NoProductFountException;
}
