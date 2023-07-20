package com.example.controller;


import com.example.model.Mail;
import com.example.service.IMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class MailController {
    @Autowired
    private IMailService mailService;

    @ModelAttribute("languages")
    public String[] getLanguages() {
        return new String[]{"English", "Vietnamese", "Japanese", "Chinese"};
    }

    @ModelAttribute("pageSize")
    public int[] getPageSize() {
        return new int[]{5, 10, 15, 25, 50, 100};
    }

    @GetMapping("/mail/list")
    public String display(Model model) {
        List<Mail> mail = mailService.displayMail();
        model.addAttribute("mail", mail);
        return "/list";
    }


    @GetMapping("/mail/edit")
    public String showEdit(int id, Model model) {
        Mail mail = mailService.mail(id);
        model.addAttribute("mail", mail);
        model.addAttribute("id", id);
        return "/edit";
    }

    @PostMapping("/mail/edit")
    public String edit(@ModelAttribute Mail mail) {
        mailService.updateMail(mail.getId(), mail);
        return "redirect:/mail/list";
    }
}
