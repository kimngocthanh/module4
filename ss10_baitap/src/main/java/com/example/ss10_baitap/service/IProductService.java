package com.example.ss10_baitap.service;

import com.example.ss10_baitap.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> displayProduct();
    Product product(int id);
}
