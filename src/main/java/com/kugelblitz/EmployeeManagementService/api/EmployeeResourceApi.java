package com.kugelblitz.EmployeeManagementService.api;

import com.kugelblitz.EmployeeManagementService.domain.Employee;
import com.kugelblitz.EmployeeManagementService.service.EmployeeReadPlatformServiceImpl;
import com.kugelblitz.EmployeeManagementService.service.EmployeeWritePlatformServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class EmployeeResourceApi {

    private final EmployeeWritePlatformServiceImpl employeeService;
    private final EmployeeReadPlatformServiceImpl employeeReadPlatformService;

    public EmployeeResourceApi(EmployeeWritePlatformServiceImpl employeeService, EmployeeReadPlatformServiceImpl employeeReadPlatformService) {
        this.employeeService = employeeService;
        this.employeeReadPlatformService = employeeReadPlatformService;
    }

    @PostMapping("/saveEmployee")
    public Employee saveEmployee(@RequestBody Employee employee ){
       return employeeService.createEmployee(employee);
    }

    @GetMapping("/getAllEmployee")
    public List<Employee> getAllEmployee(){
        return employeeReadPlatformService.getAllEmployee();
    }

    @GetMapping("/getEmployeeBYId/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable Long id){
        return employeeReadPlatformService.getEmployeeById(id);
    }

    @GetMapping("/getEmployeeByDepartmentId/{id}/employees")
    public List<Employee> getEmployeesByDepartment(@PathVariable Long id){
        return employeeReadPlatformService.findByDepartmentId(id);
    }

    @GetMapping("/getEmployeeByName/{name}")
    public List<Employee> getEmployeeByName(@PathVariable String name){
        return employeeReadPlatformService.findByName(name);
    }
    @GetMapping("/getByNameAndDepartmentName/{name}/{departmentName}")
     public List<Employee> findByNameIgnoreCaseOrDepartment_NameIgnoreCase(@PathVariable String name, @PathVariable String departmentName){
        return employeeReadPlatformService.findByNameContainingIgnoreCaseOrDepartment_NameContainingIgnoreCase(name,departmentName);
    }

    @PutMapping("/updateEmployee/{id}")
    public Optional<Employee> updateEmployee(@PathVariable Long id,@RequestBody Employee employee){
        return employeeService.updateEmployee(id,employee);
    }
}
