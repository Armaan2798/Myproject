package org.jsp.PhoneSimulatorServelet.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import org.jsp.PhoneSimulatorServelet.dto.Phone;



public class PhoneDatabaseOperation 
{
	Scanner sc=new Scanner(System.in);
	private final static String DRIVER_CLASS="com.mysql.jdbc.Driver";
	private final static String DB_URL="jdbc:mysql://localhost:3306/contact_schema?user=root&password=root";

	public Boolean  insert(Phone p)
	{
		Connection con = null;
		PreparedStatement pstmt = null;
		int rowsAffected =0;


		try {
			Class.forName(DRIVER_CLASS);
			con = DriverManager.getConnection(DB_URL);
			String query = "INSERT INTO contact_app VALUES (?,?,?,?)";
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, p.getName());
			pstmt.setString(2, p.getNumber());
			pstmt.setString(3, p.getEmailId());
			pstmt.setString(4,p.getDOB());
			rowsAffected = pstmt.executeUpdate();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(con!=null)
			{
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(pstmt!=null)
			{
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		if(rowsAffected==1)
			return true;
		else
			return false;



	}

	public Phone search(String Name)
	{

		Phone  p =null;
		Connection con =null;
		PreparedStatement pstat=null;
		ResultSet rs=null;


		try {
			Class.forName(DRIVER_CLASS);
			con=DriverManager.getConnection(DB_URL);
			String query="select *from contact_app where Name=?";
			pstat=con.prepareStatement(query);
			pstat.setString(1, Name);
			rs=pstat.executeQuery();

			if(rs.next())
			{
				String Name1=rs.getString(1);
				String Number=rs.getString(2);
				String emailID=rs.getString(3);
				String DOB=rs.getString(4);

				p=new Phone();

				p.setName(Name1);
				p.setNumber(Number);
				p.setEmailId(emailID);
				p.setDOB(DOB);
			}



		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally {

			if((con!=null) || (pstat!=null) ||(rs!=null))
			{
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return p;



	}

	public boolean Update(Phone p)
	{
		Connection con = null;
		int rowsAffected1 = 0;
		PreparedStatement pstmt =null;
		String query = null;


		try {
			Class.forName(DRIVER_CLASS);
			con=DriverManager.getConnection(DB_URL);

			query ="UPDATE contact_app  SET  Number=?,emailID=?,DOB=? where Name= ?";

			pstmt=con.prepareStatement(query);
				
			pstmt.setString(1, p.getNumber() );
			
			
			
			pstmt.setString(2, p.getEmailId());
			pstmt.setString(3, p.getDOB());
			pstmt.setString(4, p.getName());
			

			rowsAffected1=pstmt.executeUpdate();
			






		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {

			if((con!=null) || (pstmt!=null))
			{
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		if (rowsAffected1!=0) {
			return true;
			
		}
		return false;
		
	}


	public void delete(String Number)
	{
		Connection con = null;
		int rowsAffected1 = 0;
		PreparedStatement pstmt =null;
		String query = null;

		{

			try {
				Class.forName(DRIVER_CLASS);
				con=DriverManager.getConnection(DB_URL);
				query="delete from contact_app where Number=?";
				pstmt=con.prepareStatement(query);
				
				pstmt.setString(1, Number);
				rowsAffected1=pstmt.executeUpdate();
				
			} catch (SQLException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
	
	public ArrayList<Phone> display()
	{
		ArrayList<Phone> allPhone= new ArrayList<Phone>();
		Connection con=null;
		PreparedStatement pstmt=null;
		int rowsAffected=0;
		String query= null;
		ResultSet rs=null;
		
		try {
			Class.forName(DRIVER_CLASS);
			con=DriverManager.getConnection(DB_URL);
			query="SELECT * FROM contact_app";
			pstmt=con.prepareStatement(query);
			rs=pstmt.executeQuery();
			
			while(rs.next())
			{
				String Name =rs.getString(1);
				String Number =rs.getString(2);
				String emailID=rs.getString(3);
				String DOB=rs.getString(4);
				
				
				Phone p =new Phone();
				p.setName(Name);
				p.setNumber(Number);
				p.setEmailId(emailID);
				p.setDOB(DOB);
				allPhone.add(p);
				
				
				
			}
			return allPhone;
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {

			if((con!=null) || (pstmt!=null) ||(rs!=null))
			{
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return allPhone;
		
		
		
		
		
	}
}
