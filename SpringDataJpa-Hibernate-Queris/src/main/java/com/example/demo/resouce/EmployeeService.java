package com.example.demo.resouce;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {
  List<Employee> getEmployee();
}
