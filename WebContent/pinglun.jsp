<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>评论</title>
 <%@page import="java.io.*"%> 
<%@page import="javax.servlet.*" %>
<%@page import="javax.servlet.http.*" %>
<head>
<style type="text/css">

body {  
    background: url(34.jpg);  
    background-size: 100%;  
    background-repeat: no-repeat;  
}  
  
  #btn_login {  
    font-size: 14px;  
    font-family: 宋体;  
  
    width: 120px;  
    height: 28px;  
    line-height: 28px;  
    text-align: center;  
  
    color: white;  
    background-color: #3BD9FF;  
    border-radius: 6px;  
    border: 0;  
  
    float: left;  
}  

#login_control {  
    padding: 0 28px;  
}  
</style>
</head>
<body>
<%String id=null;
 id=request.getParameter("use");

if(id!=null){
	session.setAttribute("id",id);
}

%>
 <form  action="servlet/pinglun"method="post">
                 <tr>
			    	<td class="label">评论</td>
			    	<td class="controler">
			    		<textarea name="pinglun" id="pinglun" rows="10" cols="40""></textarea>
			    	</td>
			    </tr>
			    <div id="login_control">  
           <input type="submit" id="btn_login" value="评论" onclick="login();"name="submit"/> 
             
        </div>
 </form> 
</body>
</html>