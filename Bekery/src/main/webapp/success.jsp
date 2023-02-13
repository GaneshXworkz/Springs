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
    
      </div>   
</nav>
    
   <form class="container col-12 col-sm-6 col-md-3 shadow-lg p-4 mb-4 bg-white mx-auto d-block border border-primary rounded-lg 
m-5 pb-5 bg-info">
       <h4>Bekery Success...</h4><br>
       <h2>NAME :${bakery.name}</h2><br>
       <h2>SINCE :${bakery.since}</h2><br> 
       <h2>IS MARRIED :${bakery.ownerMarried}</h2><br> 
       <h2>FAMAOUS FOR :${bakery.famousFor}</h2> 
   </form> 
    


</body>
</html>