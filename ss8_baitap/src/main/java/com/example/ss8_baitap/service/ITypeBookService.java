package com.example.ss8_baitap.service;

import com.example.ss8_baitap.model.TypeBook;

import java.util.List;

public interface ITypeBookService {
    List<TypeBook> displayTypeBook();
    void addAndEdit(TypeBook typeBook);
}
