package com.keniu.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class ProductController {

    @GetMapping("/products")
    public List<String> products() {
        return List.of("Laptop", "Phone", "Tablet");
    }
}
