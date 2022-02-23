package com.example.demo.utility;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.example.demo.model.Employee;

public class EmployeeUtility {
	
	// sort by employee id

	public static List<Employee> sortByEmployeId(List<Employee> list) {
		return list.stream().sorted(new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getId().compareTo(o2.getId());
			}

		}).collect(Collectors.toList());
	}
	
	//  sort by employee name
	
	public static List<Employee> sortByEmployeName(List<Employee> list) {
		return list.stream().sorted(new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getName().compareTo(o2.getName());
			}

		}).collect(Collectors.toList());
	}
}
