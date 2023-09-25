package com.masai.serviceImpl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Service;

import com.masai.Exception.NoProductFountException;
import com.masai.models.Product;
import com.masai.models.Review;
import com.masai.repositry.ProductRepo;
import com.masai.repositry.ReviewRepository;
import com.masai.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	private ProductRepo productRepo;
    private final ReviewRepository reviewRepository;
	
	

	public ProductServiceImpl(ProductRepo productRepo, ReviewRepository reviewRepository) {
		super();
		this.productRepo = productRepo;
		this.reviewRepository = reviewRepository;
	}

	@Override
	public Product addproduct(Product product) {
		return productRepo.save(product);
	}

	@Override
	public Product updateProductPrice(int productId, BigDecimal price) throws NoProductFountException {
		Product product = productRepo.findById(productId).orElseThrow(()-> new NoProductFountException("No product regestered for "+ productId));
		product.setPrice(price);
		return productRepo.save(product);
	}

	@Override
	public Product updateProductOffer(int productId, int offer) throws NoProductFountException {
		Product product = productRepo.findById(productId).orElseThrow(() -> new NoProductFountException("No product found for id "+ productId));
		product.setOffer(offer);
		return productRepo.save(product);
	}

	@Override
	public Product updateProductStockquantity(int productId, int stockQuantity) throws NoProductFountException {
		Product product = productRepo.findById(productId).orElseThrow(() -> new NoProductFountException("No product found for id "+ productId));
		product.setStockQuantity(stockQuantity);
		return productRepo.save(product);
	}

	@Override
	public List<Product> getallProduct() {
		return productRepo.findAll();
	}
	
	@Override
	public Product getProductById(int productId) throws NoProductFountException {
        return productRepo.findById(productId)
            .orElseThrow(() -> new NoProductFountException("Product not found with id: " + productId));
    }
	
	

	@Override
    public List<Review> getAllReviewsForProduct(int productId) throws NoProductFountException {
        Product product = productRepo.findById(productId)
                .orElseThrow(() -> new NoProductFountException("Product not found with id: " + productId));

        return product.getReviews(); // Assuming you have a getter for reviews in Product class
    }

	@Override
	public String deleteProduct(int productId) throws NoProductFountException {
		Product product = productRepo.findById(productId).orElseThrow(() -> new NoProductFountException("No product found for id "+ productId));
		productRepo.delete(product);
		return "Product deleted successfully";
	}

}
