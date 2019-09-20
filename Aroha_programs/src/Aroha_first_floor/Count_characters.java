package Aroha_first_floor;

public class Count_characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hhhhhhh";
		String ls = s.toLowerCase();
		int count = 0;
		for(int i = 0; i<ls.length(); i++)
		{
			
			switch(s.charAt(i))
			{
			case 's':
			case 'a':
			case 'r':
			case 'k':
				count++;
			}
		}
		System.out.println("Number of Characters are"+" "+count);


		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
