package com.example.repository;

import com.example.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository implements IProductRepository {
    private static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "Laptop dell", 20000000, "Rất oke", "Dell"));
        productList.add(new Product(2, "Laptop Asus", 30000000, "Rất oke", "Asus"));
        productList.add(new Product(3, "Laptop Hp", 40000000, "Rất oke", "Hp"));
        productList.add(new Product(4, "Laptop MacBook", 10000000, "Rất oke", "MacBook"));
        productList.add(new Product(5, "Laptop Acer", 30000000, "Rất oke", "Acer"));
        productList.add(new Product(6, "Laptop Msi", 20000000, "Rất oke", "Msi"));
    }

    @Override
    public List<Product> display() {
        return productList;
    }

    @Override
    public void addProduct(Product product) {
        productList.add(product);
    }

    @Override
    public void edit(int id, Product product) {
        for (int i = 0; i < productList.size(); i++) {
            if(productList.get(i).getId() == id){
                productList.set(i, product);
            }
        }
    }

    @Override
    public void remove(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if(productList.get(i).getId() == id){
                productList.remove(i);
            }
        }
    }

    @Override
    public Product product(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if(productList.get(i).getId() == id){
                return productList.get(i);
            }
        }
        return null;
    }

    @Override
    public List<Product> product(String name) {
        List<Product> products = new ArrayList<>();
        for (Product p : productList) {
            if (p.getName().contains(name)) {
                products.add(p);
            }
        }
        return products;
    }
}
