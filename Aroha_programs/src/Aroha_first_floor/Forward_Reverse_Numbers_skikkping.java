package Aroha_first_floor;

public class Forward_Reverse_Numbers_skikkping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0;i<=100;i++)
		{
			
			if((!(i>=35&&i<=41))&&(!(i>=56&&i<=70))&&(!(i>=89&&i<=95)))
			{
				System.out.println("Forwrd Print numbers  "+ i);
			}
				
		}
				
		
		for(int i=100;i>=0;i--)
		{
			
			if((!(i>=35&&i<=41))&&(!(i>=56&&i<=70))&&(!(i>=89&&i<=95)))
			{
				System.out.println("Reverse Print numbers"+ "  "+ i);
			}
				
		}
		
	}

}
