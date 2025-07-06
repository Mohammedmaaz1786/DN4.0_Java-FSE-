package com.cognizant.orm_learn.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;
@Entity
public class Employee {

    @Id
    private int id;

    private String name;

    private double salary;

    private boolean permanent;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    // getters
    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }
    public boolean isPermanent() { return permanent; }
    public Department getDepartment() { return department; }

    // setters (optional but recommended)
    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setSalary(double salary) { this.salary = salary; }
    public void setPermanent(boolean permanent) { this.permanent = permanent; }
    public void setDepartment(Department department) { this.department = department; }
}



