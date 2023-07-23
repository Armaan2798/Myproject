<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
* {
	padding: 0;
	margin: 0;
	background: red solid;
}

header h1 {
	text-align: center;
	text-color:blue;
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
	<h1> Phone simulator</h1>
	<hr>
	</header>
	
	<div class="form">
		<form action="insertform" method="post">
			<label>Name</label>
			<input type<%= "text"%> name="Name" required<%= "required" %>>
			<br><br>
			
			<label>Number</label>
			<input type="text" name="Number" required<%= "required" %>>
			<br><br>
			
			
			<label>EmailID</label>
			<input type<%= "text"%> name="emailID" required<%= "required" %>>
			<br><br>
			
			
			<label>DOB</label>
			<input type="date" name="DOB" required<%= "required" %>>
			<br><br>
			
			<input type="submit" name="sumbit">
			
		
		
		</form>
	
	
	</div>

</body>
</html>