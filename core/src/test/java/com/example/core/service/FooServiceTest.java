package com.example.core.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest("service.message=Hello")
class FooServiceTest {

    @Test
    void test() {
        Assertions.assertThat("foo").isEqualTo("foo");
    }

}
