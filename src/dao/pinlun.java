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
			      sql = "SELECT ����,������,����  FROM pinglun";
			      rs = stmt.executeQuery(sql);
			    
			   
			      int i=0;
			      while(rs.next()){  
			            
			    	  String first=rs.getString("����");
		              String wenben=rs.getString("������");
		              String second=rs.getString("����");
		              
		             
		              if(wenben.compareTo(name)==0 && first.compareTo(wen)==0 && second.compareTo(pinglun)==0)
		              {
		            	  
		            	  
		          
		            	  i=1;
		            	  
		            	  break;
		              }
		              

			      
			}
			if(i==0)
			{
				
			    System.out.println("�ϴ��ɹ�");
			    String sql_1="INSERT INTO pinglun(����,������,����)" +
		                   " VALUES ('"+wen+"','"+name+"', '"+pinglun+"')";//�������...
		          stmt.executeUpdate(sql_1); 
		        
		          return i;
			}
			else
			{
				 System.out.println("�ϴ�ʧ��");
				
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
			// �ͷ�������
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
