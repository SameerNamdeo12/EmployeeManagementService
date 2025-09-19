package com.kugelblitz.EmployeeManagementService.exception;

public class EmployeeNotFoundException extends  RuntimeException
{
    public EmployeeNotFoundException(String message) {
        super(message);
    }
}
