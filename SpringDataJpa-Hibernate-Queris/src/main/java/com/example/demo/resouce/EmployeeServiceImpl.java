package com.example.demo.resouce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository empRepo;

	@Override
	public List<Employee> getEmployee() {
		return empRepo.getEmployee();
	}

}
