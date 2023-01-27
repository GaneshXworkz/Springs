package com.xworkz.King;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 8,urlPatterns = "/king")
public class King  extends HttpServlet{

	public King() {
		System.out.println("King server Created..");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		System.out.println("Running Do get in King..");
		
		String name=req.getParameter("Name");
		String region=req.getParameter("Region");
		String noOfQueens=req.getParameter("NoOfQueens");
		String DateOfBirth=req.getParameter("DateOfBirth");
		String DateOfDeath=req.getParameter("DateOfDeath");
		
		System.out.println(name);
		System.out.println(region);
		System.out.println(noOfQueens);
		System.out.println(DateOfBirth);
		System.out.println(DateOfDeath);
		
		PrintWriter write=resp.getWriter();
		write.print("King "+name+" "+"succesfully");
		resp.setContentType("text/plain");
		
		
		//    http://localhost:8899/King/
	}
}
