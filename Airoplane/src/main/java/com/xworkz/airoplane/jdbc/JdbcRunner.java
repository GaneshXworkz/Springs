package com.xworkz.airoplane.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcRunner {
	
	public static void main(String[] args) {
		
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "Xworkzodc@123");
			
			String insertQuery2 = "insert into airoplane_table values(0,'ragu','tata',78945861238,'domastic','china')";

			Statement statement=con.createStatement();
			
			int rows=statement.executeUpdate(insertQuery2);
			
			System.out.println("rowsAffected  "+rows);
			
			con.close();
			
			}
			catch(ClassNotFoundException e){
				System.out.println("Class not found...");
			}catch (SQLException event) {
				System.err.println("Sql Exception...");
	 		}
			
		}
		
	}


