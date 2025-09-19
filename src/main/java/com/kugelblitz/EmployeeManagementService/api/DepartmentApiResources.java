package com.kugelblitz.EmployeeManagementService.api;

import com.kugelblitz.EmployeeManagementService.domain.Department;
import com.kugelblitz.EmployeeManagementService.service.DepartmentReadPlatformServiceImpl;
import com.kugelblitz.EmployeeManagementService.service.DepartmentWritePlatFormServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class DepartmentApiResources {

    private final DepartmentWritePlatFormServiceImpl departmentService;
    private final DepartmentReadPlatformServiceImpl departmentReadPlatformService;

    public DepartmentApiResources(DepartmentWritePlatFormServiceImpl departmentService, DepartmentReadPlatformServiceImpl departmentReadPlatformService) {
        this.departmentService = departmentService;
        this.departmentReadPlatformService = departmentReadPlatformService;
    }

    @PostMapping("/saveDepartment")
    public Department saveDepartment(@RequestBody Department department){
       return    departmentService.saveDepartment(department);
    }

    @GetMapping("/getAllDepartment")
    public List<Department> getAllDepartment(){
        return departmentReadPlatformService.getAllDepartment();
    }

    @GetMapping("/getDepartmentById/{id}")
    public Optional<Department> getDepartmentById(@PathVariable Long id){
        return departmentReadPlatformService.getDepartmentById(id);
    }

}
