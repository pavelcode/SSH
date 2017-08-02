package com.cblue.dao;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.cblue.entity.Customer;

public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {

	public void save(Customer customer) {
        this.getHibernateTemplate().save(customer);
	}

	public Customer get(Customer customer) {
		// TODO Auto-generated method stub
		return (Customer)this.getHibernateTemplate().find("from Customer where id=?", customer.getId()).get(0);
	}

	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		List<Customer> customers = this.getHibernateTemplate().executeWithNativeSession(new HibernateCallback<List<Customer>>() {
			public List<Customer> doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query = session.createQuery("from Customer");
				return query.list();
			}
			
		});
		return customers;
	}
	
	

}
