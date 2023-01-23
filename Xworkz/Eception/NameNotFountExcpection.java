package com.Xworkz.Eception;

public class NameNotFountExcpection extends Exception {

   
   @Override
public String toString() {
	
	return "Name Not Found ";
}
   @Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Name not found";
	}
	
}
