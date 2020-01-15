package com.nik.model;

import lombok.Data;

@Data
public class Employee {

	private String name;
	private String email;
	private Integer phnum;
	private Address address;
	
}
