package com.example.demojenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping
    public String testApi() {
        return "Nguyễn Thành Đạt";
    }
}
