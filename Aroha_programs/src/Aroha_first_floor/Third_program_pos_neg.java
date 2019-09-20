package Aroha_first_floor;

import java.util.Scanner;

public class Third_program_pos_neg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int x;
		int	count=0;
		int pos=0;
		int neg=0;
		int zeo=0;
		int poscount=0;
		int negcount=0;
	int	tempos=0;
	int	temnos=0;
			for(int i=1;i<=10;i++)
			{
				
				Scanner s=new Scanner(System.in);
				System.out.println("Enter the "+i +"number" );
				x=s.nextInt();
				
				if(x>0)
				{
					
					tempos=tempos+x;
					pos++;
					poscount++;
				}
	
		
				if(x<0)
				{
					neg++;
					temnos=temnos+x;
					negcount++;
					
				}
		        if(x==0)
		        {
		        	zeo++;
		        }
		        	
		
		
		
		
		
		
		
		
		
			}
			
			
			System.out.println("number of pos " +pos );
			System.out.println("number of neg " + neg);
			System.out.println("number of Zeros " + zeo);
			if(!(poscount==0))
			{
			System.out.println("avg is pos"  + tempos/poscount);
			}
			else
			{
				
				System.out.println("avg is pos  0");
			}
			
			if(!(negcount==0))
			{
			System.out.println("avg is neg" + temnos/negcount);
			}
			else
			{
				
				System.out.println("avg is neg  0");

				
			}
		
	}

}
