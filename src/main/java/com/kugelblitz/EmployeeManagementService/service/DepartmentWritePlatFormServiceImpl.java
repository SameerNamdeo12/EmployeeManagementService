package com.kugelblitz.EmployeeManagementService.service;

import com.kugelblitz.EmployeeManagementService.domain.Department;
import com.kugelblitz.EmployeeManagementService.domain.DepartmentRepository;
import org.springframework.stereotype.Service;

@Service
public class DepartmentWritePlatFormServiceImpl  implements  DepartmentWritePlatformService{
    private final DepartmentRepository departmentRepository;

    public DepartmentWritePlatFormServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public Department saveDepartment(Department department){
        Department newDep=new Department();
        newDep.setName(department.getName());
        departmentRepository.save(newDep);
        return newDep;
    }
}
