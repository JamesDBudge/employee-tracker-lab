package com.example.employeeTracker.Repositories;

import com.example.employeeTracker.Models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
