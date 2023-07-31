package com.example.ss10_baitap.repository;

import com.example.ss10_baitap.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product,Integer> {
}
