package com.example.demo.resouce;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

//	@Query(nativeQuery = true,value = "select * from tbl_countries ") // native query
//	@Query(value = "select e from Employee e") // named parameter
//	List<Employee> getEmployee();  // @NamedNativeQuery and @NamedQuery
	List<Employee> getEmployee();

}
