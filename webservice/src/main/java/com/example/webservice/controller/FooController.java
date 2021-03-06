package com.example.webservice.controller;

import com.example.core.service.FooService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooController {

    private final FooService fooService;

    public FooController(FooService fooService) {
        this.fooService = fooService;
    }

    @GetMapping("/home")
    public String home() {
        return fooService.message();
    }
}
