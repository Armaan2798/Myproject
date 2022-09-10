<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp"%>
</head>
<body>


	<div class="container mt-3">

		<div class="row">

			<div class="col-md-6 offset-md-3">

				<h1 class="text-center mb-3">Fill the Song  Detail</h1>

				<form action="handle-song" method="post">
					<div class="form-group">
						<label for="Artistic">Singer Name</label> <input type="text"
							class="form-control" id="name" aria-describedby="emailHelp"
							name="Artistic" placeholder="Enter the Artistic name here">
					</div>


					<div class="form-group">

						<label for="Song">Song Title</label>
						<textarea class="form-control" name="Song" id="description"
							rows="5" placeholder="Enter the song description"></textarea>
					</div>



					<div class="form-group">
						<label for="DateofRealese">Date of Release  </label> <input type="text"
							placeholder="Enter Song Released Date" name="DateofRealese"
							class="form-control" id="DateofRealese">
					</div>
					
					<div class="form-group">
						<label for="Rating">Add Rating  </label> <input type="text"
							placeholder="Enter Song Rating" name="Rating"
							class="form-control" id="Rating">
					</div>
					
					
					

					<div class="container text-center">

						<a href="${pageContext.request.contextPath }/"
							class="btn btn-outline-danger">Back</a>
						<button type="submit" class="btn btn-primary">Add</button>
					</div>
				</form>


			</div>

		</div>

	</div>




</body>
</html>