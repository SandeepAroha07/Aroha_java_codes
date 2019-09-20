package Aroha_first_floor;

import java.util.Scanner;

public class String_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String");
		String name=s.nextLine();
		System.out.println(name);
		
		
		int Length=name.length();
		System.out.println(Length);
		
		
	for(int i=Length-1;i>=0;i--)
	{
		char c=name.charAt(i);
		
		if (!(Character.isWhitespace(c)))
			
		  {
	      System.out.print(name.charAt(i));
	      }
		else
		{
			System.out.println();
		}
	}

	}
}
