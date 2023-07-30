package com.example.ss8_baitap.service;

import com.example.ss8_baitap.dto.BookDto;
import com.example.ss8_baitap.dto.IBookDto;
import com.example.ss8_baitap.model.Book;
import com.example.ss8_baitap.repository.IBookDetailsRepository;
import com.example.ss8_baitap.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService implements IBookService{
    @Autowired
    private IBookRepository bookRepository;
    @Autowired
    private IBookDetailsRepository bookDetailsRepository;
    @Override
    public List<BookDto> displayBook() {
        return bookRepository.getIBookDto();
    }

    @Override
    public List<Book> displayBookByName(String nameTypeBook) {
        return bookRepository.getBook(nameTypeBook);
    }

    @Override
    public void add(BookDto bookDto) {
        List<BookDto> iBookDtoList = displayBook();
        iBookDtoList.add(bookDto);
    }
}
