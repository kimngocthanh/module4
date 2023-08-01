package com.example.ss11_baitap.controller;

import com.example.ss11_baitap.model.Blog;
import com.example.ss11_baitap.model.Category;
import com.example.ss11_baitap.service.IBlogService;
import com.example.ss11_baitap.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class BlogController {
    @Autowired
    private IBlogService blogService;
    @Autowired
    private ICategoryService categoryService;

    @GetMapping("/category/list")
    public String showCategory(Model model) {
        model.addAttribute("categoryList", categoryService.getAllCategory());
        return "category/list";
    }

    @GetMapping("/blog/list")
    public String showBlog(Model model) {
        model.addAttribute("blogList", blogService.displayBlog());
        return "blog/list";
    }

    @GetMapping("/blog/showBlogByName")
    public String showBlogByName(@RequestParam int id, Model model) {
        Category category = categoryService.category(id);
        List<Blog> blogList = blogService.findByName(category.getName());
        model.addAttribute("blogListByName",blogList);
        return "blog/blogListByName";
    }

    @GetMapping("/blog/detail")
    public String showDetailBlog(@RequestParam int id, Model model){
        model.addAttribute("blogDetail",blogService.blog(id));
        return "blog/detail";
    }

    @GetMapping("/blog/add")
    public String showAddBlog(Model model){
        model.addAttribute("blog",new Blog());
        model.addAttribute("category",categoryService.getAllCategory());
        return "blog/save";
    }

    @PostMapping("/blog/save")
    public String addBlog(@ModelAttribute Blog blog){
        blogService.addBlog(blog);
        return "redirect:/blog/list";
    }
}
