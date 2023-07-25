package com.example.ss6_bai_tap.service;

import com.example.ss6_bai_tap.model.Blog;
import com.example.ss6_bai_tap.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService implements IBlogService{
    @Autowired
    private IBlogRepository blogRepository;

    @Override
    public List<Blog> display() {
        return blogRepository.findAll();
    }

    @Override
    public void add(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void remove(int id) {
        blogRepository.deleteById(id);
    }
}
