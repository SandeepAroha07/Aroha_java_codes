package Aroha_first_floor;

public class Selling_product_price {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float Cost_price = 150;
		char cat = ' ';
		float sp = 0;
		switch(cat)
		{
		case 'A':
			sp = (float) (Cost_price + (Cost_price*(14.5/100)));
			break;
		case 'B':
			sp = (float) (Cost_price + (Cost_price*(12/100)));
			break;
		case 'C':
			sp = (float) (Cost_price + (Cost_price*(10/100)));
			break;
			default :
				sp = (float) (Cost_price + (Cost_price*(8.5/100)));
				
				
			
		}
		System.out.println(cat+","+Cost_price+" and "+sp);
		


		
		
		
		

	}

}
