<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>

<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-light "
		style="background-color: #e3f2fd;">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"> <img
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				alt="" width="50" height="30">

			</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="#">Home</a></li>
					<li class="nav-item"><a class="nav-link" href="#">Link</a></li>
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
						role="button" data-bs-toggle="dropdown" aria-expanded="false">
							Dropdown </a>
						<ul class="dropdown-menu" aria-labelledby="navbarDropdown">
							<li><a class="dropdown-item" href="#">Action</a></li>
							<li><a class="dropdown-item" href="#">Another action</a></li>
							<li><hr class="dropdown-divider"></li>
							<li><a class="dropdown-item" href="#">Something else
									here</a></li>
						</ul></li>
					<li class="nav-item"><a class="nav-link disabled" href="#"
						tabindex="-1" aria-disabled="true">Disabled</a></li>
				</ul>
				<form class="d-flex">
					<input class="form-control me-2" type="search" placeholder="Search"
						aria-label="Search">
					<button class="btn btn-outline-success" type="submit">Search</button>
				</form>
			</div>
		</div>
	</nav>

	<br>
	<h4>INTEVIEW DETALIES</h4>


	<form action="interview" method="post" class="form-control-lg ">
		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">NAME
				Name</label> <input type="text" class="form-control"
				id="exampleFormControlInput1" placeholder="Enter food name"
				name="name">
		</div>
		<div>
			<label for="exampleFormControlInput2" class="form-label">COMPANY
				NAME type</label> <select class="form-select" name="company"
				aria-label="Default select example">
				<option selected>Select COMPANY NAME</option>
				<option value="x-WORKZ">x-WORKZ</option>
				<option value="x-WORKZ RAJI">x-WORKZ RAJI</option>
				<option value="x-WORKZ BTM">x-WORKZ BTM</option>
			</select>
		</div>

		<div>
			<label for="customRange2" class="form-label">ROLE</label> <input
				type="text" class="form-range" min="0" max="5" id="customRange2"
				name="role">
		</div>

		<input type="submit" value="Send" class="btn btn-dark" />
	</form>


</body>
</html>