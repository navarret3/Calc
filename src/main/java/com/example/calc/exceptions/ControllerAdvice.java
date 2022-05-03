package com.example.calc.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerAdvice {
    @ResponseBody
    @ExceptionHandler(CalcException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    String handler(CalcException ex) {
        return ex.getMessage();
    }
}
