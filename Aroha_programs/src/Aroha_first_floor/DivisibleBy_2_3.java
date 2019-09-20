package Aroha_first_floor;

public class DivisibleBy_2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r1 = 100;
		int r2 = 200;
		int countt = 0;
		int sum = 0;
		System.out.println("Numbers are: ");
		for(int i = r1; i<=r2; i++)
		{
			if(!(i%5 ==0))
			{
				if(i%2 == 0 && i%3 == 0)
				{
					countt++;
					sum = sum+i;
					System.out.print(i+" ");
					
				}
			}
			
			
		}
		System.out.println();
		System.out.println("Sum are: "+sum);
		System.out.println("Count are: "+countt);
		System.out.println("Avg are: "+sum/countt);


	}

}
