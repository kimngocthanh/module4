package com.example.ss6_bai_tap.repository;


import com.example.ss6_bai_tap.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBlogRepository extends JpaRepository<Blog,Integer> {
    Page<Blog> findBlogByBlogNameContaining(Pageable pageable,String blogName);
}
