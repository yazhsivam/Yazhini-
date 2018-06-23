package com.maveric.smservlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SMServlet
 */
//@WebServlet("/SMServlet")
public class SMServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SMServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		SMModel modelvalues1 = new SMModel();
		
		modelvalues1.setEmpId(request.getParameter("EmpId"));
		modelvalues1.setPassword(request.getParameter("Password"));
					
		SMLogic logic1 = new SMLogic();	
		
		boolean add1 = true;
		add1 = logic1.validUser(flag);
		
		if(add1)	
		{
			
			request.getRequestDispatcher("Product.jsp").forward(request, response);
		}
						
		}
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
					
		SMModel modelvalues = new SMModel();
	
		modelvalues.setEmpId(request.getParameter("EmpId"));
		modelvalues.setEmpName(request.getParameter("EmpName"));
		modelvalues.setDeptCode(request.getParameter("DeptCode"));
		modelvalues.setDoj(request.getParameter("DOJ"));
		modelvalues.setUserActive("Active");
		modelvalues.setPassword(request.getParameter("Password"));
		
	
		SMLogic logic = new SMLogic();
	
		boolean add=true;
		
		
		try {
			add = logic.userActive(modelvalues);
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		if(add)
	
		{
			
			request.getRequestDispatcher("AdminLogin.jsp").forward(request, response);
		}
		
		else
		{
			response.sendRedirect("https://www.google.co.in/");
		}
		
		
		
		//doGet(request, response);
	}

}
