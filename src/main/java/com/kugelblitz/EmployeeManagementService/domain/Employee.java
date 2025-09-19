package com.kugelblitz.EmployeeManagementService.domain;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Double salary;

    @ManyToOne
    @JoinColumn(name="department_id")
    private Department department;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address-id")
    private Address address;

    @ManyToMany
    @JoinTable(
            name = "employee_skills",
            joinColumns = @JoinColumn(name = "employee_id"),
            inverseJoinColumns = @JoinColumn(name = "skill_id")
    )
    private List<Skills> skills = new ArrayList<>();


    public Employee() {
    }

    public Employee(Long id, String name, Double salary, Department department, Address address, List<Skills> skills) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.address = address;
        this.skills = skills;
    }

    public List<Skills> getSkills() {
        return skills;
    }

    public void setSkills(List<Skills> skills) {
        this.skills = skills;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


}
