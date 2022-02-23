package com.example.demo.resouce;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
//@Table(name = "tbl_countries" ,schema = "countryinfo")
@Table(name = "tbl_countries" ,schema = "gdprasaddb")


/*@NamedNativeQueries(value = {
		@NamedNativeQuery(name = "Employee.getEmployee",query = "select * from tbl_countries",resultSetMapping = "mapping")
})

// if no entity class is available resultsetmap for dto object.
 
@SqlResultSetMappings(value = {
		@SqlResultSetMapping(classes = 
				@ConstructorResult(targetClass = Employee.class, columns = {
				@ColumnResult(name = "id", type = Integer.class),
				@ColumnResult(name = "sortname", type = String.class),
				@ColumnResult(name = "name", type = String.class)}), name = "mapping") })*/

// if return type is Entity class
/*@NamedNativeQueries(value = {
		@NamedNativeQuery(name = "Employee.getEmployee",query = "select * from tbl_countries",resultClass = Employee.class)
})*/

// Named Queries 
@NamedQueries(value = {
		@NamedQuery(name = "Employee.getEmployee",query = "select e from Employee e")
})
public class Employee {
	@Id
	private int id;
	private String sortname;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSortname() {
		return sortname;
	}
	public void setSortname(String sortname) {
		this.sortname = sortname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Employee() {
		
	}
	
	public Employee(int id, String sortname, String name) {
		super();
		this.id = id;
		this.sortname = sortname;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", sortname=" + sortname + ", name=" + name + "]";
	}
}
