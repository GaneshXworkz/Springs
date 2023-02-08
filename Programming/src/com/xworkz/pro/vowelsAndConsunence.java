package com.xworkz.pro;

public class vowelsAndConsunence {

	
 public static void main(String[] args){
		 
		 String sent="my name is gani";
		 int ovewles=0;
		 int consunese=0;
		 
		 char [] cha=sent.toCharArray();
		 
		 for(int i=0;i<cha.length;i++){
			
		 if(cha[i]=='A'||cha[i]=='E'||cha[i]=='I'||cha[i]=='O'||cha[i]=='U'||
		  cha[i]=='a'||cha[i]=='e'||cha[i]=='i'||cha[i]=='o'||cha[i]=='u')
		  {
			  
			  ovewles=ovewles+1;
			  
		 }
		 else if(cha[i]==' ')
		 {
			continue; 
		 }
		 else{
			consunese=consunese+1;  
		 }			
			 
		 }
		 
		 System.out.println("vowels:"+ovewles);
		System.out.println("consunese:"+consunese);

		 
		 
		 
		 
		 }
		 
	
	
}
