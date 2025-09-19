package com.kugelblitz.EmployeeManagementService.service;

import com.kugelblitz.EmployeeManagementService.domain.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeWritePlatformServiceImpl implements EmployeeWritePlatformService{

    private final EmployeeRepository employeeRepository;
    private final DepartmentRepository departmentRepository;
    private final SkillsRepository skillsRepository;

    public EmployeeWritePlatformServiceImpl(EmployeeRepository employeeRepository, DepartmentRepository departmentRepository, SkillsRepository skillsRepository) {
        this.employeeRepository = employeeRepository;
        this.departmentRepository = departmentRepository;
        this.skillsRepository = skillsRepository;
    }

    @Override
    public Employee createEmployee(Employee employee) {
        Employee emp = new Employee();
        emp.setName(employee.getName());
        emp.setSalary(employee.getSalary());
        emp.setAddress(employee.getAddress());


        Department dept = departmentRepository.findById(employee.getDepartment().getId())
                .orElseThrow(() -> new RuntimeException("Department not found"));
        emp.setDepartment(dept);


        List<Skills> skills = employee.getSkills().stream()
                .map(s -> skillsRepository.findById(s.getId())
                        .orElseThrow(() -> new RuntimeException("Skill not found")))
                .collect(Collectors.toList());
        emp.setSkills(skills);

        return employeeRepository.save(emp);
    }

}
