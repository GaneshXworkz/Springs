<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BANK</title>
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
			<div class="d-flex flex-row-reverse">
			<a href="index.jsp" class="p-2">HOME</a>
			<a href="findById.jsp" class="p-2">FIND BY ID</a>
			<a href="findSerchByName.jsp" class="p-2">FIND DETAILES BY NAME</a>			
			</div>			
		</div>
	</nav>
	
<form action="bankAction" method="post" class="container col-12 col-sm-6 col-md-3 shadow-lg p-4 mb-4 bg-white mx-auto d-block border border-primary rounded-lg 
m-5 pb-5 bg-info">

<table>

	    <c:forEach items="${error}" var="a">
		<span style="color:red">${a.message}</span><br>
		</c:forEach>


      <tr><h3> ACCOUNT SIGN IN</h3></tr>

     <tr><td>NAME :</td><td><input type="text" name="name"></td></tr>
	
	 <tr><td>CONTECT NO :</td><td><input type="number" name="contectNo"></td></tr>
	
	 <tr><td> 
           PLACE :</td><td> <select name="palce">
          <option value="">---SELECT---</option>
          <c:forEach items="${palce}" var="p">
          <option value="${p}">${p}</option>
          </c:forEach>
          </select>
          </td></tr>
	
	 <tr><td> 
           GENDER :</td><td> <select name="gender">
          <option value="">---SELECT---</option>
          <c:forEach items="${gender}" var="a">
          <option value="${a}">${a}</option>
          </c:forEach>
          </select>
          </td></tr>
	
	
	 <tr><td>ADDRESS</td><td><textarea rows="3" cols="22" name="address"></textarea></td></tr>	
	
	 <tr><td>PAN NO :</td><td><input type="text" name="panNo"></td></tr>
	 <br>
	
	  <tr><td><input type="submit" value="save"/></td></tr>
          
	
	</table>
	


  
</form>		
</body>




</html>