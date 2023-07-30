package com.example.ss8_baitap.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class TypeBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTypeBook;

    @OneToMany(mappedBy = "typeBook")
    private Set<BookDetails> bookDetails;
    private String nameType;

    public TypeBook() {
    }

    public TypeBook(int idTypeBook, Set<BookDetails> bookDetails, String nameType) {
        this.idTypeBook = idTypeBook;
        this.bookDetails = bookDetails;
        this.nameType = nameType;
    }

    public String getNameType() {
        return nameType;
    }

    public void setNameType(String nameType) {
        this.nameType = nameType;
    }

    public int getIdTypeBook() {
        return idTypeBook;
    }

    public void setIdTypeBook(int idTypeBook) {
        this.idTypeBook = idTypeBook;
    }

    public Set<BookDetails> getBookDetails() {
        return bookDetails;
    }

    public void setBookDetails(Set<BookDetails> bookDetails) {
        this.bookDetails = bookDetails;
    }
}
