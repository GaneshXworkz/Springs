<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update</title>
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
	<h1>WELCOME TO BANK UPDATE</h1>
	<c:forEach items="${errors}" var="u">
		<br>
		<span style="color: red">${u.message}</span>
	</c:forEach>

	<div>
		<span style="color: green;">${message}</span>
	</div>

	<form action="update" method="post"
		class="container col-12 col-sm-6 col-md-3 shadow-lg p-4 mb-4 bg-white mx-auto d-block border border-primary rounded-lg 
m-5 pb-5 bg-info">


       <div class="mb-3">
       <label for="formFile" class="form-Lable" >ID</label><input 
       type="text" class="form-control" name="id"  
       value="${dto.id}"/>
       
       </div>


		<div class="mb-3">
			<label for="formFile" class="form-Lable">name</label><input type="text"
				class="form-control" name="name" id="formFile" 
				required="required" placeholder="Enter name" value="${dto.name}" />

		</div>

        <div class="mb-3">
			<label for="formFile" class="form-Lable">contectNo</label><input type="number"
				class="form-control" name="contectNo" id="formFile" 
				required="required" placeholder="Enter contectNo" value="${dto.contectNo}" />

		</div> 

        SELECT PLACE<select class="form-select" aria-label="Default select example" name="palce"
        required="required" >
        <option selected value="${dto.palce}">${dto.palce}</option>
        <c:forEach items="${palce}" var="p">
        <option value="${p}">${p}</option>
        </c:forEach>
        </select>
        
         SELECT GENDER<select class="form-select" aria-label="Default select example" name="gender"
        required="required" >
        <option selected value="${dto.gender}">${dto.gender}</option>
        <c:forEach items="${gender}" var="g">
        <option value="${g}">${g}</option>
        </c:forEach>
        </select>
        
         <div class="mb-3">
			<label for="formFile" class="form-Lable">address</label><input type="text"
				class="form-control" name="address" id="formFile" 
				required="required" placeholder="Enter address" value="${dto.address}" />

		</div> 
        
       <div class="mb-3">
			<label for="formFile" class="form-Lable">panNo</label><input type="text"
				class="form-control" name="panNo" id="formFile" 
				required="required" placeholder="Enter panNo" value="${dto.panNo}" />

		</div> 

      <input type="submit" value="Update" class="btn btn-primary"/>


	</form>



</body>
</html>