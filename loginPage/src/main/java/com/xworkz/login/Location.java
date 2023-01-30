package com.xworkz.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,urlPatterns = "/location")
public class Location  extends HttpServlet{
	
	
	public Location() {
		System.out.println("creating Location server....");
	}

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running Post in server");
		String userName=req.getParameter("userName");
		String userEmail=req.getParameter("userEmail");
		String startPoint=req.getParameter("startPoint");
		String destination=req.getParameter("destination");
		String gender=req.getParameter("gender");
		
		System.out.println(userName);
		System.out.println(userEmail);
		System.out.println(startPoint);
		System.out.println(destination);
		System.out.println(gender);
		
		PrintWriter write=resp.getWriter();
		
		write.print("<html>");
		write.print("<body>");
		
		
		if(userName != null ) 
		{
		 write.print("<span style= 'color :green'>");
         write.print("Sign Sucessfully "+userName);
         write.print("</span>");
		}
		else 
		{
		  write.print("<span style= 'color :red'>"); 
		  write.print("Sign unsucessfull");
		  write.print("</span>");
		}
		write.print("<br>");
		write.print("<a href=\"index.html\">Home Page</a>");
	
	
		write.print("</body>");
		write.print("</html>");

		resp.setContentType("text/html");

		
		
	}
}
