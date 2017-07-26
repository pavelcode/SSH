package com.cblue.action;

import com.cblue.entity.Customer;
import com.cblue.service.CustomerService;
import com.opensymphony.xwork2.ActionSupport;

public class CustomerAction extends ActionSupport {
	
	private CustomerService customerService;

	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	public String register(){
		System.out.println("CustomerAction--register");
		Customer customer = new Customer();
		customer.setName("wuchao");
		customerService.registerCustomer(customer);
		return NONE;
	}


}
