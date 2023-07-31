package com.example.ss10_baitap.controller;

import com.example.ss10_baitap.dto.CartDto;
import com.example.ss10_baitap.model.Product;
import com.example.ss10_baitap.service.IProductService;
import com.example.ss10_baitap.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@SessionAttributes("cart")
public class ProductController {
    @Autowired
    private IProductService productService;

    @ModelAttribute("cart")
    public CartDto initCart() {
        return new CartDto();
    }

    @GetMapping("/shop")
    public String showListProduct(Model model, @SessionAttribute(value = "cart",required = false) CartDto cartDto,
                                  @CookieValue(value = "productId",required = false,defaultValue = "-1")int id){
//        model.addAttribute("history",productService.product(id));
        if(cartDto!=null){
            model.addAttribute("cart",cartDto);
        }
        model.addAttribute("productList",productService.displayProduct());
        return "product/list";
    }
    @RequestMapping("/detail/{id}")
    public ModelAndView showDetail(@PathVariable int id){
        ModelAndView modelAndView = new ModelAndView("product/detail");
        modelAndView.addObject("product", productService.product(id));
        modelAndView.addObject("id",id);
        return modelAndView;
    }
    @GetMapping("/pay")
    public String payment(@ModelAttribute CartDto cart, RedirectAttributes redirectAttributes){
        float totalPayment = cart.countTotalPayment();
        cart.deleteAllItemInCard();
        redirectAttributes.addFlashAttribute("msg","Payment success with amount " +totalPayment);
        return "redirect:/cart";
    }
}
