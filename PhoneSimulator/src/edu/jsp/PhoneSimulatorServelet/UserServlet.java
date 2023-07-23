package edu.jsp.PhoneSimulatorServelet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jsp.PhoneSimulatorServelet.dao.PhoneDatabaseOperation;
import org.jsp.PhoneSimulatorServelet.dto.Phone;

/**
 * Servlet implementation class UserServlet
 */
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PhoneDatabaseOperation database;

	public UserServlet() {

		this.database=new PhoneDatabaseOperation();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(request, response);
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		String action =request.getServletPath();

		switch (action ) {
		case "/new":
			newform(request,response);

			break;

		case "/insert":

			break;
		case "/update":

			break;
		case "/cc":

			break;

		case "/delete":

			break;
		default:
			break;
		}

	}


	private void newform(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("userform.jsp");
		dispatcher.forward(request, response);
		
	}

}
