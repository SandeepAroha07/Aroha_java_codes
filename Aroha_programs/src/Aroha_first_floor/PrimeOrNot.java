package Aroha_first_floor;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
for(int i=0;i<=10;i++)
{
	System.out.println("Enter the value to check whether prime or not");
	int Takedata=s.nextInt();
	Primemethods md=new Primemethods();
	int f=md.setData(Takedata);
	   Boolean value= md.FindPrime(f);
	md.DisplayResult(value);
	
	
}
		 
		  
		
		
		
		
		
		
		
		
		
		
	}

}
