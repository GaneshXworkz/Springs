<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>     
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
<nav class="navbar navbar-Light bg-dark"> 
     <div class="container-fluid">
        <a class="navbar-brand" href="#">
               <img src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png" alt="" width="50" height="30">
          
        </a>
      <h1 style="color: blue" align="center">HOTEL MENAGEMENT</h1>
      </div>   
</nav>

<form action="hotel" method="post">
<h3>HOTEL NAME :${hotel}</h3>
<input type="submit" value="Hotel name">
</form>




<form action="menu" method="post">
<h3>MENU <br>
FOOD NAME :${menu.foodname}<br>
PRICE :${menu.price}<br>
</h3>


<input type="submit" value="food menu">
</form>


</body>
</html>