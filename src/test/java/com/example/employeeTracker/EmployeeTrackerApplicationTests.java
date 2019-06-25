package com.example.employeeTracker;

import com.example.employeeTracker.Models.Department;
import com.example.employeeTracker.Models.Employee;
import com.example.employeeTracker.Models.Project;
import com.example.employeeTracker.Repositories.DepartmentRepository;
import com.example.employeeTracker.Repositories.EmployeeRepository;
import com.example.employeeTracker.Repositories.ProjectRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeTrackerApplicationTests {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private DepartmentRepository departmentRepository;

	@Autowired
	private ProjectRepository projectRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canCreateEmployees() {
		Department department = new Department("Hunting");
		departmentRepository.save(department);

		Employee employee = new Employee("Dog", "The Bounty Hunter", 60, department);
		employeeRepository.save(employee);
	}

	@Test
	public void canAddEmployeesToProjects() {
		Department department = new Department("Hunting");
		departmentRepository.save(department);

		Employee employee = new Employee("Dog", "The Bounty Hunter", 60, department);
		employeeRepository.save(employee);

		Project project = new Project("Skipped Bail", 7);
		projectRepository.save(project);
		project.addEmployee(employee);
		projectRepository.save(project);
	}

}
