package com.example.controller;


import com.example.model.Password;
import com.example.model.Users;
import com.example.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import java.util.List;

@Controller
public class UsersController {
    @Autowired
    private IUsersService usersService;

    @GetMapping("/login")
    public String login() {
        return "/login";
    }

    @PostMapping("/login")
    public String usersLogin(@ModelAttribute Password password, Model model) {
        if (usersService.checkLogin(password) != null) {
            model.addAttribute("users",usersService.checkLogin(password));
            return "/users";
        }else {
            return "/error";
        }
    }
}
