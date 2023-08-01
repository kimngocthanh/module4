package com.example.ss11_baitap.service;

import com.example.ss11_baitap.model.Blog;

import java.util.List;

public interface IBlogService {
    List<Blog> displayBlog();
    List<Blog> findByName(String name);
    Blog blog(int id);
    void addBlog(Blog blog);
    void deleteBlog(int id);
}
