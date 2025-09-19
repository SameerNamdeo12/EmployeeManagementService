package com.kugelblitz.EmployeeManagementService.service;

import com.kugelblitz.EmployeeManagementService.domain.Department;
import com.kugelblitz.EmployeeManagementService.domain.DepartmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentReadPlatformServiceImpl implements DepartmentReadPlatformService{
    private final DepartmentRepository departmentRepository;

    public DepartmentReadPlatformServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public List<Department> getAllDepartment(){
        return departmentRepository.findAll();
    }
    @Override
    public Optional<Department> getDepartmentById(Long id){
        return departmentRepository.findById(id);
    }
}
