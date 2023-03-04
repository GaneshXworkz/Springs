<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search By Id</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>

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
			<a href="index.jsp">Home Page</a>			
		</div>
	</nav>
	
	<form action="search" method="get" class="container col-12 col-sm-6 col-md-3 shadow-lg p-4 mb-4 bg-white mx-auto d-block border border-primary rounded-lg 
m-5 pb-5 bg-info">
	
<per>
<div>
 Serach By Id <input type="search" name="id"><input type="submit" value="search" class="btn btn-primary">
 
</div>



		<div>
			<span style="color: red">${message}</span>
		</div>

		<h1>Result of searching</h1><br>
<h3>NAME :${bankto.name}</h3><br>
<h3>CONTECT NO :${bankto.contectNo}</h3><br>
<h3>PLACE :${bankto.palce}</h3><br>
<h3> GENDER :${bankto.gender}</h3><br>
<h3>ADDRESS :${bankto.address}</h3><br>
<h3>PAN NO :${bankto.panNo}</h3><br>
</per>
</form>
	
</form>

</body>
</html>