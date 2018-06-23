package com.maveric.registerservlet;

import java.sql.SQLException;

import com.maveric.flight.FlightDAO;

public class BookingLogic {
	
	int result;
	
	public boolean BookingDetails(FlightBooking flightBooking) throws SQLException{
		
		System.out.println("Flight Name:"+flightBooking.getFlight());
		System.out.println("Source:"+flightBooking.getSrc());
		System.out.println("Destination:"+flightBooking.getDestn());
		System.out.println("Fare:"+flightBooking.getFare());
		System.out.println("Seats:"+flightBooking.getSeats());
		System.out.println("AircraftName:"+flightBooking.getAircraft());
		
		
		boolean flag=false;
		if (flightBooking.getAircraft().equals("boeing"))
		{
					
			FlightDAO dao = new FlightDAO();
			int update = dao.FlightRegisterToDB(flightBooking);
			System.out.println("Update count in Business Logic"+update);
	    	
			if(update==1)
			{
				System.out.println("Updated Business logic ");
				flag=true;
			}
			
		}
		else
		{
			System.out.println("Will open Google");
			
		}
			
			
		return flag;	
		
	
	}
	
	
}
