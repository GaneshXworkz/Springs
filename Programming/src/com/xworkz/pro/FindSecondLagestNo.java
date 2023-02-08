package com.xworkz.pro;

public class FindSecondLagestNo {

	public static void main(String[] args) {
		 int a[]= {25,56,26,89,78};
		int temp=0;
		
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=i+1;j<a.length;j++)
			{
				
				if(a[i]>a[j])
				{
					
				 temp=a[i];
				 a[i]=a[j];
				 a[j]=temp;
					
				}
			}
			System.out.print(a[i] +",");	

		}
		System.out.println();
		System.out.println("Second Largest Number :"+a[a.length-2]);
		
		
		
	}
}
