package com.example.calc.controller;

import com.example.calc.service.CalcService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(MockitoExtension.class)
public class CalcControllerTest {

    private MockMvc mvc;

    @Mock
    private CalcService service;

    @InjectMocks
    private CalcController controller;

    @BeforeEach
    private void init(){
        this.mvc = MockMvcBuilders.standaloneSetup( controller ).build();
    }

    @Test
    public void sumTest() throws Exception {
        mvc.perform( MockMvcRequestBuilders
                        .get("/calculator/sum?num1=14&num2=231")
                        .accept(MediaType.APPLICATION_JSON))
                        .andDo(print())
                        .andExpect(status().isOk());
    }

    @Test
    public void subsTest() throws Exception {
        mvc.perform( MockMvcRequestBuilders
                        .get("/calculator/subs?num1=14&num2=231")
                        .accept(MediaType.APPLICATION_JSON))
                        .andDo(print())
                        .andExpect(status().isOk());
    }
}
