package com.xworkz.pro;

public class FindLargeAndSmallNumberInArrays {

	public static void main(String[] args) {
		
		
		int a[]= {1,25,14,7,889,25,4,61,2};
		
		int largeNo=a[0];
		int smallNo=a[0];
		
		for(int i=0;i<a.length;i++) {
			
			if(largeNo<a[i]) {
				
				largeNo=a[i];
			}else if(smallNo>a[i]){
				
				smallNo=a[i];
			}
			
			
		}
		
		System.out.println("Largest No : "+largeNo);
		System.out.println("small No :"+ smallNo);
		
						
		}
	}

