package com.example.service;


import org.springframework.stereotype.Service;

@Service
public class ConvertMoney implements IConvertMoney{

    @Override
    public double convertMoney(double moneyUsd, double rate) {
        return moneyUsd*rate;
    }
}
