package Aroha_first_floor;

public class Character_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Sandeep";
		System.out.println("First four character of the string: ");
		for(int i = 0; i<=3; i++)
		{
			System.out.println(s.charAt(i)+" ");
		}
		System.out.println();
		System.out.println("Remaining reverse Chracter: ");
		for(int i = s.length()-1; i>3; i--)
		{
			System.out.println(s.charAt(i)+" ");
		}
		



	}

}
