package com.example.calc.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class CalcServiceTest {

    @InjectMocks
    CalcServiceImpl service;

    @Test
    void sum() {
        double num1 = 4;
        double num2 = 15;

        double sum = service.sum(num1, num2);

        assertThat(sum).isEqualTo(num1+num2);
    }

    @Test
    void subs() {
        double num1 = 20;
        double num2 = 5;

        double sum = service.subs(num1, num2);

        assertThat(sum).isEqualTo(num1-num2);
    }
}
