package com.customer.crud.service;

import java.util.List;

import com.customer.crud.dtos.CustomerDTO;

public interface CustomerService {
	
	public CustomerDTO createCustomer(CustomerDTO customerdto);
	
	public CustomerDTO getCustomerbyId(Long id);
	
	public List<CustomerDTO> getAllCustomers();
	
	public CustomerDTO updateCustomerbyId(Long id, CustomerDTO customerdto);
	
	public void deleteCustomerById();

}
