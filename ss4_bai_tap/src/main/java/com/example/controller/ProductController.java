package com.example.controller;


import com.example.model.Product;
import com.example.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private IProductService productService;

    @GetMapping("/product/list")
    public String display(Model model) {
        List<Product> productList = productService.display();
        model.addAttribute("productList", productList);
        return "/list";
    }

    @GetMapping("/product/create")
    public String showCreate(Model model) {
        model.addAttribute("product", new Product());
        return "/create";
    }

    @PostMapping("/product/createProduct")
    public String create(Product product) {
        List<Product> productList = productService.display();
        int idProduct = 0;
        for (Product p : productList) {
            if (idProduct <= p.getId()) {
                idProduct = p.getId()+1;
            }
        }
        Product product1 = new Product(idProduct, product.getName(), product.getPrice(), product.getDescribe(), product.getProducer());
        productService.addProduct(product1);
        return "redirect:/product/list";
    }

    @GetMapping("/product/remove")
    public String showRemove(@RequestParam int id, Model model) {
        Product product = productService.product(id);
        model.addAttribute("productRemove", product);
        model.addAttribute("idRemove", id);
        return "/remove";
    }

    @PostMapping("product/removeProduct")
    public String remove(@RequestParam int id) {
        productService.remove(id);
        return "redirect:/product/list";
    }

    @GetMapping("/product/edit")
    public String showEdit(@RequestParam int id, Model model) {
        Product product = productService.product(id);
        model.addAttribute("productEdit",product);
        model.addAttribute("id",id);
        return "/update";
    }

    @PostMapping("/product/editProduct")
    public String edit(Product product) {
        productService.edit(product.getId(),product);
        return "redirect:/product/list";
    }

    @GetMapping("/product/view")
    public String showView(@RequestParam int id, Model model){
        Product product = productService.product(id);
        model.addAttribute("product",product);
        return "/view";
    }

    @GetMapping("/product/search")
    public String showSearch(@RequestParam String name,Model model){
        List<Product> productList = productService.product(name);
        System.out.println(productList);
        model.addAttribute("productSearch",productList);
        return "/search";
    }
}
