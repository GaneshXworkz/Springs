<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   
 <form action="jsp" method="post">
      <h1> DISPLAY PAGE </h1>
 
 
 <pre>
 
   firstName<input type="text" name="firstName" placeholder="First Name">
   lastName<input type="text" name="lastName" placeholder="Last Name">
   gender : Male<input type="radio" name="gender" id="male" value="male">
            Female<input type="radio" name="gender" id="female" value="female">
            Others<input type="radio" name="gender" id="others" value="others">
    
    reason<textarea rows="3" cols="20" name="reason" placeholder="Reason"></textarea>       
    address<textarea rows="3" cols="20" name="address" placeholder="Address"></textarea>        
    
     <input type="submit" value="SEND">
   </pre>   
   </form>

</body>
</html>