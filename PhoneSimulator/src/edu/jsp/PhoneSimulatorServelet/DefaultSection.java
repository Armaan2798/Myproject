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

public class DefaultSection extends HttpServlet 
{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("html/text");
		PrintWriter out =resp.getWriter();
		
		PhoneDatabaseOperation db=new PhoneDatabaseOperation();
		
			        ArrayList< Phone > listUser = db.display();
			        req.setAttribute("listUser", listUser);
			        RequestDispatcher dispatcher = req.getRequestDispatcher("User");
			        dispatcher.forward(req, resp);
	}
}
