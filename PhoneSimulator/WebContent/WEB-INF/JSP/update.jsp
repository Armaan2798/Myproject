<%@page import="org.jsp.PhoneSimulatorServelet.dto.Phone"%>
<%@page import="org.jsp.PhoneSimulatorServelet.dao.PhoneDatabaseOperation"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
* {
	padding: 0;
	margin: 0;
}

header h1 {
	text-align: center;
}
.form {
	width: 50%;
	border: 2px solid;
	margin: 10px auto;
	padding: 15px;
}
header {
	margin: 10px auto;
	padding: 15px;
}

</style>


</head>
<body>
	
	<header>
	<h1> Update Phone simulator</h1>
	<hr>
	</header>
	
	<%
		PhoneDatabaseOperation op = new  PhoneDatabaseOperation();
	String name =request.getParameter("name");
		Phone p = op.search(name);
	%>
	
	<div class="form">
		<form action="edit" method="post">
			
			<label>Name</label>
			<input type="text" name="Name" required="required" value="<%=p.getName() %>">
			<br><br>
			
			<label>Number</label>
			<input type="text" name="Number" required="required" value="<%=p.getNumber() %>">
			<br><br>
			
			
			<label>EmailID</label>
			<input type= "text" name="emailID"  required= "required" value="<%= p.getEmailId() %>">
			<br><br>
			
			
			<label>DOB</label>
			<input type="date" name="DOB" required= "required" value="<%=p.getDOB() %>">
			<br><br>
			
			<input type="submit" name="	UPDATE	">
			
		
		
		</form>
	
	
	</div>

</body>
</html>