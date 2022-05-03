package com.example.calc.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Please, enter only digits.")
public class CalcException extends RuntimeException {
    public CalcException() {
        super();
    }

    public CalcException(String message) {
        super(message);
    }
}
