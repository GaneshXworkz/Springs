package com.xworkz.pro;

public class ReverseString {

	public static void reverse(String rev) {
		
		String stor=rev;
		
		char[] a=stor.toCharArray();
		
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]);
		}
	}
	
	public static void main(String[] args) {
		
		reverse("mava");
	}
	
	
}
