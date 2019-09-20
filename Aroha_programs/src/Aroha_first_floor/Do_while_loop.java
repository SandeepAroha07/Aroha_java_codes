package Aroha_first_floor;

public class Do_while_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int r1=125;
   int r2=190;
   
   int i=125;
   int sum=0;
   int count=0;
   int j=1;
   
   do
   {
	   
	   sum=sum+i;
	   System.out.println("First ten numbers"+ sum);
	   
	   if(i%3==0 && i%2==0)
 	   {
 		   System.out.println("This number will divisble for first ten numbers"+" "+ i);
 		   
 	   }
	   
	   i++;
	   j++;
	   count++;
	   
   }while(i<=190 && j<=10);
   
    System.out.println("Average of the summed numbers"+ sum/count);
   
    
   
    
    do
    {
 	   
 	   
 	   if(r1%3==0 && r1%2==0)
 	   {
 		    
 		   System.out.println("This number will divisible full range"+" "+ r1);
 		   
 		   
 	   }
 	  r1++;
 	   
    }while(r1<=r2);
    
    
    
    
    
    
    
    
    
    
    
    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
