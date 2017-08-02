package com.cblue.service;

import java.util.List;

import com.cblue.entity.Customer;

public interface CustomerService {

	public void register(Customer customer);
	
	public Customer login(Customer customer);
	
	public List<Customer> getAllCustomer();
}
