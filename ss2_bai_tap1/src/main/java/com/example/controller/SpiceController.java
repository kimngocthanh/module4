package com.example.controller;


import com.example.model.Spice;
import com.example.service.ISpiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class SpiceController {
    @Autowired
    private ISpiceService spiceService;

    @GetMapping("/spice/list")
    public String display(Model model){
        List<Spice> spiceList = spiceService.display();
        model.addAttribute("spiceList",spiceList);
        return "/list";
    }

    @PostMapping
    public String displaySpice(String checkBoxName, Model model){
        String spice = "";
        List<Spice> spiceList = spiceService.display();
        model.addAttribute("spiceList",spiceList);
        System.out.println(checkBoxName);
        if(checkBoxName != null){
            spice += checkBoxName;
        }
        model.addAttribute("spice",spice);
        return "/list";
    }
}
