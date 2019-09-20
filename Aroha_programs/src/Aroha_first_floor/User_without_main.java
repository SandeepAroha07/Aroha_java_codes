package Aroha_first_floor;

import java.util.Scanner;

public class User_without_main {
	
	Scanner s=new Scanner(System.in); 
	int temp=0;
	int max = 0;
	int min=0;
	
	
	
	public int[] acceptNum(int iter)
	{
		int a[]=new int[iter];
		int temp=0;
		int max = 0;
		int min=0;
		
		for(int i=0;i<=iter-1;i++)
		{
			System.out.println("Please enter : "+i +" "+ "number");
			
			int num=s.nextInt();
			a[i]=num;
			
		}
		return a;
	}
	
	public void sumandavg(int a[])
	{
		
		for(int i=0;i<=a.length-1;i++)
		{
			temp=temp+a[i];
		
		
		
		}
			System.out.println("sum is "+ temp);
			System.out.println("average is "+ temp/a.length);
			
	}
	public int highestnum(int a[])
			
	{	
			 max = a[0];
				for(int k = 1; k <a.length;k++)
				{
						
					if(a[k] > max)
					{
						max = a[k];
					}
					
				}
		
			return max;
			
			
	}
	
	public int lowestnum(int a[])
	{
				 min = a[0];
					for(int j = 1; j <a.length;j++)
					{
							
						if(a[j] <min)
						{
							min = a[j];
						}
						
					}
				
			
			return min;
			
			
		
		
		
	}
	
	public void printhighest(int max)
	{
		
		System.out.println("Highest number is  "+ max);
	}
	
	public void printlowest(int min)
	{
		System.out.println("Lowest number is "+ min);
	}
	

}
