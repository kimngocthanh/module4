package com.example.ss10_baitap.controller;

import com.example.ss10_baitap.dto.CartDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class CartController {
    @ModelAttribute("cart")
    public CartDto setUpCart(){
        return new CartDto();
    }
    @GetMapping("/cart")
    public String showCart(@SessionAttribute(value = "cartDto", required = false) CartDto cartDto, Model model) {
        model.addAttribute("cartDto",cartDto);
        return "/cart/list";
    }
}
