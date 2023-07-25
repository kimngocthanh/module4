package com.example.ss6_bai_tap.controller;


import com.example.ss6_bai_tap.model.Blog;
import com.example.ss6_bai_tap.model.TypeBlog;
import com.example.ss6_bai_tap.repository.IBlogRepository;
import com.example.ss6_bai_tap.service.IBlogService;
import com.example.ss6_bai_tap.service.ITypeBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.lang.reflect.Type;
import java.util.List;

@Controller
public class BlogController {
    @Autowired
    private IBlogService blogService;
    @Autowired
    private ITypeBlogService typeBlogService;

    @GetMapping("/blog/list")
    public String display(Model model){
        List<Blog> blogList = blogService.display();
        model.addAttribute("blog",blogList);
        return "/list";
    }

    @GetMapping("/blog/save")
    public String showSave(Model model){
        List<TypeBlog> typeBlogList = typeBlogService.displayTypeBlog();
        model.addAttribute("blog", new Blog());
        model.addAttribute("typeBlogList",typeBlogList);
        return "/save";
    }

    @PostMapping("/blog/save")
    public String save(Blog blog, RedirectAttributes redirectAttributes){
        blogService.add(blog);
        redirectAttributes.addFlashAttribute("mess","thêm mới thành công");
        return "redirect:/blog/list";
    }

    @GetMapping("/blog/remove")
    public String remove(@RequestParam int id, RedirectAttributes redirectAttributes){
        blogService.remove(id);
        redirectAttributes.addFlashAttribute("mess","xoá thành công");
        return "redirect:/blog/list";
    }
}
