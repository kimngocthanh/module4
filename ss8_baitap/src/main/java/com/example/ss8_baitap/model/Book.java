package com.example.ss8_baitap.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBook;
    private String name;
    private String author;
    private int quantity;
    private String code;
    @OneToMany(mappedBy = "book")
    private Set<BookDetails> bookDetails;

    public Book() {
    }

    public Book(int idBook, String name, String author, int quantity, String code, Set<BookDetails> bookDetails) {
        this.idBook = idBook;
        this.name = name;
        this.author = author;
        this.quantity = quantity;
        this.code = code;
        this.bookDetails = bookDetails;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Set<BookDetails> getBookDetails() {
        return bookDetails;
    }

    public void setBookDetails(Set<BookDetails> bookDetails) {
        this.bookDetails = bookDetails;
    }
}