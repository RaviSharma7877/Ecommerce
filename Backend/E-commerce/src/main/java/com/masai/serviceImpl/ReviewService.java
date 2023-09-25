package com.masai.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.models.Product;
import com.masai.models.Review;
import com.masai.repositry.ProductRepo;
import com.masai.repositry.ReviewRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository; // Assuming you have a repository for reviews.

    @Autowired
    private ProductRepo productRepository; // Assuming you have a repository for products.

    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    public List<Review> getReviewsForProduct(int productId) {
        Product product = productRepository.findById(productId)
                .orElseThrow(() -> new EntityNotFoundException("Product not found with ID: " + productId));

        return reviewRepository.findByProduct(product);
    }

    public Review createReview(int productId, Review review) {
        Product product = productRepository.findById(productId)
                .orElseThrow(() -> new EntityNotFoundException("Product not found with ID: " + productId));

        review.setProduct(product);
        Review rew = reviewRepository.save(review);
        return rew;
    }

    public Review updateReview(int reviewId, Review updatedReview) {
        Review existingReview = reviewRepository.findById(reviewId)
                .orElseThrow(() -> new EntityNotFoundException("Review not found with ID: " + reviewId));

        existingReview.setComment(updatedReview.getComment());
        existingReview.setRating(updatedReview.getRating());

        return reviewRepository.save(existingReview);
    }

    public void deleteReview(int reviewId) {
        Review existingReview = reviewRepository.findById(reviewId)
                .orElseThrow(() -> new EntityNotFoundException("Review not found with ID: " + reviewId));

        reviewRepository.delete(existingReview);
    }
}


