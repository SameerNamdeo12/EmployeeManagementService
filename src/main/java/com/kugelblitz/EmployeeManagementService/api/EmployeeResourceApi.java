package com.kugelblitz.EmployeeManagementService.api;

import com.kugelblitz.EmployeeManagementService.domain.Employee;
import com.kugelblitz.EmployeeManagementService.service.EmployeeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmployeeResourceApi {

    private final EmployeeService employeeService;

    public EmployeeResourceApi(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/saveEmployee")
    public Employee saveEmployee(@RequestBody Employee employee ){
       return employeeService.createEmployee(employee);
    }
}
