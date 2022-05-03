package com.example.calc;

import io.corp.calculator.TracerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationApp {

    @Bean
    public TracerImpl tracerAPI(){
        return new TracerImpl();
    }
}
