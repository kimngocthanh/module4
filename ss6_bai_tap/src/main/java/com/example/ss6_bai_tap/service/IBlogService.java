package com.example.ss6_bai_tap.service;


import com.example.ss6_bai_tap.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBlogService {
    List<Blog> display();
    void add(Blog blog);
    void remove(int id);
    Blog blog(int id);
    void edit(int id, Blog blog);
    Page<Blog> findAll(Pageable pageable,String nameBlog);
}
