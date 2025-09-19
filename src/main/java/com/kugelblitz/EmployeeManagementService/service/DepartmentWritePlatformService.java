package com.kugelblitz.EmployeeManagementService.service;

import com.kugelblitz.EmployeeManagementService.domain.Department;

public interface DepartmentWritePlatformService
{
    Department saveDepartment(Department department);
}
