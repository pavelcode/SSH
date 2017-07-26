package com.cblue.test.customer;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cblue.entity.Customer;
import com.cblue.service.CustomerService;

public class TestSpring {

	
	@Test
	public void testnitSpring(){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
	}
	
	@Test
	public void testRegisterCustomer(){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		CustomerService customerService = (CustomerService)context.getBean("customerService");
		Customer customer = new Customer();
		customer.setName("lisi");
		customer.setPass("123");
		customerService.registerCustomer(customer);
		
	}
}
