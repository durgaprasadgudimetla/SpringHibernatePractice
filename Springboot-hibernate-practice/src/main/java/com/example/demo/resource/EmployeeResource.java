package com.example.demo.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("employee")
public class EmployeeResource {
	
	
	//JdbcTemplate jdbcTemplate;
//	@Autowired
//	SessionFactory sf;
	
	/*
	 * @Autowired EntityManager em;
	 */
	/*@GetMapping()
	public ResponseEntity<List<Object>> getEmployees() {
		
        Session session = sf.openSession();
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction ts = session.beginTransaction();
		
		NativeQuery nq = session.createNativeQuery("select * from employee");
		nq.addEntity(Employee.class);
		List list = nq.getResultList();
		
		return new ResponseEntity<List<Object>>(new ArrayList<>(), HttpStatus.OK);
	}*/
	
	@Autowired
	EmployeeService empService;

	@GetMapping()
	public ResponseEntity<List<Employee>> getEmployees() {
		List<Employee> empList = empService.getEmployees();
		return new ResponseEntity<List<Employee>>(empList, HttpStatus.OK);
	}

	@PostMapping()
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee emp) {
		
		Employee response = empService.createEmployee(emp);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@PutMapping()
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee emp) {
		Employee response = empService.updateEmployee(emp);
		return new ResponseEntity<Employee>(response, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteEmloyee(@PathVariable Long id) {
		empService.deleteEmployee(id);
	}
}
