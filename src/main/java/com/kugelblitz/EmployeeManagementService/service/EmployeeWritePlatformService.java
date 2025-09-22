package com.kugelblitz.EmployeeManagementService.service;

import com.kugelblitz.EmployeeManagementService.domain.Employee;

import java.util.Optional;

public interface EmployeeWritePlatformService
{
    Employee createEmployee(Employee employee);


    Optional<Employee> updateEmployee(Long id, Employee employee);

    Employee deleteEmployee(Long id);
}
