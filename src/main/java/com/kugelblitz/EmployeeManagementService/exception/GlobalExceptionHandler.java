package com.kugelblitz.EmployeeManagementService.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler
{
    @ExceptionHandler(EmployeeNotFoundException.class)
    public String handleIdNotFoundException(EmployeeNotFoundException exp) {
        return "Not Found: " + exp.getMessage();
    }
}
