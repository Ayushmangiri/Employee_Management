package com.example.employeemanagement.controller;

import com.example.employeemanagement.Model.Employee;
import com.example.employeemanagement.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeesController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("/add")
    public String addEmployee(@RequestBody  Employee employee) {
        employeeRepository.save(employee);
        return "Employee added successfully!!";
    }

    @GetMapping("/all")
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }
    @DeleteMapping("/delete")
    public String deleteEmployeeRepository() {
        employeeRepository.deleteAll();
        return "Deleted All list data";
    }
}
