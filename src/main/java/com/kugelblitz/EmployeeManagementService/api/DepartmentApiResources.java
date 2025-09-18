package com.kugelblitz.EmployeeManagementService.api;

import com.kugelblitz.EmployeeManagementService.domain.Department;
import com.kugelblitz.EmployeeManagementService.domain.DepartmentRepository;
import com.kugelblitz.EmployeeManagementService.service.DepartmentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class DepartmentApiResources {

    private final DepartmentService departmentService;

    public DepartmentApiResources(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping("saveDepartment")
    public Department saveDepartment(@RequestBody Department department){
       return    departmentService.saveDepartment(department);
    }

}
