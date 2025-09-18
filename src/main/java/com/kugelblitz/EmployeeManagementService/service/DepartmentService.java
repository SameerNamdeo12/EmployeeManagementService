package com.kugelblitz.EmployeeManagementService.service;

import com.kugelblitz.EmployeeManagementService.domain.Department;
import com.kugelblitz.EmployeeManagementService.domain.DepartmentRepository;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    private final DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public Department saveDepartment(Department department){
        Department newDep=new Department();
        newDep.setName(department.getName());
        departmentRepository.save(newDep);
        return newDep;
    }
}
