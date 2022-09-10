<html>
<head>
<%@include file="./base.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>
<body>
	<div class="container mt-3">

		<div class="row">

			<div class="col-md-12">

				<h1 class="text-center mb-3">Welcome to Song Web-App</h1>
				<table class="table">
					<thead class="thead-dark">
						<tr>
							<th scope="col">Artistic</th>
							<th scope="col">SongId</th>
							<th scope="col">Song</th>
							<th scope="col">Date of Release</th>
							<th scope="col">Rating</th>
							<th scope="col">Action</th>
						</tr>
					</thead>
					<tbody>

						<c:forEach items="${songs}" var="s">
							<tr>
								<th scope="row">${s.artistic }</th>
								
								<td>${s.songId }</td>
								<td>${s.song }</td>
								<td>${s.dateofRealese }</td>
								<td class="font-weight-bold"> ${s.rating }&#9733;</td>
								
								<td>
								<a href="delete/${s.songId }"><i class="fas fa-trash text-danger" style="font-size: 30px;"></i></a>
								<a href="update/${s.songId }"><i class="fas fa-pen-nib text-primary" style="font-size: 30px;"></i></a>
								</td>
								
							</tr>
						</c:forEach>
					</tbody>
				</table>

				<div class="container text-center">

					<a href="add-Song" class="btn btn-outline-success">Add
						Song</a>

				</div>


			</div>


		</div>

	</div>
</body>
</html>