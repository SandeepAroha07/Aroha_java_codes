package Aroha_first_floor;

import java.util.Scanner;

public class aditya_sir_friday_task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		Scanner input = new Scanner( System.in);     
	       String str = " ";
	       System.out.println("Please enter a string: ");
	       str = input.next();
	       str = str.toLowerCase();
	       for(int i = 0; i < str.length(); i++)
	       {
	           char character = str.charAt(i);
	           int firstIndex = str.indexOf(character);
	           int lastIndex = str.lastIndexOf(character);
	           if(firstIndex != lastIndex) {
	               System.out.println("The 1st character:"+character+" is repeated");
	               break; 
	           }
	       }

	}

}
