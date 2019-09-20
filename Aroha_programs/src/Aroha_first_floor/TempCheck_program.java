package Aroha_first_floor;

public class TempCheck_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float temp[] =new float[] { 34.5f, 23.2f,18.5f,40.2f,19.5f};
		
		float avgsum=0;
		int count=0;
		int count_morthan_avg=0;
		float searchnumber=40.2f;
		Boolean Number_there=true;
		
		int i=0;
		
			do {
			
			avgsum=avgsum+temp[i];
			i++;
			count++;
			
			}while(i<=temp.length-1);
			
			
			System.out.println("avg is"+avgsum/count);
			

		int j=0;
		
		do {
			if(avgsum/count<temp[j])
			
			
			{
				
				
			count_morthan_avg++;
			
			}
			
			if(temp[j]==searchnumber)
			{
				
				Number_there=true;
				
				
			}
			
			j++;
		}while(j<=temp.length-1);
		
		System.out.println(" More than avearage temperature is" + count_morthan_avg);
		
		if(Number_there==true)
		{
			
			
			System.out.println("Number is found  ");
			
		}
		else
		{
			
			
			System.out.println("Number not found");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
