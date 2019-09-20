package Aroha_first_floor;

public class Cheque_Book_validation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean toWhomToPay=true;
		boolean isDateValid=true;
		boolean signature=true;
		boolean Amount=true;
		boolean mark=false;
		
		
		int amount=1000;
		if (toWhomToPay==true)
		{
			
			if(isDateValid==true)
			{
				
				
				if(Amount==true)
				{
					
					if(signature==true)
					{
						if(mark==false)
						{
							System.out.println(" valid Check");
						}
						else
						{
							System.out.println("Mark is there");
						}
						
					}
					else {
						System.out.println("Signature is not there");
					}
					
				}
				else
				{
					System.out.println("amount is not there");
				}
			}
			
			else {
				System.out.println("Date is not there");
			}
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
