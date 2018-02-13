package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

import servlet.er;

public class pinlun {
	public int add(String name,String wen,String pinglun) {
		  Connection conn = null;
		  Statement stmt = null;
		  ResultSet rs=null;
			try {
				conn = er.getConnection();
				 stmt = (Statement) conn.createStatement();
			      String sql;
			      sql = "SELECT 文章,评论人,评论  FROM pinglun";
			      rs = stmt.executeQuery(sql);
			    
			   
			      int i=0;
			      while(rs.next()){  
			            
			    	  String first=rs.getString("文章");
		              String wenben=rs.getString("评论人");
		              String second=rs.getString("评论");
		              
		             
		              if(wenben.compareTo(name)==0 && first.compareTo(wen)==0 && second.compareTo(pinglun)==0)
		              {
		            	  
		            	  
		          
		            	  i=1;
		            	  
		            	  break;
		              }
		              

			      
			}
			if(i==0)
			{
				
			    System.out.println("上传成功");
			    String sql_1="INSERT INTO pinglun(文章,评论人,评论)" +
		                   " VALUES ('"+wen+"','"+name+"', '"+pinglun+"')";//插入操作...
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
