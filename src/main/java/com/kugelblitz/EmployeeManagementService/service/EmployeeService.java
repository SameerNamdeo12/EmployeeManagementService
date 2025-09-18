package com.kugelblitz.EmployeeManagementService.service;

import com.kugelblitz.EmployeeManagementService.domain.Employee;
import com.kugelblitz.EmployeeManagementService.domain.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee createEmployee(Employee employee){
        Employee emp=new Employee();
        emp.setName(employee.getName());
        emp.setAddress(employee.getAddress());
        emp.setDepartment(employee.getDepartment());
        emp.setSalary(employee.getSalary());
        emp.setSkills(employee.getSkills());
        emp.setDepartment(employee.getDepartment());
        emp.setAddress(employee.getAddress());
        emp.setSkills(employee.getSkills());
        employeeRepository.save(emp);
        return emp;
    }
}
