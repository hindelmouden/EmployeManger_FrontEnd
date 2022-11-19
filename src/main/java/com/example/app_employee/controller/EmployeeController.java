package com.example.app_employee.controller;

import com.example.app_employee.Service.EmployeeService;
import com.example.app_employee.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/all")
    public ResponseEntity<List<Employee>> getAllEmployees(){
        List<Employee> employees = employeeService.getListEmplyees();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Employee> findEmployee(@PathVariable("id") Long id){
        Employee employee = employeeService.getEmplyeeById(id);
        return new ResponseEntity<>(employee,HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
        Employee employe = employeeService.addEmployee(employee);
        return new ResponseEntity<>(employe,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public void deletedEmploy(@PathVariable Long id){
        employeeService.deletEmplyee(id);

    }

    @PutMapping("/update")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee){
        Employee updateEmploye = employeeService.addEmployee(employee);
        return new ResponseEntity<>(updateEmploye,HttpStatus.OK);
    }







}
