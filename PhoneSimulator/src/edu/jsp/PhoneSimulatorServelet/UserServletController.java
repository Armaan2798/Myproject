package edu.jsp.PhoneSimulatorServelet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jsp.PhoneSimulatorServelet.dao.PhoneDatabaseOperation;
import org.jsp.PhoneSimulatorServelet.dto.Phone;

/**
 * Servlet implementation class UserServletController
 */
@WebServlet("/")
public class UserServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private PhoneDatabaseOperation db;
	public void init() {
		db = new PhoneDatabaseOperation() ;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();

		try {
			switch (action) {
			case "/new":
				showNewForm(request, response);
				break;
			case "/insert":
				insertUser(request, response);
				break;
			case "/delete":
				deleteUser(request, response);
				break;
			/*case "/edit":
				showEditForm(request, response);
				break;*/
			case "/update":
				updateUser(request, response);
				break;
//			default:
//				listUser(request, response);
//				break;
			}
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
	}

//	private void listUser(HttpServletRequest request, HttpServletResponse response)
//			throws SQLException, IOException, ServletException {
//		ArrayList < Phone > listUser = db.display();
//		request.setAttribute("listUser", listUser);
//		RequestDispatcher dispatcher = request.getRequestDispatcher("user-list.jsp");
//		dispatcher.forward(request, response);
//	}

	private void showNewForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("user-form.jsp");
		dispatcher.forward(request, response);
	}

	/*private void showEditForm(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		String Number=request.getParameter("Number");
		User existingUser = db.Update(Phone, Number);
		RequestDispatcher dispatcher = request.getRequestDispatcher("user-form.jsp");
		request.setAttribute("user", existingUser);
		dispatcher.forward(request, response);

	}*/

	private void insertUser(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {
		String name = request.getParameter("Name");
		String Number = request.getParameter("Number");
		String email = request.getParameter("emailID");
		String DOB = request.getParameter("DOB");
		Phone p=new Phone();


		p.setName(name);
		p.setNumber(Number);
		p.setEmailId(email);
		p.setDOB(DOB);
		db.insert(p);
		response.sendRedirect("list");
	}

	private void updateUser(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {
		String Name=request.getParameter("Name");
		String Num=request.getParameter("Num");
		String emailID=request.getParameter("emailID");
		String DOB=request.getParameter("DOB");
		
		
		Phone p=new Phone();
		p.setName(Name);
		p.setNumber(Num);
		p.setEmailId(emailID);
		p.setDOB(DOB);
		db.Update(p);
		response.sendRedirect("list");
	}

	private void deleteUser(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {
		String Number =request.getParameter("Number");
		db.delete(Number);
		response.sendRedirect("list");

	}

}
