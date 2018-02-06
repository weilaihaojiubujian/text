package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

import servlet.er;
import use.user;


public class yonghu {
  public int add(String name,String pass) {
	  Connection conn = null;
	  Statement stmt = null;
	  ResultSet rs=null;
		try {
			conn = er.getConnection();
			 stmt = (Statement) conn.createStatement();
		      String sql;
		      sql = "SELECT 用户名, 密码 FROM users";
		      rs = stmt.executeQuery(sql);
		    
		   
		      int i=0;
		      while(rs.next()){  
		            
                  String first=rs.getString("用户名");
	              String last=rs.getString("密码"); 
	         
	             
	              if(first.compareTo(name)==0 && last.compareTo(pass)==0)
	              { 
	            	  i=1;
	            	  break;
	              }

		      
		}
		if(i==0)
		{
			
		    System.out.println("注册成功");
			String sql_1="INSERT INTO users(用户名,密码)" +
	                   " VALUES ('"+name+"', '"+pass+"')";//插入操作...
	          stmt.executeUpdate(sql_1); 
	        
	          return i;
		}
		else
		{
			 System.out.println("用户名和密码相同，无法注册");
			
			 return i;
		}
  }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
	   
      //finally block used to close resources
	   if (rs!= null) {
			try {
				rs.close();
				rs= null;
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		// 释放语句对象
		if (stmt != null) {
			try {
				stmt.close();
				stmt = null;
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
   }//end try
		return 0;
		
}
  public int yanzhen(String name,String pass) {
	
	  Connection conn = null;
	  Statement stmt = null;
	  ResultSet rs =null;	
		try {
			conn = er.getConnection();
			 stmt = (Statement) conn.createStatement();
		      String sql;
		      sql = "SELECT 用户名, 密码 FROM users";
		      rs = stmt.executeQuery(sql);
		    
		   
		      int i=0;
		      while(rs.next()){  
		            
                  String first=rs.getString("用户名");
	              String last=rs.getString("密码"); 
	         
	             
	              if(first.compareTo(name)==0 && last.compareTo(pass)==0)
	              { 
	            	  i=1;
	            	  break;
	              }

		      
		}
		if(i==1)
		{
			
		    System.out.println("登陆成功");
			
	         
	          return i;
		}
		else
		{
			 System.out.println("没有账号，无法登陆");
			 
			 return i;
		}
		 
	      
  }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
	   
      //finally block used to close resources
	   if (rs!= null) {
			try {
				rs.close();
				rs= null;
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		// 释放语句对象
		if (stmt != null) {
			try {
				stmt.close();
				stmt = null;
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}//end finally try
   }//end try
		return 0;
  }

  
  }
