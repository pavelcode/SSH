package com.cblue.service;

import java.util.List;

import com.cblue.dao.CustomerDao;
import com.cblue.entity.Customer;

public class CustomerServiceImpl implements CustomerService {

	private CustomerDao customerDao;
	
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	public void register(Customer customer) {
		// TODO Auto-generated method stub
		customerDao.save(customer);
	}

	public Customer login(Customer customer) {
		// TODO Auto-generated method stub
		return customerDao.get(customer);
	}

	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return customerDao.getAll();
	}

}
