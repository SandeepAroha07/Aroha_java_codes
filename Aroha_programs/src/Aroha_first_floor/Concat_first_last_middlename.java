package Aroha_first_floor;

import java.util.Scanner;

public class Concat_first_last_middlename {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Firstname;
		String Lastname;
		String Middlename;
		int a = 0;
		int e=0;
		int i=0;
		int o=0;
		int u=0;
		int count=0;
		
		Scanner str=new Scanner(System.in);
		System.out.println("Enter First name ");
		Firstname=str.next();
		System.out.println("Enter Last name ");
		Lastname=str.next();
		System.out.println("Enter Middle name ");
		Middlename=str.next();
		
		
	String Concatname=	Firstname.concat(Middlename).concat(Lastname);
	System.out.println(Concatname);
	
	String lowercasevalue=Concatname.toLowerCase();
	System.out.println(lowercasevalue);
	System.out.println(lowercasevalue.length());
	
	
	for(int j=0;j<=lowercasevalue.length()-1;j++)
	{
	
		
		char c=lowercasevalue.charAt(j);
		
		
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
		{
		
		count++;
		
		switch(c)
		{
		case 'a':
				a++;
		     break;
		case 'e':
			e++;
	     break;
	     
		case 'i':
			i++;
	     break;
		case 'o':
			o++;
	     break;
		case 'u':
			u++;
	     break;
	     
	     
		}
	}

	
	}
	System.out.println( "vowel a count is "+ a);
	System.out.println( "vowel e count is "+ e);
	System.out.println( "vowel i count is "+ i);
	System.out.println( "vowel o count is "+ o);
	System.out.println( "vowel u count is "+ u);
	System.out.println(" total vowel count is" + count);

}

	
	
}