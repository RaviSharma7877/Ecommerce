package com.masai.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.models.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
