package com.xworks.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sound.midi.Patch;

@WebServlet(loadOnStartup = 2,urlPatterns = "/car")
public class Car extends HttpServlet{

	public Car() {
		System.out.println("Creating Car Sever....");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("post from fastrack");	
		String data="Car Race Bike race ,Egg";
		PrintWriter write=resp.getWriter();
		write.print(data);
		resp.setContentType("text/html");
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init from fastrack");	
		
		
	}
	
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doput from fastrack");	
		String data="Car Race Bike race ,Egg";
		PrintWriter write=resp.getWriter();
		write.print(data);
		resp.setContentType("text/html");
	}
	
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Delet from fastrack");	
		String data=" race ,Egg";
		PrintWriter write=resp.getWriter();
		write.print(data);
		resp.setContentType("text/html");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("post from fastrack");	
		String data="Car Race Bike race ,Egg";
		PrintWriter write=resp.getWriter();
		write.print(data);
		resp.setContentType("text/html");
		
		
		}
	
	@Override
	protected void doTrace(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Trace from fastrack");	
		String data="Car Race Bike race ,Egg";
		PrintWriter write=resp.getWriter();
		write.print(data);
		resp.setContentType("text/html");
	}
	
	
	@Override
	protected void doHead(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("head from fastrack");	
		String data="Car Race Bike race ,Egg";
		PrintWriter write=arg1.getWriter();
		write.print(data);
		arg1.setContentType("text/html");
	}
	
}
