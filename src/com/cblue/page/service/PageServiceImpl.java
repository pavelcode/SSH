package com.cblue.page.service;

import java.util.List;

import com.cblue.page.dao.PageDao;
import com.cblue.page.dao.PageDaoImpl;
import com.cblue.page.entity.PageBean;

import com.cblue.entity.Customer;

public class PageServiceImpl implements PageService {

    private PageDao pageDao;
    
    public void setPageDao(PageDao pageDao) {
		this.pageDao = pageDao;
	}

	/**
     * pageSize为每页显示的记录数
     * page为当前显示的网页
     */
    public PageBean getPageBean(int pageSize, int page){
        PageBean pageBean = new PageBean();
        int allRows = pageDao.getAllRowCount("select count(*) from Customer");
        int totalPage = pageBean.getTotalPages(pageSize, allRows);
        int currentPage = pageBean.getCurPage(page);
        int offset = pageBean.getCurrentPageOffset(pageSize, currentPage);
        List<Customer> list = pageDao.queryByPage("from Customer", offset, pageSize);    
        pageBean.setList(list);
        pageBean.setAllRows(allRows);
        pageBean.setCurrentPage(currentPage);
        pageBean.setTotalPage(totalPage);
        return pageBean;
    }

}
