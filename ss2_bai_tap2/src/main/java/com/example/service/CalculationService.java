package com.example.service;


import org.springframework.stereotype.Service;

@Service
public class CalculationService implements ICalculationService {
    @Override
    public double total(double a, double b) {
        return a + b;
    }

    @Override
    public double subtract(double a, double b) {
        return a - b;
    }

    @Override
    public double core(double a, double b) {
        return a * b;
    }

    @Override
    public double divide(double a, double b) {
        return a / b;
    }
}
