package edu.jsp.PhoneSimulatorServelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jsp.PhoneSimulatorServelet.dao.PhoneDatabaseOperation;
import org.jsp.PhoneSimulatorServelet.dto.Phone;

public class Updata extends HttpServlet
{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		String name = req.getParameter("Name");
		String Num=req.getParameter("Number");
		String emailID=req.getParameter("emailID");
		String DOB=req.getParameter("DOB");
		
		
		Phone p=new Phone();
		p.setName(name);
		p.setNumber(Num);
		p.setEmailId(emailID);
		p.setDOB(DOB);
		
		PhoneDatabaseOperation db=new PhoneDatabaseOperation();
		Boolean IsUpdated=db.Update(p);
		if(IsUpdated)
		{
			out.print("<h1> updated!!!!<h1>");
			req.getRequestDispatcher("User").forward(req, resp);
			
		}
		else
		{
			out.print("<h1> data is not updata </h1>");
		}
		
		
		
	}

}
