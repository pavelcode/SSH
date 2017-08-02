package com.cblue.page.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.cblue.page.entity.PageBean;
import com.cblue.page.service.PageService;
import com.cblue.page.service.PageServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class PageAction extends ActionSupport {

   private PageService pageService;
   
   
   public void setPageService(PageService pageService) {
	this.pageService = pageService;
}

private int page;
    
    public int getPage(){
        return page;
    }

    public void setPage(int page){
        this.page = page;
    }

    @Override
    public String execute() throws Exception
    {
        //表示每页显示5条记录，page表示当前网页
        PageBean pageBean = pageService.getPageBean(5, page);
        HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("pageBean", pageBean);
        return SUCCESS;
    }
}
