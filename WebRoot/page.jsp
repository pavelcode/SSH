<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
  <head>
   
    <title>My JSP 'pagePerson.jsp' starting page</title>
    
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">    
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">

    <script type="text/javascript">
        function validate(){
            var page = document.getElementsByName("page")[0].value;
            if(page > <s:property value="#request.pageBean.totalPage"/>){
                alert("你输入的页数大于最大页数，页面将跳转到首页！");
                window.document.location.href = "pageAction";
                return false;
            }
            return true;
        }
    </script>

  </head>
  
  <body>

    <h1><font color="blue">分页查询</font></h1><hr>
    <table border="1" align="center" bordercolor="yellow" width="50%">
        <tr>
            <th>序号</th>
            <th>姓名</th>
            <th>年龄</th>
        </tr>
    <s:iterator value="#request.pageBean.list" id="customer">
        <tr>
            <th><s:property value="#customer.id"/></th>
            <th><s:property value="#customer.name"/></th>
            <th><s:property value="#customer.pass"/></th>        
        </tr>
    
    </s:iterator>
    
    </table>
    
    <center>
    
        <font size="5">共<font color="red"><s:property value="#request.pageBean.totalPage"/></font>页 </font>&nbsp;&nbsp;
        <font size="5">共<font color="red"><s:property value="#request.pageBean.allRows"/></font>条记录</font><br><br>
        
        <s:if test="#request.pageBean.currentPage == 1">
            首页&nbsp;&nbsp;&nbsp;上一页
        </s:if>
        
        <s:else>
            <a href="pageAction.action">首页</a>
            &nbsp;&nbsp;&nbsp;
            <a href="pageAction.action?page=<s:property value="#request.pageBean.currentPage - 1"/>">上一页</a>
        </s:else>
        
        <s:if test="#request.pageBean.currentPage != #request.pageBean.totalPage">
            <a href="pageAction.action?page=<s:property value="#request.pageBean.currentPage + 1"/>">下一页</a>
            &nbsp;&nbsp;&nbsp;
            <a href="pageAction.action?page=<s:property value="#request.pageBean.totalPage"/>">尾页</a>
        </s:if>
        
        <s:else>
            下一页&nbsp;&nbsp;&nbsp;尾页
        </s:else>
    
    </center><br>
    
    <center>
        
        <form action="pageAction" onsubmit="return validate()">
            <font size="4">跳转至</font>
            <input type="text" size="2" name="page">页
            <input type="submit" value="跳转">
        </form>
        
    </center>
    
  </body>
</html>