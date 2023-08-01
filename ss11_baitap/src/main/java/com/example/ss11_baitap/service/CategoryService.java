package com.example.ss11_baitap.service;

import com.example.ss11_baitap.model.Category;
import com.example.ss11_baitap.repository.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements ICategoryService{
    @Autowired
    private ICategoryRepository categoryRepository;
    @Override
    public List<Category> getAllCategory() {
        return categoryRepository.findAll();
    }

    @Override
    public Category category(int id) {
        return categoryRepository.findById(id).get();
    }
}
