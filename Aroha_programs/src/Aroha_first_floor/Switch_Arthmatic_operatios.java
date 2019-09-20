package Aroha_first_floor;

import java.util.Scanner;

public class Switch_Arthmatic_operatios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int choice;
		
do
{
		System.out.println("Choice 1 For Adding");
		System.out.println("Choice 2 For Multiply");
		System.out.println("Choice 3 For divide find the Quotient");
		System.out.println("Choice 4  For divide find the Remainder");
		System.out.println("Choice 5 For  Substract");
		System.out.println("Choice 6 For  Exit");

		System.out.println("Enter choice");
		
		choice=s.nextInt();
	
		if(choice>=1&&choice<=6)
		{
		
		
		switch(choice)
		{
		case 1:
			  System.out.println("Enter First Number");
			  int First=s.nextInt();
			  System.out.println("Enter second Number");
			  int second=s.nextInt();
			  int sum=First+second;
			  System.out.println("sum number is "+ sum);
			  
			  System.out.println();
			  break;
			  
			  
		case 2:	  
			System.out.println("Enter First Number");
			  int FirstMul=s.nextInt();
			  System.out.println("Enter second Number");
			  int secondMul=s.nextInt();
			  int Mul=FirstMul+secondMul;
			  System.out.println("Multipliaction  number is "+ Mul);
			  System.out.println();
			  break;
			  
			  
		case 3:
			  System.out.println("Enter Dividend Number");
			  int Dividend=s.nextInt();
			  System.out.println("Enter Divisor Number");
			  int divisor=s.nextInt();
			  int Quo=Dividend / divisor;
			  System.out.println("Quotient is"+ Quo);
			  System.out.println();
			  break;	  
			  
			  
		case 4:
			  System.out.println("Enter Dividend Number");
			  int Dividends=s.nextInt();
			  System.out.println("Enter Divisor Number");
			  int divisors=s.nextInt();
			  int Remainder=Dividends % divisors;
			  System.out.println("Remainder is"+ Remainder);
			  System.out.println();
			  break;	  
			  
			  
		case 5:
			 System.out.println("Enter First substrct  Number");
			  int Firstsub=s.nextInt();
			  System.out.println("Enter second substrct umber");
			  int secondsub=s.nextInt();
			  int sub=Firstsub-secondsub;
			  System.out.println("sum number is "+ sub);
			  System.out.println();
			  break;
			  
			  
			  
			 
			  
		case 6:
			 System.out.println(" Thank you for using services");
			 System.out.println();
		
		
		}
		
		
}
		else
		{
			 System.out.println("please enter choice between 1 to 6");
		}
			
		
		
		
	}while(!(choice==6));

	}

}
