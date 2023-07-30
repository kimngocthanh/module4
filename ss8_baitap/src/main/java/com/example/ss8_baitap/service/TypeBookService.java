package com.example.ss8_baitap.service;

import com.example.ss8_baitap.model.TypeBook;
import com.example.ss8_baitap.repository.ITypeBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeBookService implements ITypeBookService{
    @Autowired
    private ITypeBookRepository typeBookRepository;
    @Override
    public List<TypeBook> displayTypeBook() {
        return typeBookRepository.findAll();
    }

    @Override
    public void addAndEdit(TypeBook typeBook) {
        typeBookRepository.save(typeBook);
    }
}
