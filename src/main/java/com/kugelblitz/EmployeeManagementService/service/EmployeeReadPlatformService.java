package com.kugelblitz.EmployeeManagementService.service;

import com.kugelblitz.EmployeeManagementService.domain.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeReadPlatformService {
    List<Employee> getAllEmployee();
    Optional<Employee> getEmployeeById(Long id);
}
