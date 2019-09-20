package Aroha_first_floor;

import java.util.Calendar;
import java.util.Scanner;

public class Date_validation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Day");
		int Day=s.nextInt();
		
		System.out.println("Enter Month");
		int Month=s.nextInt();
		
		
		
		
		System.out.println("Enter year");
		int year=s.nextInt();
		
		int y=year;
		if(Month>=1&&Month<=12)
		{
		if(Month==4||Month==6||Month==9||Month==11)
		{
			System.out.println("valid month"+" " +Month);
			if(Day>=1&&Day<=30)
			{
				
				System.out.println("valid date"+" "+Day);
			}
			else
			{
				System.out.println("Invalid date");
			}
			
		}
		
		else
		{
			System.out.println("valid month"+" " +Month);
			if(Day>=1&&Day<=31)
			{
				
				System.out.println("valid date"+" "+Day);
			}
			else
			{
				System.out.println("Invalid date");
			}
			
		}
		}
		else
		{
			System.out.println("Invalid Month");
			System.out.println("Invalid Day");
		}
	}

}
