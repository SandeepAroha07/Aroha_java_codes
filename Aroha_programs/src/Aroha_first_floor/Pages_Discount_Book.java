package Aroha_first_floor;

import java.util.Scanner;

public class Pages_Discount_Book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float price;
		String customerBillNumber = null;
		
		
		int max_count=1;		
		int min_count=1;
		int pages_80__quantity=0;
		int pages_150_quantity=0;
		int pages_200_quantity=0;
		float[] Array_amount=new float[6];
		String Array_customerBillNumber[]=new String[6];
		int i;
		
		int [] Array_quantity=new int[6];
		float max=0.0f;
		float min=0.0f;
		int max_q=0;
		int min_q=0;
		float total_sales=0;
		float total_discount=0.0f;
		float discount=0.0f;
		int customer=0;
		float sum;
		float Final_amount=0;
		float total_amount;
		int numberOfPage = 0;
		int quantity=0;
		int Rate_80=10;
		int Rate_150=15;
		int Rate_200=22;
		int count=1;
		Scanner s=new Scanner(System.in);
		
		
		
		while(!(count>=6))
			
		{
			
			System.out.println("-------------------------------------------------");
			System.out.println("please enter note pages 80,150,200");
		  System.out.println("customer "+ count);
		System.out.println("Enter Number of Pages Book");
		
		
		
		
	      numberOfPage=s.nextInt();
	    
	      
	      if(numberOfPage==80||numberOfPage==150||numberOfPage==200)
	      {
	      
	      
	      System.out.println("Enter Quantity");
	      quantity =s.nextInt();
	      
         
		switch(numberOfPage)
		
		
		{
		
		case 80:
			if(quantity>15)
			{
		     price=quantity*Rate_80;
		     Final_amount=price-((3.0f/(100))*price);
		     discount=3.0f;
		     pages_80__quantity= pages_80__quantity+quantity;
		     customerBillNumber="CUSA"+String.valueOf(count);
		     
		     sum=price-Final_amount;
		     
		     System.out.println(" The amount to be paid  " +Final_amount  );
		     break;
		
		  
		
		    }
		
			
			else
			{
				Final_amount=quantity*Rate_80;
				System.out.println(" The amount to be paid without discount    " + Final_amount );
				discount=0.0f;
				customerBillNumber="CUSA"+String.valueOf(count);
				 pages_80__quantity= pages_80__quantity+quantity;
				break;
				
			}
		
			
		case 150:
			if(quantity>20)
			{
		     price=quantity*Rate_150;
		     Final_amount=price-((5.0f/(100))*price);
		     discount=5.0f;
		     customerBillNumber="CUSB"+String.valueOf(count);
		     pages_150_quantity=pages_150_quantity+quantity;
		     System.out.println(" The amount to be paid  " + Final_amount );
		     break;
		
		  
		
		    }
		
			
			else
			{
				Final_amount=quantity*Rate_150;
				System.out.println(" The amount to be paid  " + Final_amount );
				discount=0.0f;
				pages_150_quantity=pages_150_quantity+quantity;
				customerBillNumber="CUSB"+String.valueOf(count);
				break;
			}	
			
			
			
		case 200:
				if(quantity>20&&quantity<=29 )
			{
		     price=quantity*Rate_200;
		     Final_amount=price-((6.0f/(100))*price);
		     discount=6.0f;
		     pages_200_quantity=pages_200_quantity+quantity;
		     customerBillNumber="CUSC"+String.valueOf(count);
		     
		     System.out.println(" The amount to be paid  " + Final_amount );
		   break;
		  
		
		    }
				else if(quantity>30)
				{
					

					price=quantity*Rate_200;
					  Final_amount=price-((8.0f/(100))*price);
					  discount=8.0f;
					  pages_200_quantity=pages_200_quantity+quantity;
					  customerBillNumber="CUSC"+String.valueOf(count);
				     System.out.println(" The amount to be paid  " + Final_amount );
					break;
					
					
					
						
				}
		
			
			else
			{
				Final_amount=quantity*Rate_200;
				System.out.println(" The amount to be paid  " + Final_amount );
				discount=0.0f;
				customerBillNumber="CUSD"+String.valueOf(count);
				 pages_200_quantity=pages_200_quantity+quantity;
				break;
			}	
			
		}
		
		Array_customerBillNumber[count]=customerBillNumber;
		Array_amount[count]=Final_amount;
		Array_quantity[count]=quantity;
		total_sales=total_sales+Final_amount;
		total_discount=total_discount+discount;
		
			count++;
			
			
	      }	
			
	      else
	      {
	    	  System.out.println("User entered wrong pages");
	      }
			
		
		}	
		
		
		System.out.println("-------------------------------------------------");
		
		System.out.println("Total sales "+total_sales );
		System.out.println("-------------------------------------------------");
		System.out.println("Total discount " +total_discount);
		System.out.println("-------------------------------------------------");
		System.out.println("Tota quantity of each type of 80 pages note book  "+pages_80__quantity);
		System.out.println("-------------------------------------------------");
		System.out.println("Tota quantity of each type of 150 pages note book  "+pages_150_quantity);
		System.out.println("-------------------------------------------------");
		System.out.println("Tota quantity of each type of 150 pages note book  "+pages_200_quantity);
		System.out.println("-------------------------------------------------");
		
		 max = Array_amount[1];
		
		for(i = 1; i <= count-1; i++)
        {
            if(max < Array_amount[i])
            {
                max = Array_amount[i];
                max_count=i;
                
            }
        }
        System.out.println("Highest sale amount made by customer "+    + max );
        System.out.println("-------------------------------------------------");
        
		
        min = Array_amount[1];
        for(i = 1; i <= count-1; i++)
        {
            if(min > Array_amount[i])
            {
                min = Array_amount[i];
                min_count=i;
            }
        }
		
        System.out.println("-------------------------------------------------");
        System.out.println("lowest sale amount made by customer "+    + min );
        System.out.println("-------------------------------------------------");
        
        
        
        
        
        
        
        
        
        
 max_q =Array_quantity [1];
		
		for(i = 1; i <= count-1; i++)
        {
            if(max_q < Array_quantity[i])
            {
            	max_q = Array_quantity[i];
            }
        }
        System.out.println("Highest quantity   "+  " "+ max_q );
        
        System.out.println("-------------------------------------------------");
        
        
 min_q =Array_quantity [1];
		
		for(i = 1; i <= count-1; i++)
        {
            if( min_q > Array_quantity[i])
            {
            	 min_q = Array_quantity[i];
            }
        }
        System.out.println("Lowest  quantity   "+  " "+  min_q );
        System.out.println("-------------------------------------------------");
        
        
        System.out.println("Total Bill amount is : " + total_sales);
        System.out.println("-------------------------------------------------");
        
        System.out.println("Total average Bill  amount :"+ total_sales/5 );
        System.out.println("-------------------------------------------------");
        
        System.out.println("Customer who had highest sale"+ "Customer number :"+  max_count + " customer Bill number :"+ Array_customerBillNumber[max_count] + " Amount : "+  max );
        System.out.println("-------------------------------------------------");
        
        System.out.println("Customer who had Lowest sale" + "Customer number :"+  min_count + "customer Bill number :"+Array_customerBillNumber[min_count] + "Amount :  "+  min );
        System.out.println("-------------------------------------------------");
        

	}

}
