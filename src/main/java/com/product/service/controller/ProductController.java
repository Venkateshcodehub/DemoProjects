package com.product.service.controller;

import com.product.service.entity.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ProductController {

    @PostMapping("/getProductDetails")
    public String getProductDetails(@RequestBody Product product){
        return "response";
    }
}
