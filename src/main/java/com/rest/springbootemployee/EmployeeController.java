package com.rest.springbootemployee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public class EmployeeController {

    private EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    @GetMapping
    public List<Employee> getAll(){
        return employeeRepository.findAll();
    }

    @GetMapping
    public Employee getAllEmployees(){
        return employeeRepository.findAll().stream().findFirst().get();
    }

    @GetMapping("/{id}")
    public Employee getById(@PathVariable Integer id){
        return employeeRepository.findById(id);
    }

    @GetMapping(params = {"gender"})
    public List<Employee> getByGender(@RequestParam String gender){
        return employeeRepository.findByGender(gender);
    }
}
