package com.customer.crud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.crud.dtos.CustomerDTO;
import com.customer.crud.service.CustomerServiceImpl;

@RestController
@RequestMapping(value = "/api/v1")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class CustomerController {
	
	@Autowired
	private CustomerServiceImpl customerservice;
	
	@PostMapping("/customer")
	public ResponseEntity createCustomer(@RequestBody CustomerDTO customerdto)
	{
		return new ResponseEntity(customerservice.createCustomer(customerdto),HttpStatus.OK);
	}

}
