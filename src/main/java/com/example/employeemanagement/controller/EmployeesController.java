package com.example.employeemanagement.controller;

import com.example.employeemanagement.Model.Employee;
import com.example.employeemanagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeesController {
    private final EmployeeService employeeService;

    @Autowired
    public EmployeesController(EmployeeService employeeService) {
        this.employeeService = employeeService;

    }

    @PostMapping("/add")
    public String addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployees(employee);
    }

    @GetMapping("/details")
    public List<Employee> getEmployeesController() {
        return employeeService.getEmployeeList();
    }
    @DeleteMapping("/delete")
    public String deleteEmployees( Employee employee){
        return employeeService.deleteEmployees(employee);
    }
}