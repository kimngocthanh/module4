package com.example.ss11_baitap.service;

import com.example.ss11_baitap.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBlogService {
    List<Blog> displayBlog();
    List<Blog> findByName(String name);
    List<Blog> findByNameBlog(String name);
    Blog blog(int id);
    void addBlog(Blog blog);
    void deleteBlog(int id);

    Page<Blog> getBlogPage(Pageable pageable);
}
