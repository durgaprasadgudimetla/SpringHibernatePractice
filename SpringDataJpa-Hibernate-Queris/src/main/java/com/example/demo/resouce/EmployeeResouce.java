package com.example.demo.resouce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeResouce {
	
	@Autowired
	EmployeeService empService;
	//@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/getEmployee")
	ResponseEntity<List<Employee>> getEmployees(){
		List<Employee> listEmp = empService.getEmployee();
		return new ResponseEntity<>(listEmp,HttpStatus.OK);
	}
	
//	@PutMapping("/updateEmployee")
//	ResponseEntity<Employee> 
	
	

}
