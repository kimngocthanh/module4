package com.example.ss6_bai_tap.service;


import com.example.ss6_bai_tap.model.TypeBlog;
import com.example.ss6_bai_tap.repository.ITypeBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeBlogService implements ITypeBlogService{
    @Autowired
    private ITypeBlogRepository typeBlogRepository;
    @Override
    public List<TypeBlog> displayTypeBlog() {
        return typeBlogRepository.findAll();
    }
}
