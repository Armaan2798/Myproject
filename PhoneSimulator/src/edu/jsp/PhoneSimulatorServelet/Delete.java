package edu.jsp.PhoneSimulatorServelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jsp.PhoneSimulatorServelet.dao.PhoneDatabaseOperation;

public class Delete extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String Number = req.getParameter("id");
		PhoneDatabaseOperation db = new PhoneDatabaseOperation();
		db.delete(Number);
		req.getRequestDispatcher("User").forward(req, resp);

	}

}
