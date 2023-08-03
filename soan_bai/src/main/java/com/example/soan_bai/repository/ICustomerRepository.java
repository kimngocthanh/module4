package com.example.soan_bai.repository;

import com.example.soan_bai.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ICustomerRepository extends JpaRepository<Customer, Integer> {
    @Query(value = "select c from Customer c where c.firstName = :name")
    List<Customer> findCustomersByFirstNameCustomer(@Param("name") String name);
}
