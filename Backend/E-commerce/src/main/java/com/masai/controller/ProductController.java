package com.masai.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Exception.NoProductFountException;
import com.masai.models.Product;
import com.masai.models.Review;
import com.masai.service.ProductService;
import com.masai.serviceImpl.ReviewService;

import jakarta.persistence.EntityNotFoundException;

@RestController
public class ProductController {
	
	private ProductService productService;
	private ReviewService reviewService;
	
	

	

	public ProductController(ProductService productService, ReviewService reviewService) {
		super();
		this.productService = productService;
		this.reviewService = reviewService;
	}

	@GetMapping("/product")
	public ResponseEntity<List<Product>> products(){
		return new ResponseEntity<List<Product>>(productService.getallProduct(),HttpStatus.OK);
	}
	
	@PostMapping("/product")
	public ResponseEntity<Product> addproduct(@RequestBody Product product) {
		return new ResponseEntity<Product>(productService.addproduct(product),HttpStatus.CREATED);
	}
	
	@PostMapping("/product/{id}/{price}")
	public ResponseEntity<Product> updateProductPrice(@PathVariable int id ,@PathVariable BigDecimal price) throws NoProductFountException {
		return new ResponseEntity<Product>(productService.updateProductPrice(id, price), HttpStatus.OK);
	}
	
	@PostMapping("/product/{id}/{offer}")
	public ResponseEntity<Product> updateProductOffer(@PathVariable int id ,@PathVariable int offer) throws NoProductFountException {
		return new ResponseEntity<Product>(productService.updateProductOffer(id, offer), HttpStatus.OK);
	}
	
	@PostMapping("/product/{id}/{stockQuantity}")
	public ResponseEntity<Product> updateProductStockquantity(@PathVariable int id, @PathVariable int stockQuantity) throws NoProductFountException {
	    return new ResponseEntity<Product>(productService.updateProductStockquantity(id, stockQuantity), HttpStatus.OK);
	}
	
	
	@DeleteMapping("/product/{productId}")
	public ResponseEntity<String> deleteProduct(@PathVariable int productId) throws NoProductFountException {
		return new ResponseEntity<String>(productService.deleteProduct(productId),HttpStatus.OK);
	}
}
