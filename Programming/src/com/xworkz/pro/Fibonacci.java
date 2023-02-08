package com.xworkz.pro;

public class Fibonacci {
	
public static void main(String[] args) {
		
		
		
		int num=7 ;
		
		int f=0;
		
		int s=1;
		
		int t;
		
		System.out.print(" ,"+f);
		System.out.print(" ,"+s);
		
		for(int i=2;i<=num ;i++ ) {
			t=f+s;
			System.out.print(" ,"+t);
			f=s;
			s=t;
		}

}
}