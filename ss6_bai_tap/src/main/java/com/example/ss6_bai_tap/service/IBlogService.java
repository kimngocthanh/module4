package com.example.ss6_bai_tap.service;


import com.example.ss6_bai_tap.model.Blog;

import java.util.List;

public interface IBlogService {
    List<Blog> display();
    void add(Blog blog);
    void remove(int id);
}
