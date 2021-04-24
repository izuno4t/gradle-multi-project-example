package com.example.webservice.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.example.core.service.BarService;
import com.example.core.service.FooService;
import com.example.core.service.ServiceProperties;

@SpringBootTest()
class FooControllerTest {

    MockMvc mockMvc;

    @InjectMocks
    FooController controller;

    @Mock
    FooService fooService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();

    }

    @AfterEach
    void tearDown() {
    }


    @Test
    void testHome() throws Exception {
        when(fooService.message()).thenReturn("foo");

        mockMvc.perform(get("/home"))
                .andExpect(status().isOk())
        .andExpect(content().string(""));
    }
}
