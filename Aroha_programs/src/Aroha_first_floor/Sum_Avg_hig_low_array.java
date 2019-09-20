package Aroha_first_floor;

public class Sum_Avg_hig_low_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= { 56,23,67,90,121,88,90};
		
	int	temp=0;
	int max_q=0;
	int max_count=0;
	for(int i=0;i<=a.length-1;i++)
	{
		
		temp=temp+a[i];
	}
		
	System.out.println("Total value is "+ temp);
	System.out.println("Average value is "+ temp/a.length);
	

	
	max_q =a[0];
	int j=0;
	
	for( j=1 ; j <= a.length-1; j++)
    {
        
		if(max_q < a[j])
        {
        	max_q = a[j];
        	 max_count=j;
        }
    }
	
	System.out.println("Highest number is " + a[max_count]);
	
	int min_q=0;
	int min_count=0;
	int k=0;
	min_q =a[0];
	
	for( k=1 ; k <= a.length-1; k++)
    {
        
		if(min_q > a[k])
        {
        	 min_q = a[k];
        	 min_count=k;
        }
    }
	
	System.out.println("Lowest  number is " + a[min_count]);
	
	
	
	
	
}
}