package com.example.Employee_address.controller;

import com.example.Employee_address.model.Employee;
import com.example.Employee_address.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("employees")
    public Iterable<Employee> getEmployees(){
        return employeeService.getEmployees();
    }

    @GetMapping("employee/{id}")
    public Employee getEmployeeById(@PathVariable Long id){
        return employeeService.getEmployeeById(id);
    }

    @PostMapping("employee")
    public String addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }

    @PutMapping("employee/{id}/{lastName}")
    public String updateEmployeeLastName(@PathVariable Long id,@PathVariable String lastName){
        return employeeService.updateEmployeeLastName(id,lastName);
    }

    @DeleteMapping("employee/{id}")
    public String deleteEmployee(@PathVariable Long id){
        return employeeService.deleteEmployee(id);
    }


}
