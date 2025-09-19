package com.kugelblitz.EmployeeManagementService.service;

import com.kugelblitz.EmployeeManagementService.domain.Department;

import java.util.List;
import java.util.Optional;

public interface DepartmentReadPlatformService
{
    List<Department> getAllDepartment();
    Optional<Department> getDepartmentById(Long id);
}
