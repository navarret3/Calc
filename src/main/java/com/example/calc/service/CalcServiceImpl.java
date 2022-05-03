package com.example.calc.service;

import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService{

    public double sum(double num1, double num2) {
        return num1+num2;
    }

    public double subs(double num1, double num2) {
        return num1-num2;
    }
}
