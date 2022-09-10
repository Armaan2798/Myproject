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

				<h1 class="text-center mb-3">Change Song Details</h1>

				<form action="${pageContext.request.contextPath }/handle-song"
					method="post">

					<input type="hidden" value="${song.songId}" name="songId" />
					<div class="form-group">
						<label for="Song">Artistic Name</label> <input type="text"
							class="form-control" id="Song" aria-describedby="emailHelp"
							name="artistic" placeholder="Enter the Artistic name here"
							value="${song.artistic }">
					</div>


					<div class="form-group">

						<label for="Song">Song Description</label>
						<textarea class="form-control" name="song" id="Song"
							rows="5" placeholder="Enter the song description">${song.song }
							</textarea>
					</div>

				<div class="form-group">
						<label for="Rating">Date Of Realese</label> <input type="text"
							placeholder="Enter song rating" name="dateofRealese"
							class="form-control" id="Rating" value="${song.dateofRealese }">
					</div>


					<div class="form-group">
						<label for="Rating">Song Rating</label> <input type="text"
							placeholder="Enter song rating" name="rating"
							class="form-control" id="Rating" value="${song.rating }">
					</div>

					<div class="container text-center">

						<a href="${pageContext.request.contextPath }/"
							class="btn btn-outline-danger">Back</a>


						<button type="submit" class="btn btn-warning">Update</button>
					</div>
				</form>


			</div>

		</div>

	</div>




</body>
</html>