package com.example.ss11_baitap.service;

import com.example.ss11_baitap.model.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> getAllCategory();
    Category category(int id);
}
