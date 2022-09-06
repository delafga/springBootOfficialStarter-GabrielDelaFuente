package com.rest.springbootemployee;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeRepository {

    private List<Employee> employees;


    public List<Employee> findAll() {
        return employees;
    }



    public Employee findById(Integer id){
        return employees.stream()
                .filter(employee -> employee.getId().equals(id))
                .findFirst()
                .orElseThrow(NoEmployeeFoundException::new);
    }

    public List<Employee> findByGender(String gender) {
        return employees.stream().filter(employee -> employee.getGender().equals(gender));
    }
}
