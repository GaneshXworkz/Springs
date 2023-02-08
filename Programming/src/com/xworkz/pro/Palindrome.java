package com.xworkz.pro;

public class Palindrome {
	
	
       public static void main(String[] args){
		
	
	String sent="fhgfghg";
	
	String rev="";
	
	char[] c=sent.toCharArray();
	for(int i=c.length-1;i>=0;i--) {
		rev=rev+(c[i]);
		
	}
	
	System.out.println(sent);
	System.out.println(rev);
	
	if(sent.equals(rev))
	{
		System.out.println("Palindrome");
	}
	else
	{
		System.out.println("not Palindrome");
	}

	
}

}
