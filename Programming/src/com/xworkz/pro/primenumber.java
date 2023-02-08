package com.xworkz.pro;

public class primenumber {

	public static void main (String []args){
		 
		int n=29;	
		int count=0;
			 for(int i=1;i<=n;i++){
				 
				 if(n%i==0){
					count+=1; 
				 }
			 }
				
			 if(n>0) {
				 if(count==2){
						System.out.println(n+" PrimeNumber");
					}else{
						System.out.println(n+" Not PrimeNumber");
					}	
						
					}else {
						System.out.println("please enter valid number");
					}
			 
			 
			 
			 

			 }
				}
