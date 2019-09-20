package Aroha_first_floor;

import java.util.Scanner;

public class Second_word_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Aroha Technologies Company";
		
		int Length=s.length();
		System.out.println(Length);
		
		Scanner str=new Scanner(System.in);
		System.out.println("Enter String");
		String wordSearch=str.nextLine();
		
		int SearchIndex = s.indexOf(wordSearch);
		
		
		System.out.println(SearchIndex);
		if(SearchIndex==-1)
		{
			System.out.println("Search word is not present");
			
		}
		else
		{
			
			System.out.println("Search word is present");
		}

	}

}
