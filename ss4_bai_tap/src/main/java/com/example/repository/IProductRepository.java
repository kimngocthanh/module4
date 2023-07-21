package com.example.repository;

import com.example.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> display();

    void addProduct(Product product);

    void edit(int id, Product product);

    void remove(int id);

    Product product(int id);

    List<Product> product(String name);
}
