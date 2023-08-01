package com.example.ss11_baitap.model;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @JsonBackReference
    @OneToMany(mappedBy = "category")
    private Set<Blog> blogSet;

    public Category() {
    }

    public Category(int idCategory, String name) {
        this.id = idCategory;
        this.name = name;
    }

    public Category(int idCategory, String name, Set<Blog> blogSet) {
        this.id = idCategory;
        this.name = name;
        this.blogSet = blogSet;
    }

    public int getId() {
        return id;
    }

    public void setId(int idCategory) {
        this.id = idCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Blog> getBlogSet() {
        return blogSet;
    }

    public void setBlogSet(Set<Blog> blogSet) {
        this.blogSet = blogSet;
    }
}
