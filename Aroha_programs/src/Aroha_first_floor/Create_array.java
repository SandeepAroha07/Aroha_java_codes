package Aroha_first_floor;

import java.util.Scanner;

public class Create_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int number[]=new int[10];
		
		for(int i=0;i<=number.length-1;i++)
		{
			System.out.println("Enter numbers");
			int value=s.nextInt();
			number[i]=value;
				
		}
		
		
		for(int j=0;j<=number.length-1;j++)
		{
		
			System.out.println("numbers are"+ number[j]);
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
