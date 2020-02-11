package com.example.codeclan.onetomanyservice.controllers;

import com.example.codeclan.onetomanyservice.models.Employee;
import com.example.codeclan.onetomanyservice.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController


public class EmployeeController {

   @Autowired
   private EmployeeRepository employeeRepository;

   @GetMapping(value = "/employees")
   public List<Employee> getAllEmployees(){
       return employeeRepository.findAll();
   }
   @GetMapping(value = "/employees/{id}")
   public Optional <Employee> getEmployee(@PathVariable Long id){
    return employeeRepository.findById(id);
   }

   @PostMapping(value = "/employees")
   public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee){
       employeeRepository.save(employee);
       return new ResponseEntity<>(employee, HttpStatus.CREATED);
   }

}
