package com.maveric.flight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.maveric.registerservlet.FlightBooking;


public class FlightDAO {
	
	private final String JBDC_DRIVER = "com.mysql.cj.jdbc.Driver";
	private final String DB_URL = "jdbc:mysql://127.0.0.1:3306/flightdb";
	
	static final String USER = "YAZH";
	static final String PASSWORD = "YAZH";
	int result;
	
	public int FlightRegisterToDB(FlightBooking flightModel) throws SQLException{
		Connection con = null;
		Statement stmt = null;
		
		
		try
		{
			Class.forName(JBDC_DRIVER);
						
			con = DriverManager.getConnection(DB_URL,USER,PASSWORD);
		    stmt = con.createStatement();
		    String query = "INSERT INTO `flightdetails`(`Flight Name`, `Source`, `Destination`, `Fare`, `No of Seats`, `AircraftName`) "
		    		+ "VALUES ('"+flightModel.getFlight()+"','"+flightModel.getSrc()+"','"+flightModel.getDestn()+"','"+flightModel.getFare()+"','"+flightModel.getSeats()+"','"
		    		+flightModel.getAircraft()+"')";
		    System.out.println("Entered DAO Layer with Query"+query);
		    	 result = stmt.executeUpdate(query);
		    	System.out.println("Resukt"+result);
		    	
		    	
		}
		
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		finally{
			stmt.close();
			con.close();
			
		}
		System.out.println("Returning Result"+result);
    	
		return result;
		
		}
	}
	


