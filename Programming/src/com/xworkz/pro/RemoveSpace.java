package com.xworkz.pro;

public class RemoveSpace {

   public static void main(String[] args) {
	
	   String sen="my name ";
	   
	   char ch[]=sen.toCharArray();
	   for(int i=0;i<ch.length;i++) {
		   if(ch[i]==' ') {
			   continue;
		   }else {
			   System.out.print(ch[i]);		   }
		 
		  	   }
	   
}
}
