package Aroha_first_floor;

public class Tenth_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int apple_count=12;
		int orange_count=12;
		int apple_cost=180;
		int orange_cost=84;
		int apple_per_cost=(apple_cost/apple_count);
		int orange_per_cost=(orange_cost/orange_count);
		int mohan_wish_price=((20*apple_per_cost)+(10*orange_per_cost));
		System.out.println(mohan_wish_price);
		{
		if(mohan_wish_price<=300)
		{
		System.out.println("Out of budget for 300");
		}
		else 
			{
			System.out.println("In budget for 300 and will get change=" +(mohan_wish_price-300));
			}
		}
		{
		if(mohan_wish_price<=400)
		{
		System.out.println("Out of budget for 400");
		}
		else 
			{
			System.out.println("In budget for 400 and will get change=" +(mohan_wish_price-400));
			}
			}
		{
		if(mohan_wish_price<370)
		{
		System.out.println("Out of budget for 370");
		}
		else 
			{
			System.out.println("In budget for 370 and will get change=" +(mohan_wish_price-370));
			}
			}

		
		
		
		
		
		
		

	}

}
