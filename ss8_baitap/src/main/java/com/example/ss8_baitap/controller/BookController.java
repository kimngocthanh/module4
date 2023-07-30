package com.example.ss8_baitap.controller;


import com.example.ss8_baitap.dto.BookDto;
import com.example.ss8_baitap.dto.IBookDto;
import com.example.ss8_baitap.model.Book;
import com.example.ss8_baitap.model.TypeBook;
import com.example.ss8_baitap.service.IBookService;
import com.example.ss8_baitap.service.ITypeBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class BookController {
    @Autowired
    private ITypeBookService typeBookService;
    @Autowired
    private IBookService bookService;

    @GetMapping("/typeBook/list")
    public String showTypeBook(Model model) {
        model.addAttribute("typeBookList", typeBookService.displayTypeBook());
        return "/typeBook";
    }

    @GetMapping("/typeBook/add")
    public String showAddTypeBook(Model model) {
        model.addAttribute("typeBook", new TypeBook());
        return "/addTypeBook";
    }

    @PostMapping("/add")
    public String addTypeBook(@ModelAttribute TypeBook typeBook, RedirectAttributes redirectAttributes) {
        typeBookService.addAndEdit(typeBook);
        redirectAttributes.addFlashAttribute("mess", "Thêm mới loại sách thành công");
        return "redirect:/typeBook/list";
    }

    @GetMapping("/book/list")
    public String showBook(Model model) {
        List<BookDto> bookDtoList = bookService.displayBook();
        model.addAttribute("bookDtoList", bookDtoList);
        return "/book";
    }

    @GetMapping("/book/add")
    public String showAddBook(Model model) {
        model.addAttribute("bookDto", new BookDto());
        model.addAttribute("typeBookList", typeBookService.displayTypeBook());
        return "/addBook";
    }

    @PostMapping("/addBook")
    public String addBook(@ModelAttribute BookDto bookDto, RedirectAttributes redirectAttributes) {
        System.out.println(bookDto);
        bookService.add(bookDto);
        redirectAttributes.addFlashAttribute("mess","Thêm mới thành công");
        return "redirect:/book/list";
    }
}
