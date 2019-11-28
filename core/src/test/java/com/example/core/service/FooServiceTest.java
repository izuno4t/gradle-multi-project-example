package com.example.core.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest("service.message=Hello")
public class FooServiceTest {

    @Autowired
    private FooService fooService;

    @Test
    public void contextLoads() {
        assertThat(fooService.message()).isNotNull();
    }

    @Test
    void message() {
        assertThat(fooService.message()).isEqualTo("Hello");
    }

    @SpringBootApplication
    static class TestConfiguration {
    }

}
