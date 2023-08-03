package com.example.soan_bai.service;

import com.example.soan_bai.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> getCustomers();

    void saveCustomer(Customer theCustomer);

    Customer getCustomer(int theId);

    void deleteCustomer(int theId);

    List<Customer> findCustomersByFirstName(String name);
}
