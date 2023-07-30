package com.example.ss8_baitap.service;

import com.example.ss8_baitap.dto.BookDto;
import com.example.ss8_baitap.dto.IBookDto;
import com.example.ss8_baitap.model.Book;

import java.util.List;

public interface IBookService {
    List<BookDto> displayBook();
    List<Book> displayBookByName(String nameTypeBook);
    void add(BookDto bookDto);
}
