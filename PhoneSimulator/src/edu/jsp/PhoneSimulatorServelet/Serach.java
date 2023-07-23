package edu.jsp.PhoneSimulatorServelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jsp.PhoneSimulatorServelet.dao.PhoneDatabaseOperation;
import org.jsp.PhoneSimulatorServelet.dto.Phone;

public class Serach extends HttpServlet

{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out =resp.getWriter();
		String Name = req.getParameter("Name");
		PhoneDatabaseOperation db=new PhoneDatabaseOperation();
		Phone p=db.search(Name);
		
		if(db!=null)
		{
			String table="<table>"
					+ "<tr>"
					+ "<th>Name</th>"
					+ "<th>Number</th>"
					+ "<th>emailID</th>"
					+ "<th>DOB</th>"
					+ "</tr>"
					+ "<tr>"
					+ "<td>"
					+p.getName()
					+"</td>"
					+ "<td>"
					+ p.getNumber()
					+"</td>"
					+ "<td>"
					+ p.getEmailId()
					+"</td>"
					+"<td>"
					+p.getDOB()
					+"</td>"
					+ "</tr>"
					+ "</table>";
			out.print(table);
			
			
			
		}
		else
		{
			out.print("<h1> oops no data found in "+Name+"in database</h1>");
		}
		
		
		
		
		
		
	}

}
