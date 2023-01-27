package com.xworkz.webServer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 2,urlPatterns = "/web")
public class WebSeries extends HttpServlet{
	
	public WebSeries() {
		System.out.println("Creating Web Server...");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doGet In FreedaomServelet...");
		
		String name =req.getParameter("Name");
		String lan=req.getParameter("Language");
		String Episodes=req.getParameter("Episodes");
		String ott=req.getParameter("OTT");
		String budget=req.getParameter("Budget");
		
		
		System.out.println(name);
		System.out.println(lan);
		System.out.println(Episodes);
		System.out.println(ott);
		System.out.println(budget);
		
		PrintWriter write=resp.getWriter();
		write.print("Webseries "+name+" "+"succesfully");
		resp.setContentType("text/plain");
		
	}
	

}
