package com.example.ss10_baitap.service;

import com.example.ss10_baitap.model.Product;
import com.example.ss10_baitap.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService{
    @Autowired
    private IProductRepository productRepository;
    @Override
    public List<Product> displayProduct() {
        return productRepository.findAll();
    }

    @Override
    public Product product(int id) {
        return productRepository.findById(id).get();
    }
}
