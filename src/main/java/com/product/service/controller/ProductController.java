package com.product.service.controller;

import com.product.service.entity.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProductController {

    @PostMapping("/getProductDetails")
    public ResponseEntity<String> getProductDetails(@RequestBody Product product){
        return new ResponseEntity<String>();
    }
}
