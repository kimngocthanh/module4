package com.example.service;

import com.example.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> displayCustomer();
    void addCustomer(Customer customer);
    void deleteCustomer(int id);
}
