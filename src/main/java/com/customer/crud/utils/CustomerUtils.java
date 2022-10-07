package com.customer.crud.utils;

import org.springframework.beans.BeanUtils;

import com.customer.crud.dtos.CustomerDTO;
import com.customer.crud.models.CustomerEntity;



public class CustomerUtils {
	
	
	public static CustomerEntity convertDtotoEntity(CustomerDTO customerdto)
	{
		CustomerEntity customerentity = new CustomerEntity();
		
		BeanUtils.copyProperties(customerdto, customerentity);
		
		return customerentity;
	}
	
	public static CustomerDTO covertEntitytoDTO(CustomerEntity customerentity)
	{
		CustomerDTO customerdto = new CustomerDTO();
		
		BeanUtils.copyProperties(customerentity, customerdto);
		
		return customerdto;
	}
	

}
