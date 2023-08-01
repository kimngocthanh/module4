package com.example.ss11_baitap.service;

import com.example.ss11_baitap.model.Blog;
import com.example.ss11_baitap.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BlogService implements IBlogService{
    @Autowired
    private IBlogRepository blogRepository;
    @Override
    public List<Blog> displayBlog() {
        return blogRepository.findAll();
    }

    @Override
    public List<Blog> findByName(String name) {
        List<Blog> blogList = displayBlog();
        List<Blog> blogs = new ArrayList<>();
        for (Blog b: blogList) {
            if(b.getCategory().getName().equals(name)){
                blogs.add(b);
            }
        }return blogs;
    }

    @Override
    public Blog blog(int id) {
        return blogRepository.findById(id).get();
    }

    @Override
    public void addBlog(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void deleteBlog(int id) {
        blogRepository.deleteById(id);
    }


}
