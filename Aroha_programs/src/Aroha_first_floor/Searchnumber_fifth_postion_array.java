package Aroha_first_floor;

import java.util.Scanner;

public class Searchnumber_fifth_postion_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Boolean Value=false;	
	int j=5;
		
		int b[] = { 22,44,32,99,56,23,67,90,121,88,90};
		
		int temp=0;
		Scanner input = new Scanner( System.in); 
		System.out.println(" Enter the search number");
		int serachnumber=input.nextInt();
		 for(int i =0;i<=b.length-1; i++) 
		 {
			if(serachnumber==b[i])
			{
				Value=true;
				
			}
		 }
		 
		 if(Value==true)
		 {
			 
			 System.out.println(" Number found");
		 }
		 else
		 {
			 
			 System.out.println(" Number not found");
		 }
		 System.out.println("After 5th postion numbers are "+ " ");
	
		for( j=5;j<=b.length-1;j++)
		{
			
			
		
			System.out.print(b[j]);
			
			System.out.print(",");
			temp=temp+b[j];
				
			
		}
		
System.out.println(" sum is "+ temp);
System.out.println(" avg is " + (temp/(b.length)-j));




	}

}
