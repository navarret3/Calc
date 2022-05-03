package com.example.calc.controller;

import com.example.calc.ConfigurationApp;
import com.example.calc.exceptions.CalcException;
import com.example.calc.service.CalcService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalcController {

    ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationApp.class);

    private final CalcService calcService;

    public CalcController(CalcService service){
        this.calcService = service;
    }

    /**
     * Endpoint used to calculate the sum of two numbers
     * @param num1
     * @param num2
     * @return double
     */
    @GetMapping("/sum")
    public ResponseEntity<Double> sum(@RequestParam String num1,@RequestParam String num2) throws CalcException {
        try{
            double response = calcService.sum(Double.parseDouble(num1),Double.parseDouble(num2));

            return new ResponseEntity<>(response, HttpStatus.OK);
        }catch(Exception e){
            throw new CalcException("ERROR: Please, enter digits only.");
        }
    }

    /**
     * Endpoint used to make the calculation of a subtraction of two numbers
     * @param num1
     * @param num2
     * @return double
     */
    @GetMapping("/subs")
    public ResponseEntity<Double> subs(@RequestParam String num1,@RequestParam String num2) throws CalcException {
        try{
            double response = calcService.subs(Double.parseDouble(num1),Double.parseDouble(num2));

            return new ResponseEntity<>(response, HttpStatus.OK);
        }catch(Exception e){
            throw new CalcException("ERROR: Please, enter digits only.");
        }
    }
}
