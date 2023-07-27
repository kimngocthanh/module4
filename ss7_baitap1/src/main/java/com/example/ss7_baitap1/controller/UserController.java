package com.example.ss7_baitap1.controller;


import com.example.ss7_baitap1.dto.UserDto;
import com.example.ss7_baitap1.model.User;
import com.example.ss7_baitap1.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("/user/register")
    public String showRegister(Model model) {
        model.addAttribute("userDto", new UserDto());
        return "/register";
    }

    @PostMapping("/register")
    public String register(@Valid @ModelAttribute UserDto userDto, BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes) {
        User user = new User();
        new UserDto().validate(userDto,bindingResult);
        if(bindingResult.hasErrors()){
//            model.addAttribute("user",userDto);
            return "/register";
        }
        BeanUtils.copyProperties(userDto,user);
        userService.addUsers(user);
        redirectAttributes.addFlashAttribute("mess","thêm mới oke");
        return "/login";
    }
}
