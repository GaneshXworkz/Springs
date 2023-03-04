<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>

</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"><img alt=""
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				height="80" width="60"> </a>

			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="d-flex flex-row-reverse">
				<a href="index.jsp" class="p-2">HOME</a>
			</div>
		</div>
	</nav>




	<span style="color: red">${message}</span>
	<span style="color: red">${messages}</span>

	<form action="serchByName" method="get"
		class="container col-12 col-sm-6 col-md-3 shadow-lg p-4 mb-4 bg-white mx-auto d-block border border-primary rounded-lg 
m-5 pb-5 bg-info">

		<div>
			Serach By Name<input type="search" name="name"><input
				type="submit" value="search" class="btn btn-primary">



		</div>
	</form>



	<div>
		<table border="1" class="table">

			<tr>
				<th scope="col">ID</th>
				<th scope="col">name</th>
				<th scope="col">contectNo</th>
				<th scope="col">Palce</th>
				<th scope="col">gender</th>
				<th scope="col">address</th>
				<th scope="col">panNo</th>
				<th scope="col">update</th>
				<th scope="col">Delete</th>
			</tr>

			<c:forEach items="${list}" var="l">

				<tr>
					<td>${l.id}</td>
					<td>${l.name}</td>
					<td>${l.contectNo}</td>
					<td>${l.palce}</td>
					<td>${l.gender}</td>
					<td>${l.address}</td>
					<td>${l.panNo}</td>
					<td><a href="updated?id=${l.id}">Edit</a></td>
					<td><a href="delete?id=${l.id}">Delete</a></td>
				</tr>

			</c:forEach>


		</table>

	</div>



</body>
</html>