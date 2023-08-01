package com.example.ss11_baitap.repository;

import com.example.ss11_baitap.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBlogRepository extends JpaRepository<Blog,Integer> {
}
