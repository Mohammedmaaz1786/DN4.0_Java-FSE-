package com.cognizant.orm_learn.repository;

import com.cognizant.orm_learn.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // Derived query methods
    List<com.cognizant.orm_learn.model.Employee> findByName(String name);

    List<com.cognizant.orm_learn.model.Employee> findByNameContaining(String keyword);

    List<com.cognizant.orm_learn.model.Employee> findByDepartmentId(int deptId);

    List<com.cognizant.orm_learn.model.Employee> findByPermanent(boolean permanent);

    List<com.cognizant.orm_learn.model.Employee> findBySalaryGreaterThan(double amount);
}
