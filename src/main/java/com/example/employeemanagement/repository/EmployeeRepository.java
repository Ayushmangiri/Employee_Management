package com.example.employeemanagement.repository;


import com.example.employeemanagement.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository <Employee , Integer> {
}
