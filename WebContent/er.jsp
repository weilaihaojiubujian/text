<%@ page language="java" import="java.util.*,java.net.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
<!DOCTYPE html>
<html>
<%
request.setCharacterEncoding("utf-8");
%>
<head>
<meta charset="utf-8">
<title>系统登陆</title>
<body>  
<div id="login_frame">  
 <%@page import="java.sql.*" %> 

  
<ul>
<li><p><b></b>
<%

String name = request.getParameter("username");
%>
  <p>尊敬的 <%=session.getAttribute("username") %></p>
</p></li>
<li><p>
<%

String pass =request.getParameter("pass");
%>
 

	
   <a href="page1.jsp" rel="external nofollow" rel="external nofollow" >page1</a>
	
   	    <p> <a href="users.jsp" target="_blank">查看用户信息</a></p>
		    <br>

		   <%--    response.sendRedirect("page1.jsp"); 将页面重新跳转到page1--%>
</p></li>
</ul>
</div>  
  
</body>  
</html> 