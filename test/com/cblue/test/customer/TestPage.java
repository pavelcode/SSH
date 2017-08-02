package com.cblue.test.customer;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cblue.entity.Customer;
import com.cblue.page.dao.PageDao;
import com.cblue.page.dao.PageDaoImpl;
import com.cblue.page.entity.PageBean;
import com.cblue.page.service.PageService;

public class TestPage {
	
	@Test
	public void initData(){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		PageDaoImpl pageDao = (PageDaoImpl)context.getBean("pageDao");
	    for(int i=0;i<100;i++){
	    	Customer customer = new Customer("zhangsan"+i,"123");
	    	pageDao.getHibernateTemplate().save(customer);
	    }
	
	}

	@Test
	public void testPage(){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		PageService pageService = (PageService)context.getBean("pageService");
		 PageBean pageBean = pageService.getPageBean(5, 0);
		 System.out.println(pageBean.getAllRows());
	}
}
