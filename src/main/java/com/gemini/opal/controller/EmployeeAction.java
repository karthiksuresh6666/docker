package com.gemini.opal.controller;

import com.gemini.opal.repository.dto.Employee;
import com.gemini.opal.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/employee")
public class EmployeeAction {

    EmployeeService employeeService;

    @Autowired
    EmployeeAction(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/find")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @PostMapping("/save")
    public Employee saveEmployee(@RequestBody Employee emp) {
        return employeeService.saveEmployee(emp);
    }
}
