package com.example.webapp.controller;

import com.example.core.service.FooService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FooController {

    private final FooService fooService;

    public FooController(FooService fooService) {
        this.fooService = fooService;
    }

    @GetMapping("/")
    public String home() {
        return fooService.message();
    }
}
