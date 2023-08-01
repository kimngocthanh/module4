package com.example.ss11_baitap.repository;

import com.example.ss11_baitap.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryRepository extends JpaRepository<Category,Integer> {
}
