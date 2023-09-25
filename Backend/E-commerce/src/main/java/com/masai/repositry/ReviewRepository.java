package com.masai.repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.models.Product;
import com.masai.models.Review;

public interface ReviewRepository extends JpaRepository<Review, Integer> {

	List<Review> findByProduct(Product product);

}
