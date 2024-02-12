package com.gemini.opal.service;

import com.gemini.opal.repository.dto.Employee;
import com.gemini.opal.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    EmployeeRepository employeeRepository;

    @Autowired
    EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee saveEmployee(Employee emp) {
        return employeeRepository.save(emp);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}
