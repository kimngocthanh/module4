package com.example.ss6_bai_tap.model;


import javax.persistence.*;

@Entity
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String blogName;
    private String blogDate;
    private String blogger;
    private String content;
    @ManyToOne
    @JoinColumn(name = "type_id",referencedColumnName = "id")
    private TypeBlog typeBlog;

    public Blog() {
    }

    public Blog(int id, String blogName, String blogDate, String blogger, String content, TypeBlog typeBlog) {
        this.id = id;
        this.blogName = blogName;
        this.blogDate = blogDate;
        this.blogger = blogger;
        this.content = content;
        this.typeBlog = typeBlog;
    }

    public Blog(String blogName, String blogDate, String blogger, String content, TypeBlog typeBlog) {
        this.blogName = blogName;
        this.blogDate = blogDate;
        this.blogger = blogger;
        this.content = content;
        this.typeBlog = typeBlog;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBlogName() {
        return blogName;
    }

    public void setBlogName(String blogName) {
        this.blogName = blogName;
    }

    public String getBlogger() {
        return blogger;
    }

    public void setBlogger(String blogger) {
        this.blogger = blogger;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public TypeBlog getTypeBlog() {
        return typeBlog;
    }

    public void setTypeBlog(TypeBlog typeBlog) {
        this.typeBlog = typeBlog;
    }

    public String getBlogDate() {
        return blogDate;
    }

    public void setBlogDate(String blogDate) {
        this.blogDate = blogDate;
    }
}
