package com.example.service;

import com.example.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> display();

    void addProduct(Product product);

    void edit(int id, Product product);

    void remove(int id);

    Product product(int id);

    List<Product> product(String name);
}
