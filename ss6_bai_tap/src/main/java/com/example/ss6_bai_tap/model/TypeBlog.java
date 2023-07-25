package com.example.ss6_bai_tap.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class TypeBlog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nameTypeBlog;

    @OneToMany(mappedBy = "typeBlog")
    private Set<Blog> blogSet;
    public TypeBlog() {
    }

    public TypeBlog(String nameTypeBlog, Set<Blog> blogSet) {
        this.nameTypeBlog = nameTypeBlog;
        this.blogSet = blogSet;
    }

    public TypeBlog(String nameTypeBlog) {
        this.nameTypeBlog = nameTypeBlog;
    }

    public TypeBlog(int id, String nameTypeBlog, Set<Blog> blogSet) {
        this.id = id;
        this.nameTypeBlog = nameTypeBlog;
        this.blogSet = blogSet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameTypeBlog() {
        return nameTypeBlog;
    }

    public void setNameTypeBlog(String nameTypeBlog) {
        this.nameTypeBlog = nameTypeBlog;
    }

    public Set<Blog> getBlogSet() {
        return blogSet;
    }

    public void setBlogSet(Set<Blog> blogSet) {
        this.blogSet = blogSet;
    }
}
