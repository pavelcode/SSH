package com.cblue.dao;

import java.util.List;

import com.cblue.entity.Customer;

public interface CustomerDao {

	public void save(Customer customer);
	
	public Customer get(Customer customer);
	
	public List<Customer> getAll();
	
	
	
}
