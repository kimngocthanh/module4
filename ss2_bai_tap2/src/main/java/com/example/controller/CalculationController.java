package com.example.controller;


import com.example.service.ICalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculationController {
    @Autowired
    private ICalculationService calculationService;

    @GetMapping("/calculation")
    public String showCalculation() {
        return "/calculation";
    }

    @PostMapping
    public String result(@RequestParam double number1, @RequestParam double number2, @RequestParam String result, Model model) {
        double results = 0;
        String mess = "";
        switch (result) {
            case "sum":
                results = calculationService.total(number1, number2);
                break;
            case "sub":
                results = calculationService.subtract(number1, number2);
                break;
            case "core":
                results = calculationService.core(number1, number2);
                break;
            case "divv":
                if (number2 == 0) {
                    mess = "Không thể chia cho 0";
                }
                results = calculationService.divide(number1, number2);
                break;
        }
        model.addAttribute("number2", number2);
        model.addAttribute("results", results);
        model.addAttribute("mess", mess);
        model.addAttribute("result", result);
        return "/calculation";
    }

}
