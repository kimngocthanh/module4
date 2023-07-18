package com.example.repository;

import com.example.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerRepository implements ICustomerRepository{
    private static List<Customer> customerList = new ArrayList<>();
    static {
        customerList.add(new Customer(1,"Thành","abc@gmail.com","Hà Nội"));
        customerList.add(new Customer(2,"Cường","bcd@gmail.com","Quảng Nôm"));
        customerList.add(new Customer(3,"Duy","def@gmail.com","Đà nẵng"));
        customerList.add(new Customer(4,"Quý","egh@gmail.com","Quảng Nôm"));
    }
    @Override
    public List<Customer> displayCustomer() {
        return customerList;
    }

    @Override
    public void addCustomer(Customer customer) {
        customerList.add(customer);
    }

    @Override
    public void deleteCustomer(int id) {
        customerList.remove(id);
    }
}
