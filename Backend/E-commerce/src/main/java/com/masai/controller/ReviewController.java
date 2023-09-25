package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.models.Review;
import com.masai.serviceImpl.ReviewService;

@RestController
//@RequestMapping("/products/{productId}/reviews")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @GetMapping
    public List<Review> getReviewsForProduct(@PathVariable int productId) {
        return reviewService.getReviewsForProduct(productId);
    }

    @PostMapping("/products/{productId}/reviews")
    public ResponseEntity<Review> createReview(@PathVariable int productId,@RequestBody Review review) {
        Review createdReview = reviewService.createReview(productId, review);
        return new ResponseEntity<Review>(createdReview,HttpStatus.CREATED);
    }

    @PutMapping("/{reviewId}")
    public ResponseEntity<Review> updateReview(
            @PathVariable int reviewId,
            @RequestBody Review updatedReview
    ) {
        Review updated = reviewService.updateReview(reviewId, updatedReview);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{reviewId}")
    public ResponseEntity<Void> deleteReview(@PathVariable int reviewId) {
        reviewService.deleteReview(reviewId);
        return ResponseEntity.noContent().build();
    }
}


