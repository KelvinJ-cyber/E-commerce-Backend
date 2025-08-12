package com.kelvin.e_com_backend.controller;

import com.kelvin.e_com_backend.model.Product;
import com.kelvin.e_com_backend.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    // Injecting the ProductService to handle business logic using constructor injection
    private final ProductService service;
    ProductController(ProductService service){
        this.service = service;
    }

    @RequestMapping("/")
    public String greeting() {
        return "Hello, welcome to the E-Commerce Backend!";
    }

    @GetMapping("/products")
    public List<Product> getAllProduct(){
        return null;
    }
}
