package com.xworkz.loginPage;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,urlPatterns = "/signin") 
public class SignIn extends HttpServlet{

	public SignIn() {
		System.out.println("Creating :"+this.getClass().getSimpleName());
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	     System.out.println("Creating Sign In page....");
	     
	     String userName=req.getParameter("userName");
	     String password=req.getParameter("password");
	     
	     System.out.println(userName);
	     System.out.println(password);
	  
	     PrintWriter Writer=resp.getWriter();
	     Writer.print("<html>");
	     Writer.print("<body>");
	     
	     if(userName!=null && password.length()>8 && password!=null) {
	    	
	    	 Writer.print("<h1 style='color:Green;'>");
	         Writer.print("Sign Sucessfully "+userName);
	     }
	     
	     else {
	    	 Writer.print("<h1 style='color:Red;'>");
			  Writer.print("<h1>Sign unsucessfull </h1>");
	     }

	     Writer.print("<br>");
	     Writer.print("<a href=\"forgetPassword.html\">ForGet Password</a>");
	     
	     Writer.print("</body>");
	     Writer.print("</html>");
	     
	     resp.setContentType("text/html");
	   
	     
	     
	     
	     
	     
	     
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
