package com.example.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @Column(name = "price")
    private Long price;
    @Column(name = "description")
    private String describe;
    @Column(name = "producer")
    private String producer;

    public Product() {
    }

    public Product(String name, Long price, String describe, String producer) {
        this.name = name;
        this.price = price;
        this.describe = describe;
        this.producer = producer;
    }

    public Product(int id, String name, Long price, String describe, String producer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.describe = describe;
        this.producer = producer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
