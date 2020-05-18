package com.chenx.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MyException extends Exception {

    @ExceptionHandler(MyException.class)
    public void handler() {
        System.out.println("tyty");
    }
}
