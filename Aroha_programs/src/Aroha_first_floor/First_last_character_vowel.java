package Aroha_first_floor;

import java.util.Scanner;

public class First_last_character_vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner( System.in); 
		System.out.println(" Enter the Colour");
		String name=input.next();
		char f=name.toUpperCase().charAt(0);
		
		int len=name.length();
		char l=name.toUpperCase().charAt(len-1);
		if(f=='A'||f=='E'||f=='I'||f=='O'||f=='U')
		{
			
			System.out.println("First character is vowel");
		}
		else
		{
			System.out.println("first Character is not vowel");
		}
		
		
		if(l=='A'||l=='E'||l=='I'||l=='O'||l=='U')
		{
			
			System.out.println("last character is vowel");
		}
		else
		{
			System.out.println("Last Character is not vowel");
		}
		
	}

}
