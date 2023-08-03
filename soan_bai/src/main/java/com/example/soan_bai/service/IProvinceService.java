package com.example.soan_bai.service;

import com.example.soan_bai.model.Province;

public interface IProvinceService {
    Iterable<Province> findAll();

    Province findById(Long id);

    void save(Province province);

    void remove(Long id);
}
