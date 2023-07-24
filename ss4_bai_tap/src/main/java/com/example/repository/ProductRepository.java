package com.example.repository;

import com.example.model.Product;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository implements IProductRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Product> display() {
        TypedQuery<Product> typedQuery = entityManager.createQuery("from Product", Product.class);
        return typedQuery.getResultList();
    }

    @Transactional
    @Override
    public void addProduct(Product product) {
//        productList.add(product);
        try {
            entityManager.persist(product);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Transactional
    @Override
    public void edit(int id, Product product) {
        TypedQuery<Product> typedQuery = entityManager.createQuery("from Product ", Product.class);
        List<Product> productList = typedQuery.getResultList();
        for (int i = 0; i < productList.size(); i++) {
            if (id == productList.get(i).getId()) {
                productList.set(i, product);
                entityManager.merge(product);
            }
        }
    }

    @Transactional
    @Override
    public void remove(int id) {
        Product product = product(id);
        entityManager.remove(product);
    }

    @Transactional
    @Override
    public Product product(int id) {
        Product product = entityManager.find(Product.class, id);
        return product;
    }

    @Transactional
    @Override
    public List<Product> product(String name) {
        List<Product> products = new ArrayList<>();
        TypedQuery<Product> typedQuery = entityManager.createQuery("from Product", Product.class);
        List<Product> productList = typedQuery.getResultList();
        for (int i = 0; i < productList.size(); i++) {
            if(productList.get(i).getName().contains(name)){
                products.add(productList.get(i));
            }
        }
        return products;
    }
}
