package com.example.controller;

import com.example.service.IConvertMoney;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConvertController {
    @Autowired
    private IConvertMoney convertMoney;

    @GetMapping("/convert")
    public String showConvertMoney() {
        return "/convert";
    }

    @PostMapping("/moneyVnd")
    public String convert(@RequestParam double money, @RequestParam double rate, Model model){
        double vnd = convertMoney.convertMoney(money, rate);
        model.addAttribute("vnd",vnd);
        return "/moneyVnd";
    }
}
