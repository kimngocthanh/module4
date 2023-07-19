package com.example.service;

import com.example.model.Spice;
import com.example.repository.ISpiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpiceService implements ISpiceService{
    @Autowired
    private ISpiceRepository spiceRepository;
    @Override
    public List<Spice> display() {
        return spiceRepository.displaySpice();
    }
}
