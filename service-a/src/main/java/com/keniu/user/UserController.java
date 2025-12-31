package com.keniu.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class UserController {

    @GetMapping("/users")
    public List<String> users() {
        return List.of("Alice", "Bob", "Charlie");
    }
}
