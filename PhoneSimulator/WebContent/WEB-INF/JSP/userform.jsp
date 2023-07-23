<%@page import="java.util.ArrayList"%>
<%@page import="org.jsp.PhoneSimulatorServelet.dao.PhoneDatabaseOperation"%>
<%@page import="org.jsp.PhoneSimulatorServelet.dto.Phone"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<% PhoneDatabaseOperation op =new PhoneDatabaseOperation();
	ArrayList<Phone> ph=op.display();
	%>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Phone Simulator</title>
<head>
<style type="text/css">
header {
	margin: 10px auto;
	padding: 15px;
	text-align: center;
}

.form {
	text-align: center;
}
</style>
</head>


</head>
<body>

	<header>
	<h3>Phone Simulator</h3>
	</header>



	<div class="container text-center">
		<a href="LogPage">User</a> <a href="LogPage" class="btn btn-success"></a>
	</div>


	<table border="1" width="500" align="center">
		<tr bgcolor="00FF7F">
			<th><b> Name</b></th>
			<th><b>Number</b></th>
			<th><b>Email</b></th>
			<th><b>DOB</b></th>
			<th><b>ACTION</b></th>
		</tr>
		
		<%
			for(int i=0;i<ph.size();i++)
			{
				
				Phone p = ph.get(i);
		%>
		<tr>
			<td><%= p.getName() %></td>
			<td><%= p.getNumber()%></td>
			<td><%= p.getEmailId()%></td>
			<td><%= p.getDOB()%></td>
			<td><a href="./update?name=<%=p.getName()%>">Edit</a></td>
			<td><a href="./Deletepage?id=<%=p.getNumber()%>">Delete</a></td>
		</tr>
		<%				
			}
		%>


	</table>







</body>
</html>