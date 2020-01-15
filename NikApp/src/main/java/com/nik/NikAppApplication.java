package com.nik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NikAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(NikAppApplication.class, args);
		System.out.println("Hello");
	}

}
