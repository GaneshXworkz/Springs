package com.xworkz.loginPage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 2,urlPatterns = "/forgetPassword")
public class ForGetPassword extends HttpServlet{

	
	public ForGetPassword() {
		System.out.println("Creating :"+this.getClass().getSimpleName());
	}
	
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	     System.out.println("Creating Forget Password In page....");
	     String userName=req.getParameter("userName");	
	     String mobialaNo=req.getParameter("mobilaNo");
	     String newPassword=req.getParameter("newPassword");
	     
	     
	     System.out.println(userName);
	     System.out.println(mobialaNo);
	     System.out.println(newPassword);
    	
	     PrintWriter writer=resp.getWriter();
	     writer.print("<html>");
	     writer.print("<body>");
	     
	     if(userName!=null && newPassword.length()>8 && newPassword!=null) {
		    	
	    	 writer.print("<h1 style='color:Green;'>");
	         writer.print("New Password Created Sucessfully "+userName);
	     }
	     
	     else {
	    	 writer.print("<h1 style='color:Red;'>");
			  writer.print("<h1>unsucessfull </h1>");
	     }
	     
	     writer.print("<br>");
	     writer.print("<a href=\"index.html\">Home Page</a>");
	     
	     writer.print("</body>");
	     writer.print("</html>");
	     
	     resp.setContentType("text/html");
	          
    	    }
	
	
	
	
	
	
	
	
}
