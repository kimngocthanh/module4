package com.example.controller;


import com.example.model.Customer;
import com.example.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    private ICustomerService customerService;

    @GetMapping("/customer/list")
    public String showList(Model model) {
        List<Customer> customerList = customerService.displayCustomer();
        model.addAttribute("customerList", customerList);
        return "/list";
    }

    @GetMapping("/customer/add")
    public String showAdd() {
        return "/add";
    }

    @PostMapping("/customer/add")
    public String add(@RequestParam int id, @RequestParam String name, @RequestParam String email, @RequestParam String address, Model model) {
        Customer customer = new Customer(id, name, email, address);
        customerService.addCustomer(customer);
        List<Customer> customerList = customerService.displayCustomer();
        model.addAttribute("customerList", customerList);
        return "/list";
    }

    @GetMapping("/customer/delete")
    public String showDelete(@RequestParam int id, Model model) {
        model.addAttribute("id", id);
        return "/delete";
    }

    @PostMapping("/customer/delete")
    public String remove(@RequestParam int id, Model model) {
        customerService.deleteCustomer(id);
        List<Customer> customerList = customerService.displayCustomer();
        model.addAttribute("customerList", customerList);
        return "/list";
    }

    @GetMapping("/customer/edit")
    public String showEdit(@RequestParam int id, Model model) {
        Customer customer = customerService.customer(id);
        model.addAttribute("customer",customer);
        model.addAttribute("id", id);
        return "/edit";
    }

    @PostMapping("/customer/edit")
    public String edit(@RequestParam int id, @RequestParam String name, @RequestParam String email, @RequestParam String address, Model model) {
        Customer customer = new Customer(id, name, email, address);
        customerService.editCustomer(id, customer);
        List<Customer> customerList = customerService.displayCustomer();
        model.addAttribute("customerList", customerList);
        return "/list";
    }
}
