package com.xworkz.loginPage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 2,urlPatterns = "/signup")
public class SignUp extends HttpServlet{
   
	public SignUp() {
		System.out.println("Creating :"+this.getClass().getSimpleName());
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Creating Sign In page....");	
		
		String userName=req.getParameter("userName");
		String userEmail=req.getParameter("userEmail");
		String mobilaNo=req.getParameter("mobilaNo");
		String address=req.getParameter("address");
		String dateOfBirth=req.getParameter("dateOfBirth");
		String gender=req.getParameter("gender");
	    String password=req.getParameter("password");
		
		System.out.println(userName);
		System.out.println(userEmail);
		System.out.println(mobilaNo);
		System.out.println(address);
		System.out.println(dateOfBirth);
		System.out.println(gender);
		System.out.println(password);
		
		   PrintWriter Writer=resp.getWriter();
		     Writer.print("<html>");
		     Writer.print("<body>");
		
		if(userName !=null && userEmail!=null && mobilaNo!=null 
				&& address!=null&& dateOfBirth !=null && password!=null) {
			
			 Writer.print("<h1 style='color:Green;'>");
	         Writer.print("Sign Up Sucessfully "+userName);
			
		}else {
			 Writer.print("<h1 style='color:Red;'>");
			  Writer.print("<h1>Sign up unsucessfull </h1>");
		}
		Writer.print("<br>");
	     Writer.print("<a href=\"index.html\">Home Page</a>");
	     
	     Writer.print("</body>");
	     Writer.print("</html>");
	     
	     resp.setContentType("text/html");
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	}
