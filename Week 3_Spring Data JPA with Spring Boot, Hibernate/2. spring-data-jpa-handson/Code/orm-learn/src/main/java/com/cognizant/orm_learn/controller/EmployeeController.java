package com.cognizant.orm_learn.controller;

import com.cognizant.orm_learn.model.Employee;
import com.cognizant.orm_learn.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private com.cognizant.orm_learn.repository.EmployeeRepository employeeRepository;

    @GetMapping
    public List<Employee> getAll() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee get(@PathVariable int id) {
        return employeeService.findEmployeeById(id);
    }

    @PostMapping
    public Employee create(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }

    @PutMapping
    public Employee update(@RequestBody Employee employee) {
        return employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        employeeService.deleteEmployee(id);
    }

    @GetMapping("/search/by-name")
    public java.util.List<com.cognizant.orm_learn.model.Employee> getByName(@RequestParam String name) {
        return employeeRepository.findByName(name);
    }

    @GetMapping("/search/by-name-partial")
    public java.util.List<com.cognizant.orm_learn.model.Employee> getByNameContaining(@RequestParam String keyword) {
        return employeeRepository.findByNameContaining(keyword);
    }

    @GetMapping("/search/by-department")
    public java.util.List<com.cognizant.orm_learn.model.Employee> getByDept(@RequestParam int deptId) {
        return employeeRepository.findByDepartmentId(deptId);
    }

    @GetMapping("/search/by-permanent")
    public java.util.List<com.cognizant.orm_learn.model.Employee> getByPermanent(@RequestParam boolean status) {
        return employeeRepository.findByPermanent(status);
    }

    @GetMapping("/search/by-salary")
    public java.util.List<com.cognizant.orm_learn.model.Employee> getBySalary(@RequestParam double amount) {
        return employeeRepository.findBySalaryGreaterThan(amount);
    }
}
