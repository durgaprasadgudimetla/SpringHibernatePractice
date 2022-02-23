
  package com.example.demo.serviceimpl;
  
  import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import
  org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import  com.example.demo.repository.EmployeeRepository;
import  com.example.demo.service.EmployeeService;
  
  @Service
  
  @Transactional public class EmployeeServiceImpl implements EmployeeService {
  
  @Autowired EmployeeRepository empRepo;
  
  @Override public List<Employee> getEmployees() { return empRepo.findAll(); }
  
  @Override public Employee createEmployee(Employee emp) { return
  empRepo.save(emp); }
  
  @Override public Employee updateEmployee(Employee emp) { return
  empRepo.save(emp); }
  
  @Override public void deleteEmployee(Long id) { empRepo.deleteById(id); } }
 