package edu.jsp.PhoneSimulatorServelet;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jsp.PhoneSimulatorServelet.dao.PhoneDatabaseOperation;
import org.jsp.PhoneSimulatorServelet.dto.Phone;

//@WebServlet("/insertuser")
public class InsertUser extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		resp.setContentType("text/jsp");
		PrintWriter out =resp.getWriter();
		
		String Name = req.getParameter("Name");
		String Num =req.getParameter("Number");
		
		String emailID=req.getParameter("emailID");
		String DOB=req.getParameter("DOB");
		Phone p=new Phone();
		
		
		p.setName(Name);
		p.setNumber(Num);
		p.setEmailId(emailID);
		p.setDOB(DOB);
		
		PhoneDatabaseOperation db=new PhoneDatabaseOperation();
		Boolean Isinserted=db.insert(p);
		if(Isinserted)
		{
			
			out.print("<h1> records are inserted into database</h1>");
			req.getRequestDispatcher("User").forward(req, resp);
			
		}
		else
		{
			out.print("<h1 style ='backgroudcolor :red'> records are not inserted into the database</h1>");
			resp.sendRedirect("User");
		}
		
	
	
	}
}
