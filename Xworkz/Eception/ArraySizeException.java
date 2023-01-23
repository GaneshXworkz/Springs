package com.Xworkz.Eception;

public class ArraySizeException extends Exception {
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "size is less";
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "array is less in size";
	}

}
