package com.nik.services;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nik.model.Address;
import com.nik.model.Employee;
import com.nik.model.Employees;
import com.nik.model.Test;
import com.nik.model.Test2;

@RestController
@RequestMapping("/get")
public class GetService {

	@GetMapping(path = "/date", produces = MediaType.APPLICATION_JSON)
	public String getData() {
		return "{ \"name\" : \"Nikhil\" }";
	}

	@GetMapping(path = "/date2", produces = { "application/json" })
	public String getData2() {
		return "Nikhil2";
	}

	@GetMapping(path = "/SingleEmp",  produces = { "application/json"})
	public Test2 getEmployeeData() {

		Test2 t2 = new Test2();
		Employee emp = new Employee();
		emp.setEmail("N.karande@crif.com");
		emp.setName("Nikhil");
		emp.setPhnum(8338);
		Address add = new Address();
		add.setCity("Pune");
		add.setPin("411");
		emp.setAddress(add);
		t2.setEmployee(emp);
		return t2;
	}
	
	@GetMapping(path = "/ManyEmp",  produces = { "application/json"})
	public Test getManyEmployeeData() {

		Employee emp = new Employee();
		emp.setEmail("N.karande@crif.com");
		emp.setName("Nikhil");
		emp.setPhnum(8338);
		Address add = new Address();
		add.setCity("Pune");
		add.setPin("411");
		emp.setAddress(add);
		
		Employee emp1 = new Employee();
		emp1.setEmail("Jay.karande@crif.com");
		emp1.setName("Jay");
		emp1.setPhnum(7889);
		Address add2 = new Address();
		add2.setCity("USA");
		add2.setPin("422");
		emp1.setAddress(add2);
		
		ArrayList<Employee> listEmp = new ArrayList<Employee>();
		listEmp.add(emp);
		listEmp.add(emp1);
		
		Employees emps = new Employees();
		emps.setEmployee(listEmp);
		Test t = new Test();
		t.setEmployess(emps);
		return t;
		
	}

}
