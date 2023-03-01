<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
			<a href="index.jsp">home</a>
</div>
</nav>
   
   <form action="display" method="post"> 

    <pre>
    
    <c:forEach items="${error}" var="v">
	<span style="color:red">${v.message }</span>
	</c:forEach>
    
    <input type="text" name="name">:NAME
    <input type="number" name="phoneNo">:CONTECT NO
    <input type="email" name="emailId">: EMAIL ID
    <input type="password" name="password">:PASSWORD
    <input type="text" name="landmark">:LANDMARK
    <input type="text" name="colour">:COLOUR
    <input type="text" name="quantity">:QUANTITY
  
    <select>
    <option value=" ">---SELECT---</option>
    <c:forEach items="${item}" var="i">
    <option value="${i}">${i}</option>
    </c:forEach>
    </select>:ITEM
    
    <select>
    <option value=" ">---SELECT---</option>
    <c:forEach items="${area}" var="a">
    <option value="${a}">${a}</option>
    </c:forEach>
    </select>:AREA
    
    
    <input type="submit" value="save">
    
    </pre>











</form>

</body>
</html>