package Aroha_first_floor;

import java.util.Scanner;

public class Check_character {
	static String result=null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner obj = new Scanner(System.in);
		 System.out.println("enetr character");
		 String c=obj.next();
		char ch = c.charAt(0);
		
	String res=	Checkchar(ch);
		
System.out.println("character is "+ res);
	}

	private static String Checkchar(char ch) {
		// TODO Auto-generated method stub
		
		
		if(ch>='A'&&ch<='Z')
		{
		 result="uppercasecharacter";
	}
		
		
		else if(ch>='a'&& ch<='z')
				{
			 result="lowercasecharacter";
				}
		
		else if(ch>='0'&& ch<='9')
		{
			
			 result=" is digit";
		}
		else
		{
			 result=" is  none";

		}
		return result ;
		
		
		
	}

}
