package com.example.employeeTracker.Repositories;

import com.example.employeeTracker.Models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
