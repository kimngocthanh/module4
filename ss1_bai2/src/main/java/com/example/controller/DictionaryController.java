package com.example.controller;


import com.example.service.DictionaryService;
import com.example.service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {
    @Autowired
    private IDictionaryService dictionaryService;

    @GetMapping("/english")
    public String showConvert() {
        return "/english";
    }

    @PostMapping("/vietnamese")
    public String convert(@RequestParam String english, Model model) {
        String vietnamese = dictionaryService.vietnamese(english);
        model.addAttribute("vietnamese",vietnamese);
        return "/vietnamese";
    }
}
