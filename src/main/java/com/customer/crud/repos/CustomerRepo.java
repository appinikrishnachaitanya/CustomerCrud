package com.customer.crud.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.customer.crud.models.CustomerEntity;

public interface CustomerRepo extends JpaRepository<CustomerEntity, Long> {

}
