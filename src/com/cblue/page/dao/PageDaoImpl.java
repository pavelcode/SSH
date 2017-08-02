package com.cblue.page.dao;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class PageDaoImpl extends HibernateDaoSupport implements PageDao {

	//final String gel = "select count(*) from SaleChanceInfo si";
	public int getAllRowCount(final String hql) {
        int result;
        result = getHibernateTemplate().execute(new HibernateCallback() {     

			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				// TODO Auto-generated method stub
				Query query = session.createQuery(hql);     
                return Integer.parseInt(query.list().get(0).toString());
			}     
    
        });
        return result;     
	}

	public List queryByPage(final String hql, final int start,final int pageSize) {
		// TODO Auto-generated method stub
		List list = getHibernateTemplate().execute(new HibernateCallback() {     
		    public Object doInHibernate(Session session)     
		      throws HibernateException, SQLException {     
		     Query query = session.createQuery(hql);     
		     query.setFirstResult(start);     
		     query.setMaxResults(pageSize);     
		     List list = query.list();     
		     return list;     
		    }     
		   });     
		   return list; 
	}

}
