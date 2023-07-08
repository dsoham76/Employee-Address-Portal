# Employee-Address Portal

## Framework and Language

> Framework: SpringBoot Language: Java 8

## Data flow

1.  Controller

        1.1 EmployeeController
        - GET /employees - get all employees
        - GET /employees/{id} - get an employee by id
        - POST /employees - create a new employee
        - PUT /employees/{id} - update an employee by id
        - DELETE /employees/{id} - delete an employee by id

        1.2 AddressController
        - GET /addresses - get all addresses
        - GET /addresses/{id} - get an address by id
        - POST /addresses - create a new address
        - PUT /addresses/{id} - update an address by id
        - DELETE /addresses/{id} - delete an address by id

2.  Services

        1.1 EmployeeService
        - GET /employees - get all employees
        - GET /employees/{id} - get an employee by id
        - POST /employees - create a new employee
        - PUT /employees/{id} - update an employee by id
        - DELETE /employees/{id} - delete an employee by id

        1.2 AddressService
        - getaddresses - get all addresses
        - getaddresses/{id} - get an address by id
        - addaddresses - create a new address
        - updateaddresses/{id} - update an address by id
        - deleteaddresses/{id} - delete an address by id

3.  Repository

        - IAddressRepo
        - IEmployeeRepo

4.  Database Design

        Employee:
                id (Long)
                first name (String)
                lastName (String)
                address (Address)

        Address:
                id (Long)
                street (String)
                City (String)
                state (String)
                Zipcode (String)

## Data Structure Used in Project

     CrudRepository has been used as primay datastructure

## Project Summary

    The Employee-Address Portal is a comprehensive software solution designed to keep track of employee's address . The system provides a centralized platform that enables  administrators to create, read, edit, and delete Employee its address accounts.
