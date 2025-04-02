package com.example.employeemanagement.service;

import com.example.employeemanagement.Model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class EmployeeService {
     public final List<Employee> employeeList= new ArrayList<>();
        public String addEmployees(Employee employee){
        employeeList.add(employee);

        return "You have successfully added a new Employees Details ";
        }
    public String deleteEmployees(Employee employee){
            employeeList.remove(employee);
            return "You have delete the employees details";
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }
}