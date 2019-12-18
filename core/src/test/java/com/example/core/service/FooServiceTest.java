package com.example.core.service;

import mockit.Expectations;
import mockit.Mocked;
import mockit.Verifications;
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

    @Mocked
    BarService barService;

    @Test
    void testSum() {
        new Expectations() {{
            barService.sum(anyInt, anyInt);
            result = 123;
        }};

        var result = fooService.sum(1, 2);
        assertThat(result).isEqualTo(123);

        new Verifications() {{
            barService.sum(anyInt, anyInt);
            times = 1;
        }};
    }

}
