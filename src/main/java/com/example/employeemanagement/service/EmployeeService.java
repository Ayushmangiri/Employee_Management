package com.example.employeemanagement.service;

import com.example.employeemanagement.Model.Employee;
import com.example.employeemanagement.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;


    public Employee addEmployee(Employee employee){

        return  employeeRepository.save(employee);
    }
    public List <Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }
}

