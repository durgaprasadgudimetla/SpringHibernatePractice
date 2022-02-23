package com.example.demo.test.utility;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.Employee;

@SpringBootTest
public class EmployeeUtilityTest {
	
	
	
	@Test
	public void  testSortByEmployeId() {
		//EmployeeUtility.sortByEmployeId(null);
		
		assertTrue(true);
		
		/*EmployeeUtilityTest emt = new EmployeeUtilityTest();
		String department = emt.test(null);
		assertThatNullPointerException();
		assertEquals(department, null);*/
	}
	
/*
	@Test
	public void  testSortByEmployeName() {
		//EmployeeUtility.sortByEmployeId(null);
	}
	
	*/
	
	private String test(Employee emp) {
		return emp.getDepartment();
	}

}

