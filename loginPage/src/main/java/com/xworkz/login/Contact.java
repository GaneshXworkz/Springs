package com.xworkz.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 2,urlPatterns = "/contact")
public class Contact extends HttpServlet{

	public Contact() {
		System.out.println("Creating contect server...");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running post in server");
		String userName=req.getParameter("userName");
		String userEmail=req.getParameter("userEmail");
	    String mobile=req.getParameter("mobile");
	   
	    String comment=req.getParameter("comment");
	    
	    System.out.println(userName);
	    System.out.println(userEmail);
	    System.out.println(mobile);
	    System.out.println(comment);
	    
	    PrintWriter Write=resp.getWriter();
	    Write.print("<html>");
		Write.print("<body>");
		
		
		if(mobile.length()>0 && userName!=null) {
			Write.print("<h1 style='color:Green;'>");
	         Write.print("Sign Sucessfully "+userName);
	         
		}else {
			Write.print("<h1 style='color:Red;'>");
			  Write.print("Sign unsucessfull");
			
		}
		Write.print("<br>");
		Write.print("<a href=\"index.html\">Home Page</a>");
		
		Write.print("</body>");
		Write.print("</html>");

		resp.setContentType("text/html");
		
		
		
	}
}
