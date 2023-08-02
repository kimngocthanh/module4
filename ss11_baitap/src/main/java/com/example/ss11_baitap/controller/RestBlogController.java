package com.example.ss11_baitap.controller;

import com.example.ss11_baitap.model.Blog;
import com.example.ss11_baitap.model.Category;
import com.example.ss11_baitap.service.IBlogService;
import com.example.ss11_baitap.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class RestBlogController {
    @Autowired
    private IBlogService blogService;
    @Autowired
    private ICategoryService categoryService;
    @GetMapping("/api/blog")
    public ResponseEntity<List<Blog>> getList(){
        List<Blog> blogList = blogService.displayBlog();
        if(blogList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogList,HttpStatus.OK);
    }
    @GetMapping("/api/category")
    public ResponseEntity<List<Category>> getListCategory(){
        List<Category> categoryList = categoryService.getAllCategory();
        if(categoryList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(categoryList,HttpStatus.OK);
    }

    @DeleteMapping("/api/delete")
    public ResponseEntity<?> delete(@RequestParam int id){
        Blog blog = blogService.blog(id);
        if(blog==null){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        blogService.deleteBlog(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PostMapping("/api/add")
    public ResponseEntity<?> add(@RequestBody Blog blog){
        blogService.addBlog(blog);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("/api/detail")
    public ResponseEntity<Blog> getBlog(@RequestParam int id){
        Blog blog = blogService.blog(id);
        return new ResponseEntity<>(blog,HttpStatus.OK);
    }
    @GetMapping("/api/categoryDetail")
    public ResponseEntity<List<Blog>> getBlogByCategory(@RequestParam int id){
        Category category = categoryService.category(id);
        List<Blog> blogList = blogService.findByName(category.getName());
        return new ResponseEntity<>(blogList,HttpStatus.OK);
    }

    @GetMapping("/api/searchByName")
    public ResponseEntity<List<Blog>> getBlogByName(@RequestParam String name){
        List<Blog> blogList = blogService.findByNameBlog(name);
        return new ResponseEntity<>(blogList,HttpStatus.OK);
    }
    @GetMapping("/api/blogPage")
    public ResponseEntity<Page<Blog>> getBlogPage(@RequestParam(defaultValue = "0") int page){
        Pageable pageable = PageRequest.of(page,2);
        Page<Blog> blogPage = blogService.getBlogPage(pageable);
        return new ResponseEntity<>(blogPage,HttpStatus.OK);
    }
}
