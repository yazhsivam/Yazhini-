package com.maveric.registerservlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
//@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String flight = request.getParameter("FlightName");
		String src= request.getParameter("Source");
		String destn = request.getParameter("Destination");
		String fare = request.getParameter("Fare");
		String seats = request.getParameter("NoofSeats");
		String aircraft = request.getParameter("AircraftName");
		
	FlightBooking flightBookingmodel = new FlightBooking();
	flightBookingmodel.setAircraft(aircraft);
	flightBookingmodel.setFare(fare);
	flightBookingmodel.setFlight(flight);
	flightBookingmodel.setSeats(seats);
	flightBookingmodel.setSrc(src);
	flightBookingmodel.setDestn(destn);
	
		
		BookingLogic bookingLogic = new BookingLogic();
		boolean book=false;
		try {
			book = bookingLogic.BookingDetails(flightBookingmodel);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(book)
	
		{
			System.out.println("We will add to DB");
			request.getRequestDispatcher("addeddb.jsp").forward(request, response);
		}
		
		else
		{
			response.sendRedirect("https://www.google.co.in/");
		}
		
		
		//doGet(request, response);
	}

}
