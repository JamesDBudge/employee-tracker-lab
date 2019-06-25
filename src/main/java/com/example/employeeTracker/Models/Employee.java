package com.example.employeeTracker.Models;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="employees")
public class Employee {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String firstName;
    private String lastName;
    private int employeeNumber;

    @ManyToOne
    @JoinColumn(name="Department_ID", nullable = false)
    private Department department;

    @JsonIgnore
    @ManyToMany
    @JoinTable(
            name = "employee_projects",
            joinColumns = {@JoinColumn(
                    name="employee_id",
                    nullable = false,
                    updatable = false
            )},
            inverseJoinColumns = { @JoinColumn(
                    name="project_id",
                    nullable = false,
            updatable = false

    )}
    )

    private List<Project> projects;



    public Employee(){

    }

    public Employee(String firstName, String lastName, int employeeNumber, Department department){
        this.department = department;
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeNumber = employeeNumber;
        this.projects = new ArrayList<Project>();
    }




    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }
}
