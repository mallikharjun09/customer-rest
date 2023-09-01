package com.tmf.customer.restapi.customerrest.controllers;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tmf.customer.restapi.customerrest.entities.Customer;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	//Root URL
	@GetMapping("/")
	public String getData() {
		return "Welcome to Spring Boot project";
	}
	
	@GetMapping("/All")
	public List<Customer> getCustomers(){
		List<Customer> customers;
		Customer c1,c2,c3,c4,c5;
		c1 = new Customer(1, "jan", "vskp", "jan@gg.com",
				"Male", 7878787878L, Date.valueOf("2023-01-01"));
		c2 = new Customer(2, "man", "vskp", "jan@gg.com",
				"Male", 7878787878L, Date.valueOf("2023-01-01"));
		c3 = new Customer(3, "van", "vskp", "jan@gg.com",
				"Male", 7878787878L, Date.valueOf("2023-01-01"));
		c4 = new Customer(4, "lan", "vskp", "jan@gg.com",
				"Male", 7878787878L, Date.valueOf("2023-01-01"));
		c5 = new Customer(5, "pan", "vskp", "jan@gg.com",
				"Male", 7878787878L, Date.valueOf("2023-01-01"));
		
		customers = Arrays.asList(c1,c2,c3,c4,c5);
		return customers;
	}
}
