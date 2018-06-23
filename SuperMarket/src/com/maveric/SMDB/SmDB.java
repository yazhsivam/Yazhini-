package com.maveric.SMDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.maveric.smservlet.SMModel;
import com.mysql.cj.protocol.Resultset;

public class SmDB {

	private static String JBDC_DRIVER = "com.mysql.cj.jdbc.Driver";
	private static String DB_URL = "jdbc:mysql://127.0.0.1:3306/smdb";
	
	static final String USER = "root";
	static final String PASSWORD = "";
	int result;

	public static Connection getDBConnection(){
		Connection con = null;
		try {

			Class.forName(JBDC_DRIVER);					
			con = DriverManager.getConnection(DB_URL,USER,PASSWORD);
		} catch (Exception e) {
  System.out.println("");
		}

		return con;

	}
			
	
	public int AdminToDB(SMModel modelvalues) throws SQLException{

		Statement stmt = null;
		
try
		{
			
						
	Connection con = getDBConnection();
		    stmt = con.createStatement();
		    String query = "INSERT INTO `smdb`(`EmpId`, `EmpName`, `DeptCode`, `DOJ`, `UserActive`, `Password`) "
		    		+ "VALUES ('"+modelvalues.getEmpId()+"','"+modelvalues.getEmpName()+"','"+modelvalues.getDeptCode()+"','"+modelvalues.getDoj()+"','"+modelvalues.getUserActive()+"','"+modelvalues.getPassword()+"')";
	
		    	 result = stmt.executeUpdate(query);	        			
		}
		
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}

	    	
		return result;
		
	}
	
		public boolean CheckLogin(String empId) throws SQLException{
			
			boolean flag;
			
			Connection con = getDBConnection();	
			System.out.println("emp id:"+empId);
		
			Statement stmt1 = null;
		    stmt1 = con.createStatement();
		    		  
			String query1 = "SELECT * FROM smdb WHERE EmpId = '"+empId+"'";
			
			System.out.println("query:"+query1);
		 ResultSet resultSet = stmt1.executeQuery(query1);
		 System.out.println("select user name password: "+resultSet);
		 
		 
		 if(resultSet.next()){
			 flag = true;
			 
		 }
		 else{
			 flag = false;
		 }
		 return flag;
		 }
		 			
		    
		}    
		    
	}	
	
	

