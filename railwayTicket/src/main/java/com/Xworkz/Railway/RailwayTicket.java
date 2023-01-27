package com.Xworkz.Railway;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 21, urlPatterns = "/rail")
public class RailwayTicket extends HttpServlet {

	public RailwayTicket() {
		System.out.println("Creating RaiilWay ticket..");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Creating do get method......");

		String name = req.getParameter("Name");
		String age = req.getParameter("Age");
		String address = req.getParameter("Address");
		String dateOfBirth = req.getParameter("DateOfBirth");
		String preference = req.getParameter("Preference");
		String from = req.getParameter("From");
		String to = req.getParameter("To");

		String Amount = req.getParameter("Amount");
		String destinationAddress = req.getParameter("destinationAddress");
		String child = req.getParameter("child");
		String NoOfPassanger = req.getParameter("NoOfPassanger");
		String TrainNo = req.getParameter("TrainNo");
		String TrainName = req.getParameter("TrainName");
		String NoofStopes = req.getParameter("NoofStopes");
		String TravelTimges = req.getParameter("TravelTimges");
		String NoofJunctions = req.getParameter("NoofJunctions");
		String NoOfTraveler = req.getParameter("NoOfTraveler");
		String NoOfcouthes = req.getParameter("NoOfcouthes");
		String S2 = req.getParameter("S2");
		String AC = req.getParameter("AC");
		String general = req.getParameter("general");

		System.out.println(name);
		System.out.println(age);
		System.out.println(address);
		System.out.println(dateOfBirth);
		System.out.println(preference);
		System.out.println(from);
		System.out.println(to);

		System.out.println(Amount);
		System.out.println(destinationAddress);
		System.out.println(child);
		System.out.println(NoOfPassanger);
		System.out.println(TrainNo);
		System.out.println(TrainName);
		System.out.println(NoofStopes);
		System.out.println(TravelTimges);
		System.out.println(NoofJunctions);
		System.out.println(NoOfTraveler);
		System.out.println(NoOfcouthes);
		System.out.println(S2);
		System.out.println(AC);
		System.out.println(general);

		PrintWriter write = resp.getWriter();
		write.print("Webseries " + name + " " + "succesfully");
		resp.setContentType("text/plain");

	}

}
