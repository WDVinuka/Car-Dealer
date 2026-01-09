package com.example.product.controller;

import com.example.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1")
public class ProductController {

    @Autowired
    private ProductService productService;

    //display list of products
    @GetMapping("/product")
    public String viewHomePage(Model model){
        model.addAttribute("listProducts", productService.getAllProducts());
        return "index";
    }
}
