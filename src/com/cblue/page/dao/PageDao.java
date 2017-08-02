package com.cblue.page.dao;

import java.util.List;

public interface PageDao {
	
	//获得所有记录数
	public int getAllRowCount(String hql);
	//获得分页记录
	public List queryByPage(String hql,int start,int pageSize);

}
