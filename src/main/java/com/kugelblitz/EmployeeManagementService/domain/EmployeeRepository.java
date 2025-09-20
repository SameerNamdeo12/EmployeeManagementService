package com.kugelblitz.EmployeeManagementService.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository  extends JpaRepository<Employee,Long> {
    List<Employee> findByDepartmentId(Long departmentId);
    List<Employee> findByName(String name);
    List<Employee> findByNameContainingIgnoreCaseOrDepartment_NameContainingIgnoreCase(String name, String departmentName);
}
