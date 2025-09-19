package com.kugelblitz.EmployeeManagementService.service;

import com.kugelblitz.EmployeeManagementService.domain.Employee;
import com.kugelblitz.EmployeeManagementService.domain.EmployeeRepository;
import com.kugelblitz.EmployeeManagementService.exception.EmployeeNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeReadPlatformServiceImpl implements EmployeeReadPlatformService{
    private final EmployeeRepository employeeRepository;

    public EmployeeReadPlatformServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<Employee> getEmployeeById(Long id) {
        return Optional.ofNullable(employeeRepository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException("Employee not found with id: " + id)));
    }
}
