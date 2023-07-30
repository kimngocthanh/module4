package com.example.ss8_baitap.dto;

public class BookDto {
//    private int idBook;
    private String name;
    private String author;
    private String code;
    private String typeBook;
    private String quantity;

    public BookDto() {
    }

    public BookDto( String name, String author, String code, String typeBook, String quantity) {
//        this.idBook = idBook;
        this.name = name;
        this.author = author;
        this.code = code;
        this.typeBook = typeBook;
        this.quantity = quantity;
    }

//    public int getIdBook() {
//        return idBook;
//    }
//
//    public void setIdBook(int idBook) {
//        this.idBook = idBook;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTypeBook() {
        return typeBook;
    }

    public void setTypeBook(String typeBook) {
        this.typeBook = typeBook;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "BookDto{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", code='" + code + '\'' +
                ", typeBook='" + typeBook + '\'' +
                ", quantity='" + quantity + '\'' +
                '}';
    }
}
