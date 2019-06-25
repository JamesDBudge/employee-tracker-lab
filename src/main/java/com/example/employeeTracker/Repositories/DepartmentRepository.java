package com.example.employeeTracker.Repositories;

import com.example.employeeTracker.Models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
