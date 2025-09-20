package com.kugelblitz.EmployeeManagementService.service;

import com.kugelblitz.EmployeeManagementService.domain.*;
import com.kugelblitz.EmployeeManagementService.exception.EmployeeNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
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

    @Override
    public Optional<Employee> updateEmployee(Long id, Employee employee) {
        Optional<Employee> optionalEmployee = employeeRepository.findById(id);

        if (optionalEmployee.isPresent()) {
            Employee existingEmployee = optionalEmployee.get();
            if (employee.getName() != null) {
                existingEmployee.setName(employee.getName());}
            if (employee.getSalary() != null) {
                existingEmployee.setSalary(employee.getSalary());}
            if (employee.getAddress() != null) {
                existingEmployee.setAddress(employee.getAddress());}
            if (employee.getDepartment() != null) {
                existingEmployee.setDepartment(employee.getDepartment());}
            if (employee.getSkills() != null && !employee.getSkills().isEmpty()) {
                existingEmployee.setSkills(employee.getSkills());}
            Employee updatedEmployee = employeeRepository.save(existingEmployee);
            return Optional.of(updatedEmployee);
        } else {
            throw new EmployeeNotFoundException("id not found : " + id);
        }
    }


}
