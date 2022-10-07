package com.customer.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.crud.dtos.CustomerDTO;
import com.customer.crud.models.CustomerEntity;
import com.customer.crud.repos.CustomerRepo;
import com.customer.crud.utils.CustomerUtils;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	public CustomerRepo customercrud;

	@Override
	public CustomerDTO createCustomer(CustomerDTO customerdto) {
		
		CustomerEntity customerentity = new CustomerEntity();
		customerentity = CustomerUtils.convertDtotoEntity(customerdto);
		CustomerEntity result = customercrud.save(customerentity);
		
		
		return CustomerUtils.covertEntitytoDTO(result);
	}

	@Override
	public CustomerDTO getCustomerbyId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CustomerDTO> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerDTO updateCustomerbyId(Long id, CustomerDTO customerdto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCustomerById() {
		// TODO Auto-generated method stub

	}

}
