package com.example.Employee_address.service;

import com.example.Employee_address.model.Employee;
import com.example.Employee_address.repository.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    IEmployeeRepo employeeRepo;

    public Iterable<Employee> getEmployees() {
        return employeeRepo.findAll();
    }

    public Employee getEmployeeById(Long id) {
        Optional<Employee> myEmployees=employeeRepo.findById(id);
        Employee employee=myEmployees.get();
        if(myEmployees.isPresent()){
            return employee;
        }
        else
            return null;
    }

    public String addEmployee(Employee employee) {
        employeeRepo.save(employee);
        return "Employee has been added.";
    }

    public String updateEmployeeLastName(Long id, String lastName) {
        Optional<Employee> allEmployees=employeeRepo.findById(id);
        Employee employee=allEmployees.get();
        if(allEmployees.isPresent()){
            employee.setLastName(lastName);
            employeeRepo.save(employee);
            return "Employee's last name has been updated.";
        }else{
            return "No employee found with given id";
        }


    }

    public String deleteEmployee(Long id) {
        Optional<Employee> allEmployees=employeeRepo.findById(id);
        Employee employee=allEmployees.get();
        if(allEmployees.isPresent()){
            employeeRepo.deleteById(id);
            return "Employee has been deleted";
        }else{
            return "No employee found with given id";
        }
    }
}
