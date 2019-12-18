package com.example.core.service;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

@Service
@EnableConfigurationProperties(ServiceProperties.class)
public class FooService {

    private final BarService barService;

    private final ServiceProperties serviceProperties;

    public FooService(ServiceProperties serviceProperties, BarService barService) {
        this.serviceProperties = serviceProperties;
        this.barService = barService;
    }

    public String message() {
        return this.serviceProperties.getMessage();
    }

    public int sum(int a, int b) {
        return barService.sum(a, b);
    }
}
