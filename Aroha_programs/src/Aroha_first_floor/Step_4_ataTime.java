package Aroha_first_floor;

public class Step_4_ataTime {

	public static void main(String[] args) {
	
		int r1 = 325;
		int r2 = 450;
		int sum =0;
		int cnt =0;
		int fcnt =0;
		System.out.println("First eight numbers are: ");
		for(int i = r1; i<=r2; i+=4)
		{
			if(cnt<8)
			{
			System.out.print(i+" ");
			cnt++;
			}
			if(fcnt<5)
			{
			sum = sum+i;
			fcnt++;
			}
			
		}
		System.out.println();
		System.out.println("First five sum are: "+sum);
		System.out.println("Avg of first five sum are: "+sum/5);


		
		
		
		
		
		
		
		
		
		
	}

}
