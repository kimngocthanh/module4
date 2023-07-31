package com.example.ss10_baitap.controller;

import com.example.ss10_baitap.dto.CartDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class CartController {
    @GetMapping("/cart")
    public String showCart(@SessionAttribute(value = "cart", required = false) CartDto cart, Model model) {
        model.addAttribute("cart",cart);
        return "/cart/list";
    }
}
