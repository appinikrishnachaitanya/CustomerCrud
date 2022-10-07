package com.customer.crud.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO {
	
	
	private Long id;
	private String name;
	private int age;
	private String city;
	private double balance;

}
