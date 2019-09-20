package Aroha_first_floor;

public class Primemethods {
	
	int a=0;
	int m;
	Boolean value;
	
	public int setData(int x)
	
	{
	
		
			a=x;
		
		return a;
	}
	
	public Boolean FindPrime(int n)
	{
		
		
		 m=n/2;      
		  if(n==0||n==1){  
		  // System.out.println(n+" is not prime number");      
		  }else{  
		   int flag = 0;
		for(int i=2;i<=m;i++){      
		    if(n%i==0){      
		   //  System.out.println(n+" is not prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  {
		//	   System.out.println(n+" is prime number");
			   value=true;
			   } 
		   else
		   {
			   value=false;
		   }
		  }//end of else  

		return value;
		  
	}
	
  public void DisplayResult(Boolean Result)
  {
	  
	if(Result==true)
	{
		System.out.println("This is prime number");
		
	}
	else
	{
		System.out.println("This is not a prime number");
	}
	
	  
  }
}


