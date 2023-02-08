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
 <h1>GET DETAILES</h1>
 
 
 <form action="email" method="post">
 <h3>${emails}</h3>
 <input type="submit" value="email">
 </form>

<form action="mNumber" method="post">
 <h3 style='colour:red'>${mobileNumber}</h3>
 <input type="submit" value="Mobiale number">
 </form>

<form action="addhar" method="post">
 <h3 style='colour:red'>${addhar}</h3>
 <input type="submit" value="Addhar">
 </form>

<form action="age" method="post">
 <h3 style='colour:red'>${age}</h3>
 <input type="submit" value="age">
 </form>
 
 <form action="dateOfBirth" method="post">
 <h3 style='colour:red'>${dateofbirth}</h3>
 <input type="submit" value="DATE OF BIRTH">
 </form>
 
 <form action="desiredSalary" method="post">
 <h3 style='colour:red'>${salary}</h3>
 <input type="submit" value="salary">
 </form>




 <form action="bestFriend" method="post">
 
   <c:forEach var="Frinds" items="${Frinds}">
<ul>
<li>
            <c:out value="${Frinds}"/> <br>
</li>
</ul>
        </c:forEach>
 
 <input type="submit" value="Friends List">

 </form>
 
 
 
 
 
 

<form action="vistedPlace" method="post">
 
   <c:forEach var="MostVistedPlace" items="${MostVistedPlace}">
<ul><li>
            <c:out value="${MostVistedPlace}"/> <br>
</li></ul>
        </c:forEach>
 
 <input type="submit" value="vistedPlace">

 </form>
 
 
 
 
 
 
 
 
  <form action="skillSet" method="post">
    <c:forEach var="Skillset" items="${Skillset}">
<ul><li>
            <c:out value="${Skillset}"/> <br>
</li></ul>
        </c:forEach>
 <input type="submit" value="Skill set">
 </form>
 
 
 
 
 <form action="eduction" method="post">
 <h3> 
${edu.name}<br>
${edu.ages}<br>
${edu.yearOfPassing}<br>
${edu.collegeName}<br>
${edu.usnNo}<br>
${edu.fee}<br>
${edu.branch}<br>
${edu.noSubject}
	</h3>
<input type="submit" value="Education Details">
 </form>
 
 
 
  <form action="mobile" method="post">
 <h3>
 ${mob.brandName}<br>
	${mob.ram}<br>
	${mob.prize}<br>
	${mob.rom}<br>
	${mob.cemarapxile}
 </h3>
 <input type="submit" value="Mobile Details">
 </form>
 
 
  <form action="bevarege" method="post">
 <h3>
 ${bev.name}<br>
 ${bev.price}<br>
 ${bev.manfacturedate}<br>
 ${bev.expireDate}<br>
 </h3>
 <input type="submit" value="Beverages">
 </form>
 
 
 
 <form action="family" method="post">
 <h3>
 ${fam.fathename}<br>
 ${fam.mothername}<br>
 ${fam.siblingname1}<br>
 ${fam.siblingname2}<br>
${fam.siblingname3}<br>
${fam.sistername}<br>
${fam.address}<br>
${fam.mobilNo}<br>
 </h3>
 <input type="submit" value="family">
 </form>
 
 
 
 
 
 
 
 
 

</body>
</html>