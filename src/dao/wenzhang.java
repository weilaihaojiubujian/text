package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

import servlet.er;

public class wenzhang {
	public int add(String name,String wen) {
		  Connection conn = null;
		  Statement stmt = null;
		  ResultSet rs=null;
			try {
				conn = er.getConnection();
				 stmt = (Statement) conn.createStatement();
			      String sql;
			      sql = "SELECT 作者, 文章 FROM wenzhang";
			      rs = stmt.executeQuery(sql);
			    
			   
			      int i=0;
			      while(rs.next()){  
			            
			    	  String first=rs.getString("作者");
		              String wenben=rs.getString("文章");
		         
		             
		              if(first.compareTo(name)==0 && wenben.compareTo(wen)==0)
		              { 
		            	  i=1;
		            	  break;
		              }

			      
			}
			if(i==0)
			{
				
			    System.out.println("上传成功");
				String sql_1="INSERT INTO wenzhang(作者,文章)" +
		                   " VALUES ('"+name+"', '"+wen+"')";//插入操作...
		          stmt.executeUpdate(sql_1); 
		        
		          return i;
			}
			else
			{
				 System.out.println("上传失败");
				
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
}
