package com.cblue.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.cblue.entity.Customer;

public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {

	public void save(Customer customer) {
		// TODO Auto-generated method stub
        this.getHibernateTemplate().save(customer);
	}

}
