package Aroha_first_floor;

import java.util.Scanner;

public class Odd_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x;
	int	count=0;
		for(int i=1;i<=10;i++)
		{
			
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the "+i +"number" );
			x=s.nextInt();
			if(!((x==33||x==97||x==119)))
			
			{
				
				
				if(!(x>=16&&x<=29))
						{
					
						
					if(!(x>=79&&x<=91))
						{
					
			
				if(! (x % 2 == 0))
				{
				
					
				count++;
				
					
				}
				
				
						}
				
		}		
				
				
				
			}
			
			
		}	
			
			
		System.out.println("number of odd are  "+ count);	
			
			
			
			
			
		
		

	}

}
