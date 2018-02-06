<%@ page language="java" import="java.util.*,java.net.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>系统登陆</title>
<style type="text/css">

body {  
    background: url(12.jpg);  
    background-size: 100%;  
    background-repeat: no-repeat;  
}  
  
#login_frame {  
    width: 400px;  
    height: 260px;  
    padding: 13px;  
  
    position: absolute;  
    left: 50%;  
    top: 50%;  
    margin-left: -200px;  
    margin-top: -200px;  
  
    background-color: rgba(240, 255, 255, 0.5);  
  
    border-radius: 10px;  
    text-align: center;  
}  
  
form p > * {  
    display: inline-block;  
    vertical-align: middle;  
}  
  

.label_input {  
    font-size: 14px;  
    font-family: 宋体;  
  
    width: 65px;  
    height: 28px;  
    line-height: 28px;  
    text-align: center;  
  
    color: white;  
    background-color: #3CD8FF;  
    border-top-left-radius: 5px;  
    border-bottom-left-radius: 5px;  
}  
  
.text_field {  
    width: 278px;  
    height: 28px;  
    border-top-right-radius: 5px;  
    border-bottom-right-radius: 5px;  
    border: 0;  
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
  
#forget_pwd {  
    font-size: 12px;  
    color: black;  
    text-decoration: none;  
    position: relative;  
    float: right;  
    top: 5px;  
  
}  
  
#forget_pwd:hover {  
    color: blue;  
    text-decoration: underline;  
}  
  
#login_control {  
    padding: 0 28px;  
}  
</style>
</head>


<body>
<%@page import="java.sql.*" %>



<div id="login_frame">  
  
    
  
 
  <form  action="servlet/denlu"method="post">
      <label for="username">用户名:</label>
      <input type="text"  name="username" id="username" value=""/>
      <label for="pass">密码:</label>
      <input type="password"  name="pass" id="pass" value="" />    
      <tr>
           <td colspan="2"><input type="checkbox" name="isUseCookie" checked="checked"/>十天内记住我的登录状态</td>
         </tr>
    
   <div id="login_control">  
           <input type="submit" id="btn_login" value="登录" onclick="login();name="submit""/>  
           <hr>
               <a id="btn_login" href="zhuce.jsp">注册</a>  
        </div>  
    
</form> 
       
</div>  
</body>
</html>