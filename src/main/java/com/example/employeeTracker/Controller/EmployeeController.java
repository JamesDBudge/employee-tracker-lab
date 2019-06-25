package com.example.employeeTracker.Controller;

import com.example.employeeTracker.Models.Employee;
import com.example.employeeTracker.Repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/employees")

public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @GetMapping(value = "{id}")
    public Optional<Employee> getEmployee(@PathVariable Long id) {
        return employeeRepository.findById(id);
    }

}
