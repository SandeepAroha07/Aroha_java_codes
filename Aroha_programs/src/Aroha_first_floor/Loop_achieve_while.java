package Aroha_first_floor;

import java.util.Scanner;

public class Loop_achieve_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int choice;
		int count = 0;
		
		
		
		while(!(count>=2))
			
		{   
			System.out.println("Please enter the 2 digit number");
			choice=s.nextInt();
			String y=String.valueOf(choice);
			if(y.length()==2)
			{
				count++;
				if(count>=2)
				{
					System.out.println("valid number   "+ choice);
					break;
				}
			}
			
			else {
				System.out.println("please enter two digit number only you are enetring more than 2 digit number only");
			}
			
			
			
			
			
		}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
