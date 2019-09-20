package Aroha_first_floor;

import java.util.Scanner;

public class VIBGYOR_Colour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		Scanner input = new Scanner( System.in); 
		System.out.println(" Enter the Colour");
		String colourname=input.next();
		char c=colourname.toUpperCase().charAt(0);
		switch(c)
		{
		case 'V':
		case 'I':
		case 'B':
		case 'G':
		case 'Y':
		case 'O':
		case 'R':
		System.out.println("It is rainbow color");
		break;
		default :
			System.out.println("It is rainbow color");
	}

}
}
