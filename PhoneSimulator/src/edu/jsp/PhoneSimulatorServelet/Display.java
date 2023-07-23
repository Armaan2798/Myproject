package edu.jsp.PhoneSimulatorServelet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jsp.PhoneSimulatorServelet.dao.PhoneDatabaseOperation;
import org.jsp.PhoneSimulatorServelet.dto.Phone;

public class Display extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		resp.setContentType("text/html");
		PrintWriter out =resp.getWriter();
		PhoneDatabaseOperation db =new PhoneDatabaseOperation();
		ArrayList<Phone> p=db.display();
		
		
		RequestDispatcher rd =req.getRequestDispatcher("userform.jsp");
		rd.forward(req, resp);
		
	}
}
