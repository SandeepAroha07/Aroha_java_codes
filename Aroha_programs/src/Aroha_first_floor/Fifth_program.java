package Aroha_first_floor;

import java.util.Scanner;

public class Fifth_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String name=sc.next();
		int count=0;
		for(int i=0;i<name.length();i++)
		{
		char ch=name.charAt(i);
		if (ch!='a' && ch!='e' &&ch!='i' &&ch!='o' &&ch!='u')
		{
			count++;
		}
		}
		System.out.println("total number of non vowels:"+count);

		
		
		
		
		
		
		
		
		
	}

}
