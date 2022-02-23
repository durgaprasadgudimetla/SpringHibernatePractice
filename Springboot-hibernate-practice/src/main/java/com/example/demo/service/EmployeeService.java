
  package com.example.demo.service;
  
  import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
  
  @Service public interface EmployeeService { List<Employee> getEmployees();
  
  Employee createEmployee(Employee e);
  
  Employee updateEmployee(Employee e);
  
  void deleteEmployee(Long id); }
 