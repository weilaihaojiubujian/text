<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>wenzhang</title>
</head>
<body>

 <form name="regForm" action="servlet/wenzhangshixian"method="post">
                 <tr>
			    	<td class="label">文章：</td>
			    	<td class="controler">
			    		<textarea name="article" id="article" rows="10" cols="40""></textarea>
			    	</td>
			    </tr>
			    <div id="login_control">  
           <input type="submit" id="btn_login" value="上传博客" onclick="login();name="submit""/> 
             
        </div>
 </form> 
</body>
</html>>