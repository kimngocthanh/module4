package com.example.repository;

import com.example.model.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> displayCustomer();
    void addCustomer(Customer customer);
    void deleteCustomer(int id);
    void editCustomer(int id, Customer customer);
    Customer customer(int id);
}
